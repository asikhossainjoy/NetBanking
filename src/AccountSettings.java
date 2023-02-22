
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class AccountSettings extends javax.swing.JFrame {

    /**
     * Creates new form AccountSettings
     */
    String accountNumber;
    public AccountSettings(String accountNumber) {
        this.accountNumber=accountNumber;
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

        accountSettingsPanel = new javax.swing.JPanel();
        accountSettingsPanel2 = new javax.swing.JPanel();
        skyBankLabel = new javax.swing.JLabel();
        bangladeshNoOneOnlineBankLabel = new javax.swing.JLabel();
        ExitBtnPanel = new javax.swing.JPanel();
        ExitBtnLabel = new javax.swing.JLabel();
        EditAccountDetailsBtnPanel = new javax.swing.JPanel();
        EditAccountDetailsLabel = new javax.swing.JLabel();
        DeleteAccountBtnPanel = new javax.swing.JPanel();
        DeleteAccountBtnLabel = new javax.swing.JLabel();
        ChangePasswordBtnPanel = new javax.swing.JPanel();
        ChangePasswordLabel = new javax.swing.JLabel();
        accountSettingsLabel = new javax.swing.JLabel();
        closeBtnLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        accountSettingsPanel.setBackground(new java.awt.Color(255, 255, 255));
        accountSettingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountSettingsPanel2.setBackground(new java.awt.Color(0, 51, 255));
        accountSettingsPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        skyBankLabel.setBackground(new java.awt.Color(0, 0, 0));
        skyBankLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        skyBankLabel.setForeground(new java.awt.Color(255, 255, 255));
        skyBankLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skyBankLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/banklogo-sm.png"))); // NOI18N
        skyBankLabel.setText("   SKY BANK");
        skyBankLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        accountSettingsPanel2.add(skyBankLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1090, -1));

        bangladeshNoOneOnlineBankLabel.setBackground(new java.awt.Color(0, 0, 0));
        bangladeshNoOneOnlineBankLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        bangladeshNoOneOnlineBankLabel.setForeground(new java.awt.Color(255, 255, 255));
        bangladeshNoOneOnlineBankLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bangladeshNoOneOnlineBankLabel.setText("Bangladesh's No One Online Bank");
        accountSettingsPanel2.add(bangladeshNoOneOnlineBankLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 228, -1));

        ExitBtnPanel.setBackground(new java.awt.Color(0, 0, 255));
        ExitBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitBtnPanelMouseExited(evt);
            }
        });

        ExitBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        ExitBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        ExitBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-close-icon.png"))); // NOI18N
        ExitBtnLabel.setText("  Exit");

        javax.swing.GroupLayout ExitBtnPanelLayout = new javax.swing.GroupLayout(ExitBtnPanel);
        ExitBtnPanel.setLayout(ExitBtnPanelLayout);
        ExitBtnPanelLayout.setHorizontalGroup(
            ExitBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        ExitBtnPanelLayout.setVerticalGroup(
            ExitBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExitBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        accountSettingsPanel2.add(ExitBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 1120, -1));

        EditAccountDetailsBtnPanel.setBackground(new java.awt.Color(0, 0, 255));
        EditAccountDetailsBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditAccountDetailsBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditAccountDetailsBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditAccountDetailsBtnPanelMouseExited(evt);
            }
        });

        EditAccountDetailsLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        EditAccountDetailsLabel.setForeground(new java.awt.Color(255, 255, 255));
        EditAccountDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditAccountDetailsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-user-icon.png"))); // NOI18N
        EditAccountDetailsLabel.setText(" Edit Account Details ");

        javax.swing.GroupLayout EditAccountDetailsBtnPanelLayout = new javax.swing.GroupLayout(EditAccountDetailsBtnPanel);
        EditAccountDetailsBtnPanel.setLayout(EditAccountDetailsBtnPanelLayout);
        EditAccountDetailsBtnPanelLayout.setHorizontalGroup(
            EditAccountDetailsBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EditAccountDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        EditAccountDetailsBtnPanelLayout.setVerticalGroup(
            EditAccountDetailsBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditAccountDetailsBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditAccountDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        accountSettingsPanel2.add(EditAccountDetailsBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1120, -1));

        DeleteAccountBtnPanel.setBackground(new java.awt.Color(0, 0, 255));
        DeleteAccountBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteAccountBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteAccountBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteAccountBtnPanelMouseExited(evt);
            }
        });

        DeleteAccountBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        DeleteAccountBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        DeleteAccountBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteAccountBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-search-person.png"))); // NOI18N
        DeleteAccountBtnLabel.setText(" Delete Account");

        javax.swing.GroupLayout DeleteAccountBtnPanelLayout = new javax.swing.GroupLayout(DeleteAccountBtnPanel);
        DeleteAccountBtnPanel.setLayout(DeleteAccountBtnPanelLayout);
        DeleteAccountBtnPanelLayout.setHorizontalGroup(
            DeleteAccountBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeleteAccountBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        DeleteAccountBtnPanelLayout.setVerticalGroup(
            DeleteAccountBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteAccountBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteAccountBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        accountSettingsPanel2.add(DeleteAccountBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1120, -1));

        ChangePasswordBtnPanel.setBackground(new java.awt.Color(0, 0, 255));
        ChangePasswordBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePasswordBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChangePasswordBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChangePasswordBtnPanelMouseExited(evt);
            }
        });

        ChangePasswordLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        ChangePasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        ChangePasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChangePasswordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-forgetpass.png"))); // NOI18N
        ChangePasswordLabel.setText(" Change Password");

        javax.swing.GroupLayout ChangePasswordBtnPanelLayout = new javax.swing.GroupLayout(ChangePasswordBtnPanel);
        ChangePasswordBtnPanel.setLayout(ChangePasswordBtnPanelLayout);
        ChangePasswordBtnPanelLayout.setHorizontalGroup(
            ChangePasswordBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChangePasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        ChangePasswordBtnPanelLayout.setVerticalGroup(
            ChangePasswordBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChangePasswordBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChangePasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        accountSettingsPanel2.add(ChangePasswordBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        accountSettingsPanel.add(accountSettingsPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, -1, 557));

        accountSettingsLabel.setBackground(new java.awt.Color(0, 0, 0));
        accountSettingsLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 36)); // NOI18N
        accountSettingsLabel.setForeground(new java.awt.Color(0, 51, 255));
        accountSettingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountSettingsLabel.setText("ACCOUNT SETTINGS");
        accountSettingsPanel.add(accountSettingsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 18, 1057, -1));

        closeBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabelMouseClicked(evt);
            }
        });
        accountSettingsPanel.add(closeBtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnPanelMouseClicked
        Profile P;
        try {
            P = new Profile(accountNumber);
            setVisible(false);
            P.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AccountSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ExitBtnPanelMouseClicked

    private void ExitBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnPanelMouseEntered
        JPanel btn= ExitBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_ExitBtnPanelMouseEntered

    private void ExitBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnPanelMouseExited
        JPanel btn= ExitBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_ExitBtnPanelMouseExited

    private void EditAccountDetailsBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAccountDetailsBtnPanelMouseClicked
        Edit E;
        try {
            E = new Edit(accountNumber);
            setVisible(false);
            E.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AccountSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_EditAccountDetailsBtnPanelMouseClicked

    private void EditAccountDetailsBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAccountDetailsBtnPanelMouseEntered
        JPanel btn= EditAccountDetailsBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_EditAccountDetailsBtnPanelMouseEntered

    private void EditAccountDetailsBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAccountDetailsBtnPanelMouseExited
        JPanel btn= EditAccountDetailsBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_EditAccountDetailsBtnPanelMouseExited

    private void DeleteAccountBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccountBtnPanelMouseClicked
        Delete D;
        try {
            D = new Delete(accountNumber);
            setVisible(false);
            D.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AccountSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_DeleteAccountBtnPanelMouseClicked

    private void DeleteAccountBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccountBtnPanelMouseEntered
        JPanel btn= DeleteAccountBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_DeleteAccountBtnPanelMouseEntered

    private void DeleteAccountBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccountBtnPanelMouseExited
        JPanel btn= DeleteAccountBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_DeleteAccountBtnPanelMouseExited

    private void ChangePasswordBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordBtnPanelMouseClicked
        ChangePassword CP;
        try {
            CP = new ChangePassword(accountNumber);
            setVisible(false);
            CP.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AccountSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ChangePasswordBtnPanelMouseClicked

    private void ChangePasswordBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordBtnPanelMouseEntered
        JPanel btn= ChangePasswordBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_ChangePasswordBtnPanelMouseEntered

    private void ChangePasswordBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordBtnPanelMouseExited
        JPanel btn= ChangePasswordBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_ChangePasswordBtnPanelMouseExited

    private void closeBtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnLabelMouseClicked
    void isEntered(JPanel btn)
    {
        btn.setBackground(new Color(0,0,204));
    }
    
    void isExited(JPanel btn)
    {
        btn.setBackground(new Color(0,0,255));
    }
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
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountSettings("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChangePasswordBtnPanel;
    private javax.swing.JLabel ChangePasswordLabel;
    private javax.swing.JLabel DeleteAccountBtnLabel;
    private javax.swing.JPanel DeleteAccountBtnPanel;
    private javax.swing.JPanel EditAccountDetailsBtnPanel;
    private javax.swing.JLabel EditAccountDetailsLabel;
    private javax.swing.JLabel ExitBtnLabel;
    private javax.swing.JPanel ExitBtnPanel;
    private javax.swing.JLabel accountSettingsLabel;
    private javax.swing.JPanel accountSettingsPanel;
    private javax.swing.JPanel accountSettingsPanel2;
    private javax.swing.JLabel bangladeshNoOneOnlineBankLabel;
    private javax.swing.JLabel closeBtnLabel;
    private javax.swing.JLabel skyBankLabel;
    // End of variables declaration//GEN-END:variables
}
