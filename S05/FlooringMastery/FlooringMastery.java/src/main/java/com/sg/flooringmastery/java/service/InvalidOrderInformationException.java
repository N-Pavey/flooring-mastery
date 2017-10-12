/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.service;

/**
 *
 * @author apprentice
 */
public class InvalidOrderInformationException extends Exception {
    
    public InvalidOrderInformationException(String message) {
        
        super(message);
        
    }
    
    public InvalidOrderInformationException(String message, Throwable cause) {
        
        super(message, cause);
        
    }
    
}
