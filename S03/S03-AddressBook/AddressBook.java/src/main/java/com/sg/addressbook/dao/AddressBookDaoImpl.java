/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.AddressBook;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AddressBookDaoImpl implements AddressBookDao {
    
    private Map<String, AddressBook> addresses = new HashMap<>();
    
    public static final String ADDRESSES_FILE = "addresses.txt";
    public static final String DELIMITER = "::";
    
    private void loadAddressBook() throws AddressBookPersistenceException {
        
        Scanner scanner;
        
        try {
            
            scanner = new Scanner(new BufferedReader(new FileReader(ADDRESSES_FILE)));
            
        } catch (FileNotFoundException e) {
            
            throw new AddressBookPersistenceException("Could not load address book data into memory.", e);
            
        }

        String currentLine;
        
        String[] currentTokens;
        
        while (scanner.hasNextLine()) {
            
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            AddressBook currentAddress = new AddressBook(currentTokens[0]);
            currentAddress.setFirstName(currentTokens[1]);
            currentAddress.setLastName(currentTokens[2]);
            currentAddress.setStreetAddress(currentTokens[3]);
            currentAddress.setCityName(currentTokens[4]);
            currentAddress.setStateName(currentTokens[5]);
            currentAddress.setZipCode(currentTokens[6]);
            
            addresses.put(currentAddress.getIdNum(), currentAddress);
            
        }
        
        scanner.close();
        
    }
    
    private void writeAddressBook() throws AddressBookPersistenceException {
        
        PrintWriter out;
        
        try {
            
            out = new PrintWriter(new FileWriter(ADDRESSES_FILE));
            
        } catch (IOException e) {
            
            throw new AddressBookPersistenceException("Could not save address data.", e);
            
        }
        
        List<AddressBook> addressBookList = this.getAllAddresses();
        for (AddressBook currentAddress : addressBookList) {
            
            out.println(currentAddress.getIdNum() + DELIMITER + currentAddress.getFirstName() + DELIMITER + currentAddress.getLastName() + DELIMITER + currentAddress.getStreetAddress() + DELIMITER + currentAddress.getCityName() + DELIMITER + currentAddress.getStateName() + DELIMITER + currentAddress.getZipCode());
            out.flush();
            
        }
        
        out.close();
        
    }

    @Override
    public AddressBook addAddress(String idNum, AddressBook address) throws AddressBookPersistenceException {
        
        AddressBook newAddress = addresses.put(idNum, address);
        writeAddressBook();
        return newAddress;
        
    }

    @Override
    public List<AddressBook> getAllAddresses() throws AddressBookPersistenceException {
        
        loadAddressBook();
        return new ArrayList<AddressBook>(addresses.values());
        
    }

    @Override
    public AddressBook getAddress(String idNum) throws AddressBookPersistenceException {
        
        loadAddressBook();
        return addresses.get(idNum);
        
    }

    @Override
    public AddressBook removeAddress(String idNum) throws AddressBookPersistenceException {
        
        AddressBook removedAddress = addresses.remove(idNum);
        writeAddressBook();
        return removedAddress;
        
    }

    @Override
    public List<AddressBook> listAddressSize() throws AddressBookPersistenceException {
        
        loadAddressBook();
        return new ArrayList<AddressBook>(addresses.values());
        
    }
    
}
