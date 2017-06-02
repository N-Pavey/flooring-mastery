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
    
    private void loadAddressBook() throws FileNotFoundException {
        
        Scanner scanner;
        
        scanner = new Scanner(new BufferedReader(new FileReader(ADDRESSES_FILE)));

        String currentLine;
        
        String[] currentTokens;
        
        while (scanner.hasNextLine()) {
            
            
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            AddressBook currentAddress = new AddressBook(currentTokens[1]);
            currentAddress.setFirstName(currentTokens[0]);
            currentAddress.setStreetAddress(currentTokens[2]);
            currentAddress.setCityName(currentTokens[3]);
            currentAddress.setStateName(currentTokens[4]);
            currentAddress.setZipCode(currentTokens[5]);
            
            addresses.put(currentAddress.getLastName(), currentAddress);
            
        }
        
        scanner.close();
        
    }
    
    private void writeAddressBook() throws IOException {
        
        PrintWriter out;
        
        out = new PrintWriter(new FileWriter(ADDRESSES_FILE));
        
        List<AddressBook> addressBookList = this.getAllAddresses();
        for (AddressBook currentAddress : addressBookList) {
            
            out.println(currentAddress.getFirstName() + DELIMITER + currentAddress.getLastName() + DELIMITER + currentAddress.getStreetAddress() + DELIMITER + currentAddress.getCityName() + DELIMITER + currentAddress.getStateName() + DELIMITER + currentAddress.getZipCode());
            out.flush();
            
        }
        
        out.close();
        
    }

    @Override
    public AddressBook addAddress(String lastName, AddressBook address) {
        
        AddressBook newAddress = addresses.put(lastName, address);
        writeAddressBook();
        return newAddress;
        
    }

    @Override
    public List<AddressBook> getAllAddresses() {
        
        return new ArrayList<AddressBook>(addresses.values());
        
    }

    @Override
    public AddressBook findAddress(String lastName) {
        
        return addresses.get(lastName);
        
    }

    @Override
    public AddressBook removeAddress(String lastName) {
        
        AddressBook removedAddress = addresses.remove(lastName);
        return removedAddress;
        
    }

    @Override
    public List<AddressBook> listAddressSize() {
        
        return new ArrayList<AddressBook>(addresses.values());
        
    }
    
}
