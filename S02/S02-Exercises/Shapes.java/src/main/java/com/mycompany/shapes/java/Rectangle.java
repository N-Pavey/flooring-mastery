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
public abstract class Rectangle extends Shapes {
    
    private double length;
    private double width;
    
    @Override
    protected void area() {
        double area = length * width;
    }
    
    @Override
    protected void perimeter() {
        double perimeter = (length * 2) + (width * 2);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
}
