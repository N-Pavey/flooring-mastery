/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.doggenetics.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DogGenetics {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Random randomDog = new Random();
        
        int totalPercent = 100;
        int percent1, percent2, percent3, percent4, percent5;
        
        percent1 = randomDog.nextInt(totalPercent) + 1;
        totalPercent = totalPercent - percent1;
        percent2 = randomDog.nextInt(totalPercent) + 1;
        totalPercent = totalPercent - percent2;
        percent3 = randomDog.nextInt(totalPercent) + 1;
        totalPercent = totalPercent - percent3;
        percent4 = randomDog.nextInt(totalPercent) + 1;
        totalPercent = totalPercent - percent4;
        percent5 = totalPercent;
        
        System.out.print("Please enter the name of your dog: ");
        String dogName = userInput.nextLine();
        
        System.out.println("Retrieving file for " + dogName);
        System.out.println("Please wait...");
        System.out.println(" ");
        
        System.out.println("According to our highly trusted and completely verified report");
        System.out.println(dogName + " is a mix of the following: ");
        
        System.out.println(" ");
        System.out.println(percent1 + "% Dachsund");
        System.out.println(percent2 + "% Siberian Husky");
        System.out.println(percent3 + "% Corgi");
        System.out.println(percent4 + "% Shar Pei");
        System.out.println(percent5 + "% German Shepherd");
        
        System.out.println(" ");
        System.out.println("Disclaimer: Results may vary!");
        
    }
    
}
