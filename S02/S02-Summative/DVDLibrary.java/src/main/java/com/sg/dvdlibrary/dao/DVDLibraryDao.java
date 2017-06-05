/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface DVDLibraryDao {
    
    DVD addDVD(String idNum, DVD dvd) throws DVDLibraryDaoException;
    
    List<DVD> getAllDVDs() throws DVDLibraryDaoException;
    
    DVD getDVD(String idNum) throws DVDLibraryDaoException;
    
    DVD removeDVD(String idNum) throws DVDLibraryDaoException;
    
    DVD editDVD(String idNum) throws DVDLibraryDaoException;
    
}
