/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.controller;

import com.sg.dvdlibrary.dao.DVDLibraryPersistenceException;
import com.sg.dvdlibrary.dto.DVD;
import com.sg.dvdlibrary.service.DVDLibraryDataValidationException;
import com.sg.dvdlibrary.service.DVDLibraryDuplicateIdException;
import com.sg.dvdlibrary.service.DVDLibraryServiceLayer;
import com.sg.dvdlibrary.ui.DVDLibraryView;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class DVDLibraryController {
    
    DVDLibraryView view;
    DVDLibraryServiceLayer service;
    
    public DVDLibraryController(DVDLibraryServiceLayer service, DVDLibraryView view) {
        
        this.service = service;
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
        
        } catch (DVDLibraryPersistenceException e) {
            
            view.displayErrorMessage(e.getMessage());
            
        }
        
    }
    
    private int getMenuSelection() {
        
        return view.printMenuAndGetSelection();
        
    }
    
    private void addDVD() throws DVDLibraryPersistenceException {
        
        view.displayAddBanner();
        boolean hasErrors = false;
        
        do {
            
            DVD newDVD = view.getNewDVDInfo();
            
            try {
                
                service.addDVD(newDVD);
                view.displayAddSuccessBanner();
                hasErrors = false;
                
            } catch (DVDLibraryDuplicateIdException | DVDLibraryDataValidationException e) {
                
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
                
            }
            
        } while (hasErrors);
        
    }
    
    private void removeDVD() throws DVDLibraryPersistenceException {
        
        view.displayRemoveDVDBanner();
        String idNum = view.getDVDChoiceId();
        service.removeDVD(idNum);
        view.displayRemoveSuccessBanner();
        
    }
    
    private void viewDVD() throws DVDLibraryPersistenceException {
        
        view.displayDisplayDVDBanner();
        String title = view.getDVDChoiceTitle();
        List<DVD> dvdList = service.getAllDVDs();
        view.displayDVD(dvdList, title);
        
    }
    
    private void editDVD() throws DVDLibraryPersistenceException {
        
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
    
    private DVD getDVDEdit() throws DVDLibraryPersistenceException {
        
        view.displayEditDVDBanner();
        String idNum = view.getDVDChoiceId();
        DVD dvdEdit = service.getDVD(idNum);
        return dvdEdit;
        
    }
    
    private int getEditSelection(DVD dvd) {
        
        return view.printEditMenuAndGetSelection(dvd);
        
    }
    
    private void editTitle(DVD dvd) throws DVDLibraryPersistenceException {
        
        view.editDVDTitle(dvd);
        dvd = service.editDVD(dvd.getIdNum());
        
    }
    
    private void editReleaseDate(DVD dvd) throws DVDLibraryPersistenceException {
        
        view.editDVDRelease(dvd);
        dvd = service.editDVD(dvd.getIdNum());
        
    }
    
    private void editMpaaRating(DVD dvd) throws DVDLibraryPersistenceException {
        
        view.editDVDMpaa(dvd);
        dvd = service.editDVD(dvd.getIdNum());
        
    }
    
    private void editDirector(DVD dvd) throws DVDLibraryPersistenceException {
        
        view.editDVDDirector(dvd);
        dvd = service.editDVD(dvd.getIdNum());
        
    }
    
    private void editStudio(DVD dvd) throws DVDLibraryPersistenceException {
        
        view.editDVDStudio(dvd);
        dvd = service.editDVD(dvd.getIdNum());
        
    }
    
    private void editUserRating(DVD dvd) throws DVDLibraryPersistenceException {
        
        view.editDVDUserRating(dvd);
        dvd = service.editDVD(dvd.getIdNum());
        
    }
    
    private void listDVDs() throws DVDLibraryPersistenceException {
        
        view.displayDisplayAllBanner();
        List<DVD> dvdList = service.getAllDVDs();
        view.displayDVDList(dvdList);
        
    }
    
    private void unknownCommand() {
        
        view.displayUnknownCommandBanner();
        
    }
    
    private void exitMessage() {
        
        view.displayExitBanner();
        
    }
    
}
