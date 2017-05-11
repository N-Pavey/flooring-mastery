/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.statecapitals2;

import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class StateCapitals2 {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        HashMap<String, Capitals> stateCapitals = new HashMap<>();
        
        String stringUserPop;
        int userPopNum;

        stateCapitals.put("Alabama", new Capitals("Montgomery", 205764, 155.4));
        stateCapitals.put("Alaska", new Capitals("Juneau", 31275, 2716.7));
        stateCapitals.put("Arizona", new Capitals("Phoenix", 1445632, 474.9));
        stateCapitals.put("Arkansas", new Capitals("Little Rock", 193524, 116.2));
        stateCapitals.put("California", new Capitals("Sacramento", 466488, 97.2));
        stateCapitals.put("Colorado", new Capitals("Denver", 600158, 153.4));
        stateCapitals.put("Connecticut", new Capitals("Hartford", 124775, 17.3));
        stateCapitals.put("Delaware", new Capitals("Dover", 36047, 22.4));
        stateCapitals.put("Florida", new Capitals("Tallahassee", 181412, 95.7));
        stateCapitals.put("Georgia", new Capitals("Atlanta", 420003, 131.7));
        stateCapitals.put("Hawaii", new Capitals("Honolulu", 337256, 85.7));
        stateCapitals.put("Idaho", new Capitals("Boise", 205671, 63.8));
        stateCapitals.put("Illinois", new Capitals("Springfield", 116250, 54.0));
        stateCapitals.put("Indiana", new Capitals("Indianapolis", 829718, 361.5));
        stateCapitals.put("Iowa", new Capitals("Des Moines", 203433, 75.8));
        stateCapitals.put("Kansas", new Capitals("Topeka", 127473, 56.0));
        stateCapitals.put("Kentucky", new Capitals("Frankfort", 25527, 14.7));
        stateCapitals.put("Louisiana", new Capitals("Baton Rouge", 229553, 76.8));
        stateCapitals.put("Maine", new Capitals("Augusta", 19136, 55.4));
        stateCapitals.put("Maryland", new Capitals("Annapolis", 38394, 6.73));
        stateCapitals.put("Massachusetts", new Capitals("Boston", 617594, 48.4));
        stateCapitals.put("Michigan", new Capitals("Lansing", 114297, 35.0));
        stateCapitals.put("Minnesota", new Capitals("Saint Paul", 300851, 52.8));
        stateCapitals.put("Mississippi", new Capitals("Jackson", 173514, 104.9));
        stateCapitals.put("Missouri", new Capitals("Jefferson City", 43079, 27.3));
        stateCapitals.put("Montana", new Capitals("Helena", 28190, 14.0));
        stateCapitals.put("Nebraska", new Capitals("Lincoln", 258379, 74.6));
        stateCapitals.put("Nevada", new Capitals("Carson City", 55274, 143.4));
        stateCapitals.put("New Hampshire", new Capitals("Concord", 42695, 64.3));
        stateCapitals.put("New Jersey", new Capitals("Trenton", 84913, 7.66));
        stateCapitals.put("New Mexico", new Capitals("Santa Fe", 75764, 37.3));
        stateCapitals.put("New York", new Capitals("Albany", 97856, 21.4));
        stateCapitals.put("North Carolina", new Capitals("Raleigh", 403892, 114.6));
        stateCapitals.put("North Dakota", new Capitals("Bismarck", 61272, 26.9));
        stateCapitals.put("Ohio", new Capitals("Columbus", 822553, 210.3));
        stateCapitals.put("Oklahoma", new Capitals("Oklahoma City", 580000, 607.0));
        stateCapitals.put("Oregon", new Capitals("Salem", 154637, 45.7));
        stateCapitals.put("Pennsylvania", new Capitals("Harrisburg", 49528, 8.11));
        stateCapitals.put("Rhode Island", new Capitals("Providence", 178042, 18.5));
        stateCapitals.put("South Carolina", new Capitals("Columbia", 131686, 125.2));
        stateCapitals.put("South Dakota", new Capitals("Pierre", 13646, 13.0));
        stateCapitals.put("Tennessee", new Capitals("Nashville", 635710, 473.3));
        stateCapitals.put("Texas", new Capitals("Austin", 790390, 251.5));
        stateCapitals.put("Utah", new Capitals("Salt Lake City", 186440, 109.1));
        stateCapitals.put("Vermont", new Capitals("Montpelier", 7855, 10.2));
        stateCapitals.put("Virginia", new Capitals("Richmond", 204214, 60.1));
        stateCapitals.put("Washington", new Capitals("Olympia", 46478, 16.7));
        stateCapitals.put("West Virginia", new Capitals("Charleston", 51400, 31.6));
        stateCapitals.put("Wisconsin", new Capitals("Madison", 233209, 68.7));
        stateCapitals.put("Wyoming", new Capitals("Cheyenne", 59466, 21.1));
        
        Set<String> keys = stateCapitals.keySet();
        
        System.out.println("STATE - CAPITAL | POPULATION | AREA");
        System.out.println("===================================");
        for (String k : keys) {
            String capitalName = stateCapitals.get(k).getCapitalName();
            int capitalPop = stateCapitals.get(k).getCapitalPop();
            double capitalSqMiles = stateCapitals.get(k).getCapitalSqMiles();
            
            System.out.println(k + " - " + capitalName + " | Pop: " + capitalPop + " | Area: " + capitalSqMiles + " sq mi");
        }
        
        System.out.print("\nPlease enter the minimum population requirement: ");
        stringUserPop = userInput.nextLine();
        userPopNum = Integer.parseInt(stringUserPop);
        
        System.out.println("\nCAPITALS WITH POPULATIONS GREATER THAN: " + userPopNum + "\n");
        
        for (String k : keys) {
            if (stateCapitals.get(k).getCapitalPop() > userPopNum) {
                String capitalName = stateCapitals.get(k).getCapitalName();
                int capitalPop = stateCapitals.get(k).getCapitalPop();
                double capitalSqMiles = stateCapitals.get(k).getCapitalSqMiles();

                System.out.println(k + " - " + capitalName + " | Pop: " + capitalPop + " | Area: " + capitalSqMiles + " sq mi");
            }
        }
        
    }
        
}
