package com.hangman;


import com.hangman.user.Commands;

import java.util.ArrayList;
import java.util.List;


public class Game {
    private Commands commands = new Commands();


    public void startGame() {
        String word = Words.generateWord(); // DOG
        String hiddenWord = word.replaceAll("[a-z]", "_"); // ___
        // STORING HIDDEN CHARACTERS -> ___
        System.out.println(word);
        System.out.println(hiddenWord);
        List<Character> playerLetter = new ArrayList<>();
        System.out.println("Please guess a letter");
        String userGuess = commands.getUserInput(); // G
        for (int i = 0; i < word.length() ; i++) {
            System.out.println(word.charAt(i));

        }

        System.out.println(userGuess);
        // AS YOU LOOP CHECK EACH CHARACTER USING THE INDEX
        // 0 1 2
        // INDEX 2 GUESS IS CORRECT -> UPDATE HIDDEN CHARACTER AT INDEX 2
        // LOOP THROUGH EACH CHARACTER IN WORD
        // IF GUESS EQUALS WORD CHARACTER -> UPDATE HIDDEN WORD
    }


}
