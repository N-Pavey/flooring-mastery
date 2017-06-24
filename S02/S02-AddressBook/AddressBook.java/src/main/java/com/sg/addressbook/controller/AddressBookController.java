/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.controller;

import com.sg.addressbook.dao.AddressBookDao;
import com.sg.addressbook.dao.AddressBookDaoException;
import com.sg.addressbook.dao.AddressBookDaoImpl;
import com.sg.addressbook.dto.AddressBook;
import com.sg.addressbook.io.AddressBookView;
import com.sg.addressbook.io.UserIO;
import com.sg.addressbook.io.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class AddressBookController {
    
    AddressBookView view;
    AddressBookDao dao;
    
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
            
        } catch (AddressBookDaoException e) {
            
            view.displayErrorMessage(e.getMessage());
            
        }
        
        exitMessage();
        
    }
    
    public AddressBookController(AddressBookDao dao, AddressBookView view) {
        
        this.dao = dao;
        this.view = view;
        
    }
    
    private int getMenuSelection() {
        
        return view.printMenuAndGetSelection();
        
    }
    
    private void addAddress() throws AddressBookDaoException {
        
        view.displayAddAddressBanner();
        AddressBook newAddress = view.getNewAddressInfo();
        dao.addAddress(newAddress.getLastName(), newAddress);
        view.displayAddSuccessBanner();
        
    }
    
    private void removeAddress() throws AddressBookDaoException {
        
        view.displayRemovedAddressBanner();
        String lastName = view.getAddressChoice();
        dao.removeAddress(lastName);
        view.displayRemoveSuccessBanner();
        
    }
    
    private void findAddress() throws AddressBookDaoException {
        
        view.displayDisplayAddressBanner();
        String lastName = view.getAddressChoice();
        AddressBook addressBook = dao.findAddress(lastName);
        view.displayAddress(addressBook);
        
    }
    
    private void listAddressSize() throws AddressBookDaoException {
        
        view.displayDisplayAddressListSizeBanner();
        List<AddressBook> addressListSize = dao.listAddressSize();
        view.displayAddressBookListSize(addressListSize);
        
    }
    
    private void listAddresses() throws AddressBookDaoException {
        
        view.displayDisplayAllBanner();
        List<AddressBook> addressList = dao.getAllAddresses();
        view.displayAddressBookList(addressList);
        
    }
    
    private void unknownCommand() {
        
        view.displayUnknownCommandBanner();
        
    }
    
    private void exitMessage() {
        
        view.displayExitBanner();
        
    }
    
}
