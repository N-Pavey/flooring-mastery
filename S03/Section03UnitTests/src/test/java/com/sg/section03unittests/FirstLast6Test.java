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
public class FirstLast6Test {
    
    FirstLast6 sixArray = new FirstLast6();
    
    public FirstLast6Test() {
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
     * Test of firstLast6 method, of class FirstLast6.
     */
    // firstLast6({1, 2, 6}) -> true
    // firstLast6({6, 1, 2, 3}) -> true
    // firstLast6({13, 6, 1, 2, 3}) -> false
    @Test
    public void testLastSpot6() {
        
        assertTrue(sixArray.firstLast6(new int[]{1, 2, 6}));
        
    }
    
    @Test
    public void testFirstSpot6() {
        
        assertTrue(sixArray.firstLast6(new int[]{6, 1, 2, 3}));
        
    }
    
    @Test
    public void testBothSpots6() {
        
        assertTrue(sixArray.firstLast6(new int[]{6, 1, 2, 10, 1000, 6}));
        
    }
    
    @Test
    public void testNoEnds6() {
        
        assertFalse(sixArray.firstLast6(new int[]{13, 6, 1, 2, 3}));
        
    }
    
    @Test
    public void testNo6s() {
        
        assertFalse(sixArray.firstLast6(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10}));
        
    }
    
    @Test
    public void testTwo6s() {
        
        assertTrue(sixArray.firstLast6(new int[]{6, 6}));
        
    }
    
    @Test
    public void testOne6() {
        
        assertTrue(sixArray.firstLast6(new int[]{6}));
        
    }
    
}
