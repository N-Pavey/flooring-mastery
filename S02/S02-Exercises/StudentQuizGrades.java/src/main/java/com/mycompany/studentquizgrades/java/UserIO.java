/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentquizgrades.java;

/**
 *
 * @author apprentice
 */
public interface UserIO {
    
    void print(String message);
    void print(int i);
    void print(double d);
    
    String readInput(String prompt);
    
}
