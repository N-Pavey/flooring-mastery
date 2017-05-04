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
public class BookLibraryCatalogue {
    
    private int bookISBN;
    private String bookTitle;
    private String bookAuthor;
    private String bookGenre;
    private int numOnHand;
    
    public void sortBook (String bookGenre, String bookAuthor, String bookTitle) {
        
    }

    public int getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(int bookISBN) {
        this.bookISBN = bookISBN;
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

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getNumOnHand() {
        return numOnHand;
    }

    public void setNumOnHand(int numOnHand) {
        this.numOnHand = numOnHand;
    }
    
}
