package com.example.durchschnittweb.login.controller;

import com.example.durchschnittweb.login.model.UserNow;
import com.example.durchschnittweb.login.service.loginService;
import com.example.durchschnittweb.register.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

    @Autowired
    private User user;

    @Autowired
    private UserNow usernow;

    @Autowired
    private loginService loginService;


    @RequestMapping("/")
    public String login() {
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginAcc(@RequestParam String username, @RequestParam String password, Model model) {



        if(!(loginService.usernameExists(username))) {

            model.addAttribute("l", "Username not found. Please register yourself!");

            return "login";
        }

        usernow.setUser(username);
String user = usernow.getUser();

        model.addAttribute("user", "Du bist als " +user+ " eingelogt.");
       // model.addAttribute("user", userName);
        return "noteDur";


}



}
