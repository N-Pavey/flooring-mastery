/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.biggerbetteradder.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BiggerBetterAdder {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int numberOfBagels;
        double containersOfCreamCheese;
        float timeToasted;
        
        System.out.println("How many bagels could you eat in one sitting? ");
        numberOfBagels = inputReader.nextInt();
        
        System.out.println("How many individual containers of cream cheese would you use? ");
        containersOfCreamCheese = inputReader.nextDouble();
        
        System.out.println("How many minutes would you toast each bagel? ");
        timeToasted = inputReader.nextFloat();
        
        System.out.println("So, you'd eat " + numberOfBagels + " bagels in one sitting?!");
        System.out.println(containersOfCreamCheese + " things of cream cheese sounds like a lot, but what would I know?");
        System.out.println("I wouldn't toast bagels for longer than " + timeToasted + " minutes either!");
        
        //BestAdderEver code below
        
        //numberOfBagels = 12;
        //containersOfCreamCheese = 15.5;
        //timeToasted = 3;
        
        /*
        System.out.println("We got breakfast for the office!");
        System.out.println("We ordered " + numberOfBagels + " bagels, toasted with cream cheese.");
        System.out.print("They toasted them for " + timeToasted + " minutes and we used up ");
        System.out.println(containersOfCreamCheese + " small containers of cream cheese. I thought it was good!");
        System.out.println("However, our manager complained!");
        System.out.println("Apparently, " + numberOfBagels + " bagels wasn't enough, and " + containersOfCreamCheese + " small containers of cream cheese was too much!");
        System.out.println("If that wasn't enough, she said they were burnt after toasting them for " + timeToasted + " minutes.");
        System.out.println("I think she just needed her coffee.");
        */

    }
    
}
