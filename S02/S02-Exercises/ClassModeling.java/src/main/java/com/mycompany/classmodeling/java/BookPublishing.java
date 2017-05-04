/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling.java;

/**
 *
 * @author apprentice
 */
public class BookPublishing {
    
    private int numPages;
    private int releaseDate;
    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;
    private int numBooksOrdered;
    private int numBooksPrinted;
    private int numBooksShipped;
    
    public void retrieveOrders (int numBooksOrdered) {
        
    }
    
    public void printBooks (int numBooksPrinted) {
        
    }
    
    public void shipBooks (int numBooksShipped) {
        
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getNumBooksOrdered() {
        return numBooksOrdered;
    }

    public void setNumBooksOrdered(int numBooksOrdered) {
        this.numBooksOrdered = numBooksOrdered;
    }

    public int getNumBooksPrinted() {
        return numBooksPrinted;
    }

    public void setNumBooksPrinted(int numBooksPrinted) {
        this.numBooksPrinted = numBooksPrinted;
    }

    public int getNumBooksShipped() {
        return numBooksShipped;
    }

    public void setNumBooksShipped(int numBooksShipped) {
        this.numBooksShipped = numBooksShipped;
    }
    
}
