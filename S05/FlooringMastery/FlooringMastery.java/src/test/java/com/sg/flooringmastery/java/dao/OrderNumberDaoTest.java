/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

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
public class OrderNumberDaoTest {
    
    private OrderNumberDao orderNumDao = new OrderNumberDaoFileImpl();
    
    public OrderNumberDaoTest() {
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
     * Test of findOrderNumber method, of class OrderNumberDao.
     */
    @Test
    public void testFindIncreaseSaveNumber() throws Exception {
        
        //Save shouldnt happen since orderNum hasn't increased.
        //Will then load in from orderNum file, attempt to increase, and save again.
        orderNumDao.saveOrderNumber();
        assertEquals(1000, orderNumDao.findOrderNumber());
        
        orderNumDao.increaseOrderNumber();
        assertEquals(1001, orderNumDao.findOrderNumber());
        
        orderNumDao.saveOrderNumber();
        assertEquals(1001, orderNumDao.findOrderNumber());
        
    }
    
}
