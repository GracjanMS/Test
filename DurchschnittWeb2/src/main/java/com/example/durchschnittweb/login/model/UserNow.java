package com.example.durchschnittweb.login.model;

import org.springframework.stereotype.Service;

@Service

public class UserNow {


    private String nick;


    public UserNow() {

    }

    public void setUser(String userName){
        nick = userName;



    };


    public String getUser() {
        return nick;
    }






}
