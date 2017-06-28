/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section03unittests;

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
public class CountingXXTest {
    
    CountingXX count = new CountingXX();
    
    public CountingXXTest() {
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
     * Test of countXX method, of class CountingXX.
     */
    // countXX("abcxx") -> 1
    // countXX("xxx") -> 2
    // countXX("xxxx") -> 3
    @Test
    public void testABCXX() {
        
        assertEquals(1, count.countXX("abcxx"));
        
    }
    
    @Test
    public void testXXX() {
        
        assertEquals(2, count.countXX("xxx"));
        
    }
    
    @Test
    public void testXXXX() {
        
        assertEquals(3, count.countXX("xxxx"));
        
    }
    
    @Test
    public void testXBXXAXXX() {
        
        assertEquals(3, count.countXX("xbxxaxxx"));
        
    }
    
    @Test
    public void testX() {
        
        assertEquals(0, count.countXX("x"));
        
    }
    
}
