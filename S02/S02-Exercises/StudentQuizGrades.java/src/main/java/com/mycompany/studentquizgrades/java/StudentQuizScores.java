/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentquizgrades.java;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public class StudentQuizScores {
    
    UserIO userIO = new ImplementedInterface();
    HashMap<String, ArrayList<Integer>> studentQuiz = new HashMap<>();
    
    int runMenu() {
        
        String prompt = null;
        int promptInt;
        
        userIO.print("\nPlease enter the number of the option you would like to run:");
        userIO.print("1 | View a list of students in the system.");
        userIO.print("2 | Add a student to the system.");
        userIO.print("3 | Remove a student from the system.");
        userIO.print("4 | View list of quiz scores for a student.");
        userIO.print("5 | View the average quiz score for a student.");
        userIO.print("6 | Calculate the average scores for the entire class.");
        userIO.print("7 | View the student(s) with the highest quiz score.");
        userIO.print("8 | View the student(s) with the lowest quiz score.");
        userIO.print("9 | Exit database.");
        
        prompt = userIO.readInput(prompt);
        promptInt = Integer.parseInt(prompt);
        return promptInt;
        
    }
    
    void viewStudents() {
        
        userIO.print("\nHere are the students currently in the database:");
        
        for (String k : studentQuiz.keySet()) {
            
            userIO.print(k);
            
        }
        
    }
    
    void addStudent() {
        
        String prompt = null;
        
        userIO.print("\nWhat is the student's name?");
        String studentName = userIO.readInput(prompt);
        
        studentQuiz.put(studentName, addGrades());
        
    }
    
    ArrayList<Integer> addGrades() {
        
        ArrayList<Integer> studentScores = new ArrayList<>();
        
        boolean moreGrades = true;
        String prompt = null;
        int grade;
        
        do {
            
            userIO.print("\nPlease enter the grade.");
            prompt = userIO.readInput(prompt);
            grade = Integer.parseInt(prompt);
            studentScores.add(grade);
            
            userIO.print("\nIs there another grade to enter? (yes/no)");
            prompt = userIO.readInput(prompt);
            if ("no".equalsIgnoreCase(prompt)) {
                moreGrades = false;
            }
            
        } while (moreGrades == true);
        
        return studentScores;
        
    }
    
    void removeStudent() {
        
        String prompt = null;
        
        userIO.print("\nFrom the following, which student would you like to remove?");
        viewStudents();
        
        userIO.print("");
        prompt = userIO.readInput(prompt);
        studentQuiz.remove(prompt);
        
        userIO.print("\n" + prompt + " has been removed.");
        
    }
    
    void viewStudentScores() {
        
        String prompt = null;
        
        userIO.print("\nFrom the follow students, whose grade would you like to see?");
        viewStudents();
        
        userIO.print("");
        prompt = userIO.readInput(prompt);
        ArrayList<Integer> quizScores = studentQuiz.get(prompt);
        
        userIO.print("\n" + prompt + "'s grades are:");
        for (int s : quizScores) {
            userIO.print(s);
        }
        
    }
    
    void viewStudentAverage() {
        
        String prompt = null;
        int gradeSum = 0;
        int numOfQuizzes = 0;
        double studentAverage;
        
        userIO.print("\nFrom the following students, whose average would you like to calculate?");
        viewStudents();
        
        userIO.print("");
        prompt = userIO.readInput(prompt);
        ArrayList<Integer> quizScores = studentQuiz.get(prompt);
        
        userIO.print("\n" + prompt + "'s average is:");
        for (int i : quizScores) {
            gradeSum += i;
            numOfQuizzes++;
        }
        
        studentAverage = gradeSum / numOfQuizzes;
        userIO.print(studentAverage);
        
    }
    
    void viewClassAverage() {
        
        String prompt = null;
        int gradeSum = 0;
        int numOfQuizzes = 0;
        double classAverage;
        
        for (String s : studentQuiz.keySet()) {
            
            ArrayList<Integer> quizScores = studentQuiz.get(s);
            
            for (int i : quizScores) {
                gradeSum += i;
                numOfQuizzes++;
            }
            
        }
        
        classAverage = gradeSum / numOfQuizzes;
        userIO.print("\nThe class average is:");
        userIO.print(classAverage);
        
    }
    
    void viewHighestScores() {
        
        int highestScore = Integer.MIN_VALUE;
        HashMap<String, Integer> studentNames = new HashMap<>();
        
        // First loop to find the highest score
        for (String s : studentQuiz.keySet()) {
            
            ArrayList<Integer> quizScores = studentQuiz.get(s);
            
            for (int i : quizScores) {
                if (i > highestScore) {
                    highestScore = i;
                }
            }
            
        }
        
        // Second loop to print out the students with the highest score
        for (String s : studentQuiz.keySet()) {
            
            ArrayList<Integer> quizScores = studentQuiz.get(s);
            
            for (int i : quizScores) {
                if (i == highestScore) {
                    studentNames.put(s, highestScore);
                }
            }
            
        }
        
        userIO.print("\nStudents with the highest quiz score:");
        for (String s : studentNames.keySet()) {
            userIO.print(s + " | " + studentNames.get(s));
        }
        
    }
    
    void viewLowestScores() {
        
        int lowestScore = Integer.MAX_VALUE;
        String prompt = null;
        
        HashMap<String, Integer> studentNames = new HashMap<>();
        
        // First loop to find the highest score
        for (String s : studentQuiz.keySet()) {
            
            ArrayList<Integer> quizScores = studentQuiz.get(s);
            
            for (int i : quizScores) {
                if (i < lowestScore) {
                    lowestScore = i;
                }
            }
            
        }
        
        // Second loop to print out the students with the highest score
        for (String s : studentQuiz.keySet()) {
            
            ArrayList<Integer> quizScores = studentQuiz.get(s);
            
            for (int i : quizScores) {
                if (i == lowestScore) {
                    studentNames.put(s, lowestScore);
                }
            }
            
        }
        
        userIO.print("\nStudents with the lowest quiz score:");
        for (String s : studentNames.keySet()) {
            userIO.print(s + " | " + studentNames.get(s));
        }
        
    }
    
    /*
    boolean continueApp() {
        
        while (true) {
            
            userIO.print("\nWould you like to continue using the database? (yes/no) ");
            String prompt = "null";
            prompt = userIO.readInput(prompt);
            
            if ("yes".equalsIgnoreCase(prompt)) {
                userIO.print("\nFetching menu...");
                return true;
            } else {
                userIO.print("\nThank you! Exiting database...");
                return false;
            }
            
        }
        
    }*/
    
}
