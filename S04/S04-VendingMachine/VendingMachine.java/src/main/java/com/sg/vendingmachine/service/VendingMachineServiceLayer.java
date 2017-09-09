/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.VendingMachineItem;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface VendingMachineServiceLayer {

    List<VendingMachineItem> retrieveAllItems() throws VendingMachinePersistenceException;

    BigDecimal addUserFunds(BigDecimal userFunds) throws VendingMachinePersistenceException;

    BigDecimal getUserFunds() throws VendingMachinePersistenceException;
    
    VendingMachineItem getItem(String itemID) throws VendingMachinePersistenceException;

    void vendItem(VendingMachineItem item, BigDecimal totalFunds) throws VendingMachinePersistenceException, VendingMachineInsufficientFundsException, VendingMachineNoItemInventoryException;
    
    Change makeChange(VendingMachineItem item, BigDecimal totalFunds) throws VendingMachinePersistenceException;
    
}

