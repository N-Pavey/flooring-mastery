/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.lazyteenager.java;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class LazyTeenager {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        int percentChance = 5;
        int ranChance;
        Boolean roomClean = false;
        int counter = 1;
        
        do {
            
            System.out.println("Clean your room!! " + counter);
            
            ranChance = randomizer.nextInt(100) + 1;
            
            if (counter == 15) {
                System.out.println("That's it!! You're grounded and I'm taking your XBox!!");
                break;
            } else if (ranChance > (100 - percentChance)) {
                System.out.println("Fine! I'm cleaning it, but I'm not taking out the trash!!");
                roomClean = true;
            } else if (ranChance < (100 - percentChance)) {
                percentChance += 5;
                counter++;
            }
            
        } while (roomClean == false);
        
    }
    
}
