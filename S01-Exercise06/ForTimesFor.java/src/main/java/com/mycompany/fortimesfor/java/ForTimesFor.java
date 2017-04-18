/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fortimesfor.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ForTimesFor {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int multiplyNum = 1;
        float numCorrect = 0;
        float questionsAsked = 0;
        int userGuess;
        
        System.out.print("Which times table shall I recite? ");
        int timesTable = userInput.nextInt();
        
        for (int i = 0; i < 15; i++) {
            
            questionsAsked++;
            
            System.out.print(multiplyNum + " * " + timesTable + " is: ");
            userGuess = userInput.nextInt();
            
            if (userGuess == (multiplyNum * timesTable)) {
                System.out.println((multiplyNum * timesTable) + " is correct!");
                numCorrect++;
            } else {
                System.out.println("Sorry. The correct answer is " + (multiplyNum * timesTable));
            }
            
            multiplyNum++;
            
        }
        
        float finalPercent = (numCorrect / questionsAsked) * 100;
        
        if (finalPercent > 90) {
            System.out.println("Wow! You got " + numCorrect + " correct.");
            System.out.println("That's " + finalPercent + "%!");
        } else if (finalPercent < 50) {
            System.out.println("Oh no... You only got " + numCorrect + " correct.");
            System.out.println("That's only " + finalPercent + "%...");
            System.out.println("You should really study more.");
        } else {
            System.out.println("Looks like you got " + numCorrect + " correct.");
            System.out.println("That's " + finalPercent + "%. Not too bad.");
        }
        
        
    }
    
}
