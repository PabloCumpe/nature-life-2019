package com.nature.life.api;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class CustomerResponse {

    private BigInteger id;
    private String razonSocial;
    private String mail;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaAlta;
    private String domicilio;
    private String telefono;
    private String cuit;
    private String dni;

    public CustomerResponse(BigInteger id, String razonSocial, String mail, String nombre, String apellido, LocalDateTime fechaAlta, String domicilio, String telefono, String cuit, String dni) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.mail = mail;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaAlta = fechaAlta;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.cuit = cuit;
        this.dni = dni;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
