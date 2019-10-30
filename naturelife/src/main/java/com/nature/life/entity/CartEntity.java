package com.nature.life.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "carrito")
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",columnDefinition="bigint")
    private BigInteger id;
    private LocalDateTime fechaCreacion;
    private BigInteger cantidadDeProductos;



    @OneToMany(mappedBy = "cartEntity", cascade = CascadeType.ALL)
    private List<CartProductEntity> productos;
    @OneToOne(mappedBy = "cart", fetch = FetchType.LAZY)
    private PurchaseEntity purchase;

    public CartEntity() {
    }

    public CartEntity(LocalDateTime fechaCreacion,
            BigInteger cantidadDeProductos,
            List<CartProductEntity> productos,
            PurchaseEntity purchase) {
        this.fechaCreacion = fechaCreacion;
        this.cantidadDeProductos = cantidadDeProductos;
        this.productos = productos;
        this.purchase = purchase;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public List<CartProductEntity> getProductos() {
        return productos;
    }

    public void setProductos(List<CartProductEntity> productos) {
        this.productos = productos;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public BigInteger getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public void setCantidadDeProductos(BigInteger cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }
}
