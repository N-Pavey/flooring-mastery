/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class DVDLibraryDaoStubImpl implements DVDLibraryDao {
    
    DVD onlyDVD;
    List<DVD> dvdList = new ArrayList<>();
    
    public DVDLibraryDaoStubImpl() {
        
        onlyDVD = new DVD("0001");
        onlyDVD.setTitle("Jurassic Park");
        onlyDVD.setReleaseDate("1993");
        onlyDVD.setMpaaRating("PG-13");
        onlyDVD.setDirectorName("Steven Spielberg");
        onlyDVD.setStudio("Universal Pictures");
        onlyDVD.setUserRatingOrNote("Really great - would watch again.");
        
        dvdList.add(onlyDVD);
        
    }

    @Override
    public DVD addDVD(String idNum, DVD dvd) throws DVDLibraryPersistenceException {

        if (idNum.equals(onlyDVD.getIdNum())) {
            
            return onlyDVD;
            
        } else {
            
            return null;
            
        }

    }

    @Override
    public List<DVD> getAllDVDs() throws DVDLibraryPersistenceException {

        return dvdList;

    }

    @Override
    public DVD getDVD(String idNum) throws DVDLibraryPersistenceException {

        if (idNum.equals(onlyDVD.getIdNum())) {
            
            return onlyDVD;
            
        } else {
            
            return null;
            
        }

    }

    @Override
    public DVD removeDVD(String idNum) throws DVDLibraryPersistenceException {

        if (idNum.equals(onlyDVD.getIdNum())) {
            
            return onlyDVD;
            
        } else {
            
            return null;
            
        }

    }

    @Override
    public DVD editDVD(String idNum) throws DVDLibraryPersistenceException {

        if (idNum.equals(onlyDVD.getIdNum())) {
            
            return onlyDVD;
            
        } else {
            
            return null;
            
        }

    }
    
}
