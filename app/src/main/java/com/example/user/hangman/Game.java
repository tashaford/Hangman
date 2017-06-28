package com.example.user.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class Game {

    private UserInterface ui;
    private Word word;

    public Game(String setter){
        word = new Word(setter);
        ui = new UserInterface(setter);
    }

    public void playGame(){
        ui.welcome();
        ui.displayForViewer();
    }
}
