/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section03unittests;

/**
 *
 * @author apprentice
 */
public class MakePi {
    
    // Return an int array length n containing the first n digits of pi.
    //
    // makePi(3) -> {3, 1, 4}

    public int[] makePi(int n) {

        double pi = Math.PI;
        String piString = Double.toString(pi);
        int currentValue;
        int[] piArray = new int[n];
        
        piString = piString.replace(".", "");
        
        for (int i = 0; i < n; i++) {
            
            piArray[i] = Integer.parseInt(piString.substring(i, i + 1));
            
        }
        
        return piArray;        

    }
    
}
