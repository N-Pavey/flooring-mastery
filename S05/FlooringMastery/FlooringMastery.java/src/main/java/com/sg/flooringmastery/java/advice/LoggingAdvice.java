/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.advice;

import com.sg.flooringmastery.java.dao.AuditDao;
import com.sg.flooringmastery.java.dao.OrderPersistenceException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;

/**
 *
 * @author apprentice
 */
public class LoggingAdvice {
    
    AuditDao auditDao;
    
    public LoggingAdvice (AuditDao auditDao) {
        
        this.auditDao = auditDao;
        
    }
    
    public void createAuditEntry(JoinPoint jp) {
        
        Object[] args = jp.getArgs();
        String auditEntry = jp.getSignature().getName() + ": ";
        
        for (Object currentArg : args) {
            
            auditEntry += currentArg;
            
        }
        
        try {
            
            auditDao.writeAuditEntry(auditEntry);
            
        } catch (OrderPersistenceException e) {
            
            System.err.println("ERROR: Could not create audit entry in LoggingAdvice.");
            
        }
        
    }
    
    @AfterThrowing(
        pointcut="execution(* com.sg.flooringmastery.java.service.FlooringMasteryServiceLayer)",
            throwing = "error"
    )
    public void createAuditEntryExceptions(JoinPoint jp, Throwable error) {
        
        String auditEntry = jp.getSignature().getName() + ": ";
        
        auditEntry += ("Exception thrown: " + error);
        
        try {
            
            auditDao.writeAuditEntry(auditEntry);
            
        } catch (OrderPersistenceException e) {
            
            System.err.println("ERROR: Could not create audit entry in LoggingAdvice.");
        }
        
    }
    
}
