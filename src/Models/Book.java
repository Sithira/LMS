/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author sithira
 */
public class Book implements Serializable
{
        
    private String ISBNNumber, title, author;

    private int accessionNumber = -999;
    
    private Member borrower;
    
    
    public Book(String titl)
    {
        title = titl;
    }
    
    public Book(String isbn, String titl)
    {
        ISBNNumber = isbn;
        
        title = titl;
    }
    
    public Book(String isbn, String titl, String authr)
    {
        ISBNNumber = isbn;
        
        title = titl;
        
        author = authr;
    }
    
        public Book(String isbn, String titl, String authr, int acc)
    {
        ISBNNumber = isbn;
        
        title = titl;
        
        author = authr;
        
        accessionNumber = acc;
    }
    
    /**
     * Get the Member of the book who has borrowed it.
     * 
     * @return
     */
    public Member getBorrower()
    {
        return this.borrower;
    }
    
    /**
     * Set a new borrower for the book
     * 
     * @param newBorrower 
     */
    public void setCurrentBorrower(Member newBorrower)
    {
        this.borrower = newBorrower;
    }
    
    /**
     * Check if the book is on a loan or not.
     * 
     * @return 
     */
    public boolean isOnLoan()
    {
        if (borrower != null)
        {
           
            SetOfBooks sob = borrower.getCurrentLoans();
                      
            if (sob != null)
            {
                ArrayList<Book> books = sob.getBooks();
                
                if (!books.isEmpty())
                {
                    for (Book book : books)
                    {                        
                        if (book instanceof Book)
                        {
                            if (book.getAccessionNumber() == this.accessionNumber 
                                    && book.ISBNNumber.equals(this.ISBNNumber))
                            {
                                return true;
                            }
                        }
                    }
                }
                
            }
            
            System.out.println("Loans is null");

            return false;
        }
        
        System.out.println("Borrower is NULL");
        
        return false;
        
    }

    public String getISBNNumber()
    {
        return ISBNNumber;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getAccessionNumber()
    {
        return accessionNumber;
    }
    
    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAccessionNumber(int accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    public void setBorrower(Member borrower) {
        this.borrower = borrower;
    }
   
}
