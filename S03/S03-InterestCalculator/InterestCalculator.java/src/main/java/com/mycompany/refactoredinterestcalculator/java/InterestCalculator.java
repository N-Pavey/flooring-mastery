/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.refactoredinterestcalculator.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class InterestCalculator {
    
    public void calculateInterest() {
            
        Scanner userInput = new Scanner(System.in);
        BigDecimal startingBalance, beginningPrinciple, endingPrinciple, annualInterest, interestCompounded, compoundRateNumBD;
        BigDecimal interestEarned = new BigDecimal("0");
        int yearsInvested, compoundRateNum;
        String compoundRate;
        
        System.out.println("How much are you planning on investing? ");
        startingBalance = new BigDecimal(userInput.nextLine());
        
        beginningPrinciple = startingBalance;
        
        System.out.println("What's the current annual interest? ");
        annualInterest = new BigDecimal(userInput.nextLine());
        
        System.out.println("How many years do you plan on investing? ");
        yearsInvested = userInput.nextInt();
        userInput.nextLine();
        
        do {
            System.out.println("What's the compound rate? Quarterly, Monthly, Daily: ");
            compoundRate = userInput.nextLine();
        } while (!"Quarterly".equalsIgnoreCase(compoundRate) && !"Monthly".equalsIgnoreCase(compoundRate) && !"Daily".equalsIgnoreCase(compoundRate));
        
        if (compoundRate.equalsIgnoreCase("Quarterly")) {
            compoundRateNumBD = new BigDecimal("4");
            compoundRateNum = 4;
            interestCompounded = annualInterest.divide(compoundRateNumBD, 2, RoundingMode.HALF_UP);//annualInterest / compoundRateNum;
            
            for (int i = 0; i < yearsInvested; i++) {
                
                System.out.println("\nOn " + (i + 1) + " year: ");
                System.out.println("The starting principle was $" + beginningPrinciple);
                
                endingPrinciple = beginningPrinciple;
                
                for (int j = 0; j < compoundRateNum; j++) {
                    
                    endingPrinciple = endingPrinciple.multiply((BigDecimal.ONE).add(interestCompounded.divide(new BigDecimal("100"))));
                    endingPrinciple = endingPrinciple.setScale(2, RoundingMode.HALF_UP);
                    
                    //endingPrinciple *= (1 + (interestCompounded / 100));
                }
                
                System.out.println("The amount of interest earned this year was $" + (endingPrinciple.subtract(beginningPrinciple)));
                System.out.println("The total amount of interest earned was $" + (endingPrinciple.subtract(startingBalance)));
                System.out.println("The ending principle was $" + endingPrinciple);
                
                beginningPrinciple = endingPrinciple;
            }
            
        } else if (compoundRate.equalsIgnoreCase("Monthly")) {
            compoundRateNumBD = new BigDecimal("12");
            compoundRateNum = 12;
            interestCompounded = annualInterest.divide(compoundRateNumBD, 2, RoundingMode.HALF_UP);
            
            for (int i = 0; i < yearsInvested; i++) {
                
                System.out.println("\nOn " + (i + 1) + " year: ");
                System.out.println("The starting principle was $" + beginningPrinciple);
                
                endingPrinciple = beginningPrinciple;
                
                for (int j = 0; j < compoundRateNum; j++) {
                    
                    endingPrinciple = endingPrinciple.multiply(BigDecimal.ONE.add(interestCompounded.divide(new BigDecimal("100"))));                    
                    endingPrinciple = endingPrinciple.setScale(2, RoundingMode.HALF_UP);
                    
                }
                
                System.out.println("The amount of interest earned this year was $" + (endingPrinciple.subtract(beginningPrinciple)));
                System.out.println("The total amount of interest earned was $" + (endingPrinciple.subtract(startingBalance)));
                System.out.println("The ending principle was $" + endingPrinciple);
                
                beginningPrinciple = endingPrinciple;
            }
            
        } else if (compoundRate.equalsIgnoreCase("Daily")) {
            compoundRateNumBD = new BigDecimal("365");
            compoundRateNum = 365;
            interestCompounded = annualInterest.divide(compoundRateNumBD, 2, RoundingMode.HALF_UP);
            
            for (int i = 0; i < yearsInvested; i++) {
                
                System.out.println("\nOn " + (i + 1) + " year: ");
                System.out.println("The starting principle was $" + beginningPrinciple);
                
                endingPrinciple = beginningPrinciple;
                
                for (int j = 0; j < compoundRateNum; j++) {
                    
                    endingPrinciple = endingPrinciple.multiply(BigDecimal.ONE.add(interestCompounded.divide(new BigDecimal("100"))));
                    endingPrinciple = endingPrinciple.setScale(2, RoundingMode.HALF_UP);
                    
                }
                
                System.out.println("The amount of interest earned this year was $" + (endingPrinciple.subtract(beginningPrinciple)));
                System.out.println("The total amount of interest earned was $" + (endingPrinciple.subtract(startingBalance)));
                System.out.println("The ending principle was $" + endingPrinciple);
                
                beginningPrinciple = endingPrinciple;
            }
            
        }
        
    }
    
}
