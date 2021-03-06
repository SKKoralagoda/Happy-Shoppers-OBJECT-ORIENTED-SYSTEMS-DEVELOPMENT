/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.Product;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanushan Sasith Lakshan
 */
public class CategorySearch extends javax.swing.JFrame {

    /**
     * Creates new form CategorySearch
     */
    String cat;
    
    public CategorySearch() {
        initComponents();
    }
     public CategorySearch(String cat) {
        initComponents();
        this.cat = cat;
         fill();
    }
      public final void fill(){          
        try {
            FileInputStream fin = new FileInputStream ("product.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            ArrayList<Product> productlist = new ArrayList<>();
            productlist = (ArrayList<Product>) ois.readObject();
            DefaultTableModel model = (DefaultTableModel) tblproduct.getModel();
            Object rowData[] = new Object[6];
            for(int i = 0; i < productlist.size(); i++){
                if(cat.equals(productlist.get(i).category)){
                rowData[0] = productlist.get(i).category;
                rowData[1] = productlist.get(i).productName;
                rowData[2] = productlist.get(i).productId;
                rowData[3] = productlist.get(i).quantity;
                rowData[4] = productlist.get(i).location;
                rowData[5] = productlist.get(i).price;
                model.addRow(rowData);
                }
            }
        } catch (FileNotFoundException ex) {
            
        } catch (IOException | ClassNotFoundException ex) {
            
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

        comboCat = new javax.swing.JComboBox<>();
        lbl2 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnlodecomplain = new javax.swing.JButton();
        btninqiure = new javax.swing.JButton();
        btnaboutus = new javax.swing.JButton();
        btnsignout = new javax.swing.JButton();
        btncategory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproduct = new javax.swing.JTable();
        btnhome = new javax.swing.JButton();
        btnback1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboCat.setBackground(java.awt.SystemColor.controlDkShadow);
        comboCat.setEditable(true);
        comboCat.setForeground(java.awt.SystemColor.controlDkShadow);
        comboCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vegetable", "Meat", "Milk", "Fruit", "Bakery", "Bevarages" }));
        comboCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCatActionPerformed(evt);
            }
        });
        getContentPane().add(comboCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 220, -1));

        lbl2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(214, 214, 214));
        lbl2.setText("Category type");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 110, 30));

        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchbtn.JPG"))); // NOI18N
        btnsearch.setBorderPainted(false);
        btnsearch.setContentAreaFilled(false);
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, 100, 20));

        btnback.setBackground(java.awt.SystemColor.controlHighlight);
        btnback.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(235, 235, 235));
        btnback.setText("Back");
        btnback.setBorderPainted(false);
        btnback.setContentAreaFilled(false);
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 300, -1, -1));

        btnlodecomplain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/locsmall.jpg"))); // NOI18N
        btnlodecomplain.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnlodecomplain.setContentAreaFilled(false);
        btnlodecomplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlodecomplainActionPerformed(evt);
            }
        });
        getContentPane().add(btnlodecomplain, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 140, 10));

        btninqiure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inqui.jpg"))); // NOI18N
        btninqiure.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btninqiure.setContentAreaFilled(false);
        btninqiure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninqiureActionPerformed(evt);
            }
        });
        getContentPane().add(btninqiure, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 70, 10));

        btnaboutus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aboutus.jpg"))); // NOI18N
        btnaboutus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnaboutus.setContentAreaFilled(false);
        btnaboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaboutusActionPerformed(evt);
            }
        });
        getContentPane().add(btnaboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 70, 10));

        btnsignout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/singnout.jpg"))); // NOI18N
        btnsignout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnsignout.setContentAreaFilled(false);
        btnsignout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 60, 10));

        btncategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/catesmall.jpg"))); // NOI18N
        btncategory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btncategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btncategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 80, 10));

        tblproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Name", "ID", "Quantity", "Location", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblproduct);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 770, 260));

        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home3.JPG"))); // NOI18N
        btnhome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnhome.setContentAreaFilled(false);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 70, -1));

        btnback1.setBackground(java.awt.SystemColor.controlHighlight);
        btnback1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        btnback1.setText("Back");
        btnback1.setBorderPainted(false);
        btnback1.setContentAreaFilled(false);
        btnback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnback1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnback1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 700, 70, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customerCategoryNew.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        CustomerPage cus = new CustomerPage();
        cus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void comboCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCatActionPerformed

    private void btnlodecomplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlodecomplainActionPerformed
        CustomerComplains com = new CustomerComplains();
        com.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlodecomplainActionPerformed

    private void btninqiureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninqiureActionPerformed
        CustomerInquire inquire = new CustomerInquire();
        inquire.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btninqiureActionPerformed

    private void btnaboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaboutusActionPerformed
        CustomerAboutUs aboutus = new CustomerAboutUs();
        aboutus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnaboutusActionPerformed

    private void btnsignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignoutActionPerformed
        MainFrame main = new MainFrame();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsignoutActionPerformed

    private void btncategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoryActionPerformed
        CategorySearch cate = new CategorySearch();
        cate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncategoryActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        String category = String.valueOf(comboCat.getSelectedItem());
        CategorySearch catee = new CategorySearch(category);
        catee.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        CustomerPage cus = new CustomerPage();
        cus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnback1ActionPerformed
        CustomerPage cus = new CustomerPage();
        cus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnback1ActionPerformed

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
            java.util.logging.Logger.getLogger(CategorySearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategorySearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategorySearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategorySearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategorySearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnaboutus;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnback1;
    private javax.swing.JButton btncategory;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btninqiure;
    private javax.swing.JButton btnlodecomplain;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsignout;
    private javax.swing.JComboBox<String> comboCat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JTable tblproduct;
    // End of variables declaration//GEN-END:variables
}
