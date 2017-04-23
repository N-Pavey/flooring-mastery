/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.highroller.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HighRoller {
    
    public static void main(String[] args) {
        
        Random diceRoller = new Random();
        Scanner diceType = new Scanner(System.in);
        
        int rollResult = diceRoller.nextInt(6) + 1;
        
        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);
        
        if (rollResult == 1) {
            System.out.println("I rolled a critical failure!");
        }
        
        System.out.println("Nice. Your turn! How many sides does your dice have? ");
        int userDice = diceType.nextInt();
        
        System.out.println(userDice + "-sided huh? Cool! Let's see what you roll.");
        
        int userResult = diceRoller.nextInt(userDice) + 1;
        
        if (userResult == 1) {
            System.out.println("You rolled a " + userResult + "... A critical failure, ouch!");
        } else if (userResult == userDice) {
            System.out.println("Woah! You rolled a " + userResult + "! That's a critical. Nice job!!");
        } else {
            System.out.println("You rolled a " + userResult + ". Not too bad.");
        }
        
    }
    
}
