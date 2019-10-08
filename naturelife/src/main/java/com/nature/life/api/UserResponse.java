package com.nature.life.api;

import java.math.BigInteger;

public class UserResponse {

    private BigInteger id;
    private String userName;
    private String userLastName;
    private String mail;

    public UserResponse(BigInteger id, String userName, String userLastName, String mail) {
        this.id = id;
        this.userName = userName;
        this.userLastName = userLastName;
        this.mail = mail;
    }

    public BigInteger getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getMail() {
        return mail;
    }
}
