package com.nature.life.controllers;

import com.nature.life.api.CategoryResponse;
import com.nature.life.api.ProductRequest;
import com.nature.life.api.ProductResponse;
import com.nature.life.entity.ProductEntity;
import com.nature.life.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;

    }


    @GetMapping
    public List<ProductResponse> getProductsList() {
        List<ProductEntity> allProducts = this.productService.getAllProducts();
        return allProducts.stream()
                .map(e -> new ProductResponse(e.getId(),
                        e.getNombre(),
                        e.getDescripcion(),
                        e.getPrecioUnitario(),
                        Objects.nonNull(e.getImagen()) ? new String(e.getImagen()) : null,
                        new CategoryResponse(e.getCategoria().getNombre(), e.getCategoria().getDescripcion())))
                .collect(Collectors.toList());
    }

    @PostMapping
    public void createProduct(@RequestBody ProductRequest productRequest) {

        ProductEntity productEntity = new ProductEntity(null,
                productRequest.getNombre(),
                productRequest.getDescripcion(),
                productRequest.getPrecioUnitario(),
                productRequest.getImagen().getBytes(),
                null);

        this.productService.createNewProduct(productRequest.getIdCategoria(), productEntity);
    }

}
