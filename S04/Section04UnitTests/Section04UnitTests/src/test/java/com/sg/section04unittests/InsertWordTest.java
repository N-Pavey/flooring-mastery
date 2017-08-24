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
public class InsertWordTest {
    
    InsertWord strings = new InsertWord();
    
    public InsertWordTest() {
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

    // insertWord("<<>>", "Yay") -> "<<Yay>>"
    // insertWord("<<>>", "WooHoo") -> "<<WooHoo>>"
    // insertWord("[[]]", "word") -> "[[word]]"
    @Test
    public void testYay() {
        
        assertEquals("<<Yay>>", strings.insertWord("<<>>", "Yay"));
        
    }
    
    @Test
    public void testWooHoo() {
        
        assertEquals("<<WooHoo>>", strings.insertWord("<<>>", "WooHoo"));
        
    }
    
    @Test
    public void testWord() {
        
        assertEquals("[[word]]", strings.insertWord("[[]]", "word"));
        
    }
    
}
