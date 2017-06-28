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
public class MischeviousChildrenTest {
    
    MischeviousChildren mischief = new MischeviousChildren();
    
    public MischeviousChildrenTest() {
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
     * Test of areWeInTrouble method, of class MischeviousChildren.
     */
    
    // areWeInTrouble(true, true) -> true
    // areWeInTrouble(false, false) -> true
    // areWeInTrouble(true, false) -> false
    @Test
    public void testTrueTrue() {
        
        assertTrue(mischief.areWeInTrouble(true, true));
        
    }
    
    @Test
    public void testTrueFalse() {
        
        assertFalse(mischief.areWeInTrouble(true, false));
        
    }
    
    @Test
    public void testFalseTrue() {
        
        assertFalse(mischief.areWeInTrouble(false, true));
        
    }
    
    @Test
    public void testFalseFalse() {
        
        assertTrue(mischief.areWeInTrouble(false, false));
        
    }
    
}
