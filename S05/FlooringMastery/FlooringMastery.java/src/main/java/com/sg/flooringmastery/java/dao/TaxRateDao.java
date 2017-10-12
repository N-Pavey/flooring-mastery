/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

import java.math.BigDecimal;

/**
 *
 * @author apprentice
 */
public interface TaxRateDao {
    
    //necessary?
    //void addTaxRate(String state, BigDecimal taxRate);
    
    BigDecimal findTaxRate(String state);
    
}
