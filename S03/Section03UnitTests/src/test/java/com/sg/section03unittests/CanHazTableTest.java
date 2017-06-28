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
public class CanHazTableTest {
    
    CanHazTable table = new CanHazTable();
    
    public CanHazTableTest() {
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
     * Test of canHazTable method, of class CanHazTable.
     */
    // canHazTable(5, 10) → 2
    // canHazTable(5, 2) → 0
    // canHazTable(5, 5) → 1
    @Test
    public void test510() {
        
        assertEquals(2, table.canHazTable(5, 10));
        
    }
    
    @Test
    public void test52() {
        
        assertEquals(0, table.canHazTable(5, 2));
        
    }
    
    @Test
    public void test55() {
        
        assertEquals(1, table.canHazTable(5, 5));
        
    }
    
    @Test
    public void test810() {
        
        assertEquals(2, table.canHazTable(8, 10));
        
    }
    
    @Test
    public void test910() {
        
        assertEquals(2, table.canHazTable(9, 10));
        
    }
    
    @Test
    public void test105() {
        
        assertEquals(2, table.canHazTable(10, 5));
        
    }
    
    @Test
    public void test108() {
        
        assertEquals(2, table.canHazTable(10, 8));
        
    }
    
    @Test
    public void test109() {
        
        assertEquals(2, table.canHazTable(10, 9));
        
    }
    
    @Test
    public void test57() {
        
        assertEquals(1, table.canHazTable(5, 7));
        
    }
    
    @Test
    public void test75() {
        
        assertEquals(1, table.canHazTable(7, 5));
        
    }
    
    @Test
    public void test53() {
        
        assertEquals(1, table.canHazTable(5, 3));
        
    }
    
    @Test
    public void test35() {
        
        assertEquals(1, table.canHazTable(3, 5));
        
    }
    
    @Test
    public void test25() {
        
        assertEquals(0, table.canHazTable(2, 5));
        
    }
    
    @Test
    public void test15() {
        
        assertEquals(0, table.canHazTable(1, 5));
        
    }
    
    @Test
    public void test51() {
        
        assertEquals(0, table.canHazTable(5, 1));
        
    }
    
    @Test
    public void test101() {
        
        assertEquals(0, table.canHazTable(10, 1));
        
    }
    
    @Test
    public void test110() {
        
        assertEquals(0, table.canHazTable(1, 10));
        
    }
    
}
