package com.nature.life.services;

import com.nature.life.entity.CustomerEntity;
import com.nature.life.exceptions.NaturLifeException;
import com.nature.life.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity findUserById(BigInteger id) {
        return this.customerRepository.findById(id).orElseThrow(()->new NaturLifeException("error"));
    }

}
