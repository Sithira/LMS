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
public class Member implements Serializable
{
    
    private int memberNumber;

    private String name;
    
    private SetOfBooks currentLoans;
    
    public Member(int id, String pname)
    {
        memberNumber = id;
        
        name = pname;
    }
    
    public Member(int id, String pname, SetOfBooks books)
    {
        memberNumber = id;
        
        name = pname;
        
        currentLoans = books;
    }
    
    public void borrowBook(Book book)
    {
        book.setBorrower(this);
    }
    
    public void returnBook(Book book)
    {
        book.setBorrower(null);
    }
    
    public SetOfBooks getBooksOnLoan()
    {
        return getCurrentLoans();
    }
    
    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public SetOfBooks getCurrentLoans()
    {
        
        if (currentLoans != null)
        {
            ArrayList<Book> books = currentLoans.getBooks();
            
            if (!books.isEmpty())
            {
                
                SetOfBooks sob = new SetOfBooks();
                
                for(Book book : books)
                {
                    
                    if (book instanceof Book)
                    {
                        if (book.getBorrower() != null 
                                && book.getBorrower().equals(this))
                        {                        
                            sob.addBook(book);                       
                        }
                    }
                    
                }
                
                return sob;
                
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;
        }
        
    }

    public void setCurrentLoans(SetOfBooks currentLoans)
    {
        this.currentLoans = currentLoans;
    }
    
    public int getLoanCount()
    {
        SetOfBooks sob = getCurrentLoans();
        
        if (sob != null)
        {
            if (sob.getBooks() != null)
            {
                return sob.getBooks().size();
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return -1;
        }
        
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
   
}
