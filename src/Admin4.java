
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
public class Admin4 extends javax.swing.JFrame {

    /**
     * Creates new form Admin4
     */
    public Admin4() {
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

        profileBtnPanel = new javax.swing.JPanel();
        profileBtnLabel = new javax.swing.JLabel();
        profileBtnPanel2 = new javax.swing.JPanel();
        profileBtnLabel2 = new javax.swing.JLabel();
        profileBtnPanel4 = new javax.swing.JPanel();
        profileBtnLabel4 = new javax.swing.JLabel();
        admin4Panel = new javax.swing.JPanel();
        adminPanel4_2Panel = new javax.swing.JPanel();
        skyBankLabel = new javax.swing.JLabel();
        bangladeshNoOneOnlineBankLabel = new javax.swing.JLabel();
        logoutBtnPanel = new javax.swing.JPanel();
        logoutBtnLabel = new javax.swing.JLabel();
        addApplicationBtnPanel = new javax.swing.JPanel();
        addApplicationLabel = new javax.swing.JLabel();
        searchAccountBtnPanel = new javax.swing.JPanel();
        searchAccountBtnLabel = new javax.swing.JLabel();
        balanceDepositWithdrawTransferBtnPanel = new javax.swing.JPanel();
        balanceDepositWithdrawTransferLabel = new javax.swing.JLabel();
        customerMessageBtnPanel = new javax.swing.JPanel();
        logoutBtnLabel1 = new javax.swing.JLabel();
        adminPanelLabel = new javax.swing.JLabel();
        closeBtnLabel = new javax.swing.JLabel();

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

        profileBtnPanel2.setBackground(new java.awt.Color(153, 0, 153));
        profileBtnPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileBtnPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileBtnPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileBtnPanel2MouseExited(evt);
            }
        });

        profileBtnLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        profileBtnLabel2.setForeground(new java.awt.Color(255, 255, 255));
        profileBtnLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileBtnLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-user-icon.png"))); // NOI18N
        profileBtnLabel2.setText("Profile");

        javax.swing.GroupLayout profileBtnPanel2Layout = new javax.swing.GroupLayout(profileBtnPanel2);
        profileBtnPanel2.setLayout(profileBtnPanel2Layout);
        profileBtnPanel2Layout.setHorizontalGroup(
            profileBtnPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileBtnLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        profileBtnPanel2Layout.setVerticalGroup(
            profileBtnPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileBtnPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileBtnLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        profileBtnPanel4.setBackground(new java.awt.Color(153, 0, 153));
        profileBtnPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileBtnPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileBtnPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileBtnPanel4MouseExited(evt);
            }
        });

        profileBtnLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        profileBtnLabel4.setForeground(new java.awt.Color(255, 255, 255));
        profileBtnLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileBtnLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-user-icon.png"))); // NOI18N
        profileBtnLabel4.setText("Profile");

        javax.swing.GroupLayout profileBtnPanel4Layout = new javax.swing.GroupLayout(profileBtnPanel4);
        profileBtnPanel4.setLayout(profileBtnPanel4Layout);
        profileBtnPanel4Layout.setHorizontalGroup(
            profileBtnPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileBtnLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        profileBtnPanel4Layout.setVerticalGroup(
            profileBtnPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileBtnPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileBtnLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        admin4Panel.setBackground(new java.awt.Color(255, 255, 255));
        admin4Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminPanel4_2Panel.setBackground(new java.awt.Color(102, 0, 153));
        adminPanel4_2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        skyBankLabel.setBackground(new java.awt.Color(0, 0, 0));
        skyBankLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        skyBankLabel.setForeground(new java.awt.Color(255, 255, 255));
        skyBankLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skyBankLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/banklogo-sm.png"))); // NOI18N
        skyBankLabel.setText("   SKY BANK");
        skyBankLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        adminPanel4_2Panel.add(skyBankLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, -1));

        bangladeshNoOneOnlineBankLabel.setBackground(new java.awt.Color(0, 0, 0));
        bangladeshNoOneOnlineBankLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        bangladeshNoOneOnlineBankLabel.setForeground(new java.awt.Color(255, 255, 255));
        bangladeshNoOneOnlineBankLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bangladeshNoOneOnlineBankLabel.setText("Bangladesh's No One Online Bank");
        adminPanel4_2Panel.add(bangladeshNoOneOnlineBankLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 228, -1));

        logoutBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        logoutBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnPanelMouseExited(evt);
            }
        });

        logoutBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        logoutBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-close-icon.png"))); // NOI18N
        logoutBtnLabel.setText(" Logout");

        javax.swing.GroupLayout logoutBtnPanelLayout = new javax.swing.GroupLayout(logoutBtnPanel);
        logoutBtnPanel.setLayout(logoutBtnPanelLayout);
        logoutBtnPanelLayout.setHorizontalGroup(
            logoutBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        logoutBtnPanelLayout.setVerticalGroup(
            logoutBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        adminPanel4_2Panel.add(logoutBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 1120, -1));

        addApplicationBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        addApplicationBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addApplicationBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addApplicationBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addApplicationBtnPanelMouseExited(evt);
            }
        });

        addApplicationLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        addApplicationLabel.setForeground(new java.awt.Color(255, 255, 255));
        addApplicationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addApplicationLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-addAccount.png"))); // NOI18N
        addApplicationLabel.setText(" Add Application");

        javax.swing.GroupLayout addApplicationBtnPanelLayout = new javax.swing.GroupLayout(addApplicationBtnPanel);
        addApplicationBtnPanel.setLayout(addApplicationBtnPanelLayout);
        addApplicationBtnPanelLayout.setHorizontalGroup(
            addApplicationBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addApplicationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        addApplicationBtnPanelLayout.setVerticalGroup(
            addApplicationBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addApplicationBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addApplicationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        adminPanel4_2Panel.add(addApplicationBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1120, -1));

        searchAccountBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        searchAccountBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchAccountBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchAccountBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchAccountBtnPanelMouseExited(evt);
            }
        });

        searchAccountBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        searchAccountBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchAccountBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchAccountBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-search-person.png"))); // NOI18N
        searchAccountBtnLabel.setText(" Search Account");

        javax.swing.GroupLayout searchAccountBtnPanelLayout = new javax.swing.GroupLayout(searchAccountBtnPanel);
        searchAccountBtnPanel.setLayout(searchAccountBtnPanelLayout);
        searchAccountBtnPanelLayout.setHorizontalGroup(
            searchAccountBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchAccountBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        searchAccountBtnPanelLayout.setVerticalGroup(
            searchAccountBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchAccountBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchAccountBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        adminPanel4_2Panel.add(searchAccountBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1120, -1));

        balanceDepositWithdrawTransferBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        balanceDepositWithdrawTransferBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balanceDepositWithdrawTransferBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                balanceDepositWithdrawTransferBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                balanceDepositWithdrawTransferBtnPanelMouseExited(evt);
            }
        });

        balanceDepositWithdrawTransferLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        balanceDepositWithdrawTransferLabel.setForeground(new java.awt.Color(255, 255, 255));
        balanceDepositWithdrawTransferLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceDepositWithdrawTransferLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-moneybag.png"))); // NOI18N
        balanceDepositWithdrawTransferLabel.setText(" Balance / Deposit / Withdraw / Transfer");

        javax.swing.GroupLayout balanceDepositWithdrawTransferBtnPanelLayout = new javax.swing.GroupLayout(balanceDepositWithdrawTransferBtnPanel);
        balanceDepositWithdrawTransferBtnPanel.setLayout(balanceDepositWithdrawTransferBtnPanelLayout);
        balanceDepositWithdrawTransferBtnPanelLayout.setHorizontalGroup(
            balanceDepositWithdrawTransferBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(balanceDepositWithdrawTransferLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        balanceDepositWithdrawTransferBtnPanelLayout.setVerticalGroup(
            balanceDepositWithdrawTransferBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, balanceDepositWithdrawTransferBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(balanceDepositWithdrawTransferLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        adminPanel4_2Panel.add(balanceDepositWithdrawTransferBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        customerMessageBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        customerMessageBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerMessageBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerMessageBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerMessageBtnPanelMouseExited(evt);
            }
        });

        logoutBtnLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        logoutBtnLabel1.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtnLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtnLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-user-icon.png"))); // NOI18N
        logoutBtnLabel1.setText("Customer Message");

        javax.swing.GroupLayout customerMessageBtnPanelLayout = new javax.swing.GroupLayout(customerMessageBtnPanel);
        customerMessageBtnPanel.setLayout(customerMessageBtnPanelLayout);
        customerMessageBtnPanelLayout.setHorizontalGroup(
            customerMessageBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutBtnLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        customerMessageBtnPanelLayout.setVerticalGroup(
            customerMessageBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerMessageBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutBtnLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        adminPanel4_2Panel.add(customerMessageBtnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        admin4Panel.add(adminPanel4_2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, -1, 557));

        adminPanelLabel.setBackground(new java.awt.Color(0, 0, 0));
        adminPanelLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 36)); // NOI18N
        adminPanelLabel.setForeground(new java.awt.Color(102, 0, 153));
        adminPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminPanelLabel.setText("ADMIN PANEL");
        admin4Panel.add(adminPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 18, 1057, -1));

        closeBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabelMouseClicked(evt);
            }
        });
        admin4Panel.add(closeBtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin4Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin4Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profileBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanelMouseClicked
        /*Admin2 A2= new Admin2();
        setVisible(false);
        A2.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_profileBtnPanelMouseClicked

    private void profileBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanelMouseEntered
        JPanel btn= profileBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_profileBtnPanelMouseEntered

    private void profileBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanelMouseExited
        JPanel btn= profileBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_profileBtnPanelMouseExited

    private void logoutBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnPanelMouseClicked
        Login L= new Login();
        setVisible(false);
        L.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutBtnPanelMouseClicked

    private void logoutBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnPanelMouseEntered
        JPanel btn= logoutBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_logoutBtnPanelMouseEntered

    private void logoutBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnPanelMouseExited
        JPanel btn= logoutBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_logoutBtnPanelMouseExited

    private void profileBtnPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnPanel2MouseClicked

    private void profileBtnPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnPanel2MouseEntered

    private void profileBtnPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnPanel2MouseExited

    private void addApplicationBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addApplicationBtnPanelMouseClicked
        Admin5 A5= new Admin5();
        setVisible(false);
        A5.setVisible(true);
        dispose();
    }//GEN-LAST:event_addApplicationBtnPanelMouseClicked

    private void addApplicationBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addApplicationBtnPanelMouseEntered
        JPanel btn= addApplicationBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_addApplicationBtnPanelMouseEntered

    private void addApplicationBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addApplicationBtnPanelMouseExited
        JPanel btn= addApplicationBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_addApplicationBtnPanelMouseExited

    private void profileBtnPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnPanel4MouseClicked

    private void profileBtnPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnPanel4MouseEntered

    private void profileBtnPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanel4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnPanel4MouseExited

    private void searchAccountBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchAccountBtnPanelMouseClicked
        Admin1 A1= new Admin1();
        setVisible(false);
        A1.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchAccountBtnPanelMouseClicked

    private void searchAccountBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchAccountBtnPanelMouseEntered
        JPanel btn= searchAccountBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_searchAccountBtnPanelMouseEntered

    private void searchAccountBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchAccountBtnPanelMouseExited
        JPanel btn= searchAccountBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_searchAccountBtnPanelMouseExited

    private void balanceDepositWithdrawTransferBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceDepositWithdrawTransferBtnPanelMouseClicked
        Admin11 A11= new Admin11();
        setVisible(false);
        A11.setVisible(true);
        dispose();
    }//GEN-LAST:event_balanceDepositWithdrawTransferBtnPanelMouseClicked

    private void balanceDepositWithdrawTransferBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceDepositWithdrawTransferBtnPanelMouseEntered
        JPanel btn= balanceDepositWithdrawTransferBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_balanceDepositWithdrawTransferBtnPanelMouseEntered

    private void balanceDepositWithdrawTransferBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceDepositWithdrawTransferBtnPanelMouseExited
        JPanel btn= balanceDepositWithdrawTransferBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_balanceDepositWithdrawTransferBtnPanelMouseExited

    private void closeBtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnLabelMouseClicked

    private void customerMessageBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMessageBtnPanelMouseClicked
        Admin16 A16;
        try {
            A16 = new Admin16();
            setVisible(false);
            A16.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Admin4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_customerMessageBtnPanelMouseClicked

    private void customerMessageBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMessageBtnPanelMouseEntered
        JPanel btn= customerMessageBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_customerMessageBtnPanelMouseEntered

    private void customerMessageBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMessageBtnPanelMouseExited
        JPanel btn= customerMessageBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_customerMessageBtnPanelMouseExited
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
            java.util.logging.Logger.getLogger(Admin4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addApplicationBtnPanel;
    private javax.swing.JLabel addApplicationLabel;
    private javax.swing.JPanel admin4Panel;
    private javax.swing.JPanel adminPanel4_2Panel;
    private javax.swing.JLabel adminPanelLabel;
    private javax.swing.JPanel balanceDepositWithdrawTransferBtnPanel;
    private javax.swing.JLabel balanceDepositWithdrawTransferLabel;
    private javax.swing.JLabel bangladeshNoOneOnlineBankLabel;
    private javax.swing.JLabel closeBtnLabel;
    private javax.swing.JPanel customerMessageBtnPanel;
    private javax.swing.JLabel logoutBtnLabel;
    private javax.swing.JLabel logoutBtnLabel1;
    private javax.swing.JPanel logoutBtnPanel;
    private javax.swing.JLabel profileBtnLabel;
    private javax.swing.JLabel profileBtnLabel2;
    private javax.swing.JLabel profileBtnLabel4;
    private javax.swing.JPanel profileBtnPanel;
    private javax.swing.JPanel profileBtnPanel2;
    private javax.swing.JPanel profileBtnPanel4;
    private javax.swing.JLabel searchAccountBtnLabel;
    private javax.swing.JPanel searchAccountBtnPanel;
    private javax.swing.JLabel skyBankLabel;
    // End of variables declaration//GEN-END:variables
}