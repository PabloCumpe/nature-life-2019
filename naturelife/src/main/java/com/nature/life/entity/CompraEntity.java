package com.nature.life.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "compra")
public class CompraEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",columnDefinition="bigint")
	private BigInteger id;
	
	private BigInteger id_usuario;
	
	private BigInteger id_producto;
	
	private Integer cantidad;
	
	private Integer precio;
	
	private BigInteger id_moneda;
	
	private BigInteger id_medio_pago;
	
	private BigInteger id_orden_pedido;
	
	
	public CompraEntity() {
		
	}
	
	public CompraEntity(BigInteger id, BigInteger id_usuario, BigInteger id_producto, Integer cantidad, Integer precio,
			BigInteger id_moneda, BigInteger id_medio_pago, BigInteger id_orden_pedido) {
		this.id = id;
		this.id_usuario = id_usuario;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.id_moneda = id_moneda;
		this.id_medio_pago = id_medio_pago;
		this.id_orden_pedido = id_orden_pedido;
	}



	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(BigInteger id_usuario) {
		this.id_usuario = id_usuario;
	}

	public BigInteger getId_producto() {
		return id_producto;
	}

	public void setId_producto(BigInteger id_producto) {
		this.id_producto = id_producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public BigInteger getId_moneda() {
		return id_moneda;
	}

	public void setId_moneda(BigInteger id_moneda) {
		this.id_moneda = id_moneda;
	}

	public BigInteger getId_medio_pago() {
		return id_medio_pago;
	}

	public void setId_medio_pago(BigInteger id_medio_pago) {
		this.id_medio_pago = id_medio_pago;
	}

	public BigInteger getId_orden_pedido() {
		return id_orden_pedido;
	}

	public void setId_orden_pedido(BigInteger id_orden_pedido) {
		this.id_orden_pedido = id_orden_pedido;
	}
	
	
	
	
}
