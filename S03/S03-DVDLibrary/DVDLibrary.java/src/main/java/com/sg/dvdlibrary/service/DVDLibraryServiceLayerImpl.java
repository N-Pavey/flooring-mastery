/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.service;

import com.sg.dvdlibrary.dao.DVDLibraryAuditDao;
import com.sg.dvdlibrary.dao.DVDLibraryDao;
import com.sg.dvdlibrary.dao.DVDLibraryPersistenceException;
import com.sg.dvdlibrary.dto.DVD;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public class DVDLibraryServiceLayerImpl implements DVDLibraryServiceLayer {
    
    DVDLibraryDao dao;
    DVDLibraryAuditDao auditDao;
    
    public DVDLibraryServiceLayerImpl(DVDLibraryDao dao, DVDLibraryAuditDao auditDao) {
        
        this.dao = dao;
        this.auditDao = auditDao;
        
    }

    @Override
    public void addDVD(DVD dvd) throws DVDLibraryDuplicateIdException, DVDLibraryDataValidationException, DVDLibraryPersistenceException {

        if (dao.getDVD(dvd.getIdNum()) != null) {
            
            throw new DVDLibraryDuplicateIdException("ERROR: Could not add new DVD. "
                    + "DVD with ID " + dvd.getIdNum() + " already exists.");
            
        }
        
        validateDVDLibraryData(dvd);
        
        dao.addDVD(dvd.getIdNum(), dvd);
        
        auditDao.writeAuditEntry("DVD " + dvd.getIdNum() + " CREATED.");

    }

    @Override
    public List<DVD> getAllDVDs() throws DVDLibraryPersistenceException {

        return dao.getAllDVDs();

    }

    @Override
    public DVD getDVD(String idNum) throws DVDLibraryPersistenceException {

        return dao.getDVD(idNum);

    }

    @Override
    public DVD removeDVD(String idNum) throws DVDLibraryPersistenceException {

        DVD removedDVD = dao.removeDVD(idNum);
        auditDao.writeAuditEntry("DVD " + idNum + " REMOVED.");
        return removedDVD;

    }

    @Override
    public DVD editDVD(String idNum) throws DVDLibraryPersistenceException {

        return dao.getDVD(idNum);

    }
    
    private void validateDVDLibraryData(DVD dvd) throws DVDLibraryDataValidationException {
        
        if (dvd.getTitle() == null
                || dvd.getTitle().trim().length() == 0
                || dvd.getReleaseDate() == null
                || dvd.getReleaseDate().toString().trim().length() == 0
                || dvd.getMpaaRating() == null
                || dvd.getMpaaRating().trim().length() == 0
                || dvd.getDirectorName() == null
                || dvd.getDirectorName().trim().length() == 0
                || dvd.getStudio() == null
                || dvd.getStudio().trim().length() == 0) {
            
            throw new DVDLibraryDataValidationException("ERROR: Fields [Title, Release Date, MPAA Rating,"
                    + " Director, and Studio] are all required.");
        }
        
    }

    @Override
    public List<DVD> getDVDsReleasedFromDate(int ageInYears) throws DVDLibraryPersistenceException {

        return dao.getDVDsReleasedFromDate(ageInYears);

    }

    @Override
    public List<DVD> getDVDsByMpaaRating(String rating) throws DVDLibraryPersistenceException {

        return dao.getDVDsByMpaaRating(rating);

    }

    @Override
    public Map<String, List<DVD>> getAllDVDsByDirectorGroupByMpaa(String director) throws DVDLibraryPersistenceException {

        return dao.getAllDVDsByDirectorGroupByMpaa(director);

    }

    @Override
    public List<DVD> getAllDVDsByStudio(String studio) throws DVDLibraryPersistenceException {

        return dao.getAllDVDsByStudio(studio);

    }

    @Override
    public double getAverageDVDAge() throws DVDLibraryPersistenceException {

        return dao.getAverageDVDAge();

    }

    @Override
    public DVD getNewestDVD() throws DVDLibraryPersistenceException {

        return dao.getNewestDVD();

    }

    @Override
    public DVD getOldestDVD() throws DVDLibraryPersistenceException {

        return dao.getOldestDVD();

    }
    
}
