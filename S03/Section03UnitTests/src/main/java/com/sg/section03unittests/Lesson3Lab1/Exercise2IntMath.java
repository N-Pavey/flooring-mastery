/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section03unittests.Lesson3Lab1;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Exercise2IntMath {
    
    public void run() {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide an integer.");
        
        int operand1 = Integer.parseInt(userInput.nextLine());
        
        System.out.println("\nPlease provide another integer.");
        
        int operand2 = Integer.parseInt(userInput.nextLine());
        
        System.out.println("\nThe sum of the two numbers is: " + calculate(MathOperator.PLUS, operand1, operand2));
        System.out.println("The difference of the two numbers is: " + calculate(MathOperator.MINUS, operand1, operand2));
        System.out.println("The product of the two numbers is: " + calculate(MathOperator.MULTIPLY, operand1, operand2));
        System.out.println("The quotient of the two numbers is: " + calculate(MathOperator.DIVIDE, operand1, operand2));
        
    }
    
    public enum MathOperator {
        
        PLUS, MINUS, MULTIPLY, DIVIDE
        
    }
    
    public int calculate(MathOperator operator, int operand1, int operand2) {
        
        switch(operator) {
            
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException();
                
         }
    
    }
    
}
