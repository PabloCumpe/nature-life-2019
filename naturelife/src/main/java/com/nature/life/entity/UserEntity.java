package com.nature.life.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity(name = "users")
public class UserEntity {

    protected UserEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",columnDefinition="bigint")
    private BigInteger id;

    private String firstName;

    private String lastName;

    private String mail;

    private String password;

    private LocalDateTime creationDate;

    public UserEntity(String firsName, String lastName, String mail, String password, LocalDateTime creationDate) {
        this.firstName = firsName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.creationDate = creationDate;
    }

    public BigInteger getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
