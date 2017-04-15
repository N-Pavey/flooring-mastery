/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.fortunecookie.java;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class FortuneCookie {
    
    public static void main(String[] args) {
        
        Random fortuneRandom = new Random();
        
        int geekFortune = fortuneRandom.nextInt(10);
        
        System.out.print("Your Geek Fortune: ");
        
        if (geekFortune == 0) {
            System.out.println("Those aren't the droids you're looking for.");
        } else if (geekFortune == 1) {
            System.out.println("Never go in against a Sicilian when death is on the line!");
        } else if (geekFortune == 2) {
            System.out.println("Goonies never say die.");
        } else if (geekFortune == 3) {
            System.out.println("With great power there must also come - great responisibility");
        } else if (geekFortune == 4) {
            System.out.println("Never argue with the data.");
        } else if (geekFortune == 5) {
            System.out.println("Try not. Do, or do not. There is no try.");
        } else if (geekFortune == 6) {
            System.out.println("You are a leaf on the wind, watch how you soar.");
        } else if (geekFortune == 7) {
            System.out.println("Do absolutely nothing, and it will be everything that you thought it could be.");
        } else if (geekFortune == 8) {
            System.out.println("Kneel before Zod.");
        } else if (geekFortune == 9) {
            System.out.println("Make it so.");
        }
        
    }
    
}
