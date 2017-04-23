/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class LovesMe {
    
    public static void main(String[] args) {
        
        int petalCounter = 34;
        
        System.out.println("Let's see how this goes...");
        
        /*
        do {
            if ((petalCounter % 2) == 0) {
                System.out.println("He loves me not...");
                petalCounter--;
            } else {
                System.out.println("He LOVES me!!");
                petalCounter--;
            }
        } while (petalCounter > 0);
        */
        
        // Using a while loop for this, but a Do While can be used above instead.
        // While preferred as we don't need the code to run before we determine
        // if the petalCounter > 0 is true or false. Obviously, if petalCounter is
        // 0 or less, then there's nothing to count and there shouldn't be an output.
        while (petalCounter > 0) {
            if ((petalCounter % 2) == 0) {
                System.out.println("He loves me not...");
                petalCounter--;
            } else {
                System.out.println("He LOVES me!!");
                petalCounter--;
            }
        }
        
        
        System.out.println("What a relief! He loves me!!");
        
    }
    
}
