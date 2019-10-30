package com.nature.life.repository;

import com.nature.life.entity.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
@Repository
public interface PurchaseRepository  extends JpaRepository<PurchaseEntity, BigInteger>{

}
