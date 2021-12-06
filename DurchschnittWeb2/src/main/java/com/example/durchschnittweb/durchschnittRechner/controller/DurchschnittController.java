package com.example.durchschnittweb.durchschnittRechner.controller;

import com.example.durchschnittweb.login.model.UserNow;
import com.example.durchschnittweb.durchschnittRechner.service.NotenService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.durchschnittweb.register.service.registerService;
import com.example.durchschnittweb.login.service.loginService;




@Controller

public class DurchschnittController {

    @Autowired
    private NotenService notenService;

    @Autowired
    registerService rService;

    @Autowired
    private loginService loginService;

    @Autowired
    private UserNow usernow;


   /* @RequestMapping("/x")
    public String start() {


        return "noteDur";
    }*/

    @RequestMapping("/durchschnitt")
    public String giveDurchschgnitt(@RequestParam double noteInput, String fach, Model model) {

        String hallo;
        double avg;

        notenService.addNote(noteInput, fach);
        avg = notenService.berechneDurchschnitt();
        hallo = usernow.getUser();
        model.addAttribute("test", avg);
        model.addAttribute("gutGemacht", "gut gemacht :D  " +hallo);


        return "noteDur";
    }


    //Nur Für Test
    public void fügeNote(double note, String fach) {
        notenService.addNote(note, fach);
    }


    //Nur Für Test
    public Double testGibAvg() {
        return notenService.berechneDurchschnitt();
    }


}
