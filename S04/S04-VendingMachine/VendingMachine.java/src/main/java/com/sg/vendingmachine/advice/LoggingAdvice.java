/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.advice;

import com.sg.vendingmachine.dao.VendingMachineAuditDao;
import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author apprentice
 */

@Aspect
public class LoggingAdvice {
    
    VendingMachineAuditDao auditDao;
    
    public LoggingAdvice(VendingMachineAuditDao auditDao) {
        
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
            
        } catch (VendingMachinePersistenceException e) {
            
            System.err.println("ERROR: Could not create audit entry in LoggingAdvice.");
        }
        
    }
    
    @AfterThrowing(
        pointcut="execution(* com.sg.vendingmachine.service.VendingMachineServiceLayer.vendItem(..))",
            throwing = "error"
    )
    public void createAuditEntryExceptions(JoinPoint jp, Throwable error) {
        
        String auditEntry = jp.getSignature().getName() + ": ";
        
        auditEntry += ("Exception thrown: " + error);
        
        try {
            
            auditDao.writeAuditEntry(auditEntry);
            
        } catch (VendingMachinePersistenceException e) {
            
            System.err.println("ERROR: Could not create audit entry in LoggingAdvice.");
        }
        
    }
    
}
