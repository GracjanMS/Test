package com.example.durchschnittweb.register.controller;

import com.example.durchschnittweb.register.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller



public class registerController {

    @Autowired
    registerService rS;

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/register/createuser")
    public String createuser(@RequestParam String username, @RequestParam String password, @RequestParam String passwordRepeated, Model model) {

        if(rS.userNameExists(username)) {

            model.addAttribute("z", "Username already Exists");

            return "register";
        }

        if(!(rS.checkRepeatedPassword(password, passwordRepeated))) {

            model.addAttribute("z", "Passwords do not Match!");

            return "register";
        }
        rS.registrerUser(username, password);
        //System.out.println(rS.registrerUser());

        model.addAttribute("z", "Password accepted!");





        return "login";
    }


}
