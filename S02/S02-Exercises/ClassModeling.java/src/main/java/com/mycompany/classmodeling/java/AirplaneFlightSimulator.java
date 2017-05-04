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
public class AirplaneFlightSimulator {
    
    private int flightAltitude;
    private int currentSpeed;
    private int windSpeed;
    private float noseTiltAngle;

    public int getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public float getNoseTiltAngle() {
        return noseTiltAngle;
    }

    public void setNoseTiltAngle(float noseTiltAngle) {
        this.noseTiltAngle = noseTiltAngle;
    }
    
}
