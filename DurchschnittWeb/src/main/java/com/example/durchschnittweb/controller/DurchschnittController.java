package com.example.durchschnittweb.controller;


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


    @RequestMapping("/durchschnitt")
    public String giveDurchschgnitt(@RequestParam(value = "noteInput", required = false, defaultValue = "0.1") String noteInput, Model model) {

        double h1 = Double.valueOf(noteInput);

        if (h1 == 0.1) {

        } else {

            notenService.noten.add(Double.valueOf(h1));
        }


        String note;
        note = String.valueOf(gibDurchschnitt());
        model.addAttribute("test", note);


        return "noteDur";
    }


    public void fügeNote(double note) {
        notenService.addNote(note);
    }

    public Double gibDurchschnitt() {

        notenService.berechneDurchschnitt();
        return notenService.getDurchschnitt();


    }


}
