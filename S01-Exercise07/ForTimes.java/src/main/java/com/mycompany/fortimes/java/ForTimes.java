/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fortimes.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ForTimes {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Which times table shall I recite? ");
        int timesTable = userInput.nextInt();
        int multiplyNum = 1;
        
        for (int i = 0; i < 15; i++) {
            System.out.println(multiplyNum + " * " + timesTable + " is: " + (multiplyNum * timesTable));
            multiplyNum++;
        }
        
    }
    
}
