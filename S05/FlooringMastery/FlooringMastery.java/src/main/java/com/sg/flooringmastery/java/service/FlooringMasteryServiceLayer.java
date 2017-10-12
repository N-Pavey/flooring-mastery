/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.service;

import com.sg.flooringmastery.java.dao.OrderPersistenceException;
import com.sg.flooringmastery.java.dto.Order;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface FlooringMasteryServiceLayer {
    
    Order addOrder(Order order) throws OrderPersistenceException, InvalidStateException, InvalidOrderInformationException;
    
    Order calculateOrderInfo(Order order) throws OrderPersistenceException;
    
    List<Order> findOrdersByDate(LocalDate date) throws OrderPersistenceException;
    
    Order findOrdersByNumber(LocalDate date, int orderNum) throws OrderPersistenceException;
    
    Order editOrder(Order order) throws OrderPersistenceException;
    
    Order removeOrder(LocalDate date, int orderNum) throws OrderPersistenceException;
    
    void saveWork() throws OrderPersistenceException;
    
}
