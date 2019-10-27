package com.nature.life.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name = "productos")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint")
    private BigInteger id;
    private String nombre;
    private String descripcion;
    private BigDecimal precioUnitario;
    @Lob
    private byte[] imagen;
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL)
    private List<CartProductEntity> cart = new ArrayList<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria")
    private CategoriaEntity categoria;

    protected ProductEntity() {
    }

    public ProductEntity(BigInteger id,
            String nombre,
            String descripcion,
            BigDecimal precioUnitario,
                         byte[] imagen,
            CategoriaEntity categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.imagen = imagen;
        this.cart = cart;
        this.categoria = categoria;
    }

    public List<CartProductEntity> getCart() {
        return cart;
    }

    public void setCart(List<CartProductEntity> cart) {
        this.cart = cart;
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

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
