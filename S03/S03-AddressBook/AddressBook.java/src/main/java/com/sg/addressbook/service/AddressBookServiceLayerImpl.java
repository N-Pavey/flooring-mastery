/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.service;

import com.sg.addressbook.dao.AddressBookAuditDao;
import com.sg.addressbook.dao.AddressBookDao;
import com.sg.addressbook.dao.AddressBookPersistenceException;
import com.sg.addressbook.dto.AddressBook;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class AddressBookServiceLayerImpl implements AddressBookServiceLayer {
    
    AddressBookDao dao;
    private AddressBookAuditDao auditDao;
    
    public AddressBookServiceLayerImpl(AddressBookDao dao, AddressBookAuditDao auditDao) {
        
        this.dao = dao;
        this.auditDao = auditDao;
        
    }

    @Override
    public void addAddress(AddressBook address) throws AddressBookDuplicateIdException, AddressBookDataValidationException, AddressBookPersistenceException {

        if (dao.getAddress(address.getIdNum()) != null) {
            
            throw new AddressBookDuplicateIdException("ERROR: Could not create address."
                    + " Address Id" + address.getIdNum() + "already exists.");
            
        }
        
        validateAddressBookData(address);
        
        dao.addAddress(address.getIdNum(), address);
        
        auditDao.writeAuditEntry("Address " + address.getIdNum() + " CREATED.");

    }

    @Override
    public List<AddressBook> getAllAddresses() throws AddressBookPersistenceException {

        return dao.getAllAddresses();

    }

    @Override
    public List<AddressBook> listAddressSize() throws AddressBookPersistenceException {

        return dao.listAddressSize();

    }

    @Override
    public AddressBook getAddress(String idNum) throws AddressBookPersistenceException {

        return dao.getAddress(idNum);

    }

    @Override
    public AddressBook removeAddress(String idNum) throws AddressBookPersistenceException {

        AddressBook removedAddress = dao.removeAddress(idNum);
        auditDao.writeAuditEntry("Address " + idNum + " REMOVED.");
        return removedAddress;

    }
    
    private void validateAddressBookData(AddressBook address) throws AddressBookDataValidationException {
        
        if (address.getFirstName() == null
                || address.getFirstName().trim().length() == 0
                || address.getLastName() == null
                || address.getLastName().trim().length() == 0
                || address.getStreetAddress() == null
                || address.getStreetAddress().trim().length() == 0
                || address.getCityName() == null
                || address.getCityName().trim().length() == 0
                || address.getStateName() == null
                || address.getStateName().trim().length() == 0
                || address.getZipCode() == null
                || address.getZipCode().trim().length() == 0) {
            
            throw new AddressBookDataValidationException("ERROR: All fields [First Name, Last Name, Street Address, City, State, and Zip Code] are required.");
        }
        
    }
    
}
