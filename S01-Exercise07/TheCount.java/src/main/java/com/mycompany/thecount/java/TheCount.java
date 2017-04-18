/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thecount.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TheCount {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int userStart, userStop, userIncrement, displayNum;
        int numPerLine = 0;
        
        System.out.println("LET ME ***COUNT*** FOR YOU!!!");
        System.out.print("Where should I start? ");
        userStart = userInput.nextInt();
        displayNum = userStart;
        
        System.out.print("Where should I stop? ");
        userStop = userInput.nextInt();
        
        System.out.print("And what should I count by? ");
        userIncrement = userInput.nextInt();
        
        System.out.println("");
        
        for (int i = userStart; i <= userStop; i+=userIncrement) {
            
            numPerLine++;
            System.out.print(displayNum + " ");
            
            if (numPerLine < 3) {
                displayNum += userIncrement;
            } else if (numPerLine == 3) {
                numPerLine = 0;
                System.out.println("- Ah ah ah!");
                displayNum += userIncrement;
            }
            
        }
        
    }
    
}
