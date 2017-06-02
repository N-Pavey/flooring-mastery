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
    
    AddressBook addAddress(String lastName, AddressBook address);
    
    List<AddressBook> getAllAddresses();
    
    AddressBook findAddress(String lastName);
    
    List<AddressBook> listAddressSize();
    
    AddressBook removeAddress(String lastName);
    
}
