/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

import com.sg.flooringmastery.java.dto.Order;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class OrderDaoFileImpl implements OrderDao {
    
    private Map<Integer, Order> orders = new HashMap<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
    
    public static final String DELIMITER = ",";
    
    File directory = new File("orders");
    File[] listOfFiles = directory.listFiles();
    
    private void loadOrder(LocalDate date) throws OrderPersistenceException {
        
        for (File file : listOfFiles) {

            if (("Orders_" + date.format(formatter).toString() + ".txt").equals(file.getName())) {
                
                Scanner scanner;
                
                try {
            
                    scanner = new Scanner(new BufferedReader(new FileReader(file)));

                } catch (FileNotFoundException e) {

                    //Need to not end application if file not found
                    throw new OrderPersistenceException(" - Could not load orders into memory.", e);

                }
                
                String currentLine;
                String[] currentTokens;

                while(scanner.hasNextLine()) {
                    
                    currentLine = scanner.nextLine();
                    currentTokens = currentLine.split(DELIMITER);
                    
                    Order currentOrder = new Order();
                    currentOrder.setOrderNum(Integer.parseInt(currentTokens[0]));
                    currentOrder.setOrderedDate(LocalDate.parse(currentTokens[1]));
                    currentOrder.setCustomerName(currentTokens[2]);
                    currentOrder.setState(currentTokens[3]);
                    currentOrder.setTaxRate(new BigDecimal(currentTokens[4]));
                    currentOrder.setProductType(currentTokens[5]);
                    currentOrder.setArea(new BigDecimal(currentTokens[6]));
                    currentOrder.setMaterialCostPerSqFt(new BigDecimal(currentTokens[7]));
                    currentOrder.setLaborCostPerSqFt(new BigDecimal(currentTokens[8]));
                    currentOrder.setMaterialCost(new BigDecimal(currentTokens[9]));
                    currentOrder.setLaborCost(new BigDecimal(currentTokens[10]));
                    currentOrder.setTax(new BigDecimal(currentTokens[11]));
                    currentOrder.setTotalCost(new BigDecimal(currentTokens[12]));

                    orders.put(currentOrder.getOrderNum(), currentOrder);

                }

                scanner.close();
                
            }

        }
        
    }
    
    private void writeOrder(LocalDate date) throws OrderPersistenceException {
        
        PrintWriter out;

        File newOrder = new File("orders", "Orders_" + date.format(formatter).toString() + ".txt");
        
        try {
            
            out = new PrintWriter(new FileWriter(newOrder));
            
        } catch (IOException e) {
            
            throw new OrderPersistenceException ("Could not save new order data.", e);
        }
        
        List<Order> orderList = this.findOrdersByDate(date);

        for (Order currentOrder : orderList) {

            out.println(currentOrder.getOrderNum() + DELIMITER
                        + currentOrder.getOrderedDate() + DELIMITER
                        + currentOrder.getCustomerName() + DELIMITER
                        + currentOrder.getState() + DELIMITER
                        + currentOrder.getTaxRate() + DELIMITER
                        + currentOrder.getProductType() + DELIMITER
                        + currentOrder.getArea() + DELIMITER
                        + currentOrder.getMaterialCostPerSqFt() + DELIMITER
                        + currentOrder.getLaborCostPerSqFt() + DELIMITER
                        + currentOrder.getMaterialCost() + DELIMITER
                        + currentOrder.getLaborCost() + DELIMITER
                        + currentOrder.getTax() + DELIMITER
                        + currentOrder.getTotalCost());

            out.flush();

        }

        out.close();    
        
    }

    @Override
    public Order addOrder(int orderNum, Order order) throws OrderPersistenceException {

        loadOrder(order.getOrderedDate());
        Order newOrder = orders.put(orderNum, order);
        writeOrder(order.getOrderedDate());
        return newOrder;

    }

    @Override
    public List<Order> findOrdersByDate(LocalDate date) throws OrderPersistenceException {

        loadOrder(date);
        return orders.values()
                .stream()
                .filter(o -> o.getOrderedDate().equals(date))
                .collect(Collectors.toList());

    }

    @Override
    public Order findOrderByNumber(LocalDate date, int orderNum) throws OrderPersistenceException {

        loadOrder(date);
        return orders.values()
                .stream()
                .filter(o -> o.getOrderedDate().equals(date))
                .filter(o -> o.getOrderNum() == orderNum)
                .findFirst()
                .orElse(null);

    }

    @Override
    public Order editOrder(int orderNum, Order order) {

        Order editedOrder = orders.put(orderNum, order);
        return editedOrder;

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
