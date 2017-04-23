/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorizer.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Factorizer {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int primeCounter = 0;
        int perfectNum = 0;
        
        System.out.print("What number would you like to factor? ");
        int factorNum = userInput.nextInt();
        
        System.out.println("The factors of " + factorNum + " are:");
        System.out.println("");
        
        for (int i = 1; i < factorNum; i++) {
            
            if (factorNum % i == 0) {
                System.out.println(i);
                primeCounter++;
                perfectNum += i;
            }
            
        }
        
        System.out.println("");
        
        if (perfectNum == factorNum) {
            System.out.println(factorNum + " is a perfect number.");
        } else {
            System.out.println(factorNum + " is not a perfect number.");
        }
        
        if (primeCounter == 1) {
            System.out.println(factorNum + " is a prime number.");
        } else {
            System.out.println(factorNum + " is not a prime number.");
        }
        
    }
    
}
