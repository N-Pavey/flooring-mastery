/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luckysevens.java;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class LuckySevens {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Random randomizer = new Random();
        
        int moneyAvailable, rollDice;
        int rollCounter = 0;
        int highestTotalRollNum = 0;
        
        System.out.print("How many dollars are you willing to bet? $");
        moneyAvailable = userInput.nextInt();
        int highestTotal = moneyAvailable;
        
        for (int i = 0; moneyAvailable > 0; i++) {
            rollDice = (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1);
            rollCounter++;
            
            if (rollDice == 7) {
                moneyAvailable += 4;
                
                if (moneyAvailable > highestTotal) {
                    highestTotal = moneyAvailable;
                    highestTotalRollNum = rollCounter;
                }
            } else {
                moneyAvailable -= 1;
            }
            
        }
        
        System.out.println("You went broke after " + rollCounter + " rolls...");
        System.out.println("You should have quit after " + highestTotalRollNum + " rolls when you were ahead.");
        System.out.println("You had $" + highestTotal + " at that point.");
        
    }
    
}
