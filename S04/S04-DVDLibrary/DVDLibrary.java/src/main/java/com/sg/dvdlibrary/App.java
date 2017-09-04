/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary;

import com.sg.dvdlibrary.controller.DVDLibraryController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class App {
    
    public static void main(String[] args) {
        
//        UserIO myIo = new UserIOConsoleImpl();
//        DVDLibraryView myView = new DVDLibraryView(myIo);
//        DVDLibraryDao myDao = new DVDLibraryDaoFileImpl();
//        DVDLibraryAuditDao myAuditDao = new DVDLibraryAuditDaoFileImpl();
//        DVDLibraryServiceLayer myService = new DVDLibraryServiceLayerImpl(myDao, myAuditDao);
//        DVDLibraryController controller = new DVDLibraryController(myService, myView);
//        controller.run();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DVDLibraryController controller = ctx.getBean("controller", DVDLibraryController.class);
        controller.run();
        
    }
    
}
