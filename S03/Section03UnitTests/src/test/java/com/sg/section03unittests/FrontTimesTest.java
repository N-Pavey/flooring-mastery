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
public class FrontTimesTest {
    
    FrontTimes front = new FrontTimes();
    
    public FrontTimesTest() {
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
     * Test of frontTimes method, of class FrontTimes.
     */
    
    // frontTimes("Chocolate", 2) -> "ChoCho"
    // frontTimes("Chocolate", 3) -> "ChoChoCho"
    // frontTimes("Abc", 3) -> "AbcAbcAbc"
    @Test
    public void testChocolate2() {
        
        assertEquals("ChoCho", front.frontTimes("Chocolate", 2));
        
    }
    
    @Test
    public void testChocolate3() {
        
        assertEquals("ChoChoCho", front.frontTimes("Chocolate", 3));
        
    }
    
    @Test
    public void testAbc3() {
        
        assertEquals("AbcAbcAbc", front.frontTimes("Abc", 3));
        
    }
    
    @Test
    public void testAbc2() {
        
        assertEquals("AbcAbc", front.frontTimes("Abc", 2));
        
    }
    
    @Test
    public void testAbc1() {
        
        assertEquals("Abc", front.frontTimes("Abc", 1));
        
    }
    
    @Test
    public void testAbc0() {
        
        assertEquals("", front.frontTimes("Abc", 0));
        
    }
    
    @Test
    public void testAb2() {
        
        assertEquals("AbAb", front.frontTimes("Ab", 2));
        
    }
    
    @Test
    public void testAb1() {
        
        assertEquals("Ab", front.frontTimes("Ab", 1));
        
    }
    
    @Test
    public void testAb0() {
        
        assertEquals("", front.frontTimes("Ab", 0));
        
    }
    
    @Test
    public void testA2() {
        
        assertEquals("AA", front.frontTimes("A", 2));
        
    }
    
    @Test
    public void testA1() {
        
        assertEquals("A", front.frontTimes("A", 1));
        
    }
    
    @Test
    public void testA0() {
        
        assertEquals("", front.frontTimes("A", 0));
        
    }
    
    @Test
    public void testEmpty2() {
        
        assertEquals("", front.frontTimes("", 2));
        
    }
    
    @Test
    public void testEmpty1() {
        
        assertEquals("", front.frontTimes("", 1));
        
    }
    
    @Test
    public void testEmpty0() {
        
        assertEquals("", front.frontTimes("", 0));
        
    }
    
}
