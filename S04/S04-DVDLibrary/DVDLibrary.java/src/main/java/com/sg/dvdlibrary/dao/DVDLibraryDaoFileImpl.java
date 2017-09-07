/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao {

    private Map<String, DVD> dvds = new HashMap<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    
    public static final String LIBRARY_FILE = "dvdLibrary.txt";
    public static final String DELIMITER = "::";
    
    private void loadLibrary() throws DVDLibraryPersistenceException {
        
        Scanner scanner;
        
        try {
            
            scanner = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
            
        } catch (FileNotFoundException e) {
            
            throw new DVDLibraryPersistenceException("Could not load DVD Library data into memory...", e);
            
        }
        
        String currentLine;
        String[] currentTokens;
        
        while (scanner.hasNextLine()) {
            
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            
            //String releaseDate = LocalDate
            
            DVD currentDVD = new DVD(currentTokens[0]);
            currentDVD.setTitle(currentTokens[1]);
            currentDVD.setReleaseDate(LocalDate.parse(currentTokens[2]));
            currentDVD.setMpaaRating(currentTokens[3]);
            currentDVD.setDirectorName(currentTokens[4]);
            currentDVD.setStudio(currentTokens[5]);
            currentDVD.setUserRatingOrNote(currentTokens[6]);
            
            dvds.put(currentDVD.getIdNum(), currentDVD);
            
        }
        
        scanner.close();
        
    }
    
    private void writeLibrary() throws DVDLibraryPersistenceException {
        
        PrintWriter out;
        
        try {
            
            out = new PrintWriter(new FileWriter(LIBRARY_FILE));
            
        } catch (IOException e) {
            
            throw new DVDLibraryPersistenceException("Could not save DVD Library data.", e);
            
        }
        
        List<DVD> dvdList = this.getAllDVDs();
        
        for (DVD currentDVD : dvdList) {
            
            out.println(currentDVD.getIdNum() + DELIMITER + currentDVD.getTitle() + DELIMITER
                + currentDVD.getReleaseDate() + DELIMITER + currentDVD.getMpaaRating() + DELIMITER
                + currentDVD.getDirectorName() + DELIMITER + currentDVD.getStudio() + DELIMITER
                + currentDVD.getUserRatingOrNote());
            out.flush();
            
        }
        
        out.close();
        
    }
    
    @Override
    public DVD addDVD(String idNum, DVD dvd) throws DVDLibraryPersistenceException {
        
        DVD newDVD = dvds.put(idNum, dvd);
        writeLibrary();
        return newDVD;
        
    }

    @Override
    public List<DVD> getAllDVDs() throws DVDLibraryPersistenceException {
        
        loadLibrary();
        return new ArrayList<DVD>(dvds.values());
        
    }

    @Override
    public DVD getDVD(String idNum) throws DVDLibraryPersistenceException {
        
        loadLibrary();
        return dvds.get(idNum);
        
    }

    @Override
    public DVD removeDVD(String idNum) throws DVDLibraryPersistenceException {
        
        DVD removedDVD = dvds.remove(idNum);
        writeLibrary();
        return removedDVD;
        
    }
    
    @Override
    public DVD editDVD(String idNum) throws DVDLibraryPersistenceException {
        
        DVD editedDVD = dvds.get(idNum);
        writeLibrary();
        return editedDVD;
        
    }

    @Override
    public List<DVD> getDVDsReleasedFromDate(int ageInYears) throws DVDLibraryPersistenceException {
        
        loadLibrary();
        return dvds.values()
                .stream()
                .filter(s -> s.getDVDAge() < ageInYears)
                .collect(Collectors.toList());

    }

    @Override
    public List<DVD> getDVDsByMpaaRating(String rating) throws DVDLibraryPersistenceException {

        loadLibrary();
        return dvds.values()
                .stream()
                .filter(s -> s.getMpaaRating().equalsIgnoreCase(rating))
                .collect(Collectors.toList());

    }

    @Override
    public Map<String, List<DVD>> getAllDVDsByDirectorGroupByMpaa(String director) throws DVDLibraryPersistenceException {

        loadLibrary();
        return dvds.values()
                .stream()
                .filter(s -> s.getDirectorName().equalsIgnoreCase(director))
                .collect(Collectors.groupingBy(DVD::getMpaaRating));

    }

    @Override
    public List<DVD> getAllDVDsByStudio(String studio) throws DVDLibraryPersistenceException {

        loadLibrary();
        return dvds.values()
                .stream()
                .filter(s -> s.getStudio().equalsIgnoreCase(studio))
                .collect(Collectors.toList());

    }

    @Override
    public double getAverageDVDAge() throws DVDLibraryPersistenceException {

        loadLibrary();
        return dvds.values()
                .stream()
                .mapToLong(s -> s.getDVDAge())
                .average()
                .getAsDouble();

    }

    @Override
    public DVD getNewestDVD() throws DVDLibraryPersistenceException {
        
        loadLibrary();
        return dvds.values()
                .stream()
                .collect(Collectors.maxBy((a,b) -> a.getReleaseDate().compareTo(b.getReleaseDate())))
                .orElse(null);

    }

    @Override
    public DVD getOldestDVD() throws DVDLibraryPersistenceException {

        loadLibrary();
        return dvds.values()
                .stream()
                .collect(Collectors.minBy((a,b) -> a.getReleaseDate().compareTo(b.getReleaseDate())))
                .orElse(null);

    }
    
}