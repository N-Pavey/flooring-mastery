/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.morebucketsmorefun.java;

/**
 *
 * @author apprentice
 */
public class MoreBucketsMoreFun {
    
    public static void main(String[] args) {
        
        // Declare ALL THE THINGS
        // (Usually it's a good idea to declare them at the beginning of the program)
        int butterflies, beetles, bugs;
        String color, size, shape, thing;
        double number;
        
        // Now give a couple of them some values
        butterflies = 2;
        beetles = 4;
        
        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but " + bugs + " bugs total.");
        
        System.out.println("Uh oh, my dog ate one.");
        // The decrement operator is being used
        // It's two minuses (--), causing 1 to be subtracted from the value.
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        // bugs = butterflies + beetles; // would fix the below.
        System.out.println("But still " + bugs + " bugs left, wait a minute!!!");
        /*
            Bugs doesn't change with the update to the number of butterflies
            Bugs has already been initialized and wasn't updated after
            1 was subtraced from butterflies.
            Bugs would need to be updated after to be correct.
        */
        System.out.println("Maybe I just counted wrong the first time...");
        
    }
    
}
