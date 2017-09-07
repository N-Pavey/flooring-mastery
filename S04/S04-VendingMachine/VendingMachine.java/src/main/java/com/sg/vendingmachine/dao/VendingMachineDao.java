/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.VendingMachineItem;
import com.sg.vendingmachine.service.VendingMachineInsufficientFundsException;
import com.sg.vendingmachine.service.VendingMachineNoItemInventoryException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface VendingMachineDao {

    public List<VendingMachineItem> retrieveAllItems() throws VendingMachinePersistenceException;

    public BigDecimal addUserFunds(BigDecimal userFunds) throws VendingMachinePersistenceException;

    public BigDecimal getUserFunds() throws VendingMachinePersistenceException;

    public VendingMachineItem getItem(String itemID) throws VendingMachinePersistenceException;

    public void vendItem(VendingMachineItem item) throws VendingMachinePersistenceException, VendingMachineInsufficientFundsException, VendingMachineNoItemInventoryException;
    
}
