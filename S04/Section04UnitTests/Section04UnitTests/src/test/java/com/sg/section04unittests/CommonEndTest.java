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
public class CommonEndTest {
    
    CommonEnd arrays = new CommonEnd();
    
    public CommonEndTest() {
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
     * Test of commonEnd method, of class CommonEnd.
     */
    @Test
    public void testLastMatch3() {
        
        // commonEnd({1, 2, 3}, {7, 3}) -> true
        assertTrue(arrays.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
    
    }
    
    @Test
    public void testNoMatch(){
        
        // commonEnd({1, 2, 3}, {7, 3, 2}) -> false
        assertFalse(arrays.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        
    }
    
    @Test
    public void testFirstMatch1(){
        
        // commonEnd({1, 2, 3}, {1, 3}) -> true
        assertTrue(arrays.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
        
    }
    
}
