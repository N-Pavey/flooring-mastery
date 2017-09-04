/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.service;

import com.sg.dvdlibrary.dao.DVDLibraryPersistenceException;
import com.sg.dvdlibrary.dto.DVD;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface DVDLibraryServiceLayer {
    
    void addDVD (DVD dvd) throws DVDLibraryDuplicateIdException, DVDLibraryDataValidationException, DVDLibraryPersistenceException;
    
    List<DVD> getAllDVDs() throws DVDLibraryPersistenceException;
    
    DVD getDVD(String idNum) throws DVDLibraryPersistenceException;
    
    DVD removeDVD(String idNum) throws DVDLibraryPersistenceException;
    
    DVD editDVD(String idNum) throws DVDLibraryPersistenceException;
    
    List<DVD> getDVDsReleasedFromDate(int ageInYears) throws DVDLibraryPersistenceException;
    
    List<DVD> getDVDsByMpaaRating(String rating) throws DVDLibraryPersistenceException;
    
    Map<String, List<DVD>> getAllDVDsByDirectorGroupByMpaa(String director) throws DVDLibraryPersistenceException;
    
    List<DVD> getAllDVDsByStudio(String studio) throws DVDLibraryPersistenceException;
    
    double getAverageDVDAge() throws DVDLibraryPersistenceException;
    
    DVD getNewestDVD() throws DVDLibraryPersistenceException;
    
    DVD getOldestDVD() throws DVDLibraryPersistenceException;
    
}
