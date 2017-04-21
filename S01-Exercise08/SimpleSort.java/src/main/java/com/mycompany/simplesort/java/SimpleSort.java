/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplesort.java;

/**
 *
 * @author apprentice
 */
public class SimpleSort {
    
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] secondHalf = {1, 4, 8, 11, 15, 18, 21, 44, 54, 79, 89, 100};
        
        int[] wholeNumbers = new int[24];
        
        int counterFirst = 0;
        int counterSecond = 0;
        
        for (int i = 0; i < wholeNumbers.length; i++) {
            if (counterFirst < firstHalf.length && counterSecond < secondHalf.length) {
                if (firstHalf[counterFirst] < secondHalf[counterSecond]) {
                    wholeNumbers[i] = firstHalf[counterFirst];
                    counterFirst++;
                } else {
                    wholeNumbers[i] = secondHalf[counterSecond];
                    counterSecond++;
                }
            } else if (counterFirst < firstHalf.length) {
                wholeNumbers[i] = firstHalf[counterFirst];
                counterFirst++;
            } else {
                wholeNumbers[i] = secondHalf[counterSecond];
                counterSecond++;
            }
        }
        
        System.out.println("The numbers should be nice and organized now.");
        for (int sortedArray : wholeNumbers) {
            System.out.print(sortedArray + " ");
        }
        
    }
    
}
