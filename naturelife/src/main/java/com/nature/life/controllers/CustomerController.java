package com.nature.life.controllers;

import com.nature.life.api.CustomerResponse;
import com.nature.life.entity.CustomerEntity;
import com.nature.life.services.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    public CustomerResponse getLoggedCustomerInfo() {
        CustomerEntity custo = this.customerService.findUserById(new BigInteger("1"));
        return new CustomerResponse(custo.getId(),
                custo.getRazonSocial(),
                custo.getMail(),
                custo.getNombre(),
                custo.getApellido(),
                custo.getFechaAlta(),
                custo.getDomicilio(),
                custo.getTelefono(),
                custo.getCuit(),
                custo.getDni());
    }
}
