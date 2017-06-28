package com.example.user.hangman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/06/2017.
 */

public class TestUserInterface {

    UserInterface ui;

    @Before
    public void before() {
     ui = new UserInterface();
    }

//    @Test
//    public void checkWelcome() {
//        assertEquals("Please enter your word to be guessed", ui.welcome());
//    }
}
