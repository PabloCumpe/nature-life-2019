package com.nature.life.api;

public class CategorieRequest {


	private String nombre;
	private String descripcion;

	public CategorieRequest(String nombre, String descripcion) {
		super();
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