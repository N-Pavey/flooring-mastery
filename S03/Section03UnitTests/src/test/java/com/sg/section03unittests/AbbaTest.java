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
public class AbbaTest {
    
    Abba abba = new Abba();
    
    public AbbaTest() {
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
     * Test of abba method, of class Abba.
     */
    // abba("Hi", "Bye") -> "HiByeByeHi"
    // abba("Yo", "Alice") -> "YoAliceAliceYo"
    // abba("What", "Up") -> "WhatUpUpWhat"
    @Test
    public void testHiBye() {
        
        assertEquals("HiByeByeHi", abba.abba("Hi", "Bye"));
        
    }
    
    @Test
    public void testYoAlice() {
        
        assertEquals("YoAliceAliceYo", abba.abba("Yo", "Alice"));
        
    }
    
    @Test
    public void testWhatUp() {
        
        assertEquals("WhatUpUpWhat", abba.abba("What", "Up"));
        
    }
    
    @Test
    public void testEmptyTest() {
        
        assertEquals("TestTest", abba.abba("", "Test"));
        
    }
    
    @Test
    public void testTestEmpty() {
        
        assertEquals("TestTest", abba.abba("Test", ""));
        
    }
    
    @Test
    public void testEmptyEmpty() {
        
        assertEquals("", abba.abba("", ""));
        
    }
    
}
