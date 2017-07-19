/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.java.controller;

import com.sg.vendingmachine.java.dto.Change;
import com.sg.vendingmachine.java.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.java.dto.VendingMachineItem;
import com.sg.vendingmachine.java.service.VendingMachineServiceLayer;
import com.sg.vendingmachine.java.service.VendingMachineInsufficientFundsException;
import com.sg.vendingmachine.java.service.VendingMachineNoItemInventoryException;
import com.sg.vendingmachine.java.ui.VendingMachineView;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class VendingMachineController {
    
    VendingMachineView view;
    VendingMachineServiceLayer service;
    
    public VendingMachineController(VendingMachineServiceLayer service, VendingMachineView view) {
        
        this.service = service;
        this.view = view;
        
    }
    
    public void run() {
        
        boolean keepGoing = true;
        int menuSelection = 0;
        
        printWelcome();
        
        try {
        
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {

                    case 1:
                        printItems();
                        break;
                    case 2:
                        addFunds();
                        break;
                    case 3:
                        vendItems();
                        break;
                    case 4:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();

                }

            }
        
        exitMessage();
        
        } catch (VendingMachinePersistenceException e) {
            
            view.displayErrorMessage(e.getMessage());
            
        }
        
    }
    
    private void printWelcome() {
        
        view.printWelcomeBanner();
        
    }
    
    private int getMenuSelection() {
        
        return view.printMenuAndGetSelection();
        
    }

    private void printItems() throws VendingMachinePersistenceException {

        List<VendingMachineItem> itemList = service.retrieveAllItems();
        view.displayItemsInMachine(itemList);

    }

    private void addFunds() throws VendingMachinePersistenceException {

        BigDecimal userFunds = view.addFunds();
        BigDecimal totalFunds = service.addUserFunds(userFunds);
        view.displayAddedFunds(totalFunds);

    }

    private void vendItems() throws VendingMachinePersistenceException {
        
        String itemID = view.selectItemById();
        BigDecimal totalFunds = service.getUserFunds();

        try {

            VendingMachineItem item = service.getItem(itemID);
            service.vendItem(item, totalFunds);
            view.displayPurchaseSuccessBanner(item, totalFunds);

        } catch (NullPointerException | VendingMachineNoItemInventoryException | VendingMachineInsufficientFundsException e) {

            view.displayErrorMessage(e.getMessage());

        }

    }

    private void unknownCommand() {

        view.displayUnknownCommandBanner();

    }

    private void exitMessage() {

        view.displayExitBanner();

    }
    
}
