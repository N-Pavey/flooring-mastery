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
    
    AddressBook addAddress(String lastName, AddressBook address) throws AddressBookDaoException;
    
    List<AddressBook> getAllAddresses() throws AddressBookDaoException;
    
    AddressBook findAddress(String lastName) throws AddressBookDaoException;
    
    List<AddressBook> listAddressSize() throws AddressBookDaoException;
    
    AddressBook removeAddress(String lastName) throws AddressBookDaoException;
    
}
