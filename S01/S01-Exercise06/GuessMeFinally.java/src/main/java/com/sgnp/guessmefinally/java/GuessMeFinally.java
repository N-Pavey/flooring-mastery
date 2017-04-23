/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.guessmefinally.java;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class GuessMeFinally {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Random randomizer = new Random();
        
        int userGuess;
        int randomNum = randomizer.nextInt(200) - 100;
        
        System.out.println("I've chosen a number between -100 and 100. Can you guess what it is?");
        System.out.print("Your guess: ");
        userGuess = userInput.nextInt();
        
        if (userGuess == randomNum) {
            System.out.println("Wow, nice guess! That was it!");
        } else {
            while (userGuess != randomNum) {
                if (userGuess < randomNum) {
                    System.out.println("No, that's way too low. Try again!");
                    System.out.print("Your guess: ");
                    userGuess = userInput.nextInt();
                } else if (userGuess > randomNum) {
                    System.out.println("No, that's too high. Try again!");
                    System.out.print("Your guess: ");
                    userGuess = userInput.nextInt();
                }
            }
            
            System.out.println("Finally! It's about time you got it!");
        }
        
    }
    
}
