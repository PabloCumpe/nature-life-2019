package com.nature.life.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "productos")
public class ProductEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",columnDefinition="bigint")
	private BigInteger id;
	
	private String nombre;
	
	private String descripcion;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORIA_ID")
	private CategoriaEntity categoria;

	
	
	
	
	public CategoriaEntity getCategoria() {
		return categoria;
	}


	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}


	public ProductEntity() {
		
	}
	
	
	public ProductEntity(String nombre, String descripcion, CategoriaEntity categoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
	}



	public BigInteger getId() {
		return id;
	}


	public void setId(BigInteger id) {
		this.id = id;
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
	
	
}
