/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.dontforgettostoreit.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DontForgetToStoreIt {
    
    public static void main(String[] args) {
        
       int meaningOfLifeAndEverything = 42;
       double pi = 3.14159;
       String cheese, color;
       
       Scanner inputReader = new Scanner(System.in);
       
        System.out.println("Give me pi to at least 5 decimals: ");
        //inputReader.nextDouble(); //Replace this with the below comment.
        pi = inputReader.nextDouble();
        
        System.out.println("What is the meaning of life, the universe & everything? ");
        //inputReader.nextInt(); //Replace this with the below comment.
        meaningOfLifeAndEverything = inputReader.nextInt();
        
        System.out.println("What is your favorite kind of cheese? ");
        //inputReader.next(); //Replace this with the below comment
        cheese = inputReader.next();
        
        System.out.println("Do you like the color red or blue more? ");
        //inputReader.next(); //Replace this with the below comment
        color = inputReader.next();
        
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of life is " + (2 * pi * meaningOfLifeAndEverything));
        
    }
    
}
