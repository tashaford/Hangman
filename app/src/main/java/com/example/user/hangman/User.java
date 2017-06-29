package com.example.user.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class User {

    String name;
    int numOfLives;

    public User(String name) {
        this.name = name;
        numOfLives = 6;
    }

    public String getName() {
        return name;
    }

    public int getNumOfLives(){
        return numOfLives;
    }
}
