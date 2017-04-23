/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.guessme.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GuessMe {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int compNum = 25;
        int userNum;
        
        System.out.println("I've chosen a number. Try and guess what it is!");
        userNum = userInput.nextInt();
        
        if (userNum == compNum) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (userNum < compNum) {
            System.out.println("Ha, nice try - too low! I chose " + compNum);
        } else {
            System.out.println("Too bad, way too high. I chose " + compNum);
        }
        
    }
    
}
