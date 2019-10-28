package com.nature.life.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customer")
	private CustomerEntity customer;
    @OneToOne
    @JoinColumn(name = "id_cart")
    private CartEntity cart;    
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paymentMethod")
    private PaymentMethodEntity paymentMethod;
    
    
    public PurchaseEntity() {

	}	
	
	
	public PurchaseEntity(String moneda, BigDecimal precioTotal, LocalDateTime fechaCompra, LocalDateTime fechaEntrega,
			String estado) {
		this.moneda = moneda;
		this.precioTotal = precioTotal;
		this.fechaCompra = fechaCompra;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;

	}
	
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public BigDecimal getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(BigDecimal precioTotal) {
		this.precioTotal = precioTotal;
	}
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public LocalDateTime getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDateTime fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public CustomerEntity getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}


	
	
	
}
