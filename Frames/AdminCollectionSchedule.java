/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.CollectionSchedule;
import Classes.StoreAdmin;
import javax.swing.JOptionPane;

/**
 *
 * @author Thanushan Sasith Lakshan
 */
public class AdminCollectionSchedule extends javax.swing.JFrame {

    /**
     * Creates new form AdminCollectionSchedule
     */
    public AdminCollectionSchedule() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtpid = new javax.swing.JTextField();
        txtquan = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
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

        jLabel1.setText("Collection Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel2.setText("Collection Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jLabel4.setText("Telephone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel5.setText("Product Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel6.setText("Quantity");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 60, -1));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 210, -1));
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 210, -1));
        getContentPane().add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 210, -1));
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 210, -1));
        getContentPane().add(txtpid, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 210, -1));
        getContentPane().add(txtquan, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 210, -1));

        btnadd.setText("Add to Schedule");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 170, -1));

        background.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/collectionschedule.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashboardActionPerformed
        AdminPage admin = new AdminPage();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btndashboardActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       String cid = txtid.getText();
       String date = txtdate.getText();
       String add = txtadd.getText();
       String tel = txttel.getText();
       String pid = txtpid.getText();
       int quan = Integer.parseInt(txtquan.getText());
       
        CollectionSchedule c1 = new CollectionSchedule(cid, date, add, tel, pid, quan);
        StoreAdmin a1 = new StoreAdmin();
        if(a1.addCollectionSchedule(c1)){
            JOptionPane.showMessageDialog(this, "Succesfully added", "Collection schedule status", 1);
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
            java.util.logging.Logger.getLogger(AdminCollectionSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCollectionSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCollectionSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCollectionSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCollectionSchedule().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpid;
    private javax.swing.JTextField txtquan;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
