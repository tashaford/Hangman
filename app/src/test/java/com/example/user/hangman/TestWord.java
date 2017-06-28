package com.example.user.hangman;

import org.junit.Before;
import org.junit.Test;
import java.lang.StringBuilder;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/06/2017.
 */

public class TestWord {

    Word word;
    Word word2;

    @Before
    public void before(){
        word = new Word("hello");
        word2 = new Word("sausages");
    }

    @Test
    public void checkGetWord(){
        assertEquals("hello", word.getWord());
    }

    @Test
    public void checkWordLength(){
        assertEquals(5, word.wordLength());
    }

    @Test
    public void checkIsLetterInWord() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
    assertEquals(expected, word.isLetterInWord('e'));
    }

    @Test
    public void checkIsLetterInWordMultiple(){
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(4);
        assertEquals(expected, word.isLetterInWord('l'));
    }

    @Test
    public void checkIsLetterInWordMultipleMore() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);
        expected.add(8);
        assertEquals(expected, word2.isLetterInWord('s'));
    }
}
