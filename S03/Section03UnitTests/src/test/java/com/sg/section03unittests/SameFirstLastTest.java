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
public class SameFirstLastTest {
    
    SameFirstLast same = new SameFirstLast();
    
    public SameFirstLastTest() {
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
     * Test of sameFirstLast method, of class SameFirstLast.
     */
    // sameFirstLast({1, 2, 3}) -> false
    // sameFirstLast({1, 2, 3, 1}) -> true
    // sameFirstLast({1, 2, 1}) -> true
    @Test
    public void test123() {
        
        assertFalse(same.sameFirstLast(new int[]{1, 2, 3}));
        
    }
    
    @Test
    public void test1231() {
        
        assertTrue(same.sameFirstLast(new int[]{1, 2, 3, 1}));
        
    }
    
    @Test
    public void test121() {
        
        assertTrue(same.sameFirstLast(new int[]{1, 2, 1}));
        
    }
    
    @Test
    public void test11() {
        
        assertTrue(same.sameFirstLast(new int[]{1, 1}));
        
    }
    
    @Test
    public void test1() {
        
        assertTrue(same.sameFirstLast(new int[]{1}));
        
    }
    
    @Test
    public void test122() {
        
        assertFalse(same.sameFirstLast(new int[]{1, 2, 2}));
        
    }
    
    @Test
    public void test221() {
        
        assertFalse(same.sameFirstLast(new int[]{2, 2, 1}));
        
    }
    
    @Test
    public void test12() {
        
        assertFalse(same.sameFirstLast(new int[]{1, 2}));
        
    }
    
    @Test
    public void test12345() {
        
        assertFalse(same.sameFirstLast(new int[]{1, 2, 3, 4, 5}));
        
    }
    
    @Test
    public void test55555() {
        
        assertTrue(same.sameFirstLast(new int[]{5, 5, 5, 5, 5}));
        
    }
    
}
