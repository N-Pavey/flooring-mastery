/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

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
public class DVDLibraryDaoTest {
    
    private DVDLibraryDao dao = new DVDLibraryDaoFileImpl();
    
    public DVDLibraryDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        
        List<DVD> dvdList = dao.getAllDVDs();
        
        for (DVD dvd : dvdList) {
            
            dao.removeDVD(dvd.getIdNum());
            
        }
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addDVD method, of class DVDLibraryDao.
     */
    @Test
    public void testAddGetDVD() throws Exception {
        
        DVD dvd = new DVD("0001");
        dvd.setTitle("Jurassic Park");
        dvd.setReleaseDate("1993");
        dvd.setMpaaRating("PG-13");
        dvd.setDirectorName("Steven Spielberg");
        dvd.setStudio("Universal Pictures");
        dvd.setUserRatingOrNote("Really great - would watch again.");
        
        dao.addDVD(dvd.getIdNum(), dvd);
        
        DVD fromDao = dao.getDVD(dvd.getIdNum());
        
        assertEquals(dvd, fromDao);
        
    }

    /**
     * Test of getAllDVDs method, of class DVDLibraryDao.
     */
    @Test
    public void testGetAllDVDs() throws Exception {
        
        DVD dvd1 = new DVD("0001");
        dvd1.setTitle("Jurassic Park");
        dvd1.setReleaseDate("1993");
        dvd1.setMpaaRating("PG-13");
        dvd1.setDirectorName("Steven Spielberg");
        dvd1.setStudio("Universal Pictures");
        dvd1.setUserRatingOrNote("Really great - would watch again.");
        
        dao.addDVD(dvd1.getIdNum(), dvd1);
        
        DVD dvd2 = new DVD("0002");
        dvd2.setTitle("The Lost World: Jurassic Park");
        dvd2.setReleaseDate("1997");
        dvd2.setMpaaRating("PG-13");
        dvd2.setDirectorName("Steven Spielberg");
        dvd2.setStudio("Universal Pictures");
        dvd2.setUserRatingOrNote("Really great - would watch again.");
        
        dao.addDVD(dvd2.getIdNum(), dvd2);
        
        assertEquals(2, dao.getAllDVDs().size());
        
    }

    /**
     * Test of removeDVD method, of class DVDLibraryDao.
     */
    @Test
    public void testRemoveDVD() throws Exception {
        
        DVD dvd1 = new DVD("0001");
        dvd1.setTitle("Jurassic Park");
        dvd1.setReleaseDate("1993");
        dvd1.setMpaaRating("PG-13");
        dvd1.setDirectorName("Steven Spielberg");
        dvd1.setStudio("Universal Pictures");
        dvd1.setUserRatingOrNote("Really great - would watch again.");
        
        dao.addDVD(dvd1.getIdNum(), dvd1);
        
        DVD dvd2 = new DVD("0002");
        dvd2.setTitle("The Lost World: Jurassic Park");
        dvd2.setReleaseDate("1997");
        dvd2.setMpaaRating("PG-13");
        dvd2.setDirectorName("Steven Spielberg");
        dvd2.setStudio("Universal Pictures");
        dvd2.setUserRatingOrNote("Really great - would watch again.");
        
        dao.addDVD(dvd2.getIdNum(), dvd2);
        
        dao.removeDVD(dvd1.getIdNum());
        assertEquals(1, dao.getAllDVDs().size());
        assertNull(dao.getDVD(dvd1.getIdNum()));
        
        dao.removeDVD(dvd2.getIdNum());
        assertEquals(0, dao.getAllDVDs().size());
        assertNull(dao.getDVD(dvd2.getIdNum()));
        
    }

    /**
     * Test of editDVD method, of class DVDLibraryDao.
     */
    @Test
    public void testEditDVD() throws Exception {
        
        DVD dvd = new DVD("0001");
        dvd.setTitle("Jurassic Park");
        dvd.setReleaseDate("1993");
        dvd.setMpaaRating("PG-13");
        dvd.setDirectorName("Steven Spielberg");
        dvd.setStudio("Universal Pictures");
        dvd.setUserRatingOrNote("Really great - would watch again.");
        
        dao.addDVD(dvd.getIdNum(), dvd);
        
        DVD fromDao = dao.getDVD(dvd.getIdNum());
        
        assertEquals(dvd, fromDao);
        
    }
    
}
