/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.service;

import com.sg.addressbook.dao.AddressBookAuditDao;
import com.sg.addressbook.dao.AddressBookAuditDaoStubImpl;
import com.sg.addressbook.dao.AddressBookDao;
import com.sg.addressbook.dao.AddressBookDaoStubImpl;
import com.sg.addressbook.dao.AddressBookPersistenceException;
import com.sg.addressbook.dto.AddressBook;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class AddressBookServiceLayerTest {
    
    private AddressBookServiceLayer service;
    
    public AddressBookServiceLayerTest() {
        
        AddressBookDao dao = new AddressBookDaoStubImpl();
        AddressBookAuditDao auditDao = new AddressBookAuditDaoStubImpl();
        
        service = new AddressBookServiceLayerImpl(dao, auditDao);
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addAddress method, of class AddressBookServiceLayer.
     */
    @Test
    public void testAddAddress() throws Exception {
        
        AddressBook address = new AddressBook("0002");
        address.setFirstName("Jane");
        address.setLastName("Smith");
        address.setStreetAddress("200 Avenue");
        address.setCityName("New City");
        address.setStateName("Second State");
        address.setZipCode("22222");
        
        service.addAddress(address);
        
    }
    
    @Test
    public void testAddAddressDuplicateId() throws Exception {
        
        AddressBook address = new AddressBook("0001");
        address.setFirstName("Jane");
        address.setLastName("Smith");
        address.setStreetAddress("200 Avenue");
        address.setCityName("New City");
        address.setStateName("Second State");
        address.setZipCode("22222");
        
        try {
            
            service.addAddress(address);
            fail("Expected AddressBookDuplicateIdException was not thrown.");
            
        } catch (AddressBookDuplicateIdException e) {
            
            return;
            
        }
        
    }
    
    @Test
    public void testAddAddressInvalidData() throws Exception {
        
        AddressBook address = new AddressBook("0002");
        address.setFirstName("");
        address.setLastName("Smith");
        address.setStreetAddress("200 Avenue");
        address.setCityName("New City");
        address.setStateName("Second State");
        address.setZipCode("22222");
        
        try {
            
            service.addAddress(address);
            fail("Expected AddressBookDataValidationException was not thrown.");
            
        } catch (AddressBookDataValidationException e) {
            
            return;
            
        }
        
    }

    /**
     * Test of getAllAddresses method, of class AddressBookServiceLayer.
     */
    @Test
    public void testGetAllAddresses() throws Exception {
        
        assertEquals(1, service.getAllAddresses().size());
        
    }

    /**
     * Test of listAddressSize method, of class AddressBookServiceLayer.
     */
    @Test
    public void testListAddressSize() throws Exception {
        
        assertEquals(1, service.listAddressSize().size());
        
    }

    /**
     * Test of getAddress method, of class AddressBookServiceLayer.
     */
    @Test
    public void testGetAddress() throws Exception {
        
        AddressBook address = service.getAddress("0001");
        assertNotNull(address);
        
        address = service.getAddress("9999");
        assertNull(address);
        
    }

    /**
     * Test of removeAddress method, of class AddressBookServiceLayer.
     */
    @Test
    public void testRemoveAddress() throws Exception {
        
        AddressBook address = service.removeAddress("0001");
        assertNotNull(address);
        
        address = service.removeAddress("9999");
        assertNull(address);
        
    }
    
}
