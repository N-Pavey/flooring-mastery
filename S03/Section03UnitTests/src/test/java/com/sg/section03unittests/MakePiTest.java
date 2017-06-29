/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section03unittests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class MakePiTest {
    
    MakePi makePi = new MakePi();
    
    public MakePiTest() {
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
     * Test of makePi method, of class MakePi.
     */
    // makePi(3) -> {3, 1, 4}
    @Test
    public void testMakePi3() {
        
        assertArrayEquals(new int[]{3, 1, 4}, makePi.makePi(3));
        
    }
    
    @Test
    public void testMakePi2() {
        
        assertArrayEquals(new int[]{3, 1}, makePi.makePi(2));
        
    }
    
    @Test
    public void testMakePi1() {
        
        assertArrayEquals(new int[]{3}, makePi.makePi(1));
        
    }
    
    @Test
    public void testMakePi0() {
        
        assertArrayEquals(new int[]{}, makePi.makePi(0));
        
    }
    
    @Test
    public void testMakePi10() {
        
        assertArrayEquals(new int[]{3, 1, 4, 1, 5, 9, 2, 6, 5, 3}, makePi.makePi(10));
        
    }
    
}
