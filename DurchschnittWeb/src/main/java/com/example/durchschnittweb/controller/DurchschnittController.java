package com.example.durchschnittweb.controller;


import com.example.durchschnittweb.model.User;
import com.example.durchschnittweb.service.NotenService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class DurchschnittController {

    @Autowired
    private NotenService notenService;

    @Autowired
    private User user;


   /* @RequestMapping("/x")
    public String start() {


        return "noteDur";
    }*/

    @RequestMapping("/durchschnitt")
    public String giveDurchschgnitt(@RequestParam double noteInput, String fach, Model model) {


        double avg;

        notenService.addNote(noteInput, fach);
        avg = notenService.berechneDurchschnitt();
        model.addAttribute("test", avg);



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
