package com.example.durchschnittweb.login.service;


import com.example.durchschnittweb.register.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginService {

    @Autowired
    registerService rService;

    public boolean usernameExists(String username) {


        for (int i = 0; i < rService.getAllUsers().size(); i++) {
            if(rService.getAllUsers().get(i).getUser().equals(username)) {
                return true;
            }
        }


        return false;
    }

    public void aktuelerUser(String username){
        String userN;
        userN= username;


    };

    public int userIndex (String username){
        int index = 0;



        for (int i = 0; i < rService.getAllUsers().size(); i++) {
            if(rService.getAllUsers().get(i).getUser().equals(username)) {
                return i;
            }
        }

        return index;
    };






    //public void userEingabe(String nick, String password) {}




    }





