/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fruitsbasket.java;

import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class FruitsBasket {
    
    public static void main(String[] args) {
        
        String[] fruit = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};
        
        //String[] oranges = new String[] {};
        //String[] apples = new String[] {};
        int countOranges = 0;
        int countApples = 0;
        
        for (String fruit1 : fruit) {
            if (fruit1.equalsIgnoreCase("Orange")) {
                countOranges++;
            } else if (fruit1.equalsIgnoreCase("Apple")) {
                countApples++;
            }
        }
        
        String[] oranges = new String[countOranges];
        String[] apples = new String[countApples];
        
        countOranges = 0;
        countApples = 0;
        
        for (String fruit1 : fruit) {
            if (fruit1.equalsIgnoreCase("Orange")) {
                oranges[countOranges] = "Orange";
                countOranges++;
            } else if (fruit1.equalsIgnoreCase("Apple")) {
                apples[countApples] = "Apple";
                countApples++;
            }
        }
        
        System.out.println("The amount of fruit is: " + (countOranges + countApples));
        System.out.println("The amount of oranges is: " + oranges.length);
        System.out.println("The amount of apples is: " + apples.length);
        
    }
    
}
