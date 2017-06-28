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
public class SleepingInTest {
    
    SleepingIn sleep = new SleepingIn();
    
    public SleepingInTest() {
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
     * Test of canSleepIn method, of class SleepingIn.
     */
    // canSleepIn(false, false) -> true
    // canSleepIn(true, false) -> false
    // canSleepIn(false, true) -> true
    @Test
    public void testFalseFalse() {
        
        assertTrue(sleep.canSleepIn(false, false));
        
    }
    
    @Test
    public void testTrueFalse() {
        
        assertFalse(sleep.canSleepIn(true, false));
        
    }
    
    @Test
    public void testFalseTrue() {
        
        assertTrue(sleep.canSleepIn(false, true));
        
    }
    
    @Test
    public void testTrueTrue() {
        
        assertTrue(sleep.canSleepIn(true, true));
        
    }
    
}
