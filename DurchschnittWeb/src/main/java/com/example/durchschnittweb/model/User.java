package com.example.durchschnittweb.model;

import org.springframework.stereotype.Service;

@Service

public class User {

    private String nick;
    private String password;

    public User() {

    }

    public User(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }
    public String getUser() {
        return nick;
    }

}
