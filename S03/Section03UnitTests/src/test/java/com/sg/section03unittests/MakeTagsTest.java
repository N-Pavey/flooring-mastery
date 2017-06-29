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
public class MakeTagsTest {
    
    MakeTags tags = new MakeTags();
    
    public MakeTagsTest() {
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
     * Test of makeTags method, of class MakeTags.
     */
    // makeTags("i", "Yay") -> "<i>Yay</i>"
    // makeTags("i", "Hello") -> "<i>Hello</i>"
    // makeTags("cite", "Yay") -> "<cite>Yay</cite>"
    @Test
    public void testIYay() {
        
        assertEquals("<i>Yay</i>", tags.makeTags("i", "Yay"));
        
    }
    
    @Test
    public void testIHello() {
        
        assertEquals("<i>Hello</i>", tags.makeTags("i", "Hello"));
        
    }
    
    @Test
    public void testCiteYay() {
        
        assertEquals("<cite>Yay</cite>", tags.makeTags("cite", "Yay"));
        
    }
    
    @Test
    public void testStrongHello() {
        
        assertEquals("<strong>Hello</strong>", tags.makeTags("strong", "Hello"));
        
    }
    
    @Test
    public void testEmptyEmpty() {
        
        assertEquals("<></>", tags.makeTags("", ""));
        
    }
    
}
