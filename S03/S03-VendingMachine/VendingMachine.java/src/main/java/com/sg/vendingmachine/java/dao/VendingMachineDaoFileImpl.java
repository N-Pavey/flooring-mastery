/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.java.dao;

import com.sg.vendingmachine.java.dto.Change;
import com.sg.vendingmachine.java.dto.VendingMachineItem;
import com.sg.vendingmachine.java.service.VendingMachineInsufficientFundsException;
import com.sg.vendingmachine.java.service.VendingMachineNoItemInventoryException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class VendingMachineDaoFileImpl implements VendingMachineDao {
    
    private Map<String, VendingMachineItem> items = new HashMap<>();
    private BigDecimal totalFunds = BigDecimal.ZERO;
    
    public static final String INVENTORY_FILE = "vendingMachineItemInventory.txt";
    public static final String DELIMITER = "::";
    
    private void loadInventory() throws VendingMachinePersistenceException {
        
        Scanner scanner;
        
        try {
            
            scanner = new Scanner(new BufferedReader(new FileReader(INVENTORY_FILE)));
            
        } catch (FileNotFoundException e) {
            
            throw new VendingMachinePersistenceException("Could not load the Vending Machine Inventory into memory...", e);
            
        }
        
        String currentLine;
        String[] currentTokens;
        
        while (scanner.hasNextLine()) {
            
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            
            VendingMachineItem currentItem = new VendingMachineItem(currentTokens[0]);
            currentItem.setItemName(currentTokens[1]);
            currentItem.setItemInventory(Integer.parseInt(currentTokens[2]));
            currentItem.setItemCost(new BigDecimal(currentTokens[3]));
            
            items.put(currentItem.getItemID(), currentItem);
            
        }
        
        scanner.close();
        
    }
    
    private void writeInventory() throws VendingMachinePersistenceException {
        
        PrintWriter out;
        
        try {
            
            out = new PrintWriter(new FileWriter(INVENTORY_FILE));
            
        } catch (IOException e) {
            
            throw new VendingMachinePersistenceException("Could not save Vending Machine Inventory.", e);
            
        }
        
        List<VendingMachineItem> itemList = this.retrieveAllItems();
        
        for (VendingMachineItem currentItem : itemList) {
            
            out.println(currentItem.getItemID() + DELIMITER + currentItem.getItemName() + DELIMITER
                + currentItem.getItemInventory() + DELIMITER + currentItem.getItemCost());
            out.flush();
            
        }
        
        out.close();
        
    }

    @Override
    public List<VendingMachineItem> retrieveAllItems() throws VendingMachinePersistenceException {

        loadInventory();
        return new ArrayList<VendingMachineItem>(items.values());

    }

    @Override
    public BigDecimal addUserFunds(BigDecimal userFunds) throws VendingMachinePersistenceException {
        
        totalFunds = totalFunds.add(userFunds);
        return totalFunds;

    }

    @Override
    public BigDecimal getUserFunds() throws VendingMachinePersistenceException {

        return totalFunds;
        
    }

    @Override
    public VendingMachineItem getItem(String itemID) throws VendingMachinePersistenceException {

        loadInventory();
        return items.get(itemID);

    }

    @Override
    public void vendItem(VendingMachineItem item) throws VendingMachinePersistenceException, VendingMachineInsufficientFundsException, VendingMachineNoItemInventoryException {

        //loadInventory();
        
        int itemInv = item.getItemInventory();
        itemInv--;
        item.setItemInventory(itemInv);
        
        writeInventory();
        
        totalFunds = BigDecimal.ZERO;

    }
    
}
