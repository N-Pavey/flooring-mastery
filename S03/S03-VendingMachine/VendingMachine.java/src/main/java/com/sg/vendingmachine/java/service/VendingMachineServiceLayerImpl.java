/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.java.service;

import com.sg.vendingmachine.java.dao.VendingMachineAuditDao;
import com.sg.vendingmachine.java.dao.VendingMachineDao;
import com.sg.vendingmachine.java.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.java.dto.Change;
import com.sg.vendingmachine.java.dto.VendingMachineItem;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {
    
    VendingMachineDao dao;
    VendingMachineAuditDao auditDao;
    
    public VendingMachineServiceLayerImpl(VendingMachineDao dao, VendingMachineAuditDao auditDao) {
        
        this.dao = dao;
        this.auditDao = auditDao;
        
    }

    @Override
    public List<VendingMachineItem> retrieveAllItems() throws VendingMachinePersistenceException {

        return dao.retrieveAllItems();

    }

    @Override
    public BigDecimal addUserFunds(BigDecimal userFunds) throws VendingMachinePersistenceException {

        return dao.addUserFunds(userFunds);

    }

    @Override
    public BigDecimal getUserFunds() throws VendingMachinePersistenceException {

        return dao.getUserFunds();

    }

    @Override
    public VendingMachineItem getItem(String itemID) throws VendingMachinePersistenceException {

        return dao.getItem(itemID);

    }

    @Override
    public void vendItem(VendingMachineItem item, BigDecimal totalFunds) throws VendingMachinePersistenceException, VendingMachineInsufficientFundsException, VendingMachineNoItemInventoryException, NullPointerException {

        
        if (item == null) {
         
            throw new NullPointerException("\nLooks like there's nothing in that slot.");
            
        }
            
        if (item.getItemInventory() == 0) {

            throw new VendingMachineNoItemInventoryException("\nERROR: That item is out of stock.");

        }

        if (item.getItemCost().compareTo(totalFunds) > 0) {

            throw new VendingMachineInsufficientFundsException("\nERROR: Not enough money for \"" + item.getItemName() + "\".");

        }
        
        dao.vendItem(item);

        auditDao.writeAuditEntry("Item " + item.getItemID() + " dispensed.");

    }
    
}
