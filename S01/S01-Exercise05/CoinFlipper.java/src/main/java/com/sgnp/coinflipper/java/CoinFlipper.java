/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.coinflipper.java;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class CoinFlipper {
    
    public static void main(String[] args) {
        
        Random coinRandom = new Random();
        
        boolean flipResult = coinRandom.nextBoolean();
        
        //True = Heads | False = Tails
        
        System.out.println("Ready, set, FLIP!");
        
        if (flipResult == true) {
            System.out.println("It landed on Heads!");
        } else if (flipResult == false) {
            System.out.println("Looks like it landed on Tails.");
        }
        
    }
    
}
