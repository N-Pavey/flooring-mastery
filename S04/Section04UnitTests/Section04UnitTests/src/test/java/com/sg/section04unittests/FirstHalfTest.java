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
public class FirstHalfTest {
    
    FirstHalf firstHalf = new FirstHalf();
    
    public FirstHalfTest() {
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

    // firstHalf("WooHoo") -> "Woo"
    // firstHalf("HelloThere") -> "Hello"
    // firstHalf("abcdef") -> "abc"
    @Test
    public void testWooHoo() {
        
        assertEquals("Woo", firstHalf.firstHalf("WooHoo"));
        
    }
    
    @Test
    public void testHelloThere() {
        
        assertEquals("Hello", firstHalf.firstHalf("HelloThere"));
        
    }
    
    @Test
    public void testABCDEF() {
        
        assertEquals("abc", firstHalf.firstHalf("abcdef"));
        
    }
    
}
