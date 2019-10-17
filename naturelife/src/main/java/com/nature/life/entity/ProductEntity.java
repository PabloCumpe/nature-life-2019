package com.nature.life.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "productos")
public class ProductEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",columnDefinition="bigint")
	private BigInteger id;
	
	private String nombre;
	
	private String descripcion;
	
	private BigInteger id_categoria;
	
	private BigInteger id_UniMedida;
	
	
	
	
	public ProductEntity() {
		
	}
	
	
	public ProductEntity(BigInteger id, String nombre, String descripcion, BigInteger id_categoria, BigInteger id_UniMedida) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.id_categoria = id_categoria;
		this.id_UniMedida = id_UniMedida;
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


	public BigInteger getId_categoria() {
		return id_categoria;
	}


	public void setId_categoria(BigInteger id_categoria) {
		this.id_categoria = id_categoria;
	}


	public BigInteger getId_UniMedida() {
		return id_UniMedida;
	}


	public void setId_UniMedida(BigInteger id_UniMedida) {
		this.id_UniMedida = id_UniMedida;
	}
	
	
}
