/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class createAccount5 extends javax.swing.JFrame {

    /**
     * Creates new form createAccount5
     */
    public createAccount5() {
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

        createYourAccountButton = new javax.swing.JButton();
        createAccount5Panel = new javax.swing.JPanel();
        enjoyYourEBankingWithSkyBankLabel = new javax.swing.JLabel();
        accountCreatedSucessfullyLabel = new javax.swing.JLabel();
        goToLoginButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        closeBtnLabel = new javax.swing.JLabel();

        createYourAccountButton.setBackground(new java.awt.Color(0, 51, 102));
        createYourAccountButton.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        createYourAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        createYourAccountButton.setText("Create Your Account");
        createYourAccountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createYourAccountButton.setMaximumSize(new java.awt.Dimension(120, 40));
        createYourAccountButton.setMinimumSize(new java.awt.Dimension(120, 40));
        createYourAccountButton.setPreferredSize(new java.awt.Dimension(120, 40));
        createYourAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createYourAccountButtonMouseClicked(evt);
            }
        });
        createYourAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createYourAccountButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createAccount5Panel.setBackground(new java.awt.Color(0, 51, 255));
        createAccount5Panel.setPreferredSize(new java.awt.Dimension(1120, 630));
        createAccount5Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enjoyYourEBankingWithSkyBankLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        enjoyYourEBankingWithSkyBankLabel.setForeground(new java.awt.Color(255, 255, 255));
        enjoyYourEBankingWithSkyBankLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enjoyYourEBankingWithSkyBankLabel.setText("Enjoy Your EBanking With Sky Bank");
        createAccount5Panel.add(enjoyYourEBankingWithSkyBankLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 359, 1096, -1));

        accountCreatedSucessfullyLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        accountCreatedSucessfullyLabel.setForeground(new java.awt.Color(255, 255, 255));
        accountCreatedSucessfullyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountCreatedSucessfullyLabel.setText("Account Created Sucessfully !!!");
        createAccount5Panel.add(accountCreatedSucessfullyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 285, 1096, -1));

        goToLoginButton.setBackground(new java.awt.Color(0, 51, 102));
        goToLoginButton.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        goToLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        goToLoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/goback.png"))); // NOI18N
        goToLoginButton.setText(" Go To Login");
        goToLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToLoginButton.setMaximumSize(new java.awt.Dimension(120, 40));
        goToLoginButton.setMinimumSize(new java.awt.Dimension(120, 40));
        goToLoginButton.setPreferredSize(new java.awt.Dimension(120, 40));
        goToLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToLoginButtonMouseClicked(evt);
            }
        });
        goToLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToLoginButtonActionPerformed(evt);
            }
        });
        createAccount5Panel.add(goToLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 469, 469, -1));

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/check-ok.png"))); // NOI18N
        createAccount5Panel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 67, 1096, -1));

        closeBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabelMouseClicked(evt);
            }
        });
        createAccount5Panel.add(closeBtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccount5Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccount5Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createYourAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createYourAccountButtonMouseClicked
        createAccount5 AC5= new createAccount5();
        setVisible(false);
        AC5.setVisible(true);
        dispose();
    }//GEN-LAST:event_createYourAccountButtonMouseClicked

    private void createYourAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createYourAccountButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createYourAccountButtonActionPerformed

    private void goToLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToLoginButtonMouseClicked
        Login L= new Login();
        setVisible(false);
        L.setVisible(true);
        dispose();
    }//GEN-LAST:event_goToLoginButtonMouseClicked

    private void goToLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToLoginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goToLoginButtonActionPerformed

    private void closeBtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnLabelMouseClicked

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
            java.util.logging.Logger.getLogger(createAccount5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createAccount5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createAccount5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createAccount5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createAccount5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountCreatedSucessfullyLabel;
    private javax.swing.JLabel closeBtnLabel;
    private javax.swing.JPanel createAccount5Panel;
    private javax.swing.JButton createYourAccountButton;
    private javax.swing.JLabel enjoyYourEBankingWithSkyBankLabel;
    private javax.swing.JButton goToLoginButton;
    private javax.swing.JLabel logoLabel;
    // End of variables declaration//GEN-END:variables
}
