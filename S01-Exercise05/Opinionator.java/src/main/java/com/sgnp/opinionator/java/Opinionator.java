/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.opinionator.java;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class Opinionator {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide FOR ME!");
        
        //int x = randomizer.nextInt(5);
        int x = randomizer.nextInt(6);
        
        System.out.println("The number we chose was: " + x);
        
        /*
        The bug is that the randomizer will only generate 0-4.
        So, the line for Mole-Rats will never be able to print out.
        We could make it (5) + 1, but then the Llamas line won't ever print.
        The solution is to change (5) to (6), which has been done above.
        */
        if (x == 0) {
            System.out.println("Llamas are the best!");
        } else if (x == 1) {
            System.out.println("Dodos are the best!");
        } else if (x == 2) {
            System.out.println("Wooly Mammoths are DEFINITELY the best!");
        } else if (x == 3) {
            System.out.println("Sharks are the greatest, they have their own week.");
        } else if (x == 4) {
            System.out.println("Cockatoos are just so awesome!");
        } else if (x == 5) {
            System.out.println("Have you ever met a Mole-Rat? They're GREAT!");
        }
        
        System.out.println("Thanks Random, maybe YOU'RE the best!");
        
    }
    
}
