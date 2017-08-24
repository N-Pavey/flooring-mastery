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
public class LongInMiddleTest {
    
    LongInMiddle lim = new LongInMiddle();
    
    public LongInMiddleTest() {
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

    // longInMiddle("Hello", "hi") -> "hiHellohi"
    // longInMiddle("hi", "Hello") -> "hiHellohi"
    // longInMiddle("aaa", "b") -> "baaab"
    @Test
    public void testHelloHi() {
        
        assertEquals("hiHellohi", lim.longInMiddle("Hello", "hi"));
        
    }
    
    @Test
    public void testHiHello() {
        
        assertEquals("hiHellohi", lim.longInMiddle("hi", "Hello"));
        
    }
    
    @Test
    public void testAAAB() {
        
        assertEquals("baaab", lim.longInMiddle("aaa", "b"));
        
    }
    
}
