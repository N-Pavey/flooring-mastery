/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.barelycontrolledchaos.java;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class BarelyControlledChaos {
    
    public static void main(String[] args) {
        
        String color = randomColor(); // call color method here
        String animal = randomAnimal(); // call animal method again here
        String colorAgain = randomColor(); // call color method again here
        int weight =  randomNumber(5, 200); //call number method,
            // with a range between 5 - 200
        int distance = randomNumber(10, 20); // call number method
            // with a range between 10 - 20
        int number = randomNumber(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        int time = randomNumber(2, 6); // call number method,
            // with a range between 2 - 6

        
        System.out.println("Once, when I was very small...");
        
        System.out.println("I was chased by a " + color + ", " + weight + "lb " + " miniature " + animal + " for over " + distance + " miles!!");
        
        System.out.println("I had to hide in a field of over " + number + " " + colorAgain + " poppies for nearly " + time + " hours until it left me alone!");
        
        System.out.println("\nIt was QUITE the experience, " + "let me tell you!");
        
    }
    
    public static String randomColor() {
        Random randomizer = new Random();
        int randomColor = randomizer.nextInt(4);
        String color;
        
        if (randomColor == 0) {
            color = "purple";
            return color;
        } else if (randomColor == 1) {
            color = "blue";
            return color;
        } else if (randomColor == 2) {
            color = "pink";
            return color;
        } else if (randomColor == 3) {
            color = "orange";
            return color;
        } else {
            color = "yellow";
            return color;
        }
        
    }
    
    public static String randomAnimal() {
        Random randomizer = new Random();
        int randomAnimal = randomizer.nextInt(4);
        String animal;
        
        if (randomAnimal == 0) {
            animal = "zebra";
            return animal;
        } else if (randomAnimal == 1) {
            animal = "dog";
            return animal;
        } else if (randomAnimal == 2) {
            animal = "pigeon";
            return animal;
        } else if (randomAnimal == 3) {
            animal = "pony";
            return animal;
        } else {
            animal = "turtle";
            return animal;
        }
        
    }
    
    public static int randomNumber(int x, int y) {
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt((y - x) + 1) + x;
        return randomNumber;
    }
    
}
