/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shapes.java;

/**
 *
 * @author apprentice
 */
public abstract class Shapes {
    
    protected String color;
    
    protected abstract void area();
    
    protected abstract void perimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}

