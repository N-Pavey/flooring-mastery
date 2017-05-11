/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.statecapitals2;

/**
 *
 * @author apprentice
 */
public class Capitals {
    
    private String capitalName;
    private int capitalPop;
    private double capitalSqMiles;
    
    
    Capitals(String capitalName, int capitalPop, double capitalSqMiles) {
        this.capitalName = capitalName;
        this.capitalPop = capitalPop;
        this.capitalSqMiles = capitalSqMiles;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public int getCapitalPop() {
        return capitalPop;
    }

    public void setCapitalPop(int capitalPop) {
        this.capitalPop = capitalPop;
    }

    public double getCapitalSqMiles() {
        return capitalSqMiles;
    }

    public void setCapitalSqMiles(double capitalSqMiles) {
        this.capitalSqMiles = capitalSqMiles;
    }
    
}
