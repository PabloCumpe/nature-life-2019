package com.nature.life.services;

import com.nature.life.entity.CategoriaEntity;
import com.nature.life.exceptions.NaturLifeException;
import org.springframework.stereotype.Service;

import com.nature.life.entity.ProductEntity;
import com.nature.life.repository.ProductRepository;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CategorieService categorieService;

    public ProductService(ProductRepository productRepository,
            CategorieService categorieService) {
        this.productRepository = productRepository;
        this.categorieService = categorieService;
    }

    public void createNewProduct(BigInteger categoryId, ProductEntity productEntity) {
        final List<CategoriaEntity> categories = this.categorieService.getCategoriasByIds(categoryId);
        CategoriaEntity categoriaEntity = categories.stream()
                .findFirst()
                .orElseThrow(() -> new NaturLifeException("No existe categoria con ese id"));
        productEntity.setCategoria(categoriaEntity);
        this.productRepository.save(productEntity);
    }

	public List<ProductEntity> getProducts(String name) {
        if (Objects.nonNull(name)){
            return this.productRepository.searchProductsByName(name);
        }
		return this.productRepository.findAll();
	}

    public List<ProductEntity> getProductsByName(String name) {
        return this.productRepository.searchProductsByName(name);
    }

    public ProductEntity getProductsById(BigInteger productId) {
        return this.productRepository.findById(productId).orElseThrow(()->new NaturLifeException("error"));

    }


}
