/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java;

import com.sg.flooringmastery.java.controller.FlooringMasteryController;
import com.sg.flooringmastery.java.dao.AuditDao;
import com.sg.flooringmastery.java.dao.AuditDaoFileImpl;
import com.sg.flooringmastery.java.dao.OrderDao;
import com.sg.flooringmastery.java.dao.OrderDaoFileImpl;
import com.sg.flooringmastery.java.dao.OrderNumberDao;
import com.sg.flooringmastery.java.dao.OrderNumberDaoFileImpl;
import com.sg.flooringmastery.java.dao.ProductDao;
import com.sg.flooringmastery.java.dao.ProductDaoFileImpl;
import com.sg.flooringmastery.java.dao.TaxRateDao;
import com.sg.flooringmastery.java.dao.TaxRateDaoFileImpl;
import com.sg.flooringmastery.java.service.FlooringMasteryServiceLayer;
import com.sg.flooringmastery.java.service.FlooringMasteryServiceLayerImpl;
import com.sg.flooringmastery.java.ui.FlooringMasteryView;
import com.sg.flooringmastery.java.ui.UserIO;
import com.sg.flooringmastery.java.ui.UserIOConsoleImpl;

/**
 *
 * @author apprentice
 */
public class App {
    
    public static void main(String[] args) {
        
        UserIO myIo = new UserIOConsoleImpl();
        FlooringMasteryView myView = new FlooringMasteryView(myIo);
        OrderDao orderDao = new OrderDaoFileImpl();
        AuditDao auditDao = new AuditDaoFileImpl();
        ProductDao productDao = new ProductDaoFileImpl();
        TaxRateDao taxRateDao = new TaxRateDaoFileImpl();
        OrderNumberDao orderNumDao = new OrderNumberDaoFileImpl();
        FlooringMasteryServiceLayer myService = new FlooringMasteryServiceLayerImpl(orderDao, productDao, taxRateDao, orderNumDao, auditDao);
        FlooringMasteryController controller = new FlooringMasteryController(myService, myView);
        controller.run();
        
    }
    
}
