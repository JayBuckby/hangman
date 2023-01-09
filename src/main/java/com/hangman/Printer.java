package com.hangman;

public class Printer {
public void correctLetter() {
    System.out.println("You correctly guessed a letter!");
}
public void incorrectGuess() {
    System.out.println("Incorrect guess, you have lost a life!");
}
public void gameOver() {
    System.out.println("You didn't guess the word and have run out of lives, the game is over, would you like to play again? (y/n)");
}
public void gameWinner(){
    System.out.println("Congratulations! You have correctly guessed all the letters in the word. Would you like to play again? (y/n)");
}
public void hangmanImage1() {
    System.out.println("__|__");
}
}
