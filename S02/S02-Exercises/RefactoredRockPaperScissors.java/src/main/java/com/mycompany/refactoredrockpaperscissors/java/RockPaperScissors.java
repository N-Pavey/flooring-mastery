/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.refactoredrockpaperscissors.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class RockPaperScissors {
    
    public void startRockPaperScissors() {
        
        Scanner userInput = new Scanner(System.in);
        Random randomizer = new Random();
        
        int roundsNum, tieGames, userWins, compWins, compChoice;
        boolean playGame = true;
        String userChoice, playAgain;
        
        while (playGame == true) {
            
            tieGames = 0;
            userWins = 0;
            compWins = 0;
            
            System.out.print("How many rounds would you like to play (1-10)? ");
            roundsNum = userInput.nextInt();
            userInput.nextLine();
            
            if (roundsNum >= 1 && roundsNum <= 10) {
                
                for (int i = 0; i < roundsNum; i++) {
                    System.out.println("Rock, Paper, or Scissors?");
                    userChoice = userInput.nextLine();
                    compChoice = randomizer.nextInt(3) + 1;
                    
                    /*
                    rock = 1
                    paper = 2
                    scissors = 3
                    */
                    
                    if (userChoice.equalsIgnoreCase("Rock")) {
                        switch (compChoice) {
                            case 1:
                                System.out.println("Computer also chose rock. Tie game.");
                                tieGames++;
                                break;
                            case 2:
                                System.out.println("Computer chose paper. Computer wins...");
                                compWins++;
                                break;
                            default:
                                System.out.println("Computer chose scissors. You win!");
                                userWins++;
                                break;
                        }
                    } else if (userChoice.equalsIgnoreCase("Paper")) {
                        switch (compChoice) {
                            case 1:
                                System.out.println("Computer chose rock. You win!");
                                userWins++;
                                break;
                            case 2:
                                System.out.println("Computer also chose paper. Tie game.");
                                tieGames++;
                                break;
                            default:
                                System.out.println("Computer chose scissors. Computer wins...");
                                compWins++;
                                break;
                        }
                    } else if (userChoice.equalsIgnoreCase("Scissors")) {
                        switch (compChoice) {
                            case 1:
                                System.out.println("Computer chose rock. Computer wins...");
                                compWins++;
                                break;
                            case 2:
                                System.out.println("Computer chose paper. You win!");
                                userWins++;
                                break;
                            default:
                                System.out.println("Computer also chose scissors. Tie game.");
                                tieGames++;
                                break;
                        }
                    } else {
                        System.out.println("I didn't recognize that move. We'll chalk it up as a tie game.");
                        tieGames++;
                    }
                }
                
                System.out.println("\nOut of " + roundsNum + " rounds, the tallies are:");
                System.out.println("Tie games: " + tieGames);
                System.out.println("User wins: " + userWins);
                System.out.println("Computer wins: " + compWins);
                
                if (userWins > compWins) {
                    System.out.println("\nYou won! Great job!");
                } else if (userWins < compWins) {
                    System.out.println("\nOh, it looks like the computer won... Better luck next time!");
                } else {
                    System.out.println("\nHuh... Tie game all around.");
                }
                
                System.out.print("\nThat was fun! Want to play again? (yes/no) ");
                playAgain = userInput.nextLine();
                
                if (playAgain.equalsIgnoreCase("yes")) {
                    playGame = true;
                } else {
                    System.out.println("Aw, ok. Another time then.");
                    playGame = false;
                }
                
            } else if (roundsNum < 1) {
                System.out.println("Uhm... We can't play less than 1 round.");
                System.out.println("Maybe another time then...");
                playGame = false;
            } else if (roundsNum > 10) {
                System.out.println("That's way too many!");
                System.out.println("Maybe another time then...");
                playGame = false;
            }
            
        }
        
    }
    
}
