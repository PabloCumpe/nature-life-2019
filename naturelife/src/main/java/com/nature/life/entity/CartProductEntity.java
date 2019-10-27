package com.nature.life.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigInteger;

@Entity(name = "cart_products")
public class CartProductEntity implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn
    private ProductEntity productEntity;
    @Id
    @ManyToOne
    @JoinColumn
    private CartEntity cartEntity;

    private BigInteger cantidad;


    protected CartProductEntity() {
    }
    public CartProductEntity(ProductEntity productEntity,
            CartEntity cartEntity,
            BigInteger cantidad) {
        this.productEntity = productEntity;
        this.cartEntity = cartEntity;
        this.cantidad = cantidad;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public CartEntity getCartEntity() {
        return cartEntity;
    }

    public void setCartEntity(CartEntity cartEntity) {
        this.cartEntity = cartEntity;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }
}
