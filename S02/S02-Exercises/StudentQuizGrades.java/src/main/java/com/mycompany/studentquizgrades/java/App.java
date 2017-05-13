/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentquizgrades.java;

/**
 *
 * @author apprentice
 */
public class App {
    
    public static void main(String[] args) {
    
        UserIO userIO = new ImplementedInterface();
        StudentQuizScores quizOptions = new StudentQuizScores();
        
        boolean continueApp = true;
        
        userIO.print("STUDENT QUIZ SCORE DATABASE");
        userIO.print("===========================");
        
        do {
            
            switch (quizOptions.runMenu()) {
                
                case 1:
                    quizOptions.viewStudents();
                    break;
                case 2:
                    quizOptions.addStudent();
                    break;
                case 3:
                    quizOptions.removeStudent();
                    break;
                case 4:
                    quizOptions.viewStudentScores();
                    break;
                case 5:
                    quizOptions.viewStudentAverage();
                    break;
                case 6:
                    quizOptions.viewClassAverage();
                    break;
                case 7:
                    quizOptions.viewHighestScores();
                    break;
                case 8:
                    quizOptions.viewLowestScores();
                    break;
                case 9:
                    continueApp = false;
            }
            
        } while (continueApp == true);
        
    }

}
