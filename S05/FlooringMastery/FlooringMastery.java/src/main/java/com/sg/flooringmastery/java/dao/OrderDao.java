/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

import com.sg.flooringmastery.java.dto.Order;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface OrderDao {
    
    Order addOrder (int orderNum, Order order) throws OrderPersistenceException;
    
    List<Order> findOrdersByDate(LocalDate date) throws OrderPersistenceException;
    
    Order findOrderByNumber(LocalDate date, int orderNum) throws OrderPersistenceException;
    
    Order editOrder(int orderNum, Order order) throws OrderPersistenceException;
    
    Order removeOrder(int orderNum, Order order) throws OrderPersistenceException;
    
    void saveOrders() throws OrderPersistenceException;
    
}
