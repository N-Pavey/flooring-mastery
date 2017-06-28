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
public class FrontTimes {
    
    // Given a String and a non-negative int n, we'll say that the 
    // front of the String is the first 3 chars, or whatever is there 
    // if the String is less than length 3. Return n copies of the front; 
    //
    // frontTimes("Chocolate", 2) -> "ChoCho"
    // frontTimes("Chocolate", 3) -> "ChoChoCho"
    // frontTimes("Abc", 3) -> "AbcAbcAbc"
    public String frontTimes(String str, int n) {
        
        int letterCount = 3;
        String first3 = "";
        String newString = "";
        
        if (str.length() < letterCount) {
            
            letterCount = str.length();
            
        }
        
        for (int i = 0; i < letterCount; i++) {
            
            first3 = first3 + str.charAt(i);
            
        }
        
        while (n > 0) {
            
            newString = newString + first3;
            n--;
            
        }
        
        return newString;
        
    }
    
}
