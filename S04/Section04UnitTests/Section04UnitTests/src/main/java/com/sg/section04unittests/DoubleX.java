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
public class DoubleX {
    
    // Given a String, return true if the first instance 
    // of "x" in the String is immediately followed by 
    // another "x". 
    //
    // doubleX("axxbb") -> true
    // doubleX("axaxxax") -> false
    // doubleX("xxxxx") -> true
    public boolean doubleX(String str) {

        boolean doubleX = false;
        
        for (int i = 0; i < (str.length() - 1); i++) {
            
            if ("x".equalsIgnoreCase(str.substring(i, i + 1))) {
                
                if ("xx".equalsIgnoreCase(str.substring(i, i + 2))) {
                    
                    doubleX = true;
                    break;
                    
                } else {
                    
                    doubleX = false;
                    break;
                }
                
            }
            
        }
        
        return doubleX;

    }   
    
}
