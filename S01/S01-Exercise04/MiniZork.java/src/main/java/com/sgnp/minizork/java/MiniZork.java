/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgnp.minizork.java;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MiniZork {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");
        
        String action = userInput.nextLine();
        
        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in?");
            action = userInput.nextLine();
            
            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();
                
                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick hand in")) {
                System.out.println("You reach into the mailbox and feel something odd.");
                System.out.println("It's a locked, wooden box and you hear something rattling inside.");
                System.out.print("Smash it open or put it back? ");
                action = userInput.nextLine();
                
                if (action.equals("smash it open")) {
                    System.out.println("You throw the box on the ground!");
                    System.out.println("The wood splinters and busts open, releasing a dark shadow.");
                    System.out.println("The shadow's possessed your body now!");
                    System.out.println("Maybe next time you won't open someone else's mail.");
                } else if (action.equals("put it back")) {
                    System.out.println("You put the box back in the mailbox.");
                    System.out.println("Good job, law-abiding citizen!");
                }
            }
        } else if (action.equals("go to house")) {
            System.out.println("Before you is the boarded up door.");
            System.out.println("It looks like the boards could be pried loose.");
            System.out.println("Or you could try the window a few feet down.");
            System.out.print("So, try the window or pry the boards? ");
            action = userInput.nextLine();
            
            if (action.equals("try the window")) {
                System.out.println("Wow, you're in luck! The window was unlocked.");
                System.out.println("And it slid right open. You can see an old living room.");
                System.out.println("There's an old portrait hanging on the far wall.");
                System.out.print("Climb in or leave the house? ");
                action = userInput.nextLine();
                
                if (action.equals("leave the house")) {
                    System.out.println("There -might- be something interesting inside...");
                    System.out.println("But it's probably better to not break into a creepy old house.");
                    System.out.println("You can live with the not knowing.");
                    
                } else if (action.equals("climb in")) {
                    System.out.println("You eagerly climb through the window and look around.");
                    System.out.println("The portrait you saw earlier looks off now...");
                    System.out.println("The woman in it has vanished!");
                    System.out.println("The last thing you hear is a blood-curdling scream before everything goes dark.");
                }
                
            } else if (action.equals("pry the boards")) {
                System.out.println("The boards are old and come down easily.");
                System.out.println("The door hangs open slightly, falling apart with age.");
                System.out.println("Open the door or leave the house.");
                action = userInput.nextLine();
                
                if (action.equals("open the door")) {
                    System.out.println("As you push the door, the strains proves to be too much.");
                    System.out.println("The old hinges break and the door falls with a THUD!");
                    System.out.println("As the sound echoes throughout the house, it awakes the inhabitants.");
                    System.out.println("Large beasts are on you in seconds! It would have been better to leave the house alone!");
                    
                } else if (action.equals("leave the house")) {
                    System.out.println("There -might- be something interesting inside...");
                    System.out.println("But it's probably better to not break into a creepy old house.");
                    System.out.println("You can live with the not knowing.");
                    
                }
            }
        }
        
    }
    
}
