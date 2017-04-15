/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.passingtheturingtest.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class PassingTheTuringTest {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        String userName, favColor, favFood;
        int favNumber;
        
        System.out.println("Hiya!");
        System.out.println("What's your name? ");
        userName = inputReader.nextLine();
        
        System.out.println("Hey there, " + userName + "! I'm Nate. It's nice to meet you!");
        System.out.println("Out of curiosity, what's your favorite color? ");
        favColor = inputReader.nextLine();
        
        System.out.println("What? No way! " + favColor + " is my favorite color as well!");
        System.out.println("Speaking of colors, I know a place that sells really colorful frozen yogurt. It's super delicious");
        System.out.println("and probably my favorite food! What's your favorite food, " + userName + "?");
        favFood = inputReader.nextLine();
        
        System.out.println(favFood + "? Oh, I forgot about that! I'll make that my second favorite.");
        System.out.println("Okay, one last question before you go. What's your favorite number? ");
        favNumber = inputReader.nextInt();
        
        System.out.println(favNumber + " isn't a bad number. I like 25 the most.");
        System.out.println("Hey! If we subtracted " + favNumber + " and 25 together, we'd get " + (favNumber - 25) + ". That's almost as cool.");
        System.out.println("Well, sorry to keep you so long, " + userName + ". I'll let you go!");
        
    }
    
}
