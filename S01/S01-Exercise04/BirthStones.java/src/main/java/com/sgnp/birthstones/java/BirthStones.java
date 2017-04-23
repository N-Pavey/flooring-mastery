/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.birthstones.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BirthStones {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int birthMonth;
        
        System.out.println("What month were you born, using a number (1-12): ");
        birthMonth = userInput.nextInt();
        
        if (birthMonth == 1) {
            System.out.println("January - Garnet");
        } else if (birthMonth == 2) {
            System.out.println("February - Amethyst");
        } else if (birthMonth == 3) {
            System.out.println("March - Aquamarine");
        } else if (birthMonth == 4) {
            System.out.println("April - Diamond");
        } else if (birthMonth == 5) {
            System.out.println("May - Emerald");
        } else if (birthMonth == 6) {
            System.out.println("June - Pearl");
        } else if (birthMonth == 7) {
            System.out.println("July - Ruby");
        } else if (birthMonth == 8) {
            System.out.println("August - Peridot");
        } else if (birthMonth == 9) {
            System.out.println("September - Sapphire");
        } else if (birthMonth == 10) {
            System.out.println("October - Opal");
        } else if (birthMonth == 11) {
            System.out.println("November - Topaz");
        } else if (birthMonth == 12) {
            System.out.println("December - Turquoise");
        } else {
            System.out.println("Uh oh! It looks like you didn't put in a valid number.");
        }
        
    }
    
}
