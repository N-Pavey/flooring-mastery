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
public class ParrotTroubleTest {
    
    ParrotTrouble trouble = new ParrotTrouble();
    
    public ParrotTroubleTest() {
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

    // parrotTrouble(true, 6) -> true
    // parrotTrouble(true, 7) -> false
    // parrotTrouble(false, 6) -> false
    @Test
    public void testTrue6() {
        
        assertTrue(trouble.parrotTrouble(true, 6));
        
    }
    
    @Test
    public void testTrue7() {
        
        assertFalse(trouble.parrotTrouble(false, 7));
        
    }
    
    @Test
    public void testFalse6() {
        
        assertFalse(trouble.parrotTrouble(false, 6));
        
    }
    
    @Test
    public void testTrue22() {
        
        assertTrue(trouble.parrotTrouble(true, 22));
        
    }
    
    @Test
    public void testTrue20() {
        
        assertFalse(trouble.parrotTrouble(false, 20));
        
    }
    
    @Test
    public void testFalse22() {
        
        assertFalse(trouble.parrotTrouble(false, 22));
        
    }
    
}
