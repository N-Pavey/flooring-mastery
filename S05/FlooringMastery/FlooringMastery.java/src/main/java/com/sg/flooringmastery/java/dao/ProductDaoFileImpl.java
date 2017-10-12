/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dao;

import com.sg.flooringmastery.java.dto.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ProductDaoFileImpl implements ProductDao {
    
    private Map<String, Product> products = new HashMap<>();
    
    public static final String PRODUCTS_FILE = "products.txt";
    public static final String DELIMITER = ",";
    
    private void loadProducts() throws OrderPersistenceException {
        
        Scanner scanner;

        try {

            scanner = new Scanner(new BufferedReader(new FileReader(PRODUCTS_FILE)));

        } catch (FileNotFoundException e) {

            throw new OrderPersistenceException(" - Could not load product data into memory.", e);

        }

        String currentLine;
        String[] currentTokens;

        while (scanner.hasNextLine()) {

            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Product currentProduct = new Product();
            currentProduct.setProductType(currentTokens[0]);
            currentProduct.setMaterialCostPerSqFt(new BigDecimal(currentTokens[1]));
            currentProduct.setLaborCostPerSqFt(new BigDecimal(currentTokens[2]));

            products.put(currentProduct.getProductType(), currentProduct);
            
        }

        scanner.close();

    }

    /*necessary?
    @Override
    public void addProduct(String productType, Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */

    @Override
    public Product findProduct(String productType) throws OrderPersistenceException {

        loadProducts();
        return products.get(productType);

    }
    
}
