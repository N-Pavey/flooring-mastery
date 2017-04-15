/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.knockknock.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class KnockKnock {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();
        
        //If the .equals() is replaced with ==, then it doesn't recognize the correct answer.
        if (nameGuess.equalsIgnoreCase("Marty McFly")) {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future;"); // Sorry, had to!
        } else {
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
        
    }
    
}
