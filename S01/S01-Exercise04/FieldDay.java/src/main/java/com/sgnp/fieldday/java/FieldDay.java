/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.fieldday.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class FieldDay {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What's your last name? ");
        String lastName = userInput.nextLine();
        
        if (lastName.compareToIgnoreCase("Baggins") < 0) {
            System.out.println("Looks like you're on the team \"Red Dragons\".");
        } else if (lastName.compareToIgnoreCase("Baggins") > 0 && lastName.compareToIgnoreCase("Dresden") < 0) {
            System.out.println("You'll be on team \"Dark Wizards\".");
        } else if (lastName.compareToIgnoreCase("Dresden") > 0 && lastName.compareToIgnoreCase("Howl") < 0) {
            System.out.println("You've been moved to team \"Moving Castles\".");
        } else if (lastName.compareToIgnoreCase("Howl") > 0 && lastName.compareToIgnoreCase("Potter") < 0) {
            System.out.println("The sorting hat has placed you on team \"Golden Snitches\".");
        } else if (lastName.compareToIgnoreCase("Potter") > 0 && lastName.compareToIgnoreCase("Vimes") < 0) {
            System.out.println("You're on team \"Night Guards\".");
        } else {
            System.out.println("You've been placed on team \"Black Holes\".");
        }
        
    }
    
}
