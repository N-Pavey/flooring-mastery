/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springforwardfallback.java;

/**
 *
 * @author apprentice
 */
public class SpringForwardFallBack {
    
    public static void main(String[] args) {
        
        
        //The original start and stop ranges are:
        //Start: 0, where i is initialized.
        //Stop: 10, it'll print out 9, add 1 to i, and then stop as it's
        //no longer less than 10.
        System.out.println("It's Spring...!");
        for (int i = 1; i < 11; i++) {
            System.out.println(i + ", ");
        }
        
        //The original start and stop ranges are:
        //Start: 10, where i is initialized.
        //Stop: 0, it'll print out 1, subtract 1 from i, and then stop as it's
        //no longer greater than 0.
        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.println(i + ", ");
        }
        
    }
    
}
