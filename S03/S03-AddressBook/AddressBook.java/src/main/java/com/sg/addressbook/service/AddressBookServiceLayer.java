/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.service;

import com.sg.addressbook.dao.AddressBookPersistenceException;
import com.sg.addressbook.dto.AddressBook;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface AddressBookServiceLayer {
    
    void addAddress(AddressBook address) throws AddressBookDuplicateIdException, AddressBookDataValidationException, AddressBookPersistenceException;
    
    List<AddressBook> getAllAddresses() throws AddressBookPersistenceException;
    
    List<AddressBook> listAddressSize() throws AddressBookPersistenceException;
    
    AddressBook getAddress(String idNum) throws AddressBookPersistenceException;
    
    AddressBook removeAddress(String idNum) throws AddressBookPersistenceException;
    
}
