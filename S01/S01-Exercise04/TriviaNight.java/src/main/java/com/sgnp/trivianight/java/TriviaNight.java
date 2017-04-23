/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.trivianight.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TriviaNight {
    
    public static void main(String[] args) {
        
        Scanner userAnswer = new Scanner(System.in);
        
        int answer1, answer2, answer3;
        int score = 0;
        
        System.out.println("FIRST QUESTION!");
        System.out.println("Who is the main character in the Legend of Zelda games?");
        System.out.println("1. Zelda        2. Hylian");
        System.out.println("3. Link         4. Linkle");
        
        answer1 = userAnswer.nextInt();
        
        if (answer1 == 3) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Sorry, incorrect.");
        }
        
        System.out.println("SECOND QUESTION!");
        System.out.println("What is the latest Legend of Zelda game?");
        System.out.println("1. Twilight Princess        2. Breath of the Wild");
        System.out.println("3. Wind Waker               4. The Legend of Zelda");
        
        answer2 = userAnswer.nextInt();
        
        if (answer2 == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Sorry, incorrect.");
        }
        
        System.out.println("LAST QUESTION!!");
        System.out.println("What is the name of sword?");
        System.out.println("1. Light        2. Twilight");
        System.out.println("3. Hero         4. Master");
        
        answer3 = userAnswer.nextInt();
        
        if (answer3 == 4) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Sorry, incorrect.");
        }
        
        if (score == 3) {
            System.out.println("WOW!! You got all of them right!");
        } else if (score == 0) {
            System.out.println("Oh no! You didn't get a single one right...");
        } else {
            System.out.println("Good job! Looks like you got " + score + " correct.");
        }
        
    }
    
}
