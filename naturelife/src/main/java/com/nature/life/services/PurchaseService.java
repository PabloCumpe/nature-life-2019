package com.nature.life.services;

import com.nature.life.api.PurchaseProductRequest;
import com.nature.life.api.PurchaseRequest;
import com.nature.life.entity.*;
import com.nature.life.repository.CartRepository;
import com.nature.life.repository.PurchaseRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;
    private final CustomerService userService;
    private final ProductService productService;
    private final CartRepository cartRepository;

    private static final String STATE_FINISHED = "FINALIZADO";
    private static final String MONEDA_ARGENTINA = "ARS";

    public PurchaseService(PurchaseRepository purchaseRepository, CustomerService userService,
                           ProductService productService, CartRepository cartRepository) {
		this.purchaseRepository = purchaseRepository;
		this.userService = userService;
        this.productService = productService;
        this.cartRepository = cartRepository;
    }
	
	
    public void createNewPurchase(PurchaseRequest purchaseRequest) {

        PurchaseEntity purchaseEntity = new PurchaseEntity();
        CartEntity cartEntity = this.buildCart(purchaseRequest);

        purchaseEntity.setCart(cartEntity);
        purchaseEntity.setFechaCompra(LocalDateTime.now());
        purchaseEntity.setEstado(STATE_FINISHED);
        purchaseEntity.setMoneda(MONEDA_ARGENTINA);
        purchaseEntity.setFechaEntrega(LocalDateTime.now());
        purchaseEntity.setCustomer(this.userService.findUserById(BigInteger.valueOf(1l)));
        purchaseEntity.setPrecioTotal(this.buildPurchaseTotal(cartEntity));


        this.purchaseRepository.save(purchaseEntity);
    }

    private BigDecimal buildPurchaseTotal(CartEntity cartEntity) {
        return cartEntity.getProductos()
                .stream()
                .map(e -> e.getProductEntity().getPrecioUnitario())
                .reduce(BigDecimal.valueOf(0), BigDecimal::add);

    }

    private CartEntity buildCart(PurchaseRequest purchaseRequest) {
        CartEntity cartEntity = new CartEntity();

        List<CartProductEntity> cartProducts = purchaseRequest.getProductos()
                .stream()
                .map(e -> new CartProductEntity(this.createProduct(e.getIdProducto()), cartEntity, e.getCantidad()))
                .collect(Collectors.toList());

        cartEntity.setProductos(cartProducts);

        BigInteger totalDeProductos = purchaseRequest.getProductos()
                .stream()
                .map(PurchaseProductRequest::getCantidad)
                .reduce(BigInteger.valueOf(0), BigInteger::add);

        cartEntity.setCantidadDeProductos(totalDeProductos);
        cartEntity.setFechaCreacion(LocalDateTime.now());

        return this.cartRepository.save(cartEntity);
    }

    private ProductEntity createProduct(BigInteger productId){
	    return this.productService.getProductsById(productId);

    }
	
}
