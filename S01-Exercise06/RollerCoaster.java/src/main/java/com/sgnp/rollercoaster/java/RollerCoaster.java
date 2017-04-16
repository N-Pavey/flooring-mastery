/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.rollercoaster.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class RollerCoaster {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");
        
        String keepRiding = "y";
        int loopsLooped = 0;
        
        /*
        If we use this code instead, which checks for 'n'
        then the code never runs as the keepRiding String
        is set for 'y' initially.
        
        while (keepRiding.equalsIgnoreCase("n")) {
            System.out.println("WHEEEEEEEEEEEEeEeEEEEeEeeee....!!!");
            System.out.println("Want to keep going? (y/n) : ");
            keepRiding = userInput.nextLine();
            loopsLooped++;
        }
        */
        
        while (keepRiding.equalsIgnoreCase("y")) {
            System.out.println("WHEEEEEEEEEEEEeEeEEEEeEeeee....!!!");
            System.out.println("Want to keep going? (y/n) : ");
            keepRiding = userInput.nextLine();
            loopsLooped++;
            
            /*
            "Why is there no int in front of "loopsLooped" when we assign it value?"
            
            I'm assuming the question is referring to this instance here with the 
            loopsLooped++, as there IS int in front of loopLooped aboved when it's set to 0.
            
            There's not an int here as it's already been created and this code is just
            adding 1 to the current value.
            */
        }
        
        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
        
    }
    
}
