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
public class NearHundredTest {
    
    NearHundred near = new NearHundred();
    
    public NearHundredTest() {
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

    // nearHundred(103) -> true
    // nearHundred(90) -> true
    // nearHundred(89) -> false
    @Test
    public void test103() {
        
        assertTrue(near.nearHundred(103));
        
    }
    
    @Test
    public void test90() {
        
        assertTrue(near.nearHundred(90));
        
    }
    
    @Test
    public void test89() {
        
        assertFalse(near.nearHundred(89));
        
    }
    
    @Test
    public void test200() {
        
        assertTrue(near.nearHundred(200));
        
    }
    
    @Test
    public void test211() {
        
        assertFalse(near.nearHundred(211));
        
    }
    
    @Test
    public void test150() {
        
        assertFalse(near.nearHundred(150));
        
    }
    
}
