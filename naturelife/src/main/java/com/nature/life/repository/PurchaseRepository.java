package com.nature.life.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nature.life.entity.ProductEntity;
import com.nature.life.entity.PurchaseEntity;

public interface PurchaseRepository  extends JpaRepository<PurchaseEntity, BigInteger>{

}
