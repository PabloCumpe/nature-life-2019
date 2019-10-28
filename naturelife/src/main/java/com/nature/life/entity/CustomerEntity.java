package com.nature.life.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "clientes")
public class CustomerEntity {

    protected CustomerEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",columnDefinition="bigint")
    private BigInteger id;
    private String razonSocial;
    private String mail;
    private LocalDateTime fechaAlta;
    private String domicilio;
    private String telefono;
    private String cuit;
    private String dni;
	
    @OneToMany(mappedBy = "customer", cascade=CascadeType.ALL)
	private List<PurchaseEntity> compras =  new ArrayList<>();
    
    
    public CustomerEntity(BigInteger id,
            String razonSocial,
            String mail,
            LocalDateTime fechaAlta,
            String domicilio,
            String telefono,
            String cuit,
            String dni) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.mail = mail;
        this.fechaAlta = fechaAlta;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.cuit = cuit;
        this.dni = dni;
    }

    public BigInteger getId() {
        return id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getMail() {
        return mail;
    }

    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCuit() {
        return cuit;
    }

    public String getDni() {
        return dni;
    }
}

