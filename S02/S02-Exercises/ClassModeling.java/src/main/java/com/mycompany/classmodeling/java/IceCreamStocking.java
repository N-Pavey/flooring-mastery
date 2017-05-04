/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling.java;

/**
 *
 * @author apprentice
 */
public class IceCreamStocking {
    
    private String flavorName;
    private int currentInventoryOfFlavor;
    private int amountOrdered;
    
    public void placeOrder (int amountOrdered) {
        
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public int getCurrentInventoryOfFlavor() {
        return currentInventoryOfFlavor;
    }

    public void setCurrentInventoryOfFlavor(int currentInventoryOfFlavor) {
        this.currentInventoryOfFlavor = currentInventoryOfFlavor;
    }

    public int getAmountOfFlavorOrdered() {
        return amountOrdered;
    }

    public void setAmountOfFlavorOrdered(int amountOfFlavorOrdered) {
        this.amountOrdered = amountOfFlavorOrdered;
    }
    
}
