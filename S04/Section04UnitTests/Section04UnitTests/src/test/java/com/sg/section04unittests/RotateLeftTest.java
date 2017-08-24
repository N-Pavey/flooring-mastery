/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section04unittests;

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
public class RotateLeftTest {
    
    RotateLeft rotate = new RotateLeft();
    
    public RotateLeftTest() {
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

    // rotateLeft({1, 2, 3}) -> {2, 3, 1}
    // rotateLeft({5, 11, 9}) -> {11, 9, 5}
    // rotateLeft({7, 0, 0}) -> {0, 0, 7}
    @Test
    public void testRotate123() {
        
        Assert.assertArrayEquals(new int[]{2, 3, 1}, rotate.rotateLeft(new int[]{1, 2, 3}));
        
    }
    
    @Test
    public void testRotate5119() {
        
        Assert.assertArrayEquals(new int[]{11, 9, 5}, rotate.rotateLeft(new int[]{5, 11, 9}));
        
    }
    
    @Test
    public void testRotate700() {
        
        Assert.assertArrayEquals(new int[]{0, 0, 7}, rotate.rotateLeft(new int[]{7, 0, 0}));
        
    }
    
}
