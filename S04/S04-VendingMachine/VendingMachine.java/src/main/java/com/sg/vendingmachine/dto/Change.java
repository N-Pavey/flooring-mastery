/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

/**
 *
 * @author apprentice
 */
public class Change {
    
    BigDecimal funds;
    BigDecimal numQuarters, numDimes, numNickels, numPennies;
    
    public Change(BigDecimal funds) {
        
        // Convert funds to pennies
        // Divide pennies by quarters to get number of quarters returned
        funds = funds.multiply(new BigDecimal("100"));
        numQuarters = funds.divide(new BigDecimal("25"), 0, RoundingMode.FLOOR);
        
        // Subtract funds by $ amount of quarters to get remaining funds
        // Divide funds by dimes/tenths to get number of dimes returned
        funds = funds.subtract(numQuarters.multiply(new BigDecimal("25")));
        numDimes = funds.divide(new BigDecimal("10"), 0, RoundingMode.FLOOR);
        
        // Subtract funds by $ amount of dimes to get remaining funds
        // Divide by nickels/fifths to get number of nickels returned
        funds = funds.subtract(numDimes.multiply(new BigDecimal("10")));
        numNickels = funds.divide(new BigDecimal("5"), 0, RoundingMode.FLOOR);
        
        // Subtract funds by $ amount of nickels to get remaining funds
        // Divide by pennies and set scale as above. Subtract funds by number of pennies
        // Remaining funds should then equal 0.
        funds = funds.subtract(numNickels.multiply(new BigDecimal("5")));
        numPennies = funds.divide(new BigDecimal("1"), 0, RoundingMode.FLOOR);
        funds = funds.subtract(numPennies);
        
        this.numQuarters = numQuarters;
        this.numDimes = numDimes;
        this.numNickels = numNickels;
        this.numPennies = numPennies;
        this.funds = funds;
        
    }
    
    public BigDecimal getFunds() {
        return funds;
    }

    public void setFunds(BigDecimal funds) {
        this.funds = funds;
    }

    public BigDecimal getNumQuarters() {
        return numQuarters;
    }

    public BigDecimal getNumDimes() {
        return numDimes;
    }

    public BigDecimal getNumNickels() {
        return numNickels;
    }

    public BigDecimal getNumPennies() {
        return numPennies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.funds);
        hash = 17 * hash + Objects.hashCode(this.numQuarters);
        hash = 17 * hash + Objects.hashCode(this.numDimes);
        hash = 17 * hash + Objects.hashCode(this.numNickels);
        hash = 17 * hash + Objects.hashCode(this.numPennies);
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
        final Change other = (Change) obj;
        if (!Objects.equals(this.funds, other.funds)) {
            return false;
        }
        if (!Objects.equals(this.numQuarters, other.numQuarters)) {
            return false;
        }
        if (!Objects.equals(this.numDimes, other.numDimes)) {
            return false;
        }
        if (!Objects.equals(this.numNickels, other.numNickels)) {
            return false;
        }
        if (!Objects.equals(this.numPennies, other.numPennies)) {
            return false;
        }
        return true;
    }
    
    
    
}
