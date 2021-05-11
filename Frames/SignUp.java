/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.Customer;

/**
 *
 * @author Thanushan Sasith Lakshan
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        msg = new javax.swing.JOptionPane();
        txtname = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtus = new javax.swing.JTextField();
        txtps = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        btnsignupdone = new javax.swing.JButton();
        btnbacktologin = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtname.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtname.setOpaque(false);
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 230, -1));

        txttel.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txttel.setOpaque(false);
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 230, -1));

        txtus.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtus.setOpaque(false);
        getContentPane().add(txtus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 230, -1));

        txtps.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtps.setOpaque(false);
        getContentPane().add(txtps, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 230, -1));

        txtadd.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtadd.setOpaque(false);
        getContentPane().add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 230, -1));

        btnsignupdone.setBorderPainted(false);
        btnsignupdone.setContentAreaFilled(false);
        btnsignupdone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupdoneActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignupdone, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 120, 30));

        btnbacktologin.setBorderPainted(false);
        btnbacktologin.setContentAreaFilled(false);
        btnbacktologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbacktologinActionPerformed(evt);
            }
        });
        getContentPane().add(btnbacktologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 130, 40));

        background.setBackground(java.awt.SystemColor.controlShadow);
        background.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 12)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signup2.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbacktologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbacktologinActionPerformed
        Loginframe login = new Loginframe();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbacktologinActionPerformed

    private void btnsignupdoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupdoneActionPerformed
       String name = txtname.getText();
       String address = txtadd.getText();
       String telephone = txttel.getText();
       String username = txtus.getText();
       String password = txtps.getText();
       
       if(name.equalsIgnoreCase("")||address.equalsIgnoreCase("")||telephone.equalsIgnoreCase("")||
           username.equalsIgnoreCase("")|| password.equalsIgnoreCase("")){
             msg.showMessageDialog(this, "fill all the blanks", "sign up status", 0);
       }else{
           Customer cus = new Customer();
           Customer cust = new Customer(name,address,telephone,username,password);
           if(cus.addCustomer(cust)){
               msg.showMessageDialog(this, "Succesfully added", "sign up status", 1);
           }
       }
    }//GEN-LAST:event_btnsignupdoneActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnbacktologin;
    private javax.swing.JButton btnsignupdone;
    private javax.swing.JOptionPane msg;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtps;
    private javax.swing.JTextField txttel;
    private javax.swing.JTextField txtus;
    // End of variables declaration//GEN-END:variables
}