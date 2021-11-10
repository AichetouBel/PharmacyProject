package com.pharmacie.pharmacie.domain.entities;

public class user {

    String username;
    String passwd;
    
    public user() {
    }

    public user(String username, String passwd) {
        this.username = username;
        this.passwd = passwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    
}
