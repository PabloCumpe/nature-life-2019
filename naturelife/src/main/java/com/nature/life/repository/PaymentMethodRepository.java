package com.nature.life.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nature.life.entity.PaymentMethodEntity;



public interface PaymentMethodRepository extends JpaRepository<PaymentMethodEntity, BigInteger> {

}
