/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.doitbetter.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DoItBetter {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        double milesRun, hotdogsEaten, knownLanguages;
        int addOne = 1;
        
        System.out.println("How many miles can you run? ");
        milesRun = inputReader.nextDouble();
        System.out.println("That's okay. I was running that much when I was 6.");
        System.out.println("I'm now running " + (milesRun * 2 + addOne) + " miles!");
        
        System.out.println("What about hotdogs? How many of those can you eat? ");
        hotdogsEaten = inputReader.nextDouble();
        System.out.println("Are you even trying? I can eat as many as " + (hotdogsEaten * 2 + addOne) + " hotdogs at any given moment.");
        
        System.out.println("Okay, okay. Languages. How many of those do you know? ");
        knownLanguages = inputReader.nextDouble();
        System.out.println("Only that many? You should work on that, because I'm up to " + (knownLanguages * 2 + addOne) + " known languages, and I'm not even finished.");
        
    }
    
}
