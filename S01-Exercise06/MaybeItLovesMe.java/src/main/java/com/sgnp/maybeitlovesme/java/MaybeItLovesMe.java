/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.maybeitlovesme.java;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class MaybeItLovesMe {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        System.out.println("Well, here goes nothing.");
        
        int petalCounter = randomizer.nextInt(76) + 13;
        int counter = 0;
        Boolean lovesMe = true;
        
        if ((petalCounter % 2) == 0) {
            lovesMe = false;
        }
        
        while (petalCounter > 0) {
            if ((counter % 2) == 0 || counter == 0) {
                System.out.println("He LOVES me!!");
                petalCounter--;
                counter++;
            } else {
                System.out.println("He loves me not...");
                petalCounter--;
                counter++;
            }
        }
        
        if (lovesMe == false) {
            System.out.println("Awwww... bummer...");
        } else {
            System.out.println("Oh, wow! He loves me! It's meant to be!!");
        }
        
    }
    
}
