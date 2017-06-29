package com.example.user.hangman;

import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by user on 28/06/2017.
 */

public class Word {

    String word;
    ArrayList<String> displayList;
    ArrayList<String> guessed;


    public Word(String word) {
        this.word = word;
        displayList = new ArrayList<>();
        this.guessed = new ArrayList<String>();

    }

    public void setWord() {
        Scanner sc = new Scanner(in);
        word = sc.nextLine().toLowerCase();
    }

    public String getWord() {
        return this.word;
    }

    public int wordLength() {
        return word.length();
    }

    public boolean checkIfDisplayListEmpty(){
        if (displayList != null) return true;
        return false;
    }

    public ArrayList<String> display() {
        for (char letter : word.toCharArray()) {
            displayList.add("*");
        }
        return displayList;
    }

    public String displayToViewer() {
        StringBuilder formattedWord = new StringBuilder();
        for (String s : displayList) {
            formattedWord.append(s);
        }
        return formattedWord.toString();
    }


    public char getGuess(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().charAt(0);
    }

    public ArrayList<Integer> isLetterInWord(char guess) {
        ArrayList<Integer> positions = new ArrayList<>();
        int index = word.indexOf(guess);
        while (index >= 0) {
            positions.add(index + 1);
            index = word.indexOf(guess, index + 1);
        }
        return positions;
    }

}


