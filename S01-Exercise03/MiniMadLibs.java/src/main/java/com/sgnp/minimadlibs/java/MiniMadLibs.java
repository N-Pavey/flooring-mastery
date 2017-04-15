/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.minimadlibs.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MiniMadLibs {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        String nounOne, adjTwo, nounThree, adjFive, plNounSix, plNounSeven, plNounEight, verbPresentNine, verbPastTen;
        int numberFour;
        
        System.out.print("Give a noun: ");
        nounOne = inputReader.nextLine();
        System.out.print("Now an adjective: ");
        adjTwo = inputReader.nextLine();
        System.out.print("One more noun: ");
        nounThree = inputReader.nextLine();
        System.out.print("A number: ");
        numberFour = inputReader.nextInt();
        inputReader.nextLine();
        System.out.print("One more adjective: ");
        adjFive = inputReader.nextLine();
        System.out.print("A plural noun: ");
        plNounSix = inputReader.nextLine();
        System.out.print("A second plural noun: ");
        plNounSeven = inputReader.nextLine();
        System.out.print("A final plural noun: ");
        plNounEight = inputReader.nextLine();
        System.out.print("A verb, in the present tense: ");
        verbPresentNine = inputReader.nextLine();
        System.out.print("The same verb, now in past tense: ");
        verbPastTen = inputReader.nextLine();
        
        System.out.println("*** Now for the MAD LIB ***");
        System.out.println(nounOne + ": the " + adjTwo + " frontier.");
        System.out.println("These are the voyages of the starship " + nounThree);
        System.out.println("Its " + numberFour + "-year mission: to explore strange");
        System.out.println(adjFive + " " + plNounSix + ", to seek out");
        System.out.println(adjFive + " " + plNounSeven + " and");
        System.out.println(adjFive + " " + plNounEight + ",");
        System.out.println("to boldly " + verbPresentNine + " where no one has " + verbPastTen + " before.");
                
    }
    
}
