package com.example.user.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class UserInterface {

    public UserInterface() {

    }

    public void welcome() {
        System.out.println("Please enter your word to be guessed");
    }

    public void position(char letter) {
        System.out.println(letter + " is in position ");
    }

    public void askForGuess(){
        System.out.println("Which letter do you guess?");
    }
}
