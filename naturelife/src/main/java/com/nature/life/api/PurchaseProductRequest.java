package com.nature.life.api;

import java.math.BigInteger;

public class PurchaseProductRequest {
    private BigInteger idProducto;
    private BigInteger cantidad;

    protected PurchaseProductRequest() {
    }

    public PurchaseProductRequest(BigInteger idProducto, BigInteger cantidad) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public BigInteger getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(BigInteger idProducto) {
        this.idProducto = idProducto;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }
}
