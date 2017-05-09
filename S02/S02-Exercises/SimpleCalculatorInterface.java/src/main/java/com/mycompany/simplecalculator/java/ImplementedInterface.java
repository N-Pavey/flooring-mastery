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
public class ImplementedInterface implements UserIO{
    
    Scanner userInput = new Scanner(System.in);
    
    @Override
    public int readInt(String prompt) {
        System.out.println("Please enter a number.");
        prompt = userInput.nextLine();
        int userNum = Integer.parseInt(prompt);
        return userNum;
    }
    
    @Override
    public int readInt(String prompt, int min, int max) {
        min = -100;
        max = 100;
        int userNum;
        
        do {
            System.out.println("Please enter a number between " + min + " and " + max + ".");
            prompt = userInput.nextLine();
            userNum = Integer.parseInt(prompt);
        } while (userNum < min || userNum > max);
        
        return userNum;
    }
    
    @Override
    public String readString(String prompt) {
        prompt = userInput.nextLine();
        return prompt;
    }
    
    @Override
    public float readFloat(String prompt) {
        System.out.println("Please enter a number.");
        prompt = userInput.nextLine();
        float userNum = Float.parseFloat(prompt);
        return userNum;
    }
    
    @Override
    public float readFloat(String prompt, float min, float max) {
        min = -100;
        max = 100;
        float userNum;
        
        do {
            System.out.println("Please enter a number between " + min + " and " + max + ".");
            prompt = userInput.nextLine();
            userNum = Float.parseFloat(prompt);
        } while (userNum < min || userNum > max);
        
        return userNum;
    }
    
    @Override
    public double readDouble(String prompt) {
        System.out.println("Please enter a number.");
        prompt = userInput.nextLine();
        double userNum = Double.parseDouble(prompt);
        return userNum;
    }
    
    @Override
    public double readDouble(String prompt, double min, double max) {
        min = -100;
        max = 100;
        double userNum;
        
        do {
            System.out.println("Please enter a number between " + min + " and " + max + ".");
            prompt = userInput.nextLine();
            userNum = Double.parseDouble(prompt);
        } while (userNum < min || userNum > max);
        
        return userNum;
    }
    
    @Override
    public long readLong(String prompt) {
        System.out.println("Please enter a number.");
        prompt = userInput.nextLine();
        long userNum = Long.parseLong(prompt);
        return userNum;
    }
    
    @Override
    public long readLong(String prompt, long min, long max) {
        min = -100;
        max = 100;
        long userNum;
        
        do {
            System.out.println("Please enter a number between " + min + " and " + max + ".");
            prompt = userInput.nextLine();
            userNum = Long.parseLong(prompt);
        } while (userNum < min || userNum > max);
        
        return userNum;
    }
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }
    
}