/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplecalculator.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class App {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        SimpleCalculator mySimpleCalculator = new SimpleCalculator();
        
        double value1;
        double value2;
        String userChoice;
        boolean runMethod = true;
        
        while (runMethod == true) {
            
            System.out.println("Would you like to add, subtract, multiply, or divide two numbers?");
            System.out.println("Or exit the program? (add, subtract, multiply, divide, exit) ");
            
            userChoice = userInput.nextLine();
            
            if ("exit".equalsIgnoreCase(userChoice)){
                
                System.out.println("We'll do math later then!");
                runMethod = false;
                
            } else {
                
                System.out.print("Great! What's the first number? ");
                value1 = userInput.nextDouble();
                userInput.nextLine();
                System.out.print("Okay. And the second number? ");
                value2 = userInput.nextDouble();
                userInput.nextLine();
                
                if ("add".equalsIgnoreCase(userChoice)) {
                    
                    mySimpleCalculator.addEquation(value1, value2);
                    
                } else if ("subtract".equalsIgnoreCase(userChoice)) {
                    
                    mySimpleCalculator.subtractEquation(value1, value2);
                    
                } else if ("multiply".equalsIgnoreCase(userChoice)) {
                    
                    mySimpleCalculator.multiplyEquation(value1, value2);
                    
                } else {
                    
                    mySimpleCalculator.divideEquation(value1, value2);
                    
                }
                
            }
            
        }
        
    }
    
}
