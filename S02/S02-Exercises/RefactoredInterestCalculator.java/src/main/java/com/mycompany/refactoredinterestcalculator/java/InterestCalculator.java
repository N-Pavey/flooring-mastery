/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.refactoredinterestcalculator.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class InterestCalculator {
    
    public void calculateInterest() {
            
        Scanner userInput = new Scanner(System.in);
        double startingBalance, beginningPrinciple, endingPrinciple, annualInterest, interestCompounded;
        double interestEarned = 0;
        int yearsInvested, compoundRateNum;
        String compoundRate;
        
        System.out.print("How much are you planning on investing? $");
        startingBalance = userInput.nextDouble();
        
        beginningPrinciple = startingBalance;
        
        System.out.print("What's the current annual interest? ");
        annualInterest = userInput.nextDouble();
        
        System.out.print("How many years do you plan on investing? ");
        yearsInvested = userInput.nextInt();
        userInput.nextLine();
        
        do {
            System.out.print("What's the compound rate? Quarterly, Monthly, Daily: ");
            compoundRate = userInput.nextLine();
        } while (!"Quarterly".equalsIgnoreCase(compoundRate) && !"Monthly".equalsIgnoreCase(compoundRate) && !"Daily".equalsIgnoreCase(compoundRate));
        
        if (compoundRate.equalsIgnoreCase("Quarterly")) {
            compoundRateNum = 4;
            interestCompounded = annualInterest / compoundRateNum;
            
            for (int i = 0; i < yearsInvested; i++) {
                
                System.out.println("\nOn " + (i + 1) + " year: ");
                System.out.println("The starting principle was $" + beginningPrinciple);
                
                endingPrinciple = beginningPrinciple;
                
                for (int j = 0; j < compoundRateNum; j++) {
                    endingPrinciple *= (1 + (interestCompounded / 100));
                }
                
                System.out.println("The amount of interest earned this year was $" + (endingPrinciple - beginningPrinciple));
                System.out.println("The total amount of interest earned was $" + (endingPrinciple - startingBalance));
                System.out.println("The ending principle was $" + endingPrinciple);
                
                beginningPrinciple = endingPrinciple;
            }
            
        } else if (compoundRate.equalsIgnoreCase("Monthly")) {
            compoundRateNum = 12;
            interestCompounded = annualInterest / compoundRateNum;
            
            for (int i = 0; i < yearsInvested; i++) {
                
                System.out.println("\nOn " + (i + 1) + " year: ");
                System.out.println("The starting principle was $" + beginningPrinciple);
                
                endingPrinciple = beginningPrinciple;
                
                for (int j = 0; j < compoundRateNum; j++) {
                    endingPrinciple *= (1 + (interestCompounded / 100));
                }
                
                System.out.println("The amount of interest earned this year was $" + (endingPrinciple - beginningPrinciple));
                System.out.println("The total amount of interest earned was $" + (endingPrinciple - startingBalance));
                System.out.println("The ending principle was $" + endingPrinciple);
                
                beginningPrinciple = endingPrinciple;
            }
            
        } else if (compoundRate.equalsIgnoreCase("Daily")) {
            compoundRateNum = 365;
            interestCompounded = annualInterest / compoundRateNum;
            
            for (int i = 0; i < yearsInvested; i++) {
                
                System.out.println("\nOn " + (i + 1) + " year: ");
                System.out.println("The starting principle was $" + beginningPrinciple);
                
                endingPrinciple = beginningPrinciple;
                
                for (int j = 0; j < compoundRateNum; j++) {
                    endingPrinciple *= (1 + (interestCompounded / 100));
                }
                
                System.out.println("The amount of interest earned this year was $" + (endingPrinciple - beginningPrinciple));
                System.out.println("The total amount of interest earned was $" + (endingPrinciple - startingBalance));
                System.out.println("The ending principle was $" + endingPrinciple);
                
                beginningPrinciple = endingPrinciple;
            }
            
        }
        
    }
    
}
