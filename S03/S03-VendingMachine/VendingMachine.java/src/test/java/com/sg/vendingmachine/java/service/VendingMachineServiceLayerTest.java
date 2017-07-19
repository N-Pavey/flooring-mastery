/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.java.service;

import com.sg.vendingmachine.java.dao.VendingMachineAuditDao;
import com.sg.vendingmachine.java.dao.VendingMachineAuditDaoStubImpl;
import com.sg.vendingmachine.java.dao.VendingMachineDao;
import com.sg.vendingmachine.java.dao.VendingMachineDaoStubImpl;
import com.sg.vendingmachine.java.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.java.dto.Change;
import com.sg.vendingmachine.java.dto.VendingMachineItem;
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
public class VendingMachineServiceLayerTest {
    
    private VendingMachineServiceLayer service;
    
    public VendingMachineServiceLayerTest() {
        
        VendingMachineDao dao = new VendingMachineDaoStubImpl();
        VendingMachineAuditDao auditDao = new VendingMachineAuditDaoStubImpl();
        service = new VendingMachineServiceLayerImpl(dao, auditDao);
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of retrieveAllItems method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testRetrieveAllItems() throws Exception {
        
        assertEquals(1, service.retrieveAllItems().size());
        
    }

    /**
     * Test of addUserFunds method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testAddUserFunds() throws Exception {
        
        service.addUserFunds(new BigDecimal("1.00"));
        
    }
    
    @Test
    public void testAddUserFundsNumberFormatException() throws Exception {
    
        try {
            
            service.addUserFunds(new BigDecimal("1,00"));
            fail("Expected NumberFormatException was not thrown.");
            
        } catch (NumberFormatException e) {
            
            return;
            
        }
    
    }

    /**
     * Test of getUserFunds method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testGetUserFunds() throws Exception {
        
        assertNotNull(service.getUserFunds());
        
    }

    /**
     * Test of getItem method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testGetItem() throws Exception {
        
        VendingMachineItem item = service.getItem("A1");
        assertNotNull(item);
        
        item = service.getItem("b3");
        assertNull(item);
        
    }

    /**
     * Test of vendItem method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testVendItem() throws Exception {
        
        VendingMachineItem item = service.getItem("A1");
        service.vendItem(item, BigDecimal.ONE);
        
    }
    
    @Test
    public void testVendItemNullPointerException() throws Exception {
        
        VendingMachineItem item = service.getItem("b-3");
            
        try {
            
            service.vendItem(item, BigDecimal.ONE);
            fail("Expected NullPointerException not thrown.");
            
        } catch (NullPointerException e) {
            
            return;
            
        }
        
    }
    
    @Test
    public void testVendItemInsufficientFundsException() throws Exception {
        
        VendingMachineItem item = service.getItem("A1");
        
        try {
            
            service.vendItem(item, new BigDecimal("0.00"));
            fail("Expected InsufficientFundsException not thrown.");
            
        } catch (VendingMachineInsufficientFundsException e) {
            
            return;
            
        }
        
    }
    
    @Test
    public void testVendItemNoItemInventoryException() throws Exception {
        
        VendingMachineItem item = service.getItem("A1");
        item.setItemInventory(0);
        
        try {
            
            service.vendItem(item, BigDecimal.ONE);
            fail("Expected NoItemInventoryException not thrown.");
            
        } catch (VendingMachineNoItemInventoryException e) {
            
            return;
            
        }
        
    }
    
    @Test
    public void testVendItemNoItemInventoryExceptionWithNoMoney() throws Exception {
        
        VendingMachineItem item = service.getItem("A1");
        item.setItemInventory(0);
        
        try {
            
            service.vendItem(item, BigDecimal.ZERO);
            fail("Expected NoItemInventoryException not thrown.");
            
        } catch (VendingMachineNoItemInventoryException e) {
            
            return;
            
        }
        
    }
    
}
