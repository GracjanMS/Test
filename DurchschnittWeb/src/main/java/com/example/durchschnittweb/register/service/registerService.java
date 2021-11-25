package com.example.durchschnittweb.register.service;

import com.example.durchschnittweb.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class registerService {


    ArrayList <User> users = new ArrayList<>();

    public void registrerUser(String nick, String password) {

        users.add(new User(nick, password));

    }
    public ArrayList<User> getAllUsers(){
        return users;
    }


    public boolean userNameExists(String username) {

        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUser().equals(username)) {
                System.out.println("Username already Exists!");
                return true;
            }
        }

        System.out.println("Username accepted!");
        return false;

    }


    public boolean checkRepeatedPassword(String pw, String pwRepeated) {

        if(pw.equals(pwRepeated)) {
            System.out.println("Passwords match!");
            return true;
        }

        System.out.println("Passwords do not match!");
        return false;
    }








    /*public String getUser() {
        return users.get(0).getUser();
    }*/

}







