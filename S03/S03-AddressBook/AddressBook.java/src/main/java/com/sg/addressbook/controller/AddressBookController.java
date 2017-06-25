/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.controller;

import com.sg.addressbook.dao.AddressBookPersistenceException;
import com.sg.addressbook.dto.AddressBook;
import com.sg.addressbook.io.AddressBookView;
import com.sg.addressbook.service.AddressBookDataValidationException;
import com.sg.addressbook.service.AddressBookDuplicateIdException;
import com.sg.addressbook.service.AddressBookServiceLayer;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class AddressBookController {
    
    AddressBookView view;
    AddressBookServiceLayer service;
    
    public AddressBookController(AddressBookServiceLayer service, AddressBookView view) {
        
        this.service = service;
        this.view = view;
        
    }
    
    public void run() {
        
        boolean keepGoing = true;
        int menuSelection = 0;
        
        try {
        
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        addAddress();
                        break;
                    case 2:
                        removeAddress();
                        break;
                    case 3:
                        findAddress();
                        break;
                    case 4:
                        listAddressSize();
                        break;
                    case 5:
                        listAddresses();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            
        } catch (AddressBookPersistenceException e) {
            
            view.displayErrorMessage(e.getMessage());
            
        }
        
        exitMessage();
        
    }
    
    private int getMenuSelection() {
        
        return view.printMenuAndGetSelection();
        
    }
    
    private void addAddress() throws AddressBookPersistenceException {
        
        view.displayAddAddressBanner();
        boolean hasErrors = false;
        
        do {
            
            AddressBook newAddress = view.getNewAddressInfo();
            
            try {
        
                service.addAddress(newAddress);
                view.displayAddSuccessBanner();
                hasErrors = false;
                
            } catch (AddressBookDuplicateIdException | AddressBookDataValidationException e) {
                
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
                
            }
            
        } while (hasErrors);
        
    }
    
    private void removeAddress() throws AddressBookPersistenceException {
        
        view.displayRemovedAddressBanner();
        String idNum = view.getAddressChoice();
        service.removeAddress(idNum);
        view.displayRemoveSuccessBanner();
        
    }
    
    private void findAddress() throws AddressBookPersistenceException {
        
        view.displayDisplayAddressBanner();
        String idNum = view.getAddressChoice();
        AddressBook addressBook = service.getAddress(idNum);
        view.displayAddress(addressBook);
        
    }
    
    private void listAddressSize() throws AddressBookPersistenceException {
        
        view.displayDisplayAddressListSizeBanner();
        int addressListSize = service.listAddressSize().size();
        view.displayAddressBookListSize(addressListSize);
        
    }
    
    private void listAddresses() throws AddressBookPersistenceException {
        
        view.displayDisplayAllBanner();
        List<AddressBook> addressList = service.getAllAddresses();
        view.displayAddressBookList(addressList);
        
    }
    
    private void unknownCommand() {
        
        view.displayUnknownCommandBanner();
        
    }
    
    private void exitMessage() {
        
        view.displayExitBanner();
        
    }
    
}
