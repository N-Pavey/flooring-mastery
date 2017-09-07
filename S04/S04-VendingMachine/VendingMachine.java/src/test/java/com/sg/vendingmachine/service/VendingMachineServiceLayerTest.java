/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dto.VendingMachineItem;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class VendingMachineServiceLayerTest {
    
    private VendingMachineServiceLayer service;
    
    public VendingMachineServiceLayerTest() {
        
//        VendingMachineDao dao = new VendingMachineDaoStubImpl();
//        VendingMachineAuditDao auditDao = new VendingMachineAuditDaoStubImpl();
//        service = new VendingMachineServiceLayerImpl(dao, auditDao);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        service = ctx.getBean("serviceLayer", VendingMachineServiceLayer.class);
        
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
     * Test of addUserFunds and getUserFunds methods, of class VendingMachineServiceLayer.
     */
    @Test
    public void testAddAndGetUserFunds() throws Exception {
        
        service.addUserFunds(new BigDecimal("1.00"));
        assertEquals(new BigDecimal("1.00"), service.getUserFunds());
        
    }
    
    @Test
    public void testAddAndGetUserFundsNumberFormatException() throws Exception {
    
        try {
            
            service.addUserFunds(new BigDecimal("1,00"));
            fail("Expected NumberFormatException was not thrown.");
            
        } catch (NumberFormatException e) {
            
            return;
            
        }
        
        assertEquals(BigDecimal.ZERO, service.getUserFunds());
    
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
        
        //Item inventory starts at 2 - assert that an item was dispensed
        assertEquals(1, item.getItemInventory());
        
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
        
        assertNull(item);
        
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
        
        //assert that nothing was dispensed since user didn't have enough funds
        assertEquals(2, item.getItemInventory());
        
    }
    
    @Test
    public void testVendItemNoItemInventoryException() throws Exception {
        
        VendingMachineItem item = service.getItem("A1");
        
        //vend item twice to clear out inventory.
        service.vendItem(item, BigDecimal.ONE);
        service.vendItem(item, BigDecimal.ONE);
        
        try {
            
            service.vendItem(item, BigDecimal.ONE);
            fail("Expected NoItemInventoryException not thrown.");
            
        } catch (VendingMachineNoItemInventoryException e) {
            
            return;
            
        }
        
        //Ensure nothing was dispensed since there's nothing to dispense
        assertEquals(0, item.getItemInventory());
        
    }
    
    @Test
    public void testVendItemNoItemInventoryExceptionWithNoMoney() throws Exception {
        
        VendingMachineItem item = service.getItem("A1");
        
        //vend item twice to clear out inventory.
        service.vendItem(item, BigDecimal.ONE);
        service.vendItem(item, BigDecimal.ONE);
        
        try {
            
            service.vendItem(item, BigDecimal.ZERO);
            fail("Expected NoItemInventoryException not thrown.");
            
        } catch (VendingMachineNoItemInventoryException e) {
            
            return;
            
        }
        
        //Since there was no item to dispense, make sure nothing was in fact dispensed
        assertEquals(0, item.getItemInventory());
        
    }
    
}
