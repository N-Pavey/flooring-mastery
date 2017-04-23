/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.bewarethekraken.java;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class BewareTheKraken {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Random randomizer = new Random();
        
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");
        
        int depthDivedInFt = 0;
        int ranFish;
        
        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        
        /*
        If we change the while loop condition to true, it will run as normal
        We have the break when depth = 20000.
        However, if we removed that break, the loop would continue - infinite loop.
        */
        while (depthDivedInFt < 36200) {
            System.out.println("So far, we've swam " + depthDivedInFt + " feet");
            
            if (depthDivedInFt > 0 && depthDivedInFt < 20000 && depthDivedInFt != 10000) {
                ranFish = randomizer.nextInt(4);
            
                if (ranFish == 0) {
                    System.out.println("Hey, isn't that an octopus?");
                } else if (ranFish == 1) {
                    System.out.println("Woah, a jellyfish. Cool!");
                } else if (ranFish == 2) {
                    System.out.println("Watch out! I think I see a shark...");
                } else if (ranFish == 3) {
                    System.out.println("Is that a small giant squid? Or a large regular squid?");
                } else if (ranFish == 4) {
                    System.out.println("Look at the whales! How majestic!");
                }
            }
            
            System.out.println("");
            
            if (depthDivedInFt >= 20000) {
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            } else if (depthDivedInFt == 10000) {
                System.out.println("Hey, should we go back? (yes/no) ");
                String userReturn = userInput.nextLine();
                
                if (userReturn.equalsIgnoreCase("yes")) {
                    break;
                }
                
            }
            
            // I can swim, really fast! 1000ft at a time!
            depthDivedInFt += 1000;
            
        }
        
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
        
    }
    
}
