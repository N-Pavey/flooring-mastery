/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

import com.sg.flooringmastery.java.dto.Product;
import java.math.BigDecimal;
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
public class ProductDaoTest {
    
    private ProductDao productDao = new ProductDaoFileImpl();
    
    public ProductDaoTest() {
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
     * Test of findProduct method, of class ProductDao.
     */
    @Test
    public void testFindProduct() throws Exception {
        
        //Make sure it can pull all types of product
        String productType = "Carpet";
        Product product = productDao.findProduct(productType);
        assertEquals("Carpet", product.getProductType());
        assertEquals(new BigDecimal("2.25"), product.getMaterialCostPerSqFt());
        assertEquals(new BigDecimal("2.10"), product.getLaborCostPerSqFt());
        
        productType = "Laminate";
        product = productDao.findProduct(productType);
        assertEquals("Laminate", product.getProductType());
        assertEquals(new BigDecimal("1.75"), product.getMaterialCostPerSqFt());
        assertEquals(new BigDecimal("2.10"), product.getLaborCostPerSqFt());
        
        productType = "Tile";
        product = productDao.findProduct(productType);
        assertEquals("Tile", product.getProductType());
        assertEquals(new BigDecimal("3.50"), product.getMaterialCostPerSqFt());
        assertEquals(new BigDecimal("4.15"), product.getLaborCostPerSqFt());
        
        productType = "Wood";
        product = productDao.findProduct(productType);
        assertEquals("Wood", product.getProductType());
        assertEquals(new BigDecimal("5.15"), product.getMaterialCostPerSqFt());
        assertEquals(new BigDecimal("4.75"), product.getLaborCostPerSqFt());
        
    }
    
}
