package com.nature.life.repository;

import com.nature.life.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CustomerRepository extends JpaRepository<CustomerEntity, BigInteger> {
}
