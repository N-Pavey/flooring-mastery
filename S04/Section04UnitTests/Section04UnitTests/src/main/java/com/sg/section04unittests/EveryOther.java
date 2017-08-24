/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section04unittests;

/**
 *
 * @author apprentice
 */
public class EveryOther {
    
    // Given a String, return a new String made of every other 
    // char starting with the first, so "Hello" yields "Hlo". 
    //
    // everyOther("Hello") -> "Hlo"
    // everyOther("Hi") -> "H"
    // everyOther("Heeololeo") -> "Hello"
    public String everyOther(String str) {

        String newString = str.substring(0, 1);
        
        for (int i = 0; i < str.length(); i++) {
            
            if (i%2 == 0 && i != 0) {
                
                newString = newString + str.substring(i, i + 1);
                
            }
            
        }
        
        return newString;

    }

    
}
