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
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class VendingMachineDaoTest {
    
    private VendingMachineDao dao = new VendingMachineDaoFileImpl();
    
    public VendingMachineDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of retrieveAllItems method, of class VendingMachineDao.
     */
    @Test
    public void testRetrieveAllItems() throws Exception {
        
        //No Add method for vending machine
        //Items passed in through file so since there's 3
        //items currently in the machine, the size should
        //equal 3.
        assertEquals(3, dao.retrieveAllItems().size());
        
    }

    /**
     * Test of addUserFunds method, of class VendingMachineDao.
     */
    @Test
    public void testAddAndGetUserFunds() throws Exception {
        
        //Starting with 0. Will add 1.00 and verify it was added
        assertEquals(BigDecimal.ZERO, dao.getUserFunds());
        
        dao.addUserFunds(new BigDecimal("1.00"));
        assertEquals(new BigDecimal("1.00"), dao.getUserFunds());
        
        //Now adding another amount - Verify it was added
        dao.addUserFunds(new BigDecimal("1.49"));
        assertEquals(new BigDecimal("2.49"), dao.getUserFunds());
        
    }

    /**
     * Test of getItem method, of class VendingMachineDao.
     */
    @Test
    public void testGetItem() throws Exception {
        
        //Create an item identical to the one in the inventory file
        //create new item pulling from item in inventory
        //assert that they are equal - fromDao is pulling info correctly
        VendingMachineItem item = new VendingMachineItem("A1");
        item.setItemName("M&Ms");
        item.setItemInventory(3);
        item.setItemCost(new BigDecimal("1.00"));
        
        VendingMachineItem fromDao = dao.getItem(item.getItemID());
        
        assertEquals(item, fromDao);
        
    }

    /**
     * Test of vendItem method, of class VendingMachineDao.
     */
    @Test
    public void testVendItem() throws Exception {
        
        VendingMachineItem item = dao.getItem("A3");
        
        //Verify that inventory is being subtracted by 1 with each purchase
        assertEquals(5, item.getItemInventory());
        
        dao.vendItem(item);
        assertEquals(4, item.getItemInventory());
        
    }
    
}
