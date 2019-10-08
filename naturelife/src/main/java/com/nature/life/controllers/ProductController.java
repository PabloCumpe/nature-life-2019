package com.nature.life.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<String> getAllProducts() {
        return Arrays.asList("product1", "product2", "product3", "product4", "product5", "product6");
    }
}
