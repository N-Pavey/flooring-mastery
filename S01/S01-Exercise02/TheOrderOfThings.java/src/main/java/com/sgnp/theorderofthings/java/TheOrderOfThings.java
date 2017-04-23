/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.theorderofthings.java;

/**
 *
 * @author apprentice
 */
public class TheOrderOfThings {
    
    public static void main(String[] args) {
        
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;
        
        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "BRIGHT yellow";
        origin = "AlphaCentaurian";
        material = "platinum";
        purpose = "good";
        
        noun = "dragons";
        
        // Using the + with strings, doesn't add it concatenates!
        // (sticks them together)
        
        // This one sounds the best
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
        
        // Output attempt 2
        System.out.println(number + " " + purpose + " " + material + " " + origin + " " + color + " " + shape + " " + age + " " + size + " " + opinion + " " + noun);
        
        // Output attempt 3
        System.out.println(number + " " + size + " " + shape + " " + origin + " " + purpose + " " + opinion + " " + age + " " + color + " " + material + " " + noun);
        
    }
    
}
