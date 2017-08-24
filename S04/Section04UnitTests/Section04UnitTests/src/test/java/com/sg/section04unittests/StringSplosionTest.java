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
public class StringSplosionTest {
    
    StringSplosion splosion = new StringSplosion();
    
    public StringSplosionTest() {
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

    // stringSplosion("Code") -> "CCoCodCode"
    // stringSplosion("abc") -> "aababc"
    // stringSplosion("ab") -> "aab"
    @Test
    public void testCode() {
        
        assertEquals("CCoCodCode", splosion.stringSplosion("Code"));
        
    }
    
    @Test
    public void testABC() {
        
        assertEquals("aababc", splosion.stringSplosion("abc"));
        
    }
    
    @Test
    public void testAB() {
        
        assertEquals("aab", splosion.stringSplosion("ab"));
        
    }
    
}
