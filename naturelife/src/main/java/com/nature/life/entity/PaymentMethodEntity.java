package com.nature.life.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity(name = "medios_de_pago")
public class PaymentMethodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint")
    private BigInteger id;
    private String tipo;
    private String descripcion;

    protected PaymentMethodEntity() {
    }

    public PaymentMethodEntity(BigInteger id,
            String tipo,
            String descripcion) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public BigInteger getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
