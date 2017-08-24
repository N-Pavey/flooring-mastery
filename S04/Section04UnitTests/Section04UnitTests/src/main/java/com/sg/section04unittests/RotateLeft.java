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
public class RotateLeft {
    
    // Given an array of ints, return an array with the elements 
    // “rotated left" so {1, 2, 3} yields {2, 3, 1}. 
    //
    // rotateLeft({1, 2, 3}) -> {2, 3, 1}
    // rotateLeft({5, 11, 9}) -> {11, 9, 5}
    // rotateLeft({7, 0, 0}) -> {0, 0, 7}
    public int[] rotateLeft(int[] numbers) {

        int[] newArray = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            
            if (i == 0) {
                
                newArray[newArray.length - 1] = numbers[i];
                
            } else {
                
                newArray[i - 1] = numbers[i];
                
            }
            
        }
        
        return newArray;

    }
    
}
