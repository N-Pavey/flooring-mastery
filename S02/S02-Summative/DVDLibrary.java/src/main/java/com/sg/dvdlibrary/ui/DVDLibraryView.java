/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.ui;

import com.sg.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class DVDLibraryView {
    
    private UserIO io;
    
    public DVDLibraryView(UserIO io) {
        
        this.io = io;
        
    }
    
    public int printMenuAndGetSelection() {
        
        io.print("\nMain Menu");
        io.print("1. Add a DVD");
        io.print("2. Remove a DVD");
        io.print("3. Search for DVD");
        io.print("4. Edit DVD information");
        io.print("5. List DVDs in library");
        io.print("6. Exit Library");
        return io.readInt("\nPlease select from the menu.", 1, 6);
            
    }
    
    public void displayAddBanner() {
        
        io.print("\n=== Add DVD ===");
        
    }
    
    public DVD getNewDVDInfo() {
        
        String idNum = io.readString("\nPlease enter the DVD ID number.");
        String title = io.readString("\nPlease enter the DVD title.");
        String releaseDate = io.readString("\nWhen was this DVD released?");
        String mpaaRating = io.readString("\nWhat was the MPAA rating?");
        String directorName = io.readString("\nWho directed this movie?");
        String studio = io.readString("\nWhich studio produced this movie?");
        String userRatingOrNote = io.readString("\nPlease enter your rating or a note on this movie.");
        
        DVD currentDVD = new DVD(idNum);
        currentDVD.setTitle(title);
        currentDVD.setReleaseDate(releaseDate);
        currentDVD.setMpaaRating(mpaaRating);
        currentDVD.setDirectorName(directorName);
        currentDVD.setStudio(studio);
        currentDVD.setUserRatingOrNote(userRatingOrNote);
        
        return currentDVD;
        
    }
    
    public void displayAddSuccessBanner() {
        
        io.readString("\nDVD has been successfully added! Please hit enter to continue.");
        
    }
    
    public void displayRemoveDVDBanner() {
        
        io.print("\n=== Remove DVD ===");
        
    }
    
    public void displayRemoveSuccessBanner() {
        
        io.readString("\nThe DVD has been removed from the library. Please hit enter to continue.");
        
    }
    
    public void displayDisplayDVDBanner() {
        
        io.print("\n=== Display DVD ===");
        
    }
    
    public String getDVDChoice() {
        
        return io.readString("\nPlease enter the DVD ID number.");
        
    }
    
    public void displayDVD(DVD dvd) {
        
        if (dvd != null) {
            
            io.print("\nMovie ID Number:  " + dvd.getIdNum());
            io.print("Movie Title:      " + dvd.getTitle());
            io.print("Release Date:     " + dvd.getReleaseDate());
            io.print("MPAA Rating:      " + dvd.getMpaaRating());
            io.print("Director:         " + dvd.getDirectorName());
            io.print("Studio:           " + dvd.getStudio());
            io.print("User Rating/Note: " + dvd.getUserRatingOrNote());
            
        } else {
            
            io.print("\nThat DVD is not in this library.");
            
        }
        
        io.readString("\nPlease hit enter to continue.");
        
    }
    
    public void displayEditDVDBanner() {
        
        io.print("\n=== Edit DVD ===");
        
    }
    
    public int printEditMenuAndGetSelection(DVD dvd) {
        
        if (dvd != null) {
        
            io.print("\nWhich field would you like to edit?");
            io.print("1. Movie Title:      " + dvd.getTitle());
            io.print("2. Release Date:     " + dvd.getReleaseDate());
            io.print("3. MPAA Rating:      " + dvd.getMpaaRating());
            io.print("4. Director:         " + dvd.getDirectorName());
            io.print("5. Studio:           " + dvd.getStudio());
            io.print("6. User Rating/Note: " + dvd.getUserRatingOrNote());
            io.print("7. Cancel");
            return io.readInt("\nPlease choose from the menu.", 1, 7);
            
        } else {
            
            io.print("\nThat DVD is not in the library.");
            return 7;
            
        }
        
    }
    
    public void editDVDTitle(DVD dvd) {
        
        String title = io.readString("\nPlease enter the DVD title.");
        dvd.setTitle(title);
        
    }
    
    public void editDVDRelease(DVD dvd) {
        
        String releaseDate = io.readString("\nPlease enter the release date.");
        dvd.setReleaseDate(releaseDate);
        
    }
    
    public void editDVDMpaa(DVD dvd) {
        
        String mpaaRating = io.readString("\nPlease enter the MPAA rating.");
        dvd.setMpaaRating(mpaaRating);
        
    }
    
    public void editDVDDirector(DVD dvd) {
        
        String director = io.readString("\nPlease enter the director.");
        dvd.setDirectorName(director);
        
    }
    
    public void editDVDStudio(DVD dvd) {
        
        String studio = io.readString("\nPlease enter the studio.");
        dvd.setStudio(studio);
        
    }
    
    public void editDVDUserRating(DVD dvd) {
        
        String userRatingOrNote = io.readString("\nPlease enter your user rating or note.");
        dvd.setUserRatingOrNote(userRatingOrNote);
        
    }
    
    public void displayDVDList(List<DVD> dvdList) {
        
        for (DVD currentDVD : dvdList) {
            
            io.print("\nMovie ID number: " + currentDVD.getIdNum());
            io.print("Movie Title:     " + currentDVD.getTitle());
            io.print("Release Date:    " + currentDVD.getReleaseDate());
            
        }
        
        io.readString("\nPlease hit enter to continue.");
        
    }
    
    public void displayDisplayAllBanner() {
        
        io.print("\n=== Display All DVDs ===");
        
    }
    
    public void displayExitBanner() {
        
        io.print("\nThank you for using the DVD Library!");
        
    }
    
    public void displayUnknownCommandBanner() {
        
        io.print("\nUnknown Command!");
        
    }
    
    public void displayErrorMessage(String errorMsg) {
        
        io.print("\n=== ERROR ===");
        io.print(errorMsg);
        
    }
    
}
