package com.example.realmdbexam;

import io.realm.RealmObject;

public class User extends RealmObject {
    private String email;
    private String password;

    public User() {

    }
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
