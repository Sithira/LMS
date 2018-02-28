/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Books;

import Core.ObjectParser;
import Models.Book;
import Models.SetOfBooks;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sithira
 */
public class BooksGUI extends javax.swing.JFrame {

    private ObjectParser parser = ObjectParser.getInstance();
    
    /**
     * Creates new form BooksGUI
     */
    public BooksGUI() {
        
        initComponents();
        
        try {
            loadDataToTable();
        } catch (IOException ex) {
            Logger.getLogger(BooksGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BooksGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search_group = new javax.swing.ButtonGroup();
        main_jpanel = new javax.swing.JPanel();
        books_scroll_panel = new javax.swing.JScrollPane();
        books_table = new javax.swing.JTable();
        author_search_label = new javax.swing.JLabel();
        author_search = new javax.swing.JTextField();
        set_author_search = new javax.swing.JRadioButton();
        set_isbn_search = new javax.swing.JRadioButton();
        set_search_acc = new javax.swing.JRadioButton();
        search_button = new javax.swing.JButton();
        search_frame_heading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        books_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        books_scroll_panel.setViewportView(books_table);

        author_search_label.setText("Search");

        set_author_search.setText("Search from Author Name");

        set_isbn_search.setText("Search from ISBN");

        set_search_acc.setText("Search from ACC");

        search_button.setText("Search now");

        search_frame_heading.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        search_frame_heading.setText("All Books in LMS");

        javax.swing.GroupLayout main_jpanelLayout = new javax.swing.GroupLayout(main_jpanel);
        main_jpanel.setLayout(main_jpanelLayout);
        main_jpanelLayout.setHorizontalGroup(
            main_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_jpanelLayout.createSequentialGroup()
                .addGroup(main_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(main_jpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(author_search_label)
                        .addGap(4, 4, 4)
                        .addComponent(author_search))
                    .addGroup(main_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main_jpanelLayout.createSequentialGroup()
                            .addComponent(set_author_search)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(set_search_acc))
                        .addComponent(set_isbn_search)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(main_jpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(books_scroll_panel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_jpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search_frame_heading)
                .addGap(212, 212, 212))
        );
        main_jpanelLayout.setVerticalGroup(
            main_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_jpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search_frame_heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(main_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_jpanelLayout.createSequentialGroup()
                        .addGroup(main_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(author_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(author_search_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(main_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(set_author_search)
                            .addComponent(set_search_acc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(set_isbn_search))
                    .addComponent(search_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(books_scroll_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BooksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BooksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BooksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BooksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BooksGUI().setVisible(true);
            }
        });
    }
    
    private void loadDataToTable() throws IOException,
            FileNotFoundException,
            ClassNotFoundException
    {
        
        String columnNames[] = {"ISBN", "Title", "Auther", "accessionNumber", "Member Name", "onLoan ?"};
        
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        
        SetOfBooks sop = new SetOfBooks();
        
        Object sopo = parser.readObject(sop.TABLE_PATH);
        
        final SetOfBooks soped = (SetOfBooks) sopo;
        
        books_table.setModel(tableModel);
    
        books_table.setCellSelectionEnabled(false);
        
        for (Book book : soped.getBooks())
        {
            
            String member_name = "N/A";
            
            if (book.getBorrower() != null)
            {
                member_name = book.getBorrower().getName();
            }
            
            Object row[] = {
                book.getISBNNumber(),
                book.getTitle(),
                book.getAuthor(),
                book.getAccessionNumber() == -999 ? "N/A" : book.getAccessionNumber(),
                member_name,
                book.isOnLoan() ? "YES" : "NO"
            };
            
            tableModel.addRow(row);
        }
        
        books_table.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    int row = books_table.rowAtPoint(evt.getPoint());
                    int col = books_table.columnAtPoint(evt.getPoint());
                    if (row >= 0 && col >= 0) {
                        
                        String ISBN = books_table
                                .getValueAt(row, 0)
                                .toString();
                        
                        SetOfBooks setOfBooks = soped.findBookFromISBN(ISBN);

                        boolean opened = false;

                        for (Book book : setOfBooks.getBooks())
                        {                                       
                            (new UpdateBookGUI(book, soped)).setVisible(true);

                            opened = true;
                        }

                        if (opened)
                        {
                            dispose();
                        }

                    }
                }
            });
              
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author_search;
    private javax.swing.JLabel author_search_label;
    private javax.swing.JScrollPane books_scroll_panel;
    private javax.swing.JTable books_table;
    private javax.swing.JPanel main_jpanel;
    private javax.swing.JButton search_button;
    private javax.swing.JLabel search_frame_heading;
    private javax.swing.ButtonGroup search_group;
    private javax.swing.JRadioButton set_author_search;
    private javax.swing.JRadioButton set_isbn_search;
    private javax.swing.JRadioButton set_search_acc;
    // End of variables declaration//GEN-END:variables
}
