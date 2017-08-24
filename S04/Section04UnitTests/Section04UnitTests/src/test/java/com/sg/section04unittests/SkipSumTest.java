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
public class SkipSumTest {
    
    SkipSum skipSum = new SkipSum();
    
    public SkipSumTest() {
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
     * Test of skipSum method, of class SkipSum.
     */
    // skipSum(3, 4) → 7
    // skipSum(9, 4) → 20
    // skipSum(10, 11) → 21
    @Test
    public void testSkipSum34() {
        
        assertEquals(7, skipSum.skipSum(3, 4));
        
    }
    
    @Test
    public void testSkipSum94() {
        
        assertEquals(20, skipSum.skipSum(9, 4));
        
    }
    
    @Test
    public void testSkipSum1011() {
        
        assertEquals(21, skipSum.skipSum(10, 11));
        
    }
    
}
