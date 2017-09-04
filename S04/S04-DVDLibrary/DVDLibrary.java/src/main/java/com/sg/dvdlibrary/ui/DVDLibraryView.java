/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.ui;

import com.sg.dvdlibrary.dto.DVD;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class DVDLibraryView {
    
    private UserIO io;
    
    public DVDLibraryView(UserIO io) {
        
        this.io = io;
        
    }
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    
    public int printMenuAndGetSelection() {
        
        io.print("\nMain Menu");
        io.print("1.  Add a DVD");
        io.print("2.  Remove a DVD");
        io.print("3.  Search for DVD");
        io.print("4.  Edit DVD information");
        io.print("5.  List DVDs in library");
        io.print("6.  View DVDs released since a particular year.");
        io.print("7.  View DVDs with a specific MPAA Rating.");
        io.print("8.  View DVDs by a specific director.");
        io.print("9.  View DVDs from a specific studio.");
        io.print("10. View the average age of your DVD Library.");
        io.print("11. View your newest DVD by release date.");
        io.print("12. View your oldest DVD by release date.");
        io.print("13. Exit Library");
        return io.readInt("\nPlease select from the menu.", 1, 13);
            
    }
    
    public void displayAddBanner() {
        
        io.print("\n=== Add DVD ===");
        
    }
    
    public DVD getNewDVDInfo() {
        
        String idNum = io.readString("\nPlease enter the DVD ID number.");
        String title = io.readString("\nPlease enter the DVD title.");
        String releaseDate = io.readString("\nWhen was this DVD released? (MM/dd/yyyy) ");
        String mpaaRating = io.readString("\nWhat was the MPAA rating?");
        String directorName = io.readString("\nWho directed this movie?");
        String studio = io.readString("\nWhich studio produced this movie?");
        String userRatingOrNote = io.readString("\nPlease enter your rating or a note on this movie.");
        
        DVD currentDVD = new DVD(idNum);
        currentDVD.setTitle(title);
        currentDVD.setReleaseDate(LocalDate.parse(releaseDate, formatter));
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
    
    public String getDVDChoiceId() {
        
        return io.readString("\nPlease enter the DVD ID number.");
        
    }
    
    
    
    public String getDVDChoiceTitle() {
        
        return io.readString("\nPlease enter the DVD title.");
        
    }
    
    public void displayDVD(List<DVD> dvdList, String title) {
        
        if (dvdList.size() != 0) {
            
            for (DVD currentDVD : dvdList) {
                
                if (currentDVD.getTitle().equalsIgnoreCase(title)) {
            
                io.print("\nMovie ID Number:  " + currentDVD.getIdNum());
                io.print("Movie Title:      " + currentDVD.getTitle());
                io.print("Release Date:     " + currentDVD.getReleaseDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
                io.print("MPAA Rating:      " + currentDVD.getMpaaRating());
                io.print("Director:         " + currentDVD.getDirectorName());
                io.print("Studio:           " + currentDVD.getStudio());
                io.print("User Rating/Note: " + currentDVD.getUserRatingOrNote());
                
                }
                
            }
            
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
            io.print("2. Release Date:     " + dvd.getReleaseDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
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
        
        String releaseDate = io.readString("\nWhen was this DVD released? (MM/dd/yyyy) ");
        dvd.setReleaseDate(LocalDate.parse(releaseDate, formatter));
        
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
        
        if (dvdList.size() != 0) {
        
            for (DVD currentDVD : dvdList) {

                io.print("\nMovie ID number: " + currentDVD.getIdNum());
                io.print("Movie Title:     " + currentDVD.getTitle());
                io.print("Release Date:    " + currentDVD.getReleaseDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

            }
            
        } else {
            
            io.print("There aren't any DVDs in the library to display.");
            
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
    
    public int getDVDReleaseDate() {
        
        String releaseDate = io.readString("\nWhat is the release date you would like to see movies released from? (MM/dd/yyyy) ");
        LocalDate releaseDateLD = LocalDate.parse(releaseDate, formatter);
        Period p = releaseDateLD.until(LocalDate.now());
        int ageInYears = p.getYears();
        return ageInYears;
        
    }
    
    public void displayBannerDVDsSinceYear() {
        
        io.print("\n=== Movies Released After Date ===");
        
    }
    
    public void displayDVDsSinceYear(List<DVD> dvdList) {
        
        if (dvdList.size() != 0) {
            
            for (DVD currentDVD : dvdList) {
            
                io.print("\nMovie ID Number:  " + currentDVD.getIdNum());
                io.print("Movie Title:      " + currentDVD.getTitle());
                io.print("Release Date:     " + currentDVD.getReleaseDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
                io.print("MPAA Rating:      " + currentDVD.getMpaaRating());
                io.print("Director:         " + currentDVD.getDirectorName());
                io.print("Studio:           " + currentDVD.getStudio());
                io.print("User Rating/Note: " + currentDVD.getUserRatingOrNote());
                
            }
            
        } else {
            
            io.print("\nThere hasn't been any DVD released since then.");
            
        }
        
        io.readString("\nPlease hit enter to continue.");
        
    }

    public String getDVDRating() {

        String rating = io.readString("\nWhat MPAA Rating would you like to see movies for? ");
        return rating;

    }

    public void displayBannerDVDsWithRating(String rating) {

        io.print("\n=== Movies with a \"" + rating + "\" rating. ===");

    }

    public void displayDVDsWithRating(List<DVD> dvdList) {

        if (dvdList.size() != 0) {
            
            for (DVD currentDVD : dvdList) {
            
                io.print("\nMovie ID Number:  " + currentDVD.getIdNum());
                io.print("Movie Title:      " + currentDVD.getTitle());
                io.print("Release Date:     " + currentDVD.getReleaseDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
                io.print("Director:         " + currentDVD.getDirectorName());
                io.print("Studio:           " + currentDVD.getStudio());
                io.print("User Rating/Note: " + currentDVD.getUserRatingOrNote());
                
            }
            
        } else {
            
            io.print("\nThere are any DVDs with that rating.");
            
        }
        
        io.readString("\nPlease hit enter to continue.");

    }

    public String getDirectorChoice() {

        String directorChoice = io.readString("\nWho is the director you want to search for? ");
        return directorChoice;

    }

    public void displayBannerDirectorSearch(String director) {

        io.print("\n=== Movies directed by **" + director + "** - Sorted by Rating ===");

    }

    public void displayDirectorSearchResults(Map<String, List<DVD>> dvdMap) {

        Set<String> ratings = dvdMap.keySet();
        
        if (ratings.size() != 0) {
            
            ratings.stream()
                    .forEach(r -> {

                        io.print("\n===============");
                        io.print("\nMPAA Rating: " + r);
                        dvdMap.get(r).stream().forEach(details -> {

                            io.print("\nMovie ID Number: " + details.getIdNum());
                            io.print("Movie Title: " + details.getTitle());
                            io.print("Release Date: " + details.getReleaseDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

                        });

                    });
            
        } else {
            
            io.print("\nThere aren't any DVDs in the library from that director.");
            
        }

    }

    public String getDVDStudio() {

        String studioChoice = io.readString("\nWhat studio would you like to search for? ");
        return studioChoice;

    }

    public void displayBannerDVDsByStudio(String studio) {

        io.print("\n=== Movies from " + studio + " ===");

    }

    public void displayDVDsByStudio(List<DVD> dvdList) {

        if (dvdList.size() != 0) {
            
            for (DVD currentDVD : dvdList) {
            
                io.print("\nMovie ID Number:  " + currentDVD.getIdNum());
                io.print("Movie Title:      " + currentDVD.getTitle());
                io.print("Release Date:     " + currentDVD.getReleaseDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
                io.print("MPAA Rating:      " + currentDVD.getMpaaRating());
                io.print("Director:         " + currentDVD.getDirectorName());
                io.print("User Rating/Note: " + currentDVD.getUserRatingOrNote());
                
            }
            
        } else {
            
            io.print("\nThere are any DVDs from that studio.");
            
        }
        
        io.readString("\nPlease hit enter to continue.");

    }

    public void displayDVDsAverageAge(double averageAge) {
        
        BigDecimal age = new BigDecimal(averageAge);
        age = age.setScale(1, RoundingMode.HALF_UP);

        io.print("\n===============");
        io.print("\nThe average age of the DVDs in the library is " + age + " years.");
        io.print("\n===============");

    }

    public void displayNewestDVD(DVD dvd) {

        io.print("\n===============");
        io.print("\nThe newest DVD in the library is: ");
        io.print("Movie ID Number:    " + dvd.getIdNum());
        io.print("Movie Title:        " + dvd.getTitle());
        io.print("Movie Release Date: " + dvd.getReleaseDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        io.print("\n===============");

    }

    public void displayOldestDVD(DVD dvd) {

        io.print("\n===============");
        io.print("\nThe oldest DVD in the library is: ");
        io.print("Movie ID Number:    " + dvd.getIdNum());
        io.print("Movie Title:        " + dvd.getTitle());
        io.print("Movie Release Date: " + dvd.getReleaseDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        io.print("\n===============");

    }
    
}
