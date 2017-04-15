/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.bestadderever.java;

/**
 *
 * @author apprentice
 */
public class BestAdderEver {
    
    public static void main(String[] args) {
        
        int numberOfBagels;
        double containersOfCreamCheese;
        float timeToasted;
        
        numberOfBagels = 12;
        containersOfCreamCheese = 15.5;
        timeToasted = 3;
        
        System.out.println("We got breakfast for the office!");
        System.out.println("We ordered " + numberOfBagels + " bagels, toasted with cream cheese.");
        System.out.print("They toasted them for " + timeToasted + " minutes and we used up ");
        System.out.println(containersOfCreamCheese + " small containers of cream cheese. I thought it was good!");
        System.out.println("However, our manager complained!");
        System.out.println("Apparently, " + numberOfBagels + " bagels wasn't enough, and " + containersOfCreamCheese + " small containers of cream cheese was too much!");
        System.out.println("If that wasn't enough, she said they were burnt after toasting them for " + timeToasted + " minutes.");
        System.out.println("I think she just needed her coffee.");
        
    }
    
}
