package com.nature.life.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nature.life.entity.CategoriaEntity;
import com.nature.life.entity.ProductEntity;

public interface CategorieRepository extends JpaRepository<CategoriaEntity, BigInteger>{
	
}
