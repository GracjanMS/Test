package com.example.durchschnittweb.login.service;


import com.example.durchschnittweb.model.User;
import com.example.durchschnittweb.register.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

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








    //public void userEingabe(String nick, String password) {}




    }





