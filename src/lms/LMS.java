/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import Core.ObjectParser;
import Models.Book;
import Models.Member;
import Models.SetOfBooks;
import Models.SetOfMembers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sithira
 */
public class LMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        
        ObjectParser parser = ObjectParser.getInstance();
        
        SetOfBooks sob = new SetOfBooks();
        SetOfMembers som = new SetOfMembers();
        
        
        try 
        {
        Book book1 = new Book("Book 1");

        Book book2 = new Book("Book 2");
        
        Book book3 = new Book("Book 3");

        
        Member member1 = new Member(123, "Sithira 1");
        member1.borrowBook(book1);
        
        Member member2 = new Member(1234, "Sithira 2");
        
        Member member3 = new Member(1235, "Sithira 3");

        
        sob.addBook(book1);
        sob.addBook(book2);        
        sob.addBook(book3);
        
        som.addMember(member1);
        som.addMember(member2);
        som.addMember(member3);
        
        member1.setCurrentLoans(sob);
        
        try {
            parser.writeObject(sob.TABLE_PATH, sob);
            parser.writeObject(som.TABLE_PATH, som);
        } catch (IOException ex) {
            Logger.getLogger(LMS.class.getName()).log(Level.SEVERE, null, ex);
        }


        Object o = parser.readObject(som.TABLE_PATH);
        
        SetOfMembers sm = (SetOfMembers) o;
        
        for(Member member : sm.getMembers())
        {
            
            SetOfBooks soop = member.getCurrentLoans();
            
            if (soop != null)
            {
                                            
                ArrayList<Book> list = soop.getBooks();
                
                if (!list.isEmpty())
                {
                    for (Book book : list)
                    {

                        System.out.println("Book name : " + book.getTitle());

                    }
                }
                else
                {
                    System.out.println("EMOT INNER");
                }
            }
            else
            {
                System.out.println("EMPT OUTER");
            }
            
        }
        
        } catch (IOException ex) {
            Logger.getLogger(LMS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
