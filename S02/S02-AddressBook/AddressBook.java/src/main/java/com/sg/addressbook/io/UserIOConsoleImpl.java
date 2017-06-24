/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.io;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class UserIOConsoleImpl implements UserIO {
    
    Scanner userInput = new Scanner(System.in);
    
    @Override
    public int readInt(String prompt) {
        int userNum;
        String userChoice;
        
        System.out.println(prompt);
        userChoice = userInput.nextLine();
        userNum = Integer.parseInt(userChoice);
        
        return userNum;
    }
    
    @Override
    public int readInt(String prompt, int min, int max) {
        int userNum = 0;
        boolean validEntry = false;
        String userChoice;
        
        while (!validEntry) {
            
            try {
            
                do {
                    System.out.println(prompt);
                    userChoice = userInput.nextLine();
                    userNum = Integer.parseInt(userChoice);
                    validEntry = true;
                } while (userNum < min || userNum > max);
                
            } catch (NumberFormatException e) {
                
                System.out.println("Please enter a number.");
                validEntry = false;
                
            }
            
        }
        
        return userNum;
        
    }
    
    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        prompt = userInput.nextLine();
        return prompt;
    }
    
    @Override
    public float readFloat(String prompt) {
        float userNum;
        String userChoice;
        
        System.out.println(prompt);
        userChoice = userInput.nextLine();
        userNum = Float.parseFloat(userChoice);
        
        return userNum;
    }
    
    @Override
    public float readFloat(String prompt, float min, float max) {
        float userNum = 0;
        boolean validEntry = false;
        String userChoice;
        
        while (!validEntry) {
            
            try {
            
                do {
                    System.out.println(prompt);
                    userChoice = userInput.nextLine();
                    userNum = Float.parseFloat(userChoice);
                } while (userNum < min || userNum > max);
                
            } catch (NumberFormatException e) {
                
                System.out.println("Please enter a number.");
                validEntry = false;
                
            }
            
        }
        
        return userNum;
    }
    
    @Override
    public double readDouble(String prompt) {
        double userNum;
        String userChoice;
        
        System.out.println(prompt);
        userChoice = userInput.nextLine();
        userNum = Double.parseDouble(userChoice);
        
        return userNum;
    }
    
    @Override
    public double readDouble(String prompt, double min, double max) {
        double userNum = 0;
        boolean validEntry = false;
        String userChoice;
        
        while (!validEntry) {
            
            try {
            
                do {
                    System.out.println(prompt);
                    userChoice = userInput.nextLine();
                    userNum = Double.parseDouble(userChoice);
                } while (userNum < min || userNum > max);
                
            } catch (NumberFormatException e) {
                
                System.out.println("Please enter a number.");
                validEntry = false;
                
            }
            
        }
        
        return userNum;
    }
    
    @Override
    public long readLong(String prompt) {
        long userNum;
        String userChoice;
        
        System.out.println(prompt);
        userChoice = userInput.nextLine();
        userNum = Long.parseLong(userChoice);
        
        return userNum;
    }
    
    @Override
    public long readLong(String prompt, long min, long max) {
        long userNum = 0;
        boolean validEntry = false;
        String userChoice;
        
        while (!validEntry) {
            
            try {
            
                do {
                    System.out.println(prompt);
                    userChoice = userInput.nextLine();
                    userNum = Long.parseLong(userChoice);
                } while (userNum < min || userNum > max);
                
            } catch (NumberFormatException e) {
                
                System.out.println("Please enter a number.");
                validEntry = false;
                
            }
            
        }
        
        return userNum;
    }
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }
    
}