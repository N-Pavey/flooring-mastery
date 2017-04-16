/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.doordonot;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DoOrDoNot {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Should I do it? (yes/no) ");
        boolean doIt;
        
        if (input.next().equalsIgnoreCase("yes")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DON'T YOU DARE!
        }
        
        boolean iDidIt = false;
        
        /*
        do {
            iDidIt = true;
            break;
        } while (doIt);
        */
        
        while (doIt) {
            iDidIt = true;
            break;
        }
        
        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
        
        /*
        If I tell it "yes" to do it, it prints out
            "I did it!"
        If I tell it "no" to not do it, it prints out
            "I know you said not to ... etc."
        
        With just a while loop, answering "yes" prints out
            "I did it!"
        Answer "no" prints out
            "Don't look at me, I didn't do anything."
        
        The do while sets the iDidIt to true
        While the while loops leave the iDidIt to false
        */
        
    }
    
}
