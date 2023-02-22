
import java.awt.Color;
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
public class Admin8 extends javax.swing.JFrame {

    /**
     * Creates new form Admin8
     */
    public Admin8() {
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

        profileBtnLabel6 = new javax.swing.JLabel();
        admin8Panel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        searchBtnPanel = new javax.swing.JPanel();
        searchBtnLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        profileBtnPanel = new javax.swing.JPanel();
        profileBtnLabel = new javax.swing.JLabel();
        exitBtnPanel = new javax.swing.JPanel();
        exitBtnLabel = new javax.swing.JLabel();
        admin8_2Panel = new javax.swing.JPanel();
        enterAccountNumberLabel = new javax.swing.JLabel();
        enterAccountNumberTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        headingLabel2 = new javax.swing.JLabel();
        subheadingLabel2 = new javax.swing.JLabel();
        headingLabel = new javax.swing.JLabel();
        subheadingLabel = new javax.swing.JLabel();
        closeBtnLabel = new javax.swing.JLabel();

        profileBtnLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        profileBtnLabel6.setForeground(new java.awt.Color(255, 255, 255));
        profileBtnLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileBtnLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-close-icon.png"))); // NOI18N
        profileBtnLabel6.setText("Activate / Deactivate Account");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        admin8Panel.setBackground(new java.awt.Color(255, 255, 255));
        admin8Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBarPanel.setBackground(new java.awt.Color(102, 0, 153));

        searchBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        searchBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBtnPanelMouseExited(evt);
            }
        });

        searchBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        searchBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-search-person.png"))); // NOI18N
        searchBtnLabel.setText(" Search");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-indicate.png"))); // NOI18N

        javax.swing.GroupLayout searchBtnPanelLayout = new javax.swing.GroupLayout(searchBtnPanel);
        searchBtnPanel.setLayout(searchBtnPanelLayout);
        searchBtnPanelLayout.setHorizontalGroup(
            searchBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBtnPanelLayout.createSequentialGroup()
                .addComponent(searchBtnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        searchBtnPanelLayout.setVerticalGroup(
            searchBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        profileBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        profileBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileBtnPanelMouseExited(evt);
            }
        });

        profileBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        profileBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-user-icon.png"))); // NOI18N
        profileBtnLabel.setText("Profile");

        javax.swing.GroupLayout profileBtnPanelLayout = new javax.swing.GroupLayout(profileBtnPanel);
        profileBtnPanel.setLayout(profileBtnPanelLayout);
        profileBtnPanelLayout.setHorizontalGroup(
            profileBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileBtnPanelLayout.createSequentialGroup()
                .addComponent(profileBtnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profileBtnPanelLayout.setVerticalGroup(
            profileBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        exitBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        exitBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnPanelMouseExited(evt);
            }
        });

        exitBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        exitBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-close-icon.png"))); // NOI18N
        exitBtnLabel.setText(" Exit");

        javax.swing.GroupLayout exitBtnPanelLayout = new javax.swing.GroupLayout(exitBtnPanel);
        exitBtnPanel.setLayout(exitBtnPanelLayout);
        exitBtnPanelLayout.setHorizontalGroup(
            exitBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnPanelLayout.createSequentialGroup()
                .addComponent(exitBtnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitBtnPanelLayout.setVerticalGroup(
            exitBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sideBarPanelLayout = new javax.swing.GroupLayout(sideBarPanel);
        sideBarPanel.setLayout(sideBarPanelLayout);
        sideBarPanelLayout.setHorizontalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(searchBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(profileBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(exitBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        admin8Panel.add(sideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        admin8_2Panel.setBackground(new java.awt.Color(102, 0, 153));

        enterAccountNumberLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterAccountNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterAccountNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterAccountNumberLabel.setText("Enter Account Number");

        enterAccountNumberTextField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterAccountNumberTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        enterAccountNumberTextField.setToolTipText("Please Enter Account Number");

        searchButton.setBackground(new java.awt.Color(0, 51, 102));
        searchButton.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setMaximumSize(new java.awt.Dimension(120, 40));
        searchButton.setMinimumSize(new java.awt.Dimension(120, 40));
        searchButton.setPreferredSize(new java.awt.Dimension(120, 40));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        headingLabel2.setBackground(new java.awt.Color(0, 0, 0));
        headingLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        headingLabel2.setForeground(new java.awt.Color(255, 255, 255));
        headingLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel2.setText("SKY BANK");

        subheadingLabel2.setBackground(new java.awt.Color(0, 0, 0));
        subheadingLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        subheadingLabel2.setForeground(new java.awt.Color(255, 255, 255));
        subheadingLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subheadingLabel2.setText("Bangladesh's No One Online Bank");

        javax.swing.GroupLayout admin8_2PanelLayout = new javax.swing.GroupLayout(admin8_2Panel);
        admin8_2Panel.setLayout(admin8_2PanelLayout);
        admin8_2PanelLayout.setHorizontalGroup(
            admin8_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin8_2PanelLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(admin8_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterAccountNumberTextField)
                    .addComponent(enterAccountNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
            .addComponent(headingLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subheadingLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        admin8_2PanelLayout.setVerticalGroup(
            admin8_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin8_2PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headingLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subheadingLabel2)
                .addGap(94, 94, 94)
                .addComponent(enterAccountNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterAccountNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        admin8Panel.add(admin8_2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 103, -1, -1));

        headingLabel.setBackground(new java.awt.Color(0, 0, 0));
        headingLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 36)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(102, 0, 153));
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("ADMIN PANEL");
        admin8Panel.add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 13, 960, -1));

        subheadingLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        subheadingLabel.setForeground(new java.awt.Color(102, 0, 153));
        subheadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subheadingLabel.setText("Activate / Deactivate Account");
        admin8Panel.add(subheadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 60, 980, -1));

        closeBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabelMouseClicked(evt);
            }
        });
        admin8Panel.add(closeBtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin8Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin8Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnPanelMouseClicked
        /*Admin1 A1= new Admin1();
        setVisible(false);
        A1.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_searchBtnPanelMouseClicked

    private void searchBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnPanelMouseEntered
        JPanel btn= searchBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_searchBtnPanelMouseEntered

    private void searchBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnPanelMouseExited
        JPanel btn= searchBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_searchBtnPanelMouseExited

    private void profileBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanelMouseClicked
        Admin9 A9= new Admin9();
        setVisible(false);
        A9.setVisible(true);
        dispose();
    }//GEN-LAST:event_profileBtnPanelMouseClicked

    private void profileBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanelMouseEntered
        JPanel btn= profileBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_profileBtnPanelMouseEntered

    private void profileBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanelMouseExited
        JPanel btn= profileBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_profileBtnPanelMouseExited

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void exitBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnPanelMouseClicked
        Admin4 A4= new Admin4();
        setVisible(false);
        A4.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitBtnPanelMouseClicked

    private void exitBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnPanelMouseEntered
        JPanel btn= exitBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_exitBtnPanelMouseEntered

    private void exitBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnPanelMouseExited
        JPanel btn= exitBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_exitBtnPanelMouseExited

    private void closeBtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnLabelMouseClicked
    void isEntered(JPanel btn)
    {
        btn.setBackground(new Color(0,51,102));
    }
    
    void isExited(JPanel btn)
    {
        btn.setBackground(new Color(153,0,153));
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
            java.util.logging.Logger.getLogger(Admin8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin8Panel;
    private javax.swing.JPanel admin8_2Panel;
    private javax.swing.JLabel closeBtnLabel;
    private javax.swing.JLabel enterAccountNumberLabel;
    private javax.swing.JTextField enterAccountNumberTextField;
    private javax.swing.JLabel exitBtnLabel;
    private javax.swing.JPanel exitBtnPanel;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JLabel headingLabel2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel profileBtnLabel;
    private javax.swing.JLabel profileBtnLabel6;
    private javax.swing.JPanel profileBtnPanel;
    private javax.swing.JLabel searchBtnLabel;
    private javax.swing.JPanel searchBtnPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JLabel subheadingLabel;
    private javax.swing.JLabel subheadingLabel2;
    // End of variables declaration//GEN-END:variables
}