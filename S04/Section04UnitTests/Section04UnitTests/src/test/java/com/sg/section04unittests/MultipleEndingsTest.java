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
public class MultipleEndingsTest {
    
    MultipleEndings multipleEndings = new MultipleEndings();
    
    public MultipleEndingsTest() {
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
     * Test of multipleEndings method, of class MultipleEndings.
     */
    // multipleEndings("Hello") -> "lololo"
    // multipleEndings("ab") -> "ababab"
    // multipleEndings("Hi") -> "HiHiHi"
    @Test
    public void testMultipleEndingsHello() {
        
        assertEquals("lololo", multipleEndings.multipleEndings("Hello"));
        
    }
    
    @Test
    public void testMultipleEndingsAB() {
        
        assertEquals("ababab", multipleEndings.multipleEndings("ab"));
        
    }
    
    @Test
    public void testMultipleEndingsHi() {
        
        assertEquals("HiHiHi", multipleEndings.multipleEndings("Hi"));
        
    }
    
}
