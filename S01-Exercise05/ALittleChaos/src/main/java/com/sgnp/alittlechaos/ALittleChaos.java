/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.alittlechaos;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class ALittleChaos {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
        
        int num = randomizer.nextInt(100);
        
        System.out.println("You can store a randomized resulte: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);
        
        // If r.nextInt(101) is changed to what it is below
        // Then it no longer generates a number between 0-100
        // Instead, it generates a number between 0-49
        // And then adds 50 to it. So the lowest number will be 50 instead of 0.
        System.out.print(randomizer.nextInt(50) + 50 + ", ");
        System.out.print(randomizer.nextInt(50) + 50 + ", ");
        System.out.print(randomizer.nextInt(50) + 50 + ", ");
        System.out.print(randomizer.nextInt(50) + 50 + ", ");
        System.out.print(randomizer.nextInt(50) + 50 + ", ");
        System.out.println(randomizer.nextInt(50) + 50);
        
    }
    
}
