/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

import com.sg.flooringmastery.java.dto.Order;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class OrderDaoStubImpl implements OrderDao {
    
    private Order onlyOrder;
    private List<Order> orderList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    
    public OrderDaoStubImpl() {
        
        onlyOrder = new Order();
        onlyOrder.setOrderNum(100);
        onlyOrder.setOrderedDate(LocalDate.parse("01/01/2017", formatter));
        onlyOrder.setCustomerName("Nathan");
        onlyOrder.setState("IN");
        onlyOrder.setTaxRate(new BigDecimal("6.00"));
        onlyOrder.setProductType("Wood");
        onlyOrder.setArea(new BigDecimal("50"));
        onlyOrder.setMaterialCostPerSqFt(new BigDecimal("5.15"));
        onlyOrder.setLaborCostPerSqFt(new BigDecimal("4.75"));
        onlyOrder.setMaterialCost(new BigDecimal("257.50"));
        onlyOrder.setLaborCost(new BigDecimal("237.50"));
        onlyOrder.setTax(new BigDecimal("29.70"));
        onlyOrder.setTotalCost(new BigDecimal("524.70"));
        
        orderList.add(onlyOrder);
        
    }

    @Override
    public Order addOrder(int orderNum, Order order) throws OrderPersistenceException {

        if (orderNum == onlyOrder.getOrderNum()) {
            
            return onlyOrder;
            
        } else {
            
            return null;
            
        }
        
    }

    @Override
    public List<Order> findOrdersByDate(LocalDate date) throws OrderPersistenceException {

        if (date.equals(onlyOrder.getOrderedDate())) {
            
            return orderList;
            
        } else {
            
            return null;
            
        }

    }

    @Override
    public Order findOrderByNumber(LocalDate date, int orderNum) throws OrderPersistenceException {

        if (date.equals(onlyOrder.getOrderedDate()) && orderNum == onlyOrder.getOrderNum()) {
            
            return onlyOrder;
            
        } else {
            
            return null;
            
        }

    }

    @Override
    public Order editOrder(int orderNum, Order order) throws OrderPersistenceException {

        if (orderNum == onlyOrder.getOrderNum()) {
            
            return onlyOrder;
            
        } else {
            
            return null;
            
        }
        
    }

    @Override
    public Order removeOrder(int orderNum, Order order) throws OrderPersistenceException {

        if (orderNum == onlyOrder.getOrderNum()) {
            
            return onlyOrder;
            
        } else {
            
            return null;
            
        }
        
    }

    @Override
    public void saveOrders() throws OrderPersistenceException {
        
        //Nothing to return
        //Nothing to do?

    }
    
}
