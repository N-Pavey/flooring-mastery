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
public class StringTimesTest {
    
    StringTimes stringTimes = new StringTimes();
    
    public StringTimesTest() {
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
     * Test of stringTimes method, of class StringTimes.
     */
    @Test
    public void testStr3() {
        
        assertEquals("HiHiHi", stringTimes.stringTimes("Hi", 3));
        
    }
    
    @Test
    public void testStr2() {
        
        assertEquals("HiHi", stringTimes.stringTimes("Hi", 2));
        
    }
    
    @Test
    public void testStr1() {
        
        assertEquals("Hi", stringTimes.stringTimes("Hi", 1));
        
    }
    
    @Test
    public void testStr0() {
        
        assertNull(stringTimes.stringTimes("Hi", 0));
        
    }
    
    @Test
    public void testStrNeg1() {
        
        assertNull(stringTimes.stringTimes("Hi", -1));
        
    }
    
    @Test
    public void testEmpty1() {
        
        assertNull(stringTimes.stringTimes("", 1));
        
    }
    
    @Test
    public void testEmpty0() {
        
        assertNull(stringTimes.stringTimes("", 0));
        
    }
    
    @Test
    public void testEmptyNeg1() {
        
        assertNull(stringTimes.stringTimes("", -1));
        
    }
    
}
