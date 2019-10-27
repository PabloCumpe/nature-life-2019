package com.nature.life.api;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ProductResponse {

	private String nombre;
	private String descripcion;
	private BigDecimal precioUnitario;
	private String imagen;
	private CategoryResponse categoria;

	public ProductResponse(String nombre,
			String descripcion,
			BigDecimal precioUnitario,
			String imagen,
			CategoryResponse categoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.imagen = imagen;
		this.categoria = categoria;
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

	public CategoryResponse getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoryResponse categoria) {
		this.categoria = categoria;
	}
}
