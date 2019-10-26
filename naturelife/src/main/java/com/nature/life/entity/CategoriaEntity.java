package com.nature.life.entity;

import java.math.BigInteger;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

@Entity(name = "categoria")
public class CategoriaEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCategoria",columnDefinition="bigint")
	private BigInteger idCategoria;
	
	private String nombre;
	 
	private String descripcion;
	
	//Se agrupan los libros que sean de la categoria this
	
	@OneToMany(mappedBy = "categoria", cascade=CascadeType.ALL)
	private List<ProductEntity> productos =  new ArrayList<>();
	


	public List getProductos() {
		return productos;
	}

	public void setProductos(List productos) {
		this.productos = productos;
	}

	public CategoriaEntity() {
		
	}
	
	public CategoriaEntity(String nombre, String descripcion ) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public BigInteger getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(BigInteger idCategoria) {
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



	
	
	
}
