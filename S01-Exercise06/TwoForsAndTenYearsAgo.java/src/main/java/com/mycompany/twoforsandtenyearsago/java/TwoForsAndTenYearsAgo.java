/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twoforsandtenyearsago.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TwoForsAndTenYearsAgo {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("What year would you like to count back from? ");
        int year = userInput.nextInt();
        
        /*
        The start/stop range is 0-10, stopping when i = 11.
        
        Right now, I think this is what makes the most sense to me as
        it's the format I've seen the most. However, once I got used
        to the second format, I can see how I would use that format
        in some instances.
        */
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " years ago would be " + (year - i));
        }
        
        System.out.println("\nI can count backwards using a different way too...");
        
        /*
        The original start/stop range is the (year that the user enters) to
        (10 years less than the year the user enters).
        */
        for (int i = year; i >= year - 20; i--) {
            System.out.println( (year - i) + " years ago would be " + i);
        }
        
    }
    
}
