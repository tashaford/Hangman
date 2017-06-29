package com.example.user.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class UserInterface {

    Word word;

    public UserInterface(String setter) {
        word = new Word(setter);
    }

    public void welcome() {
        System.out.println("Let's play hangman. You have six lives to begin with.");
    }

    public void displayForViewer(){
        word.display();
        System.out.println("Here is the number of letters in the word for your to guess: ");
        System.out.println(word.displayToViewer());
    }

    public char askForGuess(){
        System.out.println("Which letter do you guess?");
        return word.getGuess();
    }

    public void position(char letter, int position) {
        System.out.println(letter + " is in position " + position);
    }

    public void informLives(){
        System.out.println("Incorrect, you have used up a life.");
    }

    public void revealWord(){
        System.out.println();
        System.out.println("The word was " + word.getWord());
    }

    public void loseGame(){
        System.out.println();
        System.out.println("You have ran out of guesses and lost.");
    }

    public void winGame(){
        System.out.println();
        System.out.println("You are correct and won!");
    }

}
