/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.ui;

import com.sg.flooringmastery.java.dto.Order;
import com.sg.flooringmastery.java.dto.Product;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public class FlooringMasteryView {
    
    private UserIO io;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public FlooringMasteryView(UserIO io) {

        this.io = io;
        
    }
    
    public int printMenuAndGetSelection() {
        
        io.print("\nMenu Options:");
        io.print("1. Display Orders");
        io.print("2. Add an Order");
        io.print("3. Edit an Order");
        io.print("4. Remove an Order");
        io.print("5. Save Current Work");
        io.print("6. Quit");
        
        return io.readInt("\nPlease selected from the above menu options.", 1, 6);
        
    }
    
    public Order getNewOrderInfo(Map<String, BigDecimal> statesMap, List<Product> productsList) {
        
        boolean validEntry = false;
        LocalDate date = null;
        String customerName = null;
        String state = null;
        String product = null;
        BigDecimal area = BigDecimal.ZERO;
        
        while (!validEntry) {
        
            try {

                date = LocalDate.parse(io.readString("\nPlease enter the order date (MM/dd/yyyy)."), formatter);
                validEntry = true;

            } catch (DateTimeParseException e) {

                io.print("\nPlease enter in the proper format.");
                validEntry = false;

            }
            
        }
        
        customerName = io.readString("\nPlease enter your name.");
        
        //Get the state
        io.print("\nAvailable States");
        
        for (String key : statesMap.keySet()) {
            
            io.print(key);
            
        }
        
        state = io.readString("\nPlease enter one of the states available.");
        
        
        //Get the flooring selection
        io.print("\nFlooring Options");
        
        for (Product currentProduct : productsList) {
            
            io.print(currentProduct.getProductType() + " | Cost/Sq. Ft. = $" + currentProduct.getMaterialCostPerSqFt()
                        + " | Labor Cost/Sq. Ft. = $" + currentProduct.getLaborCostPerSqFt());
            
        }
        
        product = io.readString("\nPlease enter one of the available products.");
        
        //Get the area
        validEntry = false;
        
        while (!validEntry) {
            
            try {

                area = new BigDecimal(io.readString("\nPlease enter the square footage."));
                area = area.setScale(0, RoundingMode.CEILING);
                validEntry = true;

            } catch (NumberFormatException e) {

                io.print("\nPlease make sure you're entering a number.");
                validEntry = false;

            }
            
        }
        
        Order currentOrder = new Order();
        currentOrder.setOrderedDate(date);
        currentOrder.setCustomerName(customerName);
        currentOrder.setState(state);
        currentOrder.setProductType(product);
        currentOrder.setArea(area);
        
        return currentOrder;
        
    }
    
    public boolean getOrderConfirmation(Order order) {
        
        io.print("\n--- New Order Information ---");
        io.print("Order Number:         " + order.getOrderNum());
        io.print("Order Date:           " + order.getOrderedDate().format(formatter));
        io.print("Customer Name:        " + order.getCustomerName());
        io.print("State:                " + order.getState());
        io.print("Tax Rate:             " + order.getTaxRate() + "%");
        io.print("Product:              " + order.getProductType());
        io.print("Area:                 " + order.getArea() + " sq ft");
        io.print("Material Cost/Sq Ft: $" + order.getMaterialCostPerSqFt());
        io.print("Labor Cost/Sq Ft:    $" + order.getLaborCostPerSqFt());
        io.print("Material Cost:       $" + order.getMaterialCost());
        io.print("Labor Cost:          $" + order.getLaborCost());
        io.print("Tax:                 $" + order.getTax());
        io.print("Total:               $" + order.getTotalCost());
        
        String confirmOrder = io.readString("\nDoes the above order information look correct? (y/n)");
        
        if ("y".equalsIgnoreCase(confirmOrder)) {
            
            return true;
            
        } else {
            
            return false;
            
        }
        
    }
    
    public void displayAddOrderBanner() {
        
        io.print("\n--- Create New Order ---");
        
    }
    
    public void displayAddOrderSuccessBanner() {
        
        io.readString("\nThe order has been successfully created. Please hit enter to continue.");
        
    }

    public void displayOrderRestartBanner() {
        
        io.readString("\nPlease try entering the information again.");
        
    }
    
    public void displayAddCancelledBanner() {
        
        io.readString("\nThe order has been cancelled. Please hit enter to continue.");
        
    }
    
    public void displayOrderDisplayBanner() {
        
        io.print("\n--- Display Orders ---");
        
    }
    
    public LocalDate getOrderDate() {
        
        boolean validEntry = false;
        LocalDate date = null;
        
        while (!validEntry) {
            
            try {
                
                do {
                    
                    date = LocalDate.parse(io.readString("\nPlease enter the order date (MM/dd/yyyy)."), formatter);
                    validEntry = true;
                    
                } while (date.toString().length() == 0 || date == null);
                
            } catch (DateTimeParseException e) {
                
                io.print("\nPlease enter the date in the correct format.");
                validEntry = false;
                
            }
            
        }
        
        return date;
        
    }
    
    public int getOrderNum() {
        
        boolean validEntry = false;
        int orderNum = 0;
        
        while (!validEntry) {
            
            try {
                
                orderNum = io.readInt("\nPlease enter the order number.");
                validEntry = true;
                
            } catch (NumberFormatException e) {
                
                io.print("\nPlease ensure you're entering a proper order number");
                validEntry = false;
               
            }
            
        }
        
        
        return orderNum;
        
    }
    
    public void displayOrders(List<Order> orderList, LocalDate date) {
        
        if (!orderList.isEmpty() && orderList != null) {
            
            for (Order currentOrder : orderList) {
                
                if (currentOrder.getOrderedDate().equals(date)) {
                    
                    io.print("\nOrder Number:         " + currentOrder.getOrderNum());
                    io.print("Order Date:           " + currentOrder.getOrderedDate().format(formatter));
                    io.print("Customer Name:        " + currentOrder.getCustomerName());
                    io.print("State:                " + currentOrder.getState());
                    io.print("Tax Rate:             " + currentOrder.getTaxRate() + "%");
                    io.print("Product:              " + currentOrder.getProductType());
                    io.print("Area:                 " + currentOrder.getArea() + " sq ft");
                    io.print("Material Cost/Sq Ft: $" + currentOrder.getMaterialCostPerSqFt());
                    io.print("Labor Cost/Sq Ft:    $" + currentOrder.getLaborCostPerSqFt());
                    io.print("Material Cost:       $" + currentOrder.getMaterialCost());
                    io.print("Labor Cost:          $" + currentOrder.getLaborCost());
                    io.print("Tax:                 $" + currentOrder.getTax());
                    io.print("Total:               $" + currentOrder.getTotalCost());
                    
                }
                
            }
            
        } else {
            
            io.print("\nThere are no orders from that date.");
            
        }
        
        io.readString("\nPlease hit enter to continue.");
        
    }
    
    public void displayEditOrderBanner() {
        
        io.print("\n--- Edit Order ---");
        
    }
    
    public Order editOrderInfo(Order order, Map<String, BigDecimal> statesMap, List<Product> productsList) {
        
        if (order != null) {
            
            boolean validEntry = false;
        
            LocalDate date = order.getOrderedDate();
            String userDateInput = "";
            LocalDate newDate = null;

            String customerName = order.getCustomerName();
            String newCustomerName = null;

            String state = order.getState();
            String newState = null;

            String product = order.getProductType();
            String newProduct = null;

            BigDecimal area = order.getArea();
            String userAreaInput = "";
            BigDecimal newArea = null;
            
            //Get Date
            while (!validEntry) {
                
                io.print("\nCurrent Date: " + date);
                userDateInput = io.readString("Please enter the new order date (MM/dd/yyyy) or hit enter to skip.");
                
                if ("".equalsIgnoreCase(userDateInput)) {
                    
                    //If empty, user didn't put anything new in - old date will be kept.
                    validEntry = true;
                    
                } else {
        
                    try {

                        newDate = LocalDate.parse(userDateInput, formatter);
                        validEntry = true;

                    } catch (DateTimeParseException e) {

                        io.print("\nPlease use the correct format.");
                        validEntry = false;

                    }
                
                }
                
            }

            //If newDate was changed/passed above, will replace old date.
            if (newDate != null) {

                order.setOrderedDate(newDate);

            }

            
            //Get customer name
            io.print("\nCurrent Name: " + customerName);
            newCustomerName = io.readString("Please enter the new customer name or hit enter to skip.");

            if (newCustomerName != null && !"".equals(newCustomerName)) {

                order.setCustomerName(newCustomerName);

            }

            //Get the state
            io.print("\nCurrent State: " + state);
            io.print("Available States");

            for (String key : statesMap.keySet()) {

                io.print(key);

            }

            newState = io.readString("\nPlease enter the new state from those available or hit enter to skip.");
            
            if (newState != null && !"".equals(newState)) {
                
                order.setState(newState);
                
            }


            //Get the flooring selection
            io.print("\nCurrent Product: " + product);
            io.print("Flooring Options");

            for (Product currentProduct : productsList) {

                io.print(currentProduct.getProductType() + " | Cost/Sq. Ft. = $" + currentProduct.getMaterialCostPerSqFt()
                            + " | Labor Cost/Sq. Ft. = $" + currentProduct.getLaborCostPerSqFt());

            }

            newProduct = io.readString("\nPlease enter the new product from those available or hit enter to skip.");
            
            if (newProduct != null && !"".equals(newProduct)) {
                
                order.setProductType(newProduct);
                
            }

            
            //Get Area
            validEntry = false;
            
            while (!validEntry) {
                
                io.print("\nCurrent Area: " + area + " sq ft");
                userAreaInput = io.readString("Please enter the new square footage or hit enter to skip.");
                
                if ("".equalsIgnoreCase(userAreaInput)) {
                    
                    //If empty, nothing new was entered = old area will be kept.
                    validEntry = true;
                    
                } else {
                
                    try {

                        newArea = new BigDecimal(userAreaInput);
                        newArea = newArea.setScale(0, RoundingMode.CEILING);
                        validEntry = true;

                    } catch (NumberFormatException e) {

                        io.print("\nPlease make sure you're entering a number.");
                        validEntry = false;

                    }
                    
                }

                if (newArea != null) {

                    order.setArea(newArea);

                }
            
            }
            
            return order;
            
        } else {
        
            return null;
        
        }
        
    }
    
    public void displayEditedOrderInfo(Order order) {
        
        io.print("\n--- Updated Information for Order " + order.getOrderNum() + " ---");
        io.print("Order Number:         " + order.getOrderNum());
        io.print("Order Date:           " + order.getOrderedDate().format(formatter));
        io.print("Customer Name:        " + order.getCustomerName());
        io.print("State:                " + order.getState());
        io.print("Tax Rate:             " + order.getTaxRate() + "%");
        io.print("Product:              " + order.getProductType());
        io.print("Area:                 " + order.getArea() + " sq ft");
        io.print("Material Cost/Sq Ft: $" + order.getMaterialCostPerSqFt());
        io.print("Labor Cost/Sq Ft:    $" + order.getLaborCostPerSqFt());
        io.print("Material Cost:       $" + order.getMaterialCost());
        io.print("Labor Cost:          $" + order.getLaborCost());
        io.print("Tax:                 $" + order.getTax());
        io.print("Total:               $" + order.getTotalCost());
        
        io.readString("\nThe order has been updated. Please hit enter to continue.");
        
    }

    public void displayEditCancelledBanner() {
        
        io.readString("\nEditing has been cancelled. Please hit enter to continue.");
        
    }

    public void displayNullOrderBanner() {
        
        io.readString("\nThere doesn't appear to be an order with that order number/date. Please hit enter to continue.");
        
    }

    public void displayRemoveOrderBanner() {

        io.print("\n--- Remove Order ---");
        
    }

    public boolean displayRemoveOrderConfirmation(Order order) {

        if (order != null) {
            
            io.print("Order Number:         " + order.getOrderNum());
            io.print("Order Date:           " + order.getOrderedDate().format(formatter));
            io.print("Customer Name:        " + order.getCustomerName());
            io.print("State:                " + order.getState());
            io.print("Tax Rate:             " + order.getTaxRate() + "%");
            io.print("Product:              " + order.getProductType());
            io.print("Area:                 " + order.getArea() + " sq ft");
            io.print("Material Cost/Sq Ft: $" + order.getMaterialCostPerSqFt());
            io.print("Labor Cost/Sq Ft:    $" + order.getLaborCostPerSqFt());
            io.print("Material Cost:       $" + order.getMaterialCost());
            io.print("Labor Cost:          $" + order.getLaborCost());
            io.print("Tax:                 $" + order.getTax());
            io.print("Total:               $" + order.getTotalCost());
            
            String confirmRemove = io.readString("\nWould you like to remove this order? (y/n) ");
            
            if ("y".equalsIgnoreCase(confirmRemove)) {
                
                return true;
                
            } else {
                
                return false;
                
            }
            
        } else {
            
            io.print("\nThere doesn't appear to be an order.");
            return false;
            
        }
        
    }

    public void displayRemoveOrderSuccessBanner() {

        io.readString("\nThe order has been marked for deletion. Please hit enter to continue.");
        
    }

    public void displayRemoveOrderCancelledBanner() {

        io.readString("\nThe order has been kept. Please hit enter to continue.");

    }

    public void displaySaveSuccessfulBanner() {

        io.readString("\nThe orders have been updated. Please hit enter to continue.");

    }

    public void displaySaveDisabledBanner() {

        io.readString("\nCurrently running TEST MODE. Saving has been disabled for this mode.");
        
    }

    public boolean displaySaveWorkConfirmation() {

        String saveWork = io.readString("\nDo you want to save your changes? (y/n)");
        
        if("y".equalsIgnoreCase(saveWork)) {
            
            return true;
            
        } else {
            
            return false;
            
        }
        
    }

    public void displaySaveCancelledBanner() {

        io.readString("\nChanges have not been saved. Please hit enter to continue.");

    }

    public void displayUnknownCommandBanner() {

        io.print("\n---Unknown Command ---");
        
    }

    public void displayErrorMessage(String errorMsg) {

        io.print("\n--- ERROR ---");
        io.print(errorMsg);

    }

    public void displayExitBanner() {

        io.print("\nThank you!");
    }
    
}
