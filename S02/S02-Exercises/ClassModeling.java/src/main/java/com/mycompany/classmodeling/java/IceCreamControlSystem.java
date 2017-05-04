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
public class IceCreamControlSystem {
    
    private float iceCreamTemperature;
    private double iceCreamWeight;
    private Ingredients iceCreamIngredients;
    private boolean iceCreamLabeled;

    public float getIceCreamTemperature() {
        return iceCreamTemperature;
    }

    public void setIceCreamTemperature(float iceCreamTemperature) {
        this.iceCreamTemperature = iceCreamTemperature;
    }

    public double getIceCreamWeight() {
        return iceCreamWeight;
    }

    public void setIceCreamWeight(double iceCreamWeight) {
        this.iceCreamWeight = iceCreamWeight;
    }

    public Ingredients getIceCreamIngredients() {
        return iceCreamIngredients;
    }

    public void setIceCreamIngredients(Ingredients iceCreamIngredients) {
        this.iceCreamIngredients = iceCreamIngredients;
    }

    public boolean isIceCreamLabeled() {
        return iceCreamLabeled;
    }

    public void setIceCreamLabeled(boolean iceCreamLabeled) {
        this.iceCreamLabeled = iceCreamLabeled;
    }
    
}
