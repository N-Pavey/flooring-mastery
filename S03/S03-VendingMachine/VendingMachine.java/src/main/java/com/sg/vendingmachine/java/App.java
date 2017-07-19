/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.java;

import com.sg.vendingmachine.java.dao.VendingMachineAuditDao;
import com.sg.vendingmachine.java.dao.VendingMachineAuditDaoFileImpl;
import com.sg.vendingmachine.java.controller.VendingMachineController;
import com.sg.vendingmachine.java.dao.VendingMachineDao;
import com.sg.vendingmachine.java.dao.VendingMachineDaoFileImpl;
import com.sg.vendingmachine.java.service.VendingMachineServiceLayer;
import com.sg.vendingmachine.java.service.VendingMachineServiceLayerImpl;
import com.sg.vendingmachine.java.ui.UserIO;
import com.sg.vendingmachine.java.ui.UserIOConsoleImpl;
import com.sg.vendingmachine.java.ui.VendingMachineView;

/**
 *
 * @author apprentice
 */
public class App {
    
    public static void main(String[] args) {
        
        UserIO myIo = new UserIOConsoleImpl();
        VendingMachineView myView = new VendingMachineView(myIo);
        VendingMachineDao myDao = new VendingMachineDaoFileImpl();
        VendingMachineAuditDao myAuditDao = new VendingMachineAuditDaoFileImpl();
        VendingMachineServiceLayer myService = new VendingMachineServiceLayerImpl(myDao, myAuditDao);
        VendingMachineController controller = new VendingMachineController(myService, myView);
        controller.run();
        
    }
    
}
