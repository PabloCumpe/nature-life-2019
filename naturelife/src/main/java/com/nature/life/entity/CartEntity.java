package com.nature.life.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "carrito")
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",columnDefinition="bigint")
    private BigInteger id;
    @OneToMany(mappedBy = "cartEntity", cascade = CascadeType.ALL)
    private List<CartProductEntity> productos;
    @OneToOne(mappedBy = "cart", fetch = FetchType.LAZY)
    private PurchaseEntity purchase;

    protected CartEntity() {
    }
    public CartEntity(BigInteger id, List<CartProductEntity> productos) {
        this.id = id;
        this.productos = productos;
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
}
