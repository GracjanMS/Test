package com.example.durchschnittweb.login.controller;


import com.example.durchschnittweb.login.service.loginService;
import com.example.durchschnittweb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.durchschnittweb.login.service.loginService;
@Controller
public class loginController {

    @Autowired
    private User user;

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





       // model.addAttribute("user", userName);
        return "noteDur";


}



}
