package com.mycompany.simplecalculator.java;


public class App {
    
    public static void main(String[] args) {
        
        UserIO userInterface = new ImplementedInterface();
        SimpleCalculator mySimpleCalculator = new SimpleCalculator();
        
        double value1;
        double value2;
        String userChoice = null;
        boolean runMethod = true;
        
        while (runMethod == true) {
            
            userInterface.print("Would you like to add, subtract, multiply, or divide two numbers?");
            userInterface.print("Or exit the program? (add, subtract, multiply, divide, exit) ");
            
            userChoice = userInterface.readString(userChoice);
            
            if ("exit".equalsIgnoreCase(userChoice)){
                
                userInterface.print("We'll do math later then!");
                runMethod = false;
                
            } else {
                
                userInterface.print("Great! What's the first number? ");
                value1 = userInterface.readDouble(userChoice);
                
                userInterface.print("Okay. And the second number? ");
                value2 = userInterface.readDouble(userChoice);
                
                if ("add".equalsIgnoreCase(userChoice)) {
                    
                    mySimpleCalculator.addEquation(value1, value2);
                    
                } else if ("subtract".equalsIgnoreCase(userChoice)) {
                    
                    mySimpleCalculator.subtractEquation(value1, value2);
                    
                } else if ("multiply".equalsIgnoreCase(userChoice)) {
                    
                    mySimpleCalculator.multiplyEquation(value1, value2);
                    
                } else {
                    
                    mySimpleCalculator.divideEquation(value1, value2);
                    
                }
                
            }
            
        }
        
    }
    
}