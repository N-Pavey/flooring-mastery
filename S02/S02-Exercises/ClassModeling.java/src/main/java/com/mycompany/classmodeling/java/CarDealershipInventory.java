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
public class CarDealershipInventory {
    
    private int numOfAccidents;
    private String carMake;
    private String carModel;
    private int carYear;
    private String carColor;
    private Extras carExtras;

    public int getNumOfAccidents() {
        return numOfAccidents;
    }

    public void setNumOfAccidents(int numOfAccidents) {
        this.numOfAccidents = numOfAccidents;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Extras getCarExtras() {
        return carExtras;
    }

    public void setCarExtras(Extras carExtras) {
        this.carExtras = carExtras;
    }
    
}
