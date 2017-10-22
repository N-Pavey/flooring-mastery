/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class OrderNumberDaoFileImpl implements OrderNumberDao {
    
    private int orderNum = 0;
    
    public static final String ORDERNUM_FILE = "orderNum.txt";
    
    private void loadOrderNum() throws OrderPersistenceException {
        
        Scanner scanner;

        try {

            scanner = new Scanner(new BufferedReader(new FileReader(ORDERNUM_FILE)));

        } catch (FileNotFoundException e) {

            throw new OrderPersistenceException(" - Could not load order number data into memory.", e);

        }

        while (scanner.hasNextInt()) {

            orderNum = scanner.nextInt();

        }

        scanner.close();
        
    }
    
    private void writeOrderNum() throws OrderPersistenceException {
	    
        PrintWriter out;

        try {

            out = new PrintWriter(new FileWriter(ORDERNUM_FILE));

        } catch (IOException e) {

            throw new OrderPersistenceException("Could not save new order number data.", e);

        }

        out.println(orderNum);
        out.flush();
        out.close();

    }

    @Override
    public int findOrderNumber() throws OrderPersistenceException {

        //if orderNum = 0, then new orders haven't been created yet and orderNum needs to be loaded in.
        if (orderNum == 0) {
            
            loadOrderNum();
            
        }
        
        return orderNum;

    }

    @Override
    public void increaseOrderNumber() {

        orderNum++;
        
    }

    @Override
    public void saveOrderNumber() throws OrderPersistenceException {

        //if orderNum is 0, then new orders weren't created and orderNum was not updated
        //orderNum should then NOT be updated in the file
        if (orderNum != 0) {
            
            writeOrderNum();
            
        }

    }
    
}
