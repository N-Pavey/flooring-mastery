/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.healthyhearts.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HealthyHearts {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        double age, lowRange, highRange, maxRate;
        maxRate = 220;
        
        System.out.println("What is your age? ");
        age = inputReader.nextDouble();
        
        maxRate = maxRate - age;
        highRange = maxRate * .85;
        lowRange = maxRate * .50;
        
        System.out.println("Your maximum heart rate should be " + maxRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + lowRange + " - " + highRange + " beats per minute.");
                
    }
    
}
