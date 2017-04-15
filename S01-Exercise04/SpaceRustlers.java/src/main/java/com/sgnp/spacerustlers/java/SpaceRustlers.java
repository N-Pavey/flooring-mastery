/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.spacerustlers.java;

/**
 *
 * @author apprentice
 */
public class SpaceRustlers {
    
    public static void main(String[] args) {
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        /*
        This if/else compares the Ints aliens and spaceships.
        If there are more aliens, it'll display the first message.
        Otherwise, it'll display the second message.
        */
        
        if (aliens > spaceships) {
            System.out.println("Vrroom, vroom! Let's get going!");
        } else {
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        /*
        Same as above, now comparing cows to spaceships.
        If there are the same amount of cows and spaceships, the first message gets displayed.
        If there are more cows, the second message will get displayed.
        If there are more ships than cows, the last message will display.
        
        If we remove the "else" from the "else if" in the middle then nothing will happen...
        Unless we change ints. Lets say we make both ints = 100.
        The first message will get displayed and that If statement ends.
        Then the second If statement starts. The else doesn't have any parameters though.
        So, since cows isn't greater than spaceships, then the Else statement prints out.
        We then end up with two conflicting statements.
        */
        
        if (cows == spaceships) {
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships) {
            System.out.println("Dangit! I don't know how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        if (aliens > cows) {
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else {
            System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ the hamburger now!!");
        }
        
    }
    
}
