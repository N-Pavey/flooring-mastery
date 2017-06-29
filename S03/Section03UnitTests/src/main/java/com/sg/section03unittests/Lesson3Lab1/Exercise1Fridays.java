/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section03unittests.Lesson3Lab1;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Exercise1Fridays {
    
    /*
    
    Create an enum for every day of the week
    Create an App class that asks the user to enter a day of the week
    and the use a switch statement and your enum to print out how
    many days there are until Friday.
    
    */
    public void run() {
    
        Scanner userInput = new Scanner(System.in);
        WeekDays weekDay;
        
        System.out.println("Please enter a day of the week.");
        weekDay = WeekDays.valueOf(userInput.nextLine().toUpperCase());
        System.out.println("\n" + daysFriday(weekDay));
        
    }
    
    public enum WeekDays {
        
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    
    }
    
    public String daysFriday(WeekDays weekday) {
    
        switch(weekday) {
            
            case MONDAY:
                return "There are 4 days until Friday.";
            case TUESDAY:
                return "There are 3 days until Friday.";
            case WEDNESDAY:
                return "There are 2 days until Friday.";
            case THURSDAY:
                return "There is 1 day until Friday.";
            case FRIDAY:
                return "It's Friday!!!";
            case SATURDAY:
                return "There are 6 days until Friday.";
            case SUNDAY:
                return "There are 5 days until Friday.";
            default:
                throw new UnsupportedOperationException();
            
        }
    
    }
    
}
