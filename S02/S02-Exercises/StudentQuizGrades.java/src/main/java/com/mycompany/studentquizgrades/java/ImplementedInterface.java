/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentquizgrades.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ImplementedInterface implements UserIO {
    
    Scanner userInput = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }
    
    @Override
    public void print(int i) {
        System.out.println(i);
    }
    
    @Override
    public void print(double d) {
        System.out.println(d);
    }

    @Override
    public String readInput(String prompt) {
        prompt = userInput.nextLine();
        return prompt;
   }
    
}
