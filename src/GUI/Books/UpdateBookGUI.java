/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Books;

import Core.LMSAlert;
import Core.ObjectParser;
import Models.Book;
import Models.SetOfBooks;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author sithira
 */
public class UpdateBookGUI extends javax.swing.JFrame {

    private Book book;
    
    private ObjectParser parser;
    
    /**
     * Creates new form UpdateBook
     */
    public UpdateBookGUI() {
        initComponents();
    }
    
    public UpdateBookGUI(Book b)
    {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        parser = ObjectParser.getInstance();
        
        book = b;
        
        book_name.setText(book.getTitle());
        
        book_isbn.setText(book.getISBNNumber());
        
        String mem_name = "N/A";
        
        String auth_name = "N/A";
        
        if (book.getAuthor() != null)
        {
            auth_name = book.getAuthor();
        }
        
        book_author.setText(auth_name);
        
        if (book.getBorrower() != null)
        {
            mem_name = book.getBorrower().getName();
        }
        
        member_name.setText(mem_name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        book_edit_label = new javax.swing.JLabel();
        book_name_label = new javax.swing.JLabel();
        book_name = new javax.swing.JLabel();
        isbn_label = new javax.swing.JLabel();
        book_isbn = new javax.swing.JLabel();
        author_label = new javax.swing.JLabel();
        book_author = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        member_label = new javax.swing.JLabel();
        member_name = new javax.swing.JLabel();
        close_button = new javax.swing.JButton();
        remove_book = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        book_edit_label.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        book_edit_label.setText(" BOOK VIEW");

        book_name_label.setText("Book name :");

        book_name.setText("Book Name");

        isbn_label.setText("Book ISBN :");

        book_isbn.setText("Book ISBN");

        author_label.setText("Book Author : ");

        book_author.setText("Book Author");

        jLabel1.setText("Book Accession :");

        jLabel2.setText("Book Accession");

        member_label.setText("Borrowed Member :");

        member_name.setText("Member Name");

        close_button.setText("Close");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });

        remove_book.setText("Remove Book");
        remove_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_bookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(book_name_label)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(isbn_label)
                                    .addComponent(author_label)
                                    .addComponent(jLabel1)
                                    .addComponent(member_label))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(member_name)
                                    .addComponent(jLabel2)
                                    .addComponent(book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(book_isbn)
                                    .addComponent(book_author))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(close_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(remove_book)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(book_edit_label, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(book_edit_label)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book_name_label)
                    .addComponent(book_name))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book_isbn)
                    .addComponent(isbn_label))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(author_label)
                    .addComponent(book_author))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(member_label)
                    .addComponent(member_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close_button)
                    .addComponent(remove_book))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_close_buttonActionPerformed

    private void remove_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_bookActionPerformed
        
//        if (book.isOnLoan())
//        {
//            LMSAlert.showDialog("This book is on a loan. You Cant Delete it.");
//        }
//        else
//        {
            try {
                
                SetOfBooks sop = (SetOfBooks) parser.readObject(SetOfBooks.TABLE_PATH);
                
                sop.removeBook(book);
                
                //LMSAlert.showDialog("Book has been removed from the LMS");
                
                parser.writeObject(sop.TABLE_PATH, sop);
                
                setVisible(false);
                
                dispose();
                
                (new BooksGUI()).setVisible(true);
                
            } catch (IOException ex) {
                Logger.getLogger(UpdateBookGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UpdateBookGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        //}
        
    }//GEN-LAST:event_remove_bookActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBookGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author_label;
    private javax.swing.JLabel book_author;
    private javax.swing.JLabel book_edit_label;
    private javax.swing.JLabel book_isbn;
    private javax.swing.JLabel book_name;
    private javax.swing.JLabel book_name_label;
    private javax.swing.JButton close_button;
    private javax.swing.JLabel isbn_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel member_label;
    private javax.swing.JLabel member_name;
    private javax.swing.JButton remove_book;
    // End of variables declaration//GEN-END:variables
}