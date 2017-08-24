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
public class SumTest {
    
    Sum sum = new Sum();
    
    public SumTest() {
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
     * Test of sum method, of class Sum.
     */
    // sum({1, 2, 3}) -> 6
    // sum({5, 11, 2}) -> 18
    // sum({7, 0, 0}) -> 7
    @Test
    public void testSum123() {
        
        assertEquals(6, sum.sum(new int[]{1, 2, 3}));
        
    }
    
    @Test
    public void testSum5112() {
        
        assertEquals(18, sum.sum(new int[]{5, 11, 2}));
        
    }
    
    @Test
    public void testSum700() {
        
        assertEquals(7, sum.sum(new int[]{7, 0, 0}));
        
    }
    
}
