/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplecalculator.java;

/**
 *
 * @author apprentice
 */
public class SimpleCalculator {
    
    public void addEquation(double x, double y) {
        
        double result = x + y;
        System.out.println("\n" + x + " + " + y + " = " + result + "\n");
        
    }
    
    public void subtractEquation(double x, double y) {
        
        double result = x - y;
        System.out.println("\n" + x + " - " + y + " = " + result + "\n");
        
    }
    
    public void multiplyEquation(double x, double y) {
        
        double result = x * y;
        System.out.println("\n" + x + " * " + y + " = " + result + "\n");
        
    }
    
    public void divideEquation(double x, double y) {
        
        double result = x / y;
        System.out.println("\n" + x + " / " + y + " = " + result + "\n");
    }
    
}
