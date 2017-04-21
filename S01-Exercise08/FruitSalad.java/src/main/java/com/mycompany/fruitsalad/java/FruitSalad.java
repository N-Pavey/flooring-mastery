/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fruitsalad.java;

/**
 *
 * @author apprentice
 */
public class FruitSalad {
    
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        String[] fruitSalad = new String[12];
        String[] apples = new String[3];
        String[] oranges = new String[2];
        String[] berries, miscFruit;
        
        int counterApple = 0;
        int counterOranges = 0;
        int counterBerries = 0;
        int counterMiscFruit = 0;
        
        for (String allFruits : fruit) {
            if (allFruits.contains("Apple") && !allFruits.equalsIgnoreCase("Pineapple") && counterApple < 3) {
                apples[counterApple] = allFruits;
                counterApple++;
            } else if (allFruits.contains("Orange") && counterOranges < 2) {
                oranges[counterOranges] = allFruits;
                counterOranges++;
            } else if (allFruits.contains("berry")) {
                counterBerries++;
            } else if (!allFruits.contains("Tomato") && !allFruits.contains("Orange") && !allFruits.contains("Apple")) {
                counterMiscFruit++;
            }
        }
        
        berries = new String[counterBerries];
        miscFruit = new String[counterMiscFruit];
        counterBerries = 0;
        counterMiscFruit = 0;
        
        for (String allFruits : fruit) {
            if (allFruits.contains("berry")) {
                berries[counterBerries] = allFruits;
                counterBerries++;
            } else if (!allFruits.contains("Tomato") && !allFruits.contains("Orange") && !allFruits.contains("Apple")) {
                miscFruit[counterMiscFruit] = allFruits;
                counterMiscFruit++;
            }
        }
        
        counterApple = 0;
        counterOranges = 0;
        counterBerries = 0;
        counterMiscFruit = 0;
        
        System.out.println("This fruit salad contains " + fruitSalad.length + " kinds of fruit.");
        
        for (int i = 0; i < fruitSalad.length; i++) {
            if (counterApple < 3) {
                fruitSalad[i] = apples[counterApple];
                counterApple++;
            } else if (counterOranges < 2) {
                fruitSalad[i] = oranges[counterOranges];
                counterOranges++;
            } else if (counterBerries < berries.length) {
                fruitSalad[i] = berries[counterBerries];
                counterBerries++;
            } else if (counterMiscFruit < miscFruit.length) {
                fruitSalad[i] = miscFruit[counterMiscFruit];
                counterMiscFruit++;
            }
        }
        
        System.out.println("There are " + counterApple + " kinds of apples, " + counterOranges + " kinds of oranges,");
        System.out.println(counterBerries + " kinds of berries, and " + counterMiscFruit + " other types of fruit.");
        System.out.println("Here are the fruits I included.");
        for (String finalFruits : fruitSalad) {
            System.out.print(finalFruits + ", ");
        }
        
    }
    
}
