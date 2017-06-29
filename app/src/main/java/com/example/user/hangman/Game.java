package com.example.user.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class Game {

    private UserInterface ui;
    private Word word;
    private User user;
    String name;
    int lives = 0;


    public Game(String setter) {
        word = new Word(setter);
        ui = new UserInterface(setter);
        user = new User(name);
    }

    public void playGame() {
        ui.welcome();
        ui.displayForViewer();
        while (lives < 6){
           char guess = ui.askForGuess();
            checkLetter(guess);
        }
        endGame();
    }

    public void checkLetter(char guess) {
        word.isLetterInWord(guess);
        if (word.checkIfDisplayListEmpty() != true) {
            for (int arrayPosition : word.isLetterInWord(guess)) {
                ui.possition(guess, arrayPosition);
            }
        } else {
            ui.informLives();
            lives ++ ;
        }
    }

//    public void guessing() {
//        while (lives < 6) {
//            char guess = ui.askForGuess();
//            checkLetter(guess);
//        }
//    }

    public void endGame(){
        if (lives == 6){
        ui.loseGame();
        }
        if (lives < 6){
            ui.winGame();
        }
        ui.revealWord();

    }

}
