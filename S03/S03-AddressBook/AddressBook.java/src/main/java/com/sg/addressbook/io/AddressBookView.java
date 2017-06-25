/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.io;

import com.sg.addressbook.dto.AddressBook;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class AddressBookView {
    
    private UserIO io;
    
    public AddressBookView(UserIO io) {
        
        this.io = io;
        
    }
    
    public int printMenuAndGetSelection() {
        
        io.print("--- Main Menu ---");
        io.print("1. Add Address");
        io.print("2. Delete Address");
        io.print("3. Find Address");
        io.print("4. List Address Count");
        io.print("5. List All Addresses");
        io.print("6. Exit");
        
        return io.readInt("Please select the operation you wish to perform.", 1, 6);
        
    }
    
    public AddressBook getNewAddressInfo() {
        
        String idNum = io.readString("Please enter the ID for this address.");
        String firstName = io.readString("Please enter the first name.");
        String lastName = io.readString("Please enter the last name.");
        String streetAddress = io.readString("Please enter the street address.");
        String cityName = io.readString("Please enter the city.");
        String stateName = io.readString("Please enter the state.");
        String zipCode = io.readString("Please enter the zip code.");
        
        AddressBook currentAddress = new AddressBook(idNum);
        currentAddress.setFirstName(firstName);
        currentAddress.setLastName(lastName);
        currentAddress.setStreetAddress(streetAddress);
        currentAddress.setCityName(cityName);
        currentAddress.setStateName(stateName);
        currentAddress.setZipCode(zipCode);
        
        return currentAddress;
        
    }
    
    public String getAddressChoice() {
        
        return io.readString("Please enter the ID number of the address you wish to see.");
        
    }
    
    public void displayAddress(AddressBook addressBook) {
        
        if (addressBook != null) {
            
            io.print(addressBook.getIdNum());
            io.print(addressBook.getFirstName() + " " + addressBook.getLastName());
            io.print(addressBook.getStreetAddress());
            io.print(addressBook.getCityName() + ", " + addressBook.getStateName() + " " + addressBook.getZipCode());
            
        } else {
            
            io.print("No such address.");
            
        }
        
        io.readString("\nPlease hit enter to continue.");
        
    }
    
    public void displayAddressBookListSize(int addressListSize) {
        
        io.print("There are " + addressListSize + " addresses in the book.");
        io.readString("\nPlease hit enter to continue.");
        
    }
    
    public void displayAddressBookList(List<AddressBook> addressList) {
        
        for (AddressBook currentAddress : addressList) {
            
            io.print("\n" + currentAddress.getIdNum());
            io.print(currentAddress.getFirstName() + " " + currentAddress.getLastName());
            io.print(currentAddress.getStreetAddress());
            io.print(currentAddress.getCityName() + ", " + currentAddress.getStateName() + " " + currentAddress.getZipCode());
            
        }
        
        io.readString("\nPlease hit enter to continue.");
        
    }
    
    public void displayAddAddressBanner() {
        
        io.print("--- Add Address ---");
        
    }
    
    public void displayAddSuccessBanner() {
        
        io.readString("\nAddress has been added. Please hit enter to continue.");
        
    }
    
    public void displayRemovedAddressBanner() {
        
        io.print("--- Remove Address ---");
        
    }
    
    public void displayRemoveSuccessBanner() {
        
        io.readString("\nAddress has been successfully removed. Please hit enter to continue.");
        
    }
    
    public void displayDisplayAddressBanner() {
        
        io.print("--- Display Address ---");
        
    }
    
    public void displayDisplayAddressListSizeBanner() {
        
        io.print("--- Number of Addresses in Book ---");
        
    }
    
    public void displayDisplayAllBanner() {
        
        io.print("--- All Addresses ---");
        
    }
    
    public void displayExitBanner() {
        
        io.print("Good bye!");
        
    }
    
    public void displayUnknownCommandBanner() {
        
        io.print("Sorry - Unable to understand that command.");
        
    }
    
    public void displayErrorMessage(String errorMsg) {
        
        io.print("--- ERROR ---");
        io.print(errorMsg);
        
    }
    
}
