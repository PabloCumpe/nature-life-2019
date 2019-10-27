package com.nature.life.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nature.life.entity.ProductEntity;


public interface ProductRepository extends JpaRepository<ProductEntity, BigInteger> {
	
}
