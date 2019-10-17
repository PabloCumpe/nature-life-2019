package com.nature.life.api;
//test commit nico
public class UserRequest {


    private String userName;
    private String userLastName;
    private String mail;
    private String password;

    public UserRequest(String userName, String userLastName, String mail, String password) {
        this.userName = userName;
        this.userLastName = userLastName;
        this.mail = mail;
        this.password = password;
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

    public String getPassword() {
        return password;
    }
}
