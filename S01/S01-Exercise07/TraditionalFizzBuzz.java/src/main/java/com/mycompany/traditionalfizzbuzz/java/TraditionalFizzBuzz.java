/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.traditionalfizzbuzz.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TraditionalFizzBuzz {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("How many units of fizz and buzz would you like? ");
        int unitsFizzBuzz = userInput.nextInt();
        
        int counterFizzBuzz = 0;
        
        for (int i = 0; ; i++) {
            if (i != 0 && (i % 5) == 0 && (i % 3) == 0) {
                System.out.println("fizz buzz");
                counterFizzBuzz++;
            } else if (i != 0 && (i % 5) == 0) {
                System.out.println("buzz");
                counterFizzBuzz++;
            } else if (i != 0 && (i % 3) == 0) {
                System.out.println("fizz");
                counterFizzBuzz++;
            } else {
                System.out.println(i);
            }
            
            if (counterFizzBuzz == unitsFizzBuzz) {
                System.out.println("TRADITION!!!!!");
                break;
            }
            
        }
        
    }
    
}
