/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.java.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author apprentice
 */
public class Order {
    
    public Order () {
        
        // Do nothing
        
    }
    
    //Copy constructor
    public Order (Order order) {
        
        orderNum = order.orderNum;
        orderedDate = order.orderedDate;
        customerName = order.customerName;
        state = order.state;
        productType = order.productType;
        area = order.area;
        
    }
    
    private int orderNum;
    private String customerName;
    private String state;
    private BigDecimal taxRate;
    private String productType;
    private BigDecimal area;
    private BigDecimal materialCostPerSqFt;
    private BigDecimal laborCostPerSqFt;
    private BigDecimal materialCost;
    private BigDecimal laborCost;
    private BigDecimal tax;
    private BigDecimal totalCost;
    private LocalDate orderedDate;

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public BigDecimal getMaterialCostPerSqFt() {
        return materialCostPerSqFt;
    }

    public void setMaterialCostPerSqFt(BigDecimal materialCostPerSqFt) {
        this.materialCostPerSqFt = materialCostPerSqFt;
    }

    public BigDecimal getLaborCostPerSqFt() {
        return laborCostPerSqFt;
    }

    public void setLaborCostPerSqFt(BigDecimal laborCostPerSqFt) {
        this.laborCostPerSqFt = laborCostPerSqFt;
    }

    public BigDecimal getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(BigDecimal materialCost) {
        this.materialCost = materialCost;
    }

    public BigDecimal getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(BigDecimal laborCost) {
        this.laborCost = laborCost;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDate getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(LocalDate orderedDate) {
        this.orderedDate = orderedDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.orderNum;
        hash = 19 * hash + Objects.hashCode(this.customerName);
        hash = 19 * hash + Objects.hashCode(this.state);
        hash = 19 * hash + Objects.hashCode(this.taxRate);
        hash = 19 * hash + Objects.hashCode(this.productType);
        hash = 19 * hash + Objects.hashCode(this.area);
        hash = 19 * hash + Objects.hashCode(this.materialCostPerSqFt);
        hash = 19 * hash + Objects.hashCode(this.laborCostPerSqFt);
        hash = 19 * hash + Objects.hashCode(this.materialCost);
        hash = 19 * hash + Objects.hashCode(this.laborCost);
        hash = 19 * hash + Objects.hashCode(this.tax);
        hash = 19 * hash + Objects.hashCode(this.totalCost);
        hash = 19 * hash + Objects.hashCode(this.orderedDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (this.orderNum != other.orderNum) {
            return false;
        }
        if (!Objects.equals(this.customerName, other.customerName)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.productType, other.productType)) {
            return false;
        }
        if (!Objects.equals(this.taxRate, other.taxRate)) {
            return false;
        }
        if (!Objects.equals(this.area, other.area)) {
            return false;
        }
        if (!Objects.equals(this.materialCostPerSqFt, other.materialCostPerSqFt)) {
            return false;
        }
        if (!Objects.equals(this.laborCostPerSqFt, other.laborCostPerSqFt)) {
            return false;
        }
        if (!Objects.equals(this.materialCost, other.materialCost)) {
            return false;
        }
        if (!Objects.equals(this.laborCost, other.laborCost)) {
            return false;
        }
        if (!Objects.equals(this.tax, other.tax)) {
            return false;
        }
        if (!Objects.equals(this.totalCost, other.totalCost)) {
            return false;
        }
        if (!Objects.equals(this.orderedDate, other.orderedDate)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        
        return "Order Number: " + orderNum + " |Date: " + orderedDate
                + " |Customer Name: " + customerName
                + " |State: " + state + " |Tax Rate: " + taxRate
                + " |Product: " + productType + " |Area: " + area
                + " |Material Cost/Sq Ft: " + materialCostPerSqFt
                + " |Labor Cost/Sq Ft: " + laborCostPerSqFt
                + " |Material Cost: " + materialCost + " |Labor Cost: " + laborCost
                + " |Tax: " + tax + " |Total Cost: " + totalCost;
        
    }
    
}
