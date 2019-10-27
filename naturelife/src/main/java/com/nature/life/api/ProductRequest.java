package com.nature.life.api;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ProductRequest {

	private String nombre;
	private String descripcion;
	private BigDecimal precioUnitario;
	private String imagen;
	private BigInteger idCategoria;

	public ProductRequest(String nombre,
			String descripcion,
			BigDecimal precioUnitario,
			String imagen,
			BigInteger idCategoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.imagen = imagen;
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public BigInteger getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(BigInteger idCategoria) {
		this.idCategoria = idCategoria;
	}
}
