/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.yourlifeinmovies.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class YourLifeInMovies {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        String userName;
        int userDOB;
        
        System.out.print("You wanna do something fun? Okay, what's your name? ");
        userName = userInput.nextLine();
        
        System.out.print(userName + "? Okay, cool! Now, when were you born? ");
        userDOB = userInput.nextInt();
        
        System.out.println("If that's the case, then ");
        
        if (userDOB > 2005) {
            System.out.println("You probably haven't seen any good movies yet.");
        }
        
        if (userDOB <= 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out half a decade ago?");
        }
        
        if (userDOB <= 1995) {
            System.out.println("What about the first Harry Potter? It came out over 15 years ago.");
        }
        
        if (userDOB <= 1985) {
            System.out.println("And remember Space Jam? It came out not last decade, but the one before THAT!");
        }
        
        if (userDOB <= 1975) {
            System.out.println("Surely you know Jurassic Park, too. Yeah, well it was released closer to the lunar landing than today.");
        }
        
        if (userDOB <= 1965) {
            System.out.println("And don't get me started on M.A.S.H.! It's been around for almost half a century!!");
        }
        
    }
    
}
