/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

import com.sg.flooringmastery.java.dto.Product;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface ProductDao {
    
    List<Product> pullAllProducts() throws OrderPersistenceException;
    
    Product findProduct(String productType) throws OrderPersistenceException;
    
}
