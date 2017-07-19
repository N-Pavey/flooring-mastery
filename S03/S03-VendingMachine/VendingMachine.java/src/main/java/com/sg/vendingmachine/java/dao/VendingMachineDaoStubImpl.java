/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.java.dao;

import com.sg.vendingmachine.java.dto.VendingMachineItem;
import com.sg.vendingmachine.java.service.VendingMachineInsufficientFundsException;
import com.sg.vendingmachine.java.service.VendingMachineNoItemInventoryException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class VendingMachineDaoStubImpl implements VendingMachineDao {
    
    private VendingMachineItem onlyItem;
    private List<VendingMachineItem> machineInventory = new ArrayList<>();
    private BigDecimal totalFunds = BigDecimal.ZERO;
    
    public VendingMachineDaoStubImpl() {
        
        onlyItem = new VendingMachineItem("A1");
        onlyItem.setItemName("M&Ms");
        onlyItem.setItemInventory(2);
        onlyItem.setItemCost(new BigDecimal("1.00"));
        
        machineInventory.add(onlyItem);
        
    }

    @Override
    public List<VendingMachineItem> retrieveAllItems() throws VendingMachinePersistenceException {

        return machineInventory;

    }

    @Override
    public BigDecimal addUserFunds(BigDecimal userFunds) throws VendingMachinePersistenceException {

        return totalFunds;

    }

    @Override
    public BigDecimal getUserFunds() throws VendingMachinePersistenceException {

        return totalFunds;

    }

    @Override
    public VendingMachineItem getItem(String itemID) throws VendingMachinePersistenceException {

        if (itemID.equalsIgnoreCase(onlyItem.getItemID())) {
            
            return onlyItem;
            
        } else {
            
            return null;
            
        }

    }

    @Override
    public void vendItem(VendingMachineItem item) throws VendingMachinePersistenceException, VendingMachineInsufficientFundsException, VendingMachineNoItemInventoryException {

        //Nothing to return - do nothing

    }
    
}
