/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.service;

import com.sg.dvdlibrary.dto.DVD;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class DVDLibraryServiceLayerTest {
    
    private DVDLibraryServiceLayer service;
    
    public DVDLibraryServiceLayerTest() {
        
//        DVDLibraryDao dao = new DVDLibraryDaoStubImpl();
//        DVDLibraryAuditDao auditDao = new DVDLibraryAuditDaoStubImpl();
//        service = new DVDLibraryServiceLayerImpl(dao, auditDao);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        service = ctx.getBean("serviceLayer", DVDLibraryServiceLayer.class);
        
    }
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    
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
     * Test of addDVD method, of class DVDLibraryServiceLayer.
     */
    @Test
    public void testAddDVD() throws Exception {
        
        DVD dvd = new DVD("0002");
        dvd.setTitle("The Lost World: Jurassic Park");
        dvd.setReleaseDate(LocalDate.parse("02/02/1993", formatter));
        dvd.setMpaaRating("PG-13");
        dvd.setDirectorName("Steven Spielberg");
        dvd.setStudio("Universal Pictures");
        dvd.setUserRatingOrNote("Really great - would watch again.");
        
        service.addDVD(dvd);
        
    }
    
    @Test
    public void testAddDVDDuplicateId() throws Exception {
        
        DVD dvd = new DVD("0001");
        dvd.setTitle("The Lost World: Jurassic Park");
        dvd.setReleaseDate(LocalDate.parse("02/02/1997", formatter));
        dvd.setMpaaRating("PG-13");
        dvd.setDirectorName("Steven Spielberg");
        dvd.setStudio("Universal Pictures");
        dvd.setUserRatingOrNote("Really great - would watch again.");
        
        try {
            
            service.addDVD(dvd);
            fail("Expected DVDLibraryDuplicateIdException was not thrown.");
        
        } catch (DVDLibraryDuplicateIdException e) {
            
            return;
            
        }
        
    }
    
    @Test
    public void testAddDVDInvalidData() throws Exception {
        
        DVD dvd = new DVD("0002");
        dvd.setTitle("");
        dvd.setReleaseDate(LocalDate.parse("02/02/1997", formatter));
        dvd.setMpaaRating("PG-13");
        dvd.setDirectorName("Steven Spielberg");
        dvd.setStudio("Universal Pictures");
        dvd.setUserRatingOrNote("Really great - would watch again.");
        
        try {
            
            service.addDVD(dvd);
            fail("Expected DVDLibraryDataValidationException was not thrown.");
            
        } catch (DVDLibraryDataValidationException e) {
            
            return;
            
        }
        
    }

    /**
     * Test of getAllDVDs method, of class DVDLibraryServiceLayer.
     */
    @Test
    public void testGetAllDVDs() throws Exception {
        
        assertEquals(1, service.getAllDVDs().size());
        
    }

    /**
     * Test of getDVD method, of class DVDLibraryServiceLayer.
     */
    @Test
    public void testGetDVD() throws Exception {
        
        DVD dvd = service.getDVD("0001");
        assertNotNull(dvd);
        
        dvd = service.getDVD("9999");
        assertNull(dvd);
        
    }

    /**
     * Test of removeDVD method, of class DVDLibraryServiceLayer.
     */
    @Test
    public void testRemoveDVD() throws Exception {
        
        DVD dvd = service.removeDVD("0001");
        assertNotNull(dvd);
        
        dvd = service.removeDVD("9999");
        assertNull(dvd);
        
    }

    /**
     * Test of editDVD method, of class DVDLibraryServiceLayer.
     */
    @Test
    public void testEditDVD() throws Exception {
        
        DVD dvd = service.getDVD("0001");
        assertNotNull(dvd);
        
        dvd = service.getDVD("9999");
        assertNull(dvd);
        
    }
    
}
