/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.controller;

import com.sg.flooringmastery.java.dao.OrderDao;
import com.sg.flooringmastery.java.dao.OrderDaoFileImpl;
import com.sg.flooringmastery.java.dao.OrderPersistenceException;
import com.sg.flooringmastery.java.dto.Order;
import com.sg.flooringmastery.java.service.FlooringMasteryServiceLayer;
import com.sg.flooringmastery.java.service.FlooringMasteryServiceLayerImpl;
import com.sg.flooringmastery.java.service.InvalidOrderInformationException;
import com.sg.flooringmastery.java.service.InvalidStateException;
import com.sg.flooringmastery.java.ui.FlooringMasteryView;
import com.sg.flooringmastery.java.ui.UserIO;
import com.sg.flooringmastery.java.ui.UserIOConsoleImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class FlooringMasteryController {
    
    FlooringMasteryView view;
    FlooringMasteryServiceLayer service;
    
    public FlooringMasteryController(FlooringMasteryServiceLayer service, FlooringMasteryView view) {
        
        this.service = service;
        this.view = view;
        
    }
    
    private UserIO io = new UserIOConsoleImpl();
    
    public void run() {
        
        boolean keepGoing = true;
        int menuSelection = 0;
        
        try {
        
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {

                    case 1:
                        displayOrders();
                        break;
                    case 2:
                        addOrder();
                        break;
                    case 3:
                        editOrder();
                        break;
                    case 4:
                        removeOrder();
                        break;
                    case 5:
                        io.print("SAVE WORK");
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        io.print("UNKNOWN COMMAND");

                }

            }

            io.print("GOOD BYE!");
        
        } catch (OrderPersistenceException e) {
            
            view.displayErrorMessage(e.getMessage());
            
        }
        
    }
    
    private int getMenuSelection() {
        
        return view.printMenuAndGetSelection();
        
    }
    
    private void displayOrders() throws OrderPersistenceException {
        
        view.displayOrderDisplayBanner();
        LocalDate date = view.getOrderDate();
        List<Order> orderList = service.findOrdersByDate(date);
        view.displayOrders(orderList, date);
        
    }
    
    private void addOrder() throws OrderPersistenceException {
        
        view.displayAddOrderBanner();
        boolean hasErrors = false;
        
        do {
            
            Order newOrder = view.getNewOrderInfo();
            
            try {
                
                service.addOrder(newOrder);
                view.displayAddOrderSuccessBanner();
                hasErrors = false;
                
            } catch (InvalidStateException | InvalidOrderInformationException e) {
                
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
                
            }
            
        } while (hasErrors);
        
    }
    
    private void editOrder() throws OrderPersistenceException {
        
        boolean keepEditing = true;
        int menuSelection = 0;
        Order order = getOrderEdit();
        
        while (keepEditing) {
            
            menuSelection = getEditSelection(order);
            
            switch (menuSelection) {
                
                case 1:
                    editCustomerName(order);
                    break;
                case 2:
                    editState(order);
                    break;
                case 3:
                    editProductType(order);
                    break;
                case 4:
                    editArea(order);
                    break;
                case 5:
                    keepEditing = false;
                    break;
                default:
                    unknownCommand();
            }
            
        }
    }

    private Order getOrderEdit() throws OrderPersistenceException {

        view.displayEditOrderBanner();
        LocalDate date = view.getOrderDate();
        int orderNum = view.getOrderNum();
        Order order = service.findOrdersByNumber(date, orderNum);
        return order;

    }

    private int getEditSelection(Order order) {

        return view.printEditMenuAndGetSelection(order);

    }

    private void editCustomerName(Order order) throws OrderPersistenceException {

        view.editCustomerName(order);
        order = service.editOrder(order);
    }

    private void editState(Order order) throws OrderPersistenceException {

        view.editState(order);
        order = service.editOrder(order);
        
    }

    private void editProductType(Order order) throws OrderPersistenceException {

        view.editProductType(order);
        order = service.editOrder(order);
        
    }

    private void editArea(Order order) throws OrderPersistenceException {

        view.editArea(order);
        order = service.editOrder(order);
        
    }
    
    private void removeOrder() throws OrderPersistenceException {
        
        view.displayRemoveOrderBanner();
        LocalDate date = view.getOrderDate();
        int orderNum = view.getOrderNum();
        Order order = service.findOrdersByNumber(date, orderNum);
        boolean removeOrder = view.displayRemoveOrderConfirmation(order);
        
        if (removeOrder) {
            
            service.removeOrder(date, orderNum);
            
        }
        
    }

    private void unknownCommand() {

        view.displayUnknownCommandBanner();
        
    }
    
    private void exitMessage() {
        
        view.displayExitBanner();
        
    }
    
}
