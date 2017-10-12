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
    
    Order addOrder (int orderNum, Order order);
    
    List<Order> findOrdersByDate(LocalDate date);
    
    Order findOrderByNumber(LocalDate date, int orderNum);
    
    Order editOrder(int orderNum, Order order);
    
    Order removeOrder(LocalDate date, int orderNum);
    
    void saveOrders();
    
}
