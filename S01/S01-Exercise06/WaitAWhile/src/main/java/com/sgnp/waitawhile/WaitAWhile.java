/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.waitawhile;

/**
 *
 * @author apprentice
 */
public class WaitAWhile {
    
    public static void main(String[] args) {
        
        int timeNow = 5;
        int bedTime = 10;
        
        /*
        If timeNow is set to equal or greater than bedTime, then the
        while loop never runs, instead skipping to the out prints below.
        
        If bedTime is increased, then the while loop continues to run
        until timeNow equals that of bedTime.
        
        if the timeNow++ is commented out, then the while loop continues to run
        as an INFINITE LOOP since timeNow never increases.
        */
        
        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; //Time passes
        }
        
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
        
    }
    
}
