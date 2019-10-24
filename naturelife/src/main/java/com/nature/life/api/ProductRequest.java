package com.nature.life.api;


public class ProductRequest {

	private String nombre;
	
	private String descripcion;
	
		
	public ProductRequest(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
	
}
