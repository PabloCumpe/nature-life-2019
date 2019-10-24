package com.nature.life.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nature.life.api.ProductRequest;
import com.nature.life.api.UserRequest;
import com.nature.life.entity.ProductEntity;
import com.nature.life.entity.UserEntity;
import com.nature.life.services.ProductService;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
		
	}
	
	
    @GetMapping
    public List<String> getAllProducts() {
        return Arrays.asList("product1", "product2", "product3", "product4", "product5", "product6");
    }
    
    
    @PostMapping("/producto")
    public void createUser(@RequestBody ProductRequest productRequest) {
        ProductEntity productEntity= new ProductEntity(productRequest.getNombre(),
        		productRequest.getDescripcion())  ;
       this.productService.createNewProduct(productEntity);
    }
}
