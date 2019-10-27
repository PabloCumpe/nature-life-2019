package com.nature.life.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "compra")
public class PurchaseEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",columnDefinition="bigint")
	private BigInteger id;
	private String moneda;
	private BigDecimal precioTotal;
	private LocalDateTime fechaCompra;
	private LocalDateTime fechaEntrega;
	private String estado;



	
	
}
