/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author sithira
 */
public class SetOfBooks implements Serializable
{ 
    
    public static final String TABLE_PATH = Paths.get(".")
            .toAbsolutePath()
            .normalize()
            .toString() + "/database/SetOfBooks.txt";
    
    private ArrayList<Book> books = new ArrayList<Book>();
    
    public void addBook(Book book)
    {
        books.add(book);
    }
    
    public SetOfBooks findBookByAuthor(String name)
    {
        
        if (!books.isEmpty())
        {
            
            SetOfBooks sob = new SetOfBooks();
            
            for (Book book : books)
            {
                if (book instanceof Book)
                {
                    if (book.getAuthor() != null 
                            && book.getAuthor().equals(name))
                    {
                       sob.addBook(book);
                    }
                }
            }
            
            return sob;
            
        }
        
        return null;
    }
    
    public SetOfBooks findBookFromTitle(String title)
    {
        if (!books.isEmpty())
        {
            
            SetOfBooks sob = new SetOfBooks();
            
            for (Book book : books)
            {
                if (book instanceof Book)
                {
                    if (book.getTitle() != null 
                            && book.getTitle().equals(title))
                    {
                        sob.addBook(book);
                    }
                }
            }
            
            return sob;
            
        }
        
        return null;
    }
    
    public Book findBookFromAccNumber(int number)
    {
        
        if (!books.isEmpty())
        {
            
            for (Book book : books)
            {
                if (book instanceof Book)
                {
                    if (book.getAccessionNumber() != -1 
                            && book.getAccessionNumber() == number)
                    {
                        return book;
                    }
                }
            }
            
            return null;
            
        }
        
        return null;
    }
    
    public SetOfBooks findBookFromISBN(String isbn)
    {
        
        if (!books.isEmpty())
        {
            
            SetOfBooks sob = new SetOfBooks();
            
            for (Book book : books)
            {
                
                if (book instanceof Book)
                {
                    
                    if (book.getISBNNumber() != null 
                            && book.getISBNNumber().equals(isbn))
                    {
                        sob.addBook(book);                     
                    }
                    
                }
                
            }
            
            return sob;
                    
        }
        
        return null;
    }
    
    public void removeBook(Book book)
    {
        // Todo: improve the conditions
        if (!books.isEmpty())
        {
            
            for (int x = 0; x < books.size(); x++)
            {
                
                String title = null;
                
                int accessionNumber = 0;       
                
                Book bk = books.get(x);
                
                if (bk.getTitle() != null)
                {
                    title = bk.getTitle();
                }
                
                if (bk.getAccessionNumber() != -999)
                {
                    accessionNumber = bk.getAccessionNumber();
                }               
                
                if (title != null && accessionNumber != -999)
                {
                    if (title.equals(book.getTitle()))
                    {
                        books.remove(x);
                    }
                                       
                }
                
            }
           
        }
        
    }
    
    public ArrayList<Book> getBooks()
    {
        return this.books;
    }
    
    public void setBooks(ArrayList<Book> list)
    {
        this.books = list;
    }
    
}
