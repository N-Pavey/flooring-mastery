/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.staypositive.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class StayPositive {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("What number should I count down from? ");
        int numCountDown = userInput.nextInt();
        int lineCounter = 0;
        
        System.out.println("Sounds good. Let's start!");
        System.out.println("");
        
        while (numCountDown >= 0) {
            
            System.out.print(numCountDown);
            numCountDown--;
            lineCounter++;
            
            if (lineCounter < 10) {
                System.out.print(" ");
            } else {
                System.out.println("");
                lineCounter = 0;
            }
            
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("All right. I think that's enough for now.");
        
    }
    
}
