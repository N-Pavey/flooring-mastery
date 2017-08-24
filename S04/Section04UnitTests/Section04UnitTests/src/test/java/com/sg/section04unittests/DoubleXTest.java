/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section04unittests;

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
public class DoubleXTest {
    
    DoubleX doubleX = new DoubleX();
    
    public DoubleXTest() {
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
     * Test of doubleX method, of class DoubleX.
     */
    // doubleX("axxbb") -> true
    // doubleX("axaxxax") -> false
    // doubleX("xxxxx") -> true
    @Test
    public void testAXXBB() {
        
        assertTrue(doubleX.doubleX("axxbb"));
        
    }
    
    @Test
    public void testAXAXXAX() {
        
        assertFalse(doubleX.doubleX("axaxxax"));
        
    }
    
    @Test
    public void testXXXXX() {
        
        assertTrue(doubleX.doubleX("xxxxx"));
        
    }
    
}