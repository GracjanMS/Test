package com.example.notendurchschnitts.controller;

import com.example.notendurchschnitts.service.NotenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DurchschnittController {
    @Autowired
    private NotenService notenService;

    public void fügeNote(double note) {
        notenService.addNote(note);
    }

    public Double gibDurchschnitt() {

        notenService.berechneDurchschnitt();
        return notenService.getDurchschnitt();


    }


}
