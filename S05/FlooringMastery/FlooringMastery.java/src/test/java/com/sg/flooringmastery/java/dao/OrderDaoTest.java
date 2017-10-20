/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

import com.sg.flooringmastery.java.dto.Order;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
public class OrderDaoTest {
    
    private OrderDao orderDao = new OrderDaoFileImpl();
    
    File directory = new File("orders");
    File[] listOfFiles = directory.listFiles();
    
    //Set up test date for tests
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private LocalDate testDate = LocalDate.parse("01/01/2017", formatter);
    
    public OrderDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        
        //Find all orders from test date, iterate through them and delete all orders (if any)
        //Save those changes to ensure old orders don't interfere with tests
        List<Order> orderList = orderDao.findOrdersByDate(testDate);
        
        for (Order order : orderList) {
            
            orderDao.removeOrder(order.getOrderNum(), order);
            
        }
        
        orderDao.saveOrders();
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addOrder method, of class OrderDao.
     */
    @Test
    public void testAddGetOrder() throws Exception {
        
        //Testing addOrder && findOrderByNumber
        
        Order order = new Order();
        order.setOrderNum(100);
        order.setOrderedDate(testDate);
        order.setCustomerName("Nathan");
        order.setState("IN");
        order.setTaxRate(new BigDecimal("6.00"));
        order.setProductType("Wood");
        order.setArea(new BigDecimal("50"));
        order.setMaterialCostPerSqFt(new BigDecimal("5.15"));
        order.setLaborCostPerSqFt(new BigDecimal("4.75"));
        order.setMaterialCost(new BigDecimal("257.50"));
        order.setLaborCost(new BigDecimal("237.50"));
        order.setTax(new BigDecimal("29.70"));
        order.setTotalCost(new BigDecimal("524.70"));
        
        orderDao.addOrder(order.getOrderNum(), order);
        
        Order fromDao = orderDao.findOrderByNumber(testDate, order.getOrderNum());
        
        assertEquals(order, fromDao);
        
    }

    /**
     * Test of findOrdersByDate method, of class OrderDao.
     */
    @Test
    public void testFindOrdersByDate() throws Exception {
        
        Order order1 = new Order();
        order1.setOrderNum(100);
        order1.setOrderedDate(testDate);
        order1.setCustomerName("Nathan");
        order1.setState("IN");
        order1.setTaxRate(new BigDecimal("6.00"));
        order1.setProductType("Wood");
        order1.setArea(new BigDecimal("50"));
        order1.setMaterialCostPerSqFt(new BigDecimal("5.15"));
        order1.setLaborCostPerSqFt(new BigDecimal("4.75"));
        order1.setMaterialCost(new BigDecimal("257.50"));
        order1.setLaborCost(new BigDecimal("237.50"));
        order1.setTax(new BigDecimal("29.70"));
        order1.setTotalCost(new BigDecimal("524.70"));
        
        orderDao.addOrder(order1.getOrderNum(), order1);
        
        Order order2 = new Order();
        order2.setOrderNum(200);
        order2.setOrderedDate(testDate);
        order2.setCustomerName("John");
        order2.setState("OH");
        order2.setTaxRate(new BigDecimal("6.25"));
        order2.setProductType("Carpet");
        order2.setArea(new BigDecimal("50"));
        order2.setMaterialCostPerSqFt(new BigDecimal("2.25"));
        order2.setLaborCostPerSqFt(new BigDecimal("2.10"));
        order2.setMaterialCost(new BigDecimal("112.50"));
        order2.setLaborCost(new BigDecimal("105.00"));
        order2.setTax(new BigDecimal("13.59"));
        order2.setTotalCost(new BigDecimal("231.09"));
        
        orderDao.addOrder(order2.getOrderNum(), order2);
        
        assertEquals(2, orderDao.findOrdersByDate(testDate).size());
        
    }

    /**
     * Test of editOrder method, of class OrderDao.
     */
    @Test
    public void testEditOrder() throws Exception {
        
        Order order = new Order();
        order.setOrderNum(100);
        order.setOrderedDate(testDate);
        order.setCustomerName("Nathan");
        order.setState("IN");
        order.setTaxRate(new BigDecimal("6.00"));
        order.setProductType("Wood");
        order.setArea(new BigDecimal("50"));
        order.setMaterialCostPerSqFt(new BigDecimal("5.15"));
        order.setLaborCostPerSqFt(new BigDecimal("4.75"));
        order.setMaterialCost(new BigDecimal("257.50"));
        order.setLaborCost(new BigDecimal("237.50"));
        order.setTax(new BigDecimal("29.70"));
        order.setTotalCost(new BigDecimal("524.70"));
        
        orderDao.addOrder(order.getOrderNum(), order);
        
        Order fromDao = orderDao.findOrderByNumber(testDate, order.getOrderNum());
        
        assertEquals(order, fromDao);
        
    }

    /**
     * Test of removeOrder method, of class OrderDao.
     */
    @Test
    public void testRemoveOrder() throws Exception {
        
        Order order1 = new Order();
        order1.setOrderNum(100);
        order1.setOrderedDate(testDate);
        order1.setCustomerName("Nathan");
        order1.setState("IN");
        order1.setTaxRate(new BigDecimal("6.00"));
        order1.setProductType("Wood");
        order1.setArea(new BigDecimal("50"));
        order1.setMaterialCostPerSqFt(new BigDecimal("5.15"));
        order1.setLaborCostPerSqFt(new BigDecimal("4.75"));
        order1.setMaterialCost(new BigDecimal("257.50"));
        order1.setLaborCost(new BigDecimal("237.50"));
        order1.setTax(new BigDecimal("29.70"));
        order1.setTotalCost(new BigDecimal("524.70"));
        
        orderDao.addOrder(order1.getOrderNum(), order1);
        
        Order order2 = new Order();
        order2.setOrderNum(200);
        order2.setOrderedDate(testDate);
        order2.setCustomerName("John");
        order2.setState("OH");
        order2.setTaxRate(new BigDecimal("6.25"));
        order2.setProductType("Carpet");
        order2.setArea(new BigDecimal("50"));
        order2.setMaterialCostPerSqFt(new BigDecimal("2.25"));
        order2.setLaborCostPerSqFt(new BigDecimal("2.10"));
        order2.setMaterialCost(new BigDecimal("112.50"));
        order2.setLaborCost(new BigDecimal("105.00"));
        order2.setTax(new BigDecimal("13.59"));
        order2.setTotalCost(new BigDecimal("231.09"));
        
        orderDao.addOrder(order2.getOrderNum(), order2);
        
        orderDao.removeOrder(order1.getOrderNum(), order1);
        assertEquals(1, orderDao.findOrdersByDate(testDate).size());
        assertNull(orderDao.findOrderByNumber(testDate, order1.getOrderNum()));
        
        orderDao.removeOrder(order2.getOrderNum(), order2);
        assertEquals(0, orderDao.findOrdersByDate(testDate).size());
        assertNull(orderDao.findOrderByNumber(testDate, order2.getOrderNum()));
        
    }

    /**
     * Test of saveOrders method, of class OrderDao.
     */
    @Test
    public void testSaveOrders() throws Exception {
        
        Order order = new Order();
        order.setOrderNum(100);
        order.setOrderedDate(testDate);
        order.setCustomerName("Nathan");
        order.setState("IN");
        order.setTaxRate(new BigDecimal("6.00"));
        order.setProductType("Wood");
        order.setArea(new BigDecimal("50"));
        order.setMaterialCostPerSqFt(new BigDecimal("5.15"));
        order.setLaborCostPerSqFt(new BigDecimal("4.75"));
        order.setMaterialCost(new BigDecimal("257.50"));
        order.setLaborCost(new BigDecimal("237.50"));
        order.setTax(new BigDecimal("29.70"));
        order.setTotalCost(new BigDecimal("524.70"));
        
        orderDao.addOrder(order.getOrderNum(), order);
        orderDao.saveOrders();
        
        File testFile = new File("orders/Orders_01012017.txt");
        assertTrue(testFile.isFile());
        
        orderDao.removeOrder(order.getOrderNum(), order);
        orderDao.saveOrders();
        
        assertFalse(testFile.isFile());
        
    }
    
}
