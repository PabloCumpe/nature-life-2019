package com.nature.life.api;

import java.math.BigInteger;
import java.util.List;

public class PurchaseRequest {

    private List<PurchaseProductRequest> productos;
    private BigInteger idMedioDePago;

    protected PurchaseRequest() {
    }

    public PurchaseRequest(List<PurchaseProductRequest> productos,
            BigInteger idMedioDePago) {
        this.productos = productos;
        this.idMedioDePago = idMedioDePago;
    }

    public List<PurchaseProductRequest> getProductos() {
        return productos;
    }

    public void setProductos(List<PurchaseProductRequest> productos) {
        this.productos = productos;
    }

    public BigInteger getIdMedioDePago() {
        return idMedioDePago;
    }

    public void setIdMedioDePago(BigInteger idMedioDePago) {
        this.idMedioDePago = idMedioDePago;
    }
}
