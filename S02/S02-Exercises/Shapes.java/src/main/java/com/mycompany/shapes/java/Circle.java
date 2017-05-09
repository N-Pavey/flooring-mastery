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
public abstract class Circle extends Shapes {
    
    private double radius;
    
    @Override
    protected void area() {
        double area = 3.14 * (radius * radius);
    }
    
    @Override
    protected void perimeter() {
        double perimeter = 2 * 3.14 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
