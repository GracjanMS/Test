package com.example.durchschnittweb.durchschnittRechner.service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.example.durchschnittweb.durchschnittRechner.model.Note;
//import static com.sun.tools.javac.resources.CompilerProperties.Notes.Note;

@Service
public class NotenService {


    public ArrayList<Note> noten = new ArrayList<>();
    private double durchschnitt;

    public void addNote(double note, String fach) {
        noten.add(new Note(note, fach));
    }


    public double berechneDurchschnitt() {
        double summe = 0;

        for (int i = 0; i< noten.size();i++) {
            summe = summe + noten.get(i).getNote();
        }
        this.durchschnitt = summe / noten.size();
        return durchschnitt;
    }


    public double getDurchschnitt() {

        return durchschnitt;
    }

}
