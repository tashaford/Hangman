package com.example.user.hangman;

import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 28/06/2017.
 */

public class Word {

    String word;
    StringBuilder sb;

    public Word(String word) {
        this.word = word;
        sb = new StringBuilder(word);
    }

    public void setWord() {
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine().toLowerCase();
    }

    public String getWord() {
        return this.word;
    }

    public int wordLength() {
        return word.length();
    }

    public ArrayList<Integer> isLetterInWord(char guess) {
        ArrayList<Integer> positions = new ArrayList<>();
        int index = word.indexOf(guess);
        while (index >= 0) {
            positions.add(index +1);
            index = word.indexOf(guess, index + 1);
        } return positions;
    }
}

