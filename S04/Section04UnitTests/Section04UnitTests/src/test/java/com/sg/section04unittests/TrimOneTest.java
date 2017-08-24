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
public class TrimOneTest {
    
    TrimOne trim = new TrimOne();
    
    public TrimOneTest() {
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

    // trimOne("Hello") -> "ell"
    // trimOne("java") -> "av"
    // trimOne("coding") -> "odin"
    @Test
    public void testHello() {
        
        assertEquals("ell", trim.trimOne("Hello"));
        
    }
    
    @Test
    public void testJava() {
        
        assertEquals("av", trim.trimOne("java"));
        
    }
    
    @Test
    public void testCoding() {
        
        assertEquals("odin", trim.trimOne("coding"));
        
    }
    
    @Test
    public void testNo() {
        
        assertEquals("", trim.trimOne("No"));
        
    }
    
}
