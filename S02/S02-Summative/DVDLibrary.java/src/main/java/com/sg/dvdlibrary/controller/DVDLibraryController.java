/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.controller;

import com.sg.dvdlibrary.dao.DVDLibraryDao;
import com.sg.dvdlibrary.dao.DVDLibraryDaoException;
import com.sg.dvdlibrary.dao.DVDLibraryDaoFileImpl;
import com.sg.dvdlibrary.dto.DVD;
import com.sg.dvdlibrary.ui.DVDLibraryView;
import com.sg.dvdlibrary.ui.UserIO;
import com.sg.dvdlibrary.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class DVDLibraryController {
    
    DVDLibraryView view;
    DVDLibraryDao dao;
    
    public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view) {
        
        this.dao = dao;
        this.view = view;
        
    }
    
    public void run() {
        
        boolean keepGoing = true;
        int menuSelection = 0;
        
        try {
        
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {

                    case 1:
                        addDVD();
                        break;
                    case 2:
                        removeDVD();
                        break;
                    case 3:
                        viewDVD();
                        break;
                    case 4:
                        editDVD();
                        break;
                    case 5:
                        listDVDs();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();

                }

            }
        
            exitMessage();
        
        } catch (DVDLibraryDaoException e) {
            
            view.displayErrorMessage(e.getMessage());
            
        }
        
    }
    
    private int getMenuSelection() {
        
        return view.printMenuAndGetSelection();
        
    }
    
    private void addDVD() throws DVDLibraryDaoException {
        
        view.displayAddBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getIdNum(), newDVD);
        view.displayAddSuccessBanner();
        
    }
    
    private void removeDVD() throws DVDLibraryDaoException {
        
        view.displayRemoveDVDBanner();
        String idNum = view.getDVDChoiceId();
        dao.removeDVD(idNum);
        view.displayRemoveSuccessBanner();
        
    }
    
    private void viewDVD() throws DVDLibraryDaoException {
        
        view.displayDisplayDVDBanner();
        String title = view.getDVDChoiceTitle();
        List<DVD> dvdList = dao.getAllDVDs();
        view.displayDVD(dvdList, title);
        
    }
    
    private void editDVD() throws DVDLibraryDaoException {
        
        boolean keepEditing = true;
        int menuSelection = 0;
        DVD dvd = getDVDEdit();

        while (keepEditing) {

            menuSelection = getEditSelection(dvd);

            switch (menuSelection) {

                case 1:
                    editTitle(dvd);
                    break;
                case 2:
                    editReleaseDate(dvd);
                    break;
                case 3:
                    editMpaaRating(dvd);
                    break;
                case 4:
                    editDirector(dvd);
                    break;
                case 5:
                    editStudio(dvd);
                    break;
                case 6:
                    editUserRating(dvd);
                    break;
                case 7:
                    keepEditing = false;
                    break;
                default:
                    unknownCommand();

            }

        }
                        
    }
    
    private DVD getDVDEdit() throws DVDLibraryDaoException {
        
        view.displayEditDVDBanner();
        String idNum = view.getDVDChoiceId();
        DVD dvdEdit = dao.getDVD(idNum);
        return dvdEdit;
        
    }
    
    private int getEditSelection(DVD dvd) {
        
        return view.printEditMenuAndGetSelection(dvd);
        
    }
    
    private void editTitle(DVD dvd) throws DVDLibraryDaoException {
        
        view.editDVDTitle(dvd);
        dvd = dao.editDVD(dvd.getIdNum());
        
    }
    
    private void editReleaseDate(DVD dvd) throws DVDLibraryDaoException {
        
        view.editDVDRelease(dvd);
        dvd = dao.editDVD(dvd.getIdNum());
        
    }
    
    private void editMpaaRating(DVD dvd) throws DVDLibraryDaoException {
        
        view.editDVDMpaa(dvd);
        dvd = dao.editDVD(dvd.getIdNum());
        
    }
    
    private void editDirector(DVD dvd) throws DVDLibraryDaoException {
        
        view.editDVDDirector(dvd);
        dvd = dao.editDVD(dvd.getIdNum());
        
    }
    
    private void editStudio(DVD dvd) throws DVDLibraryDaoException {
        
        view.editDVDStudio(dvd);
        dvd = dao.editDVD(dvd.getIdNum());
        
    }
    
    private void editUserRating(DVD dvd) throws DVDLibraryDaoException {
        
        view.editDVDUserRating(dvd);
        dvd = dao.editDVD(dvd.getIdNum());
        
    }
    
    private void listDVDs() throws DVDLibraryDaoException {
        
        view.displayDisplayAllBanner();
        List<DVD> dvdList = dao.getAllDVDs();
        view.displayDVDList(dvdList);
        
    }
    
    private void unknownCommand() {
        
        view.displayUnknownCommandBanner();
        
    }
    
    private void exitMessage() {
        
        view.displayExitBanner();
        
    }
    
}
