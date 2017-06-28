package com.example.user.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class Game {

    private UserInterface ui;

    public Game(){
        ui = new UserInterface();
    }

    public void playGame(){
        ui.welcome();

    }
}
