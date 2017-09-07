/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.ui;

import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.VendingMachineItem;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class VendingMachineView {
    
    private UserIO io;
    
    public VendingMachineView(UserIO io) {
        
        this.io = io;
        
    }
    
    public void printWelcomeBanner() {
        
        io.print("Welcome to VEND-O-TRON, your favorite eSnack vendor!");
        
    }
    
    public int printMenuAndGetSelection() {
        
        io.print("\n1. View available items.");
        io.print("2. Insert money.");
        io.print("3. Purchase an item.");
        io.print("4. Exit");
            
        return io.readInt("\nPlease select from the above choices.", 1, 4);
            
    }

    public void displayItemsInMachine(List<VendingMachineItem> itemList) {

        int invCounter = 0;
        
        for (VendingMachineItem currentItem : itemList) {
            
            if (currentItem.getItemInventory() > 0) {
                
                invCounter++;
                
            }
            
        }
        
        if (invCounter != 0) {
            
            for (VendingMachineItem currentItem : itemList) {
                
                if (currentItem.getItemInventory() > 1) {
                    
                    io.print("\nSlot ID:   " + currentItem.getItemID());
                    io.print("Item Name: " + currentItem.getItemName());
                    io.print("Item Cost: " + currentItem.getItemCost());
                    
                } else if (currentItem.getItemInventory() == 1) {
                    
                    io.print("\nSlot ID:   " + currentItem.getItemID());
                    io.print("Item Name: " + currentItem.getItemName());
                    io.print("Item Cost: " + currentItem.getItemCost());
                    io.print("And it looks like there's only 1 left!");
                    
                } else {
                    
                    io.print("\nOh well... It looks like whatever was here is out of stock.");
                    
                }
                
            }
            
        } else {
            
            io.print("Looks like this machine was hit hard. It doesn't have anything in stock!");
            
        }
        
        io.readString("\nPlease hit enter to continue.");

    }

    public BigDecimal addFunds() {

        boolean validEntry = false;
        BigDecimal userFunds = BigDecimal.ZERO;
        
        while (!validEntry) {
            
            try {
            
                userFunds = new BigDecimal(io.readString("\nHow much money would you like to deposit? (0.00) "));
                userFunds = userFunds.setScale(2, RoundingMode.HALF_UP);
                validEntry = true;
                
            } catch (NumberFormatException e) {
                
                System.out.println("Please enter in the correct format.");
                validEntry = false;
                
            }
            
        }
        
        return userFunds;

    }

    public void displayAddedFunds(BigDecimal funds) {

        io.print("\nYou currently have $" + funds + " available to use.");
        io.readString("\nPlease hit enter to continue.");

    }

    public String selectItemById() {

        String itemID = io.readString("\nPlease enter the Slot ID of the item you want.");
        itemID = itemID.toUpperCase();
        return itemID;

    }

    public void displayPurchaseSuccessBanner(VendingMachineItem item, BigDecimal totalFunds) {

        totalFunds = totalFunds.subtract(item.getItemCost());
        Change change = new Change(totalFunds);
        
        io.print("\n" + item.getItemName() + " has been dispensed!");
        
        io.print("\nYour change is: ");
        io.print(change.getNumQuarters() + " quarters,");
        io.print(change.getNumDimes() + " dimes,");
        io.print(change.getNumNickels() + " nickels, and");
        io.print(change.getNumPennies() + " pennies.");

    }

    public void displayUnknownCommandBanner() {

        io.print("\n=== Unknown Command ===");

    }

    public void displayErrorMessage(String errorMsg) {

        io.print("\n=== ERROR ===");
        io.print(errorMsg);

    }

    public void displayExitBanner() {

        io.print("\nThanks for using VEND-O-TRON!");

    }
    
}
