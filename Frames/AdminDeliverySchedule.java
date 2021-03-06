/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.DeliverySchedule;
import Classes.Order;
import Classes.OrderItem;
import Classes.StoreAdmin;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanushan Sasith Lakshan
 */
public class AdminDeliverySchedule extends javax.swing.JFrame {

    /**
     * Creates new form AdminDeliverySchedule
     */
    public AdminDeliverySchedule() {
        initComponents();
        fillTable();
        Table1();
    }
     public final void fillTable(){          
        try {
            FileInputStream fin = new FileInputStream ("order.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            ArrayList<Order> productlist = new ArrayList<>();
            productlist = (ArrayList<Order>) ois.readObject();
            DefaultTableModel model = (DefaultTableModel)tblorder.getModel();
            Object rowData[] = new Object[6];
            for(int i = 0; i < productlist.size(); i++){
                rowData[0] = productlist.get(i).getOrderid();
                rowData[1] = productlist.get(i).getDate();
                rowData[2] = productlist.get(i).getTotal();
                rowData[3] = productlist.get(i).getAddress();
                rowData[4] = productlist.get(i).getTelephone();
                rowData[5] = productlist.get(i).getUsername();
                model.addRow(rowData);
            }
        } catch (FileNotFoundException ex) {
            
        } catch (IOException | ClassNotFoundException ex) {
            
        } 
    }
     
          public final void Table1(){          
        try {
            FileInputStream fin = new FileInputStream ("orderitem.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            ArrayList<OrderItem> productlist1 = new ArrayList<>();
            productlist1 = (ArrayList<OrderItem>) ois.readObject();
            DefaultTableModel model = (DefaultTableModel)tblitem.getModel();
            Object rowData[] = new Object[3];
            for(int i = 0; i < productlist1.size(); i++){
                rowData[0] = productlist1.get(i).getOrderNo();
                rowData[1] = productlist1.get(i).getItem();
                rowData[2] = productlist1.get(i).getQuantity();
                
                
                model.addRow(rowData);
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

        btndashboard = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblorder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtoid = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblitem = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndashboard.setBorderPainted(false);
        btndashboard.setContentAreaFilled(false);
        btndashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndashboardActionPerformed(evt);
            }
        });
        getContentPane().add(btndashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, 50));

        tblorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Date", "Total", "Address", "Telephone", "Customer"
            }
        ));
        jScrollPane2.setViewportView(tblorder);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 640, 160));

        jLabel1.setText("Delivery ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, -1, -1));

        jLabel2.setText("Delivery Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, -1, -1));

        jLabel3.setText("Order Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, -1, -1));
        getContentPane().add(txtoid, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 230, -1));
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 230, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 230, -1));

        btnadd.setText("Add to schedule");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 610, -1, -1));

        tblitem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Product Name", "Quantity"
            }
        ));
        jScrollPane3.setViewportView(tblitem);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 640, 180));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deliveryshedule.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashboardActionPerformed
        AdminPage admin = new AdminPage();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btndashboardActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String did = txtid.getText();
        String date = txtdate.getText();
        String oid = txtoid.getText();
        
        DeliverySchedule d1 = new DeliverySchedule(did, date, oid);
        StoreAdmin sa = new StoreAdmin();
        if(sa.addDeliverySchedule(d1)){
            JOptionPane.showMessageDialog(this,"succesfully added", "Delivery schedule status", 1);
        }
        
    }//GEN-LAST:event_btnaddActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDeliverySchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDeliverySchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDeliverySchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDeliverySchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDeliverySchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblitem;
    private javax.swing.JTable tblorder;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtoid;
    // End of variables declaration//GEN-END:variables
}
