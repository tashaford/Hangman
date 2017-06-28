package com.example.user.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class UserInterface {

    public UserInterface() {

    }

    public void welcome() {
        System.out.println("Let's play hangman.");
    }

    public void position(char letter) {
        System.out.println(letter + " is in position ");
    }

    public void askForGuess(){
        System.out.println("Which letter do you guess?");
    }

    public void displayForViewer(){
        System.out.println("Here is the number of letters in the word for your to guess: " );
    }
}
