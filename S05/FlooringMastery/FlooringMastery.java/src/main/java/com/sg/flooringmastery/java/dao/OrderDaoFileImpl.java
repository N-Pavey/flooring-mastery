/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

import com.sg.flooringmastery.java.dto.Order;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class OrderDaoFileImpl implements OrderDao {
    
    private Map<Integer, Order> orders = new HashMap<>();

    @Override
    public Order addOrder(int orderNum, Order order) {

        Order newOrder = orders.put(orderNum, order);
        return newOrder;

    }

    @Override
    public List<Order> findOrdersByDate(LocalDate date) {

        return orders.values()
                .stream()
                .filter(o -> o.getOrderedDate().equals(date))
                .collect(Collectors.toList());

    }

    @Override
    public Order findOrderByNumber(LocalDate date, int orderNum) {

        return orders.values()
                .stream()
                .filter(o -> o.getOrderedDate().equals(date))
                .filter(o -> o.getOrderNum() == orderNum)
                .findFirst()
                .get();

    }

    //neccessary?
    @Override
    public Order editOrder(int orderNum, Order order) {

        Order newOrder = orders.put(orderNum, order);
        return newOrder;

    }

    @Override
    public Order removeOrder(LocalDate date, int orderNum) {

        Order removedOrder = orders.remove(orderNum);
        return removedOrder;
        
    }

    @Override
    public void saveOrders() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
