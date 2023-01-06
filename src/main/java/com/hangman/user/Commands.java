package com.hangman.user;

import java.util.Scanner;

public class Commands {

    private Scanner scanner = new Scanner(System.in);

    public String getUserInput(){
       String userInput = scanner.nextLine();
       return userInput;
    }




}
