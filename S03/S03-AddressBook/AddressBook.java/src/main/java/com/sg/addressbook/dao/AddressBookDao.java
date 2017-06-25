/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.AddressBook;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface AddressBookDao {
    
    AddressBook addAddress(String idNum, AddressBook address) throws AddressBookPersistenceException;
    
    List<AddressBook> getAllAddresses() throws AddressBookPersistenceException;
    
    AddressBook getAddress(String idNum) throws AddressBookPersistenceException;
    
    List<AddressBook> listAddressSize() throws AddressBookPersistenceException;
    
    AddressBook removeAddress(String idNum) throws AddressBookPersistenceException;
    
}
