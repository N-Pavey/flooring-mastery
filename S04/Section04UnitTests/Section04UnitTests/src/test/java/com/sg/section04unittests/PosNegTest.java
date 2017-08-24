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
public class PosNegTest {
    
    PosNeg posNeg = new PosNeg();
    
    public PosNegTest() {
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

    // posNeg(1, -1, false) -> true
    // posNeg(-1, 1, false) -> true
    // posNeg(-4, -5, true) -> true
    @Test
    public void test1N1False() {
        
        assertTrue(posNeg.posNeg(1, -1, false));
        
    }
    
    @Test
    public void testN11False(){
        
        assertTrue(posNeg.posNeg(-1, 1, false));
        
    }
    
    @Test
    public void testN4N5True() {
        
        assertTrue(posNeg.posNeg(-4, -5, true));
        
    }
    
    @Test
    public void testN2N3False() {
        
        assertFalse(posNeg.posNeg(-2, -3, false));
        
    }
    
    @Test
    public void test00True() {
        
        assertFalse(posNeg.posNeg(0, 0, true));
        
    }
    
    @Test
    public void test00False() {
        
        assertFalse(posNeg.posNeg(0, 0, false));
        
    }
    
    @Test
    public void test35False() {
        
        assertFalse(posNeg.posNeg(3, 5, false));
        
    }
    
    @Test
    public void test35True() {
        
        assertFalse(posNeg.posNeg(3, 5, true));
        
    }
    
}
