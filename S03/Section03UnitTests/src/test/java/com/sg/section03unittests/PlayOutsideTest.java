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
public class PlayOutsideTest {
    
    PlayOutside play = new PlayOutside();
    
    public PlayOutsideTest() {
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
     * Test of playOutside method, of class PlayOutside.
     */
    // playOutside(70, false) → true
    // playOutside(95, false) → false
    // playOutside(95, true) → true
    @Test
    public void test70False() {
        
        assertTrue(play.playOutside(70, false));
        
    }
    
    @Test
    public void test95False() {
        
        assertFalse(play.playOutside(95, false));
        
    }
    
    @Test
    public void test95True() {
        
        assertTrue(play.playOutside(95, true));
        
    }
    
    @Test
    public void test59True() {
        
        assertFalse(play.playOutside(59, true));
        
    }
    
    @Test
    public void test60False() {
        
        assertTrue(play.playOutside(60, false));
        
    }
    
    @Test
    public void test61True() {
        
        assertTrue(play.playOutside(61, true));
        
    }
    
    @Test
    public void test99True() {
        
        assertTrue(play.playOutside(99, true));
        
    }
    
    @Test
    public void test100True() {
        
        assertTrue(play.playOutside(100, true));
        
    }
    
    @Test
    public void test101True() {
        
        assertFalse(play.playOutside(101, true));
        
    }
    
}
