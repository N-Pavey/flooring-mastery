/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.differentkettleoffish.java;

/**
 *
 * @author apprentice
 */
public class DifferentKettleOfFish {
    
    public static void main(String[] args) {
        
        //int fish = 1;
        
        /*
        The main difference is that fish is both initialized and
        incremented within the parameters of the for loop, rather
        than initialized outside and incremented inside like what
        happens with the while loop.
        */
        for (int fish = 1; fish <= 10; fish++) {
            
            if (fish == 3) {
                System.out.println("RED fish!");
            } else if (fish == 4) {
                System.out.println("BLUE fish!");
            } else {
                System.out.println(fish + " fish!");
            }
            
        }
        
        /*
        while (fish < 10) {
            if (fish == 3) {
                System.out.println("RED fish!");
            } else if (fish == 4) {
                System.out.println("BLUE fish!");
            } else {
                System.out.println(fish + " fish!");
            }
            
            fish++;
        }
        */
        
    }
    
}
