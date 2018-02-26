/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import Core.ObjectParser;
import GUI.MainGUI;
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
        
        Member member1 = new Member(1, "Member 1");
        
        Member member2 = new Member(1, "Member 2");
        
        Member member3 = new Member(1, "Member 3");
        
        
        Book book1 = new Book("SomeISBN-1", "Title 1");
        
        Book book2 = new Book("SomeISBN-2", "Title 2");
        
        Book book3 = new Book("SomeISBN-3", "Title 3");
        
        
        SetOfMembers som = new SetOfMembers();
        
        som.addMember(member1);
        som.addMember(member2);
        som.addMember(member3);
        
        SetOfBooks sob = new SetOfBooks();
        
        sob.addBook(book1);
        sob.addBook(book2);
        sob.addBook(book3);
        
        book1.setBorrower(member1);   
        book2.setBorrower(member1);
        
        member1.setCurrentLoans(sob);
        
        try {
            parser.writeObject(sob.TABLE_PATH, sob);
        } catch (IOException ex) {
            Logger.getLogger(LMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            parser.writeObject(som.TABLE_PATH, som);
        } catch (IOException ex) {
            Logger.getLogger(LMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        (new MainGUI()).setVisible(true);        
    }

}
