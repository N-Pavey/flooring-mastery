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
public class AlarmClockTest {
    
    AlarmClock alarm = new AlarmClock();
    
    public AlarmClockTest() {
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
     * Test of alarmClock method, of class AlarmClock.
     */
    // alarmClock(1, false) → "7:00"
    // alarmClock(5, false) → "7:00"
    // alarmClock(0, false) → "10:00"
    @Test
    public void testAlarmClock1False() {
        
        assertEquals("7:00", alarm.alarmClock(1, false));
        
    }
    
    @Test
    public void testAlarmClock5False() {
        
        assertEquals("7:00", alarm.alarmClock(5, false));
        
    }
    
    @Test
    public void testAlarmClock0False() {
        
        assertEquals("10:00", alarm.alarmClock(0, false));
        
    }
    
    @Test
    public void testAlarmClock1True() {
        
        assertEquals("10:00", alarm.alarmClock(1, true));
        
    }
    
    @Test
    public void testAlarmClock6True() {
        
        assertEquals("off", alarm.alarmClock(6, true));
        
    }
    
}
