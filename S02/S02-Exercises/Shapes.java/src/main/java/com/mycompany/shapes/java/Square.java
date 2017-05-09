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
public abstract class Square extends Shapes {
    
    private double length;
    
    @Override
    protected void area() {
        double area = length * length;
    }
    
    @Override
    protected void perimeter() {
        double perimeter = length * 4;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
       
}
