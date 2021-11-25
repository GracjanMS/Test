package com.example.durchschnittweb.model;

import javax.annotation.PostConstruct;

public class Note {

    private double note;
    private String fach;

    public Note() {

    }

    public Note(double note, String fach) {
        this.note = note;
        this.fach = fach;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    @PostConstruct
    public void postCon() {
        this.note = 0;
        this.fach = "Fach";
        System.out.println("PostConstruct" + " " + this);
    }

    @Override
    public String toString() {
        return fach + ": " + note;
    }


}
