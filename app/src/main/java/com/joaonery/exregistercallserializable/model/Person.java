package com.joaonery.exregistercallserializable.model;

import java.io.Serializable;

public class Person implements Serializable{

    private String login;
    private String password;

    public Person() {
    }

    public Person(String login, String password) {
        if(login.equalsIgnoreCase("adm1") && password.equalsIgnoreCase("adm1")){
            this.login = login;
            this.password = password;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  "Login: " + login + "\n" +
                "Password: " + password;
    }
}