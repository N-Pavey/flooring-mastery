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
import java.time.format.FormatStyle;
import java.util.List;

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
    
    public Order getNewOrderInfo() {
        
        boolean validEntry = false;
        LocalDate date = null;
        String state = null;
        String product = null;
        BigDecimal area = BigDecimal.ZERO;
        
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
        
        String customerName = io.readString("\nPlease enter your name.");
        
        //Get the state
        io.print("\nAvailable States");
        io.print("1. OH");
        io.print("2. PA");
        io.print("3. MI");
        io.print("4. IN");
        int stateSelection = io.readInt("Please choose from the menu.", 1, 4);
        
        switch (stateSelection) {
            
            case 1:
                state = "OH";
                break;
            case 2:
                state = "PA";
                break;
            case 3:
                state = "MI";
                break;
            case 4:
                state = "IN";
                break;
            default:
                displayUnknownCommandBanner();
            
        }
        
        //Get the flooring selection
        io.print("\nFlooring Options");
        io.print("1. Carpet | Cost / Sq. Ft. = $2.25 | Labor Cost / Sq. Ft. = $2.10");
        io.print("2. Laminate | Cost / Sq. Ft. = $1.75 | Labor Cost / Sq. Ft. = $2.10");
        io.print("3. Tile | Cost / Sq. Ft. = $3.50 | Labor Cost / Sq. Ft. = $4.15");
        io.print("4. Wood | Cost / Sq. Ft. = $5.15 | Labor Cost / Sq. Ft. = $4.75");
        int floorSelection = io.readInt("Please choose from the menu.", 1, 4);
        
        switch (floorSelection) {
            
            case 1:
                product = "Carpet";
                break;
            case 2:
                product = "Laminate";
                break;
            case 3:
                product = "Tile";
                break;
            case 4:
                product = "Wood";
                break;
            default:
                displayUnknownCommandBanner();
            
        }
        
        //Get the area
        validEntry = false;
        
        while (!validEntry) {
            
            try {
            
                do {
                    
                    area = new BigDecimal(io.readString("\nPlease enter the square footage."));
                    area = area.setScale(0, RoundingMode.CEILING);
                    validEntry = true;
                    
                } while (area.compareTo(BigDecimal.ZERO) <= 0);
                
            } catch (NumberFormatException e) {
                
                System.out.println("Please make sure you're entering a number.");
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
    
    public void displayAddOrderBanner() {
        
        io.print("\n--- Create New Order ---");
        
    }
    
    public void displayAddOrderSuccessBanner() {
        
        io.readString("\nThe order has been successfully created. Please hit enter to continue.");
        
    }
    
    public void displayOrderDisplayBanner() {
        
        io.print("\n--- Display Orders ---");
        
    }
    
    public LocalDate getOrderDate() {
        
        String date = io.readString("\nPlease enter the order date (MM/dd/yyyy)");
        return LocalDate.parse(date, formatter);
        
    }
    
    public int getOrderNum() {
        
        int orderNum = io.readInt("\nPlease enter the order number.");
        return orderNum;
        
    }
    
    public void displayOrders(List<Order> orderList, LocalDate date) {
        
        if (orderList.size() != 0) {
            
            for (Order currentOrder : orderList) {
                
                if (currentOrder.getOrderedDate().equals(date)) {
                    
                    io.print("\nOrder Number:         " + currentOrder.getOrderNum());
                    io.print("Order Date:           " + currentOrder.getOrderedDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
                    io.print("Customer Name:        " + currentOrder.getCustomerName());
                    io.print("State:                " + currentOrder.getState());
                    io.print("Tax Rate:             " + currentOrder.getTaxRate());
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
    
    public int printEditMenuAndGetSelection(Order order) {
        
        if (order != null) {
            
            io.print("\nWhich field would you like to edit?");
            io.print("1. Order Date:    " + order.getOrderedDate());
            io.print("2. Customer Name: " + order.getCustomerName());
            io.print("3. State:         " + order.getState());
            io.print("4. Product:       " + order.getProductType());
            io.print("5. Area (sq ft):  " + order.getArea());
            io.print("6. Go Back");
            return io.readInt("\nPlease choose from the menu.", 1, 6);
            
        } else {
            
            io.print("\nThere doesn't appear to be an order.");
            return 6;
            
        }
        
    }
    
    public void editCustomerName(Order order) {
        
        String customerName = io.readString("\nPlease enter the customer name.");
        order.setCustomerName(customerName);
        
    }
    
    public void editState(Order order) {
        
        String state = null;
        
        io.print("\nAvailable States");
        io.print("1. OH");
        io.print("2. PA");
        io.print("3. MI");
        io.print("4. IN");
        int stateSelection = io.readInt("Please choose from the menu.", 1, 4);
        
        switch (stateSelection) {
            
            case 1:
                state = "OH";
                break;
            case 2:
                state = "PA";
                break;
            case 3:
                state = "MI";
                break;
            case 4:
                state = "IN";
                break;
            default:
                displayUnknownCommandBanner();
            
        }
        
        order.setState(state);
        
    }
    
    public void editProductType(Order order) {
        
        String product = null;
        
        io.print("\nFlooring Options");
        io.print("1. Carpet | Cost / Sq. Ft. = $2.25 | Labor Cost / Sq. Ft. = $2.10");
        io.print("2. Laminate | Cost / Sq. Ft. = $1.75 | Labor Cost / Sq. Ft. = $2.10");
        io.print("3. Tile | Cost / Sq. Ft. = $3.50 | Labor Cost / Sq. Ft. = $4.15");
        io.print("4. Wood | Cost / Sq. Ft. = $5.15 | Labor Cost / Sq. Ft. = $4.75");
        int floorSelection = io.readInt("Please choose from the menu.", 1, 4);
        
        switch (floorSelection) {
            
            case 1:
                product = "Carpet";
                break;
            case 2:
                product = "Laminate";
                break;
            case 3:
                product = "Tile";
                break;
            case 4:
                product = "Wood";
                break;
            default:
                displayUnknownCommandBanner();
            
        }
        
        order.setProductType(product);
        
    }
    
    public void editArea(Order order) {
        
        boolean validEntry = false;
        BigDecimal area = BigDecimal.ZERO;
        
        while (!validEntry) {
            
            try {
            
                do {
                    
                    area = new BigDecimal(io.readString("\nPlease enter the square footage."));
                    area = area.setScale(0, RoundingMode.CEILING);
                    validEntry = true;
                    
                } while (area.compareTo(BigDecimal.ZERO) <= 0);
                
            } catch (NumberFormatException e) {
                
                System.out.println("Please make sure you're entering a number.");
                validEntry = false;
                
            }
            
        }
        
        order.setArea(area);
        
    }

    public void displayRemoveOrderBanner() {

        io.print("\n--- Remove Order ---");
        
    }

    public boolean displayRemoveOrderConfirmation(Order order) {

        if (order != null) {
            
            io.print("\nOrder Number:         " + order.getOrderNum());
            io.print("Customer Name:        " + order.getCustomerName());
            io.print("State:                " + order.getState());
            io.print("Tax Rate:            $" + order.getTaxRate());
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
