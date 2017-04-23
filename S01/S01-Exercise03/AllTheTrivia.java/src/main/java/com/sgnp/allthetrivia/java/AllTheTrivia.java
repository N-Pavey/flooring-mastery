/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.allthetrivia.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AllTheTrivia {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int inchesInFoot, numLicksSucker;
        String colorBlueYellow, systemSony;
        
        System.out.println("How many inches are in a foot? ");
        inchesInFoot = inputReader.nextInt();
        System.out.println("How many licks does it take to get to the center of a Tootsie Pop? ");
        numLicksSucker = inputReader.nextInt();
        inputReader.nextLine();
        System.out.println("What color do you get when mixing blue and yellow? ");
        colorBlueYellow = inputReader.nextLine();
        System.out.println("What's the latest game console from Sony? ");
        systemSony = inputReader.nextLine();
        
        System.out.println(" ");
        
        System.out.println("There are " + systemSony + " in a foot! Cool!");
        System.out.println("It takes " + inchesInFoot + " licks to get to the center of a Tootsie Pop?");
        System.out.println("I thought it was more. Huh...");
        System.out.println("You get " + numLicksSucker + " when you mix blue and yellow,");
        System.out.println("and that's my favorite color!");
        System.out.println("That's right! I forgot the name of that system was " + colorBlueYellow + ".");
        
    }
    
}
