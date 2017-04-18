/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.forandtwentyblackbirds.java;

/**
 *
 * @author apprentice
 */
public class ForAndTwentyBlackbirds {
    
    public static void main(String[] args) {
        
        
        //To get the traditional 24 birds, both the initializer and the 
        //stop condition were updated. i now equals 1 to start the counter
        //in a more traditional sense. The stop condition is now "< 25" so that
        //it stops at 24.
        int birdsInPie = 0;
        for (int i = 1; i < 25; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }
        
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
        
    }
    
}
