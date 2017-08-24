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
public class EveryOtherTest {
    
    EveryOther everyOther = new EveryOther();
    
    public EveryOtherTest() {
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
     * Test of everyOther method, of class EveryOther.
     */
    // everyOther("Hello") -> "Hlo"
    // everyOther("Hi") -> "H"
    // everyOther("Heeololeo") -> "Hello"
    @Test
    public void testEveryOtherHlo() {
        
        assertEquals("Hlo", everyOther.everyOther("Hello"));
        
    }
    
    @Test
    public void testEveryOtherH() {
        
        assertEquals("H", everyOther.everyOther("Hi"));
        
    }
    
    @Test
    public void testEveryOtherHeeololeo() {
        
        assertEquals("Hello", everyOther.everyOther("Heeololeo"));
        
    }
    
}
