package com.hangman;


import com.hangman.user.Commands;

import java.util.ArrayList;
import java.util.List;


public class Game {
    private Commands commands = new Commands();
    private Printer printer = new Printer();
    public static int lives = 6;


    public void startGame() {
        List<String> letterGuesses = new ArrayList<>();
        String word = Words.generateWord();
        String hiddenWord = word.replaceAll("[a-z]", "_");

//        int lives = 6;


        while (lives != 0) {
            System.out.println(hiddenWord);
            System.out.println("Guess a letter!");
            String userGuess = commands.getUserInput();
            userGuess = userGuess.toLowerCase();
            if (userGuess.equals("")) {
                System.out.println("You have guessed an empty character, to give yourself a chance, use a letter!");
            }
            if (letterGuesses.contains(userGuess)) {
                System.out.println("You have already guessed this letter, please guess another!");
            }
            letterGuesses.add(userGuess);
            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (userGuess.equals(String.valueOf(word.charAt(i)))) {
                    hiddenWord = hiddenWord.substring(0, i) + word.charAt(i) + hiddenWord.substring(i + 1);
                    correctGuess = true;


                } // end of FOR loop
            }
            if (correctGuess) {
                printer.correctLetter();
                Hangman.hangmanImage();
                System.out.println("Letters guessed so far " + letterGuesses);
            } else {
                printer.incorrectGuess();
                lives--;
                Hangman.hangmanImage();
                System.out.println("You have " + lives + " lives left");
                System.out.println("Letters guessed so far " + letterGuesses);
            }

            if (hiddenWord.equals(word)) {
                System.out.println("The word was: " + word);
                printer.gameWinner();
                String playerChoice = commands.getUserInput();
                if (playerChoice.equals("y")) {
                    lives = 6;
                    startGame();
                }
            }
        } // END OF WHILE LOOP


        if (lives == 0) {
            System.out.println("The word was: " + word);
            printer.gameOver();
            String playerChoice = commands.getUserInput();
            if (playerChoice.equals("y")) {
                lives = 6;
                startGame();
            }
        }
    }


}



