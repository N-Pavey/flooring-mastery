/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.service;

import com.sg.dvdlibrary.dao.DVDLibraryAuditDao;
import com.sg.dvdlibrary.dao.DVDLibraryAuditDaoStubImpl;
import com.sg.dvdlibrary.dao.DVDLibraryDao;
import com.sg.dvdlibrary.dao.DVDLibraryDaoStubImpl;
import com.sg.dvdlibrary.dao.DVDLibraryPersistenceException;
import com.sg.dvdlibrary.dto.DVD;
import java.util.List;
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
public class DVDLibraryServiceLayerTest {
    
    private DVDLibraryServiceLayer service;
    
    public DVDLibraryServiceLayerTest() {
        
        DVDLibraryDao dao = new DVDLibraryDaoStubImpl();
        DVDLibraryAuditDao auditDao = new DVDLibraryAuditDaoStubImpl();
        service = new DVDLibraryServiceLayerImpl(dao, auditDao);
        
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
     * Test of addDVD method, of class DVDLibraryServiceLayer.
     */
    @Test
    public void testAddDVD() throws Exception {
        
        DVD dvd = new DVD("0002");
        dvd.setTitle("The Lost World: Jurassic Park");
        dvd.setReleaseDate("1997");
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
        dvd.setReleaseDate("1997");
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
        dvd.setReleaseDate("1997");
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
