/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Password4 extends javax.swing.JFrame {

    /**
     * Creates new form Password4
     */
    public Password4() {
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

        password4Panel = new javax.swing.JPanel();
        enjoyYourEBankingWithSkyBankLabel = new javax.swing.JLabel();
        passwordChangedSucessfullyLabel = new javax.swing.JLabel();
        goToLoginButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        closeBtnLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        password4Panel.setBackground(new java.awt.Color(0, 51, 255));

        enjoyYourEBankingWithSkyBankLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        enjoyYourEBankingWithSkyBankLabel.setForeground(new java.awt.Color(255, 255, 255));
        enjoyYourEBankingWithSkyBankLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enjoyYourEBankingWithSkyBankLabel.setText("Enjoy Your EBanking With Sky Bank");

        passwordChangedSucessfullyLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        passwordChangedSucessfullyLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordChangedSucessfullyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordChangedSucessfullyLabel.setText("Password Changed Sucessfully !!!");

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

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/check-ok.png"))); // NOI18N

        closeBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout password4PanelLayout = new javax.swing.GroupLayout(password4Panel);
        password4Panel.setLayout(password4PanelLayout);
        password4PanelLayout.setHorizontalGroup(
            password4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(password4PanelLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(goToLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, password4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(password4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enjoyYourEBankingWithSkyBankLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordChangedSucessfullyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
                    .addComponent(logoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, password4PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeBtnLabel)))
                .addContainerGap())
        );
        password4PanelLayout.setVerticalGroup(
            password4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(password4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeBtnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addComponent(passwordChangedSucessfullyLabel)
                .addGap(18, 18, 18)
                .addComponent(enjoyYourEBankingWithSkyBankLabel)
                .addGap(82, 82, 82)
                .addComponent(goToLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(password4Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(password4Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Password4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeBtnLabel;
    private javax.swing.JLabel enjoyYourEBankingWithSkyBankLabel;
    private javax.swing.JButton goToLoginButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel password4Panel;
    private javax.swing.JLabel passwordChangedSucessfullyLabel;
    // End of variables declaration//GEN-END:variables
}
