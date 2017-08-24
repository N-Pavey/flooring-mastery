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
public class CaughtSpeedingTest {
    
    CaughtSpeeding ticket = new CaughtSpeeding();
    
    public CaughtSpeedingTest() {
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
     * Test of caughtSpeeding method, of class CaughtSpeeding.
     */
    // caughtSpeeding(60, false) → 0
    // caughtSpeeding(65, false) → 1
    //caughtSpeeding(65, true) → 0
    @Test
    public void testCaughtSpeeding60False() {
        
        assertEquals(0, ticket.caughtSpeeding(60, false));
        
    }
    
    @Test
    public void testCaughtSpeeding65False() {
        
        assertEquals(1, ticket.caughtSpeeding(65, false));
        
    }
    
    @Test
    public void testCaughtSpeeding65True() {
        
        assertEquals(0, ticket.caughtSpeeding(65, true));
        
    }
    
    @Test
    public void testCS85True() {
        
        assertEquals(1, ticket.caughtSpeeding(85, true));
        
    }
    
    @Test
    public void testCS81False() {
        
        assertEquals(2, ticket.caughtSpeeding(81, false));
        
    }
    
    @Test
    public void testCS86True() {
        
        assertEquals(2, ticket.caughtSpeeding(86, true));
        
    }
    
}
