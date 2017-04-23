/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.guessmemore.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GuessMeMore {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        Scanner userInput = new Scanner(System.in);
        
        int randomNum = randomizer.nextInt(201) - 100;
        
        // System.out.println(randomNum);
        
        System.out.println("I've chosen a number between -100 and 100. Can you guess what it is?");
        int userGuess = userInput.nextInt();
        
        System.out.println("Your guess: " + userGuess);
        
        if (userGuess < randomNum) {
            System.out.println("Hm, no, that's too low. Try again.");
            
            userGuess = userInput.nextInt();
            
            if (userGuess < randomNum) {
                System.out.println("Still too low. It was actually " + randomNum);
            } else if (userGuess > randomNum) {
                System.out.println("Now you're too high. It was actually " + randomNum);
            } else if (userGuess == randomNum) {
                System.out.println("You got it that time!");
            }
            
        } else if (userGuess > randomNum) {
            System.out.println("No, that's way too high. Take another guess.");
            
            userGuess = userInput.nextInt();
            
            if (userGuess < randomNum) {
                System.out.println("Now you're too low. It was actually " + randomNum);
            } else if (userGuess > randomNum) {
                System.out.println("Still too high... It was actually " + randomNum);
            } else if (userGuess == randomNum) {
                System.out.println("You got it that time!");
            }
            
        } else if (userGuess == randomNum) {
            System.out.println("Wow! You guessed it! Good job.");
        }
        
    }
    
}
