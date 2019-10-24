package com.nature.life.services;

import org.springframework.stereotype.Service;

import com.nature.life.entity.ProductEntity;
import com.nature.life.repository.ProductRepository;



@Service
public class ProductService {
	
	private final ProductRepository productRepository;
	
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public void createNewProduct(ProductEntity productEntity) {
		this.productRepository.save(productEntity);
	}

}
