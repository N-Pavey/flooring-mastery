/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.AddressBook;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class AddressBookDaoStubImpl implements AddressBookDao {
    
    AddressBook onlyAddress;
    List<AddressBook> addressList = new ArrayList<>();
    
    public AddressBookDaoStubImpl() {
        
        onlyAddress = new AddressBook("0001");
        onlyAddress.setFirstName("John");
        onlyAddress.setLastName("Doe");
        onlyAddress.setStreetAddress("100 Street");
        onlyAddress.setCityName("City");
        onlyAddress.setStateName("State");
        onlyAddress.setZipCode("11111");
        
        addressList.add(onlyAddress);
        
    }

    @Override
    public AddressBook addAddress(String idNum, AddressBook address) throws AddressBookPersistenceException {

        if (idNum.equals(onlyAddress.getIdNum())) {
            
            return onlyAddress;
            
        } else {
            
            return null;
            
        }

    }

    @Override
    public List<AddressBook> getAllAddresses() throws AddressBookPersistenceException {

        return addressList;

    }

    @Override
    public AddressBook getAddress(String idNum) throws AddressBookPersistenceException {

        if (idNum.equals(onlyAddress.getIdNum())) {
            
            return onlyAddress;
            
        } else {
            
            return null;
            
        }

    }

    @Override
    public List<AddressBook> listAddressSize() throws AddressBookPersistenceException {

        
        return addressList;

    }

    @Override
    public AddressBook removeAddress(String idNum) throws AddressBookPersistenceException {

        if (idNum.equals(onlyAddress.getIdNum())) {
            
            return onlyAddress;
            
        } else {
            
            return null;
            
        }

    }
    
}
