/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

import java.math.BigDecimal;
import java.util.Map;
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
public class TaxRateDaoTest {
    
    private TaxRateDao taxRateDao = new TaxRateDaoFileImpl();
    
    public TaxRateDaoTest() {
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
     * Test of findTaxRate method, of class TaxRateDao.
     */
    @Test
    public void testFindTaxRate() throws Exception {
        
        String state = "OH";
        BigDecimal taxRate = taxRateDao.findTaxRate(state);
        assertEquals(new BigDecimal("6.25"), taxRate);
        
        state = "PA";
        taxRate = taxRateDao.findTaxRate(state);
        assertEquals(new BigDecimal("6.75"), taxRate);
        
        state = "MI";
        taxRate = taxRateDao.findTaxRate(state);
        assertEquals(new BigDecimal("5.75"), taxRate);
        
        state = "IN";
        taxRate = taxRateDao.findTaxRate(state);
        assertEquals(new BigDecimal("6.00"), taxRate);
        
    }
    
    @Test
    public void testFindTaxRateInvalidState() throws Exception {
        
        String state = "Europe";
        assertNull(taxRateDao.findTaxRate(state));
        
    }
    
    @Test
    public void testFindTaxRateBlankField() throws Exception {
        
        String state = "";
        assertNull(taxRateDao.findTaxRate(state));
        
    }
    
    @Test
    public void testPullAllStates() throws Exception {
        
        Map<String, BigDecimal> states = taxRateDao.pullAvailableStates();
        assertEquals(4, states.size());
        
    }
    
}
