/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

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
public class AddressBookDaoTest {
    
    private AddressBookDao dao = new AddressBookDaoImpl();
    
    public AddressBookDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        
        List<AddressBook> addressList = dao.getAllAddresses();
        
        for (AddressBook address : addressList) {
            
            dao.removeAddress(address.getIdNum());
            
        }
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addAddress method, of class AddressBookDao.
     */
    @Test
    public void testAddGetAddress() throws Exception {
        
        AddressBook address = new AddressBook("0001");
        address.setFirstName("John");
        address.setLastName("Doe");
        address.setStreetAddress("100 Street");
        address.setCityName("City");
        address.setStateName("State");
        address.setZipCode("11111");
        
        dao.addAddress(address.getIdNum(), address);
        
        AddressBook fromDao = dao.getAddress(address.getIdNum());
        
        assertEquals(address, fromDao);
        
    }

    /**
     * Test of getAllAddresses method, of class AddressBookDao.
     */
    @Test
    public void testGetAllAddresses() throws Exception {
        
        AddressBook address1 = new AddressBook("0001");
        address1.setFirstName("John");
        address1.setLastName("Doe");
        address1.setStreetAddress("100 Street");
        address1.setCityName("City");
        address1.setStateName("State");
        address1.setZipCode("11111");
        
        dao.addAddress(address1.getIdNum(), address1);
        
        AddressBook address2 = new AddressBook("0002");
        address2.setFirstName("Jane");
        address2.setLastName("Doe");
        address2.setStreetAddress("200 Street");
        address2.setCityName("City");
        address2.setStateName("State");
        address2.setZipCode("22222");
        
        dao.addAddress(address2.getIdNum(), address2);
        
        assertEquals(2, dao.getAllAddresses().size());
        
    }

    /**
     * Test of listAddressSize method, of class AddressBookDao.
     */
    @Test
    public void testListAddressSize() throws Exception {
        
        AddressBook address1 = new AddressBook("0001");
        address1.setFirstName("John");
        address1.setLastName("Doe");
        address1.setStreetAddress("100 Street");
        address1.setCityName("City");
        address1.setStateName("State");
        address1.setZipCode("11111");
        
        dao.addAddress(address1.getIdNum(), address1);
        
        AddressBook address2 = new AddressBook("0002");
        address2.setFirstName("Jane");
        address2.setLastName("Doe");
        address2.setStreetAddress("200 Street");
        address2.setCityName("City");
        address2.setStateName("State");
        address2.setZipCode("22222");
        
        dao.addAddress(address2.getIdNum(), address2);
        
        assertEquals(2, dao.listAddressSize().size());
        
    }

    /**
     * Test of removeAddress method, of class AddressBookDao.
     */
    @Test
    public void testRemoveAddress() throws Exception {
        
        AddressBook address1 = new AddressBook("0001");
        address1.setFirstName("John");
        address1.setLastName("Doe");
        address1.setStreetAddress("100 Street");
        address1.setCityName("City");
        address1.setStateName("State");
        address1.setZipCode("11111");
        
        dao.addAddress(address1.getIdNum(), address1);
        
        AddressBook address2 = new AddressBook("0002");
        address2.setFirstName("Jane");
        address2.setLastName("Doe");
        address2.setStreetAddress("200 Street");
        address2.setCityName("City");
        address2.setStateName("State");
        address2.setZipCode("22222");
        
        dao.addAddress(address2.getIdNum(), address2);
        
        dao.removeAddress(address1.getIdNum());
        assertEquals(1, dao.getAllAddresses().size());
        
        dao.removeAddress(address2.getIdNum());
        assertEquals(0, dao.getAllAddresses().size());
        
    }
    
}
