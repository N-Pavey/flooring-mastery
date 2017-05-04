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
public class AirplaneAirTrafficControl {
    
    private int departureTime;
    private int arrivalTime;
    private int gateNumber;
    private double averageSpeedMPH;
    private String aircraftCallSign;

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public double getAverageSpeedMPH() {
        return averageSpeedMPH;
    }

    public void setAverageSpeedMPH(double averageSpeedMPH) {
        this.averageSpeedMPH = averageSpeedMPH;
    }

    public String getAircraftCallSign() {
        return aircraftCallSign;
    }

    public void setAircraftCallSign(String aircraftCallSign) {
        this.aircraftCallSign = aircraftCallSign;
    }
    
}
