
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
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
public class Admin12 extends javax.swing.JFrame {

    /**
     * Creates new form Admin12
     */
    public Admin12() {
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

        admin12Panel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        balanceBtnPanel = new javax.swing.JPanel();
        balanceBtnLabel = new javax.swing.JLabel();
        withdrawBtnPanel = new javax.swing.JPanel();
        withdrawBtnLabel = new javax.swing.JLabel();
        depositBtnPanel = new javax.swing.JPanel();
        depositBtnLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        transferBtnPanel = new javax.swing.JPanel();
        transferBtnLabel = new javax.swing.JLabel();
        exitBtnPanel = new javax.swing.JPanel();
        exitBtnLabel = new javax.swing.JLabel();
        admin12_2Panel = new javax.swing.JPanel();
        depositAmountLabel = new javax.swing.JLabel();
        enterAccountNumberLabel = new javax.swing.JLabel();
        enterAccountNumberTextField = new javax.swing.JTextField();
        enterdepositAmountLabel = new javax.swing.JLabel();
        enterDepositAmountTextField = new javax.swing.JTextField();
        depositAmountButton = new javax.swing.JButton();
        adminPanelLabel = new javax.swing.JLabel();
        balanceDepositWithdrawTransferLabel = new javax.swing.JLabel();
        closeBtnLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        admin12Panel.setBackground(new java.awt.Color(255, 255, 255));
        admin12Panel.setMinimumSize(new java.awt.Dimension(1120, 630));
        admin12Panel.setPreferredSize(new java.awt.Dimension(1120, 630));
        admin12Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBarPanel.setBackground(new java.awt.Color(102, 0, 153));

        balanceBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        balanceBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balanceBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                balanceBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                balanceBtnPanelMouseExited(evt);
            }
        });

        balanceBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        balanceBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        balanceBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-moneybag.png"))); // NOI18N
        balanceBtnLabel.setText("Balance");

        javax.swing.GroupLayout balanceBtnPanelLayout = new javax.swing.GroupLayout(balanceBtnPanel);
        balanceBtnPanel.setLayout(balanceBtnPanelLayout);
        balanceBtnPanelLayout.setHorizontalGroup(
            balanceBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(balanceBtnPanelLayout.createSequentialGroup()
                .addComponent(balanceBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        balanceBtnPanelLayout.setVerticalGroup(
            balanceBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(balanceBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(balanceBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        withdrawBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        withdrawBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                withdrawBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                withdrawBtnPanelMouseExited(evt);
            }
        });

        withdrawBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        withdrawBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        withdrawBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        withdrawBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-moneybag.png"))); // NOI18N
        withdrawBtnLabel.setText("Withdraw");

        javax.swing.GroupLayout withdrawBtnPanelLayout = new javax.swing.GroupLayout(withdrawBtnPanel);
        withdrawBtnPanel.setLayout(withdrawBtnPanelLayout);
        withdrawBtnPanelLayout.setHorizontalGroup(
            withdrawBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawBtnPanelLayout.createSequentialGroup()
                .addComponent(withdrawBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        withdrawBtnPanelLayout.setVerticalGroup(
            withdrawBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        depositBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        depositBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depositBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depositBtnPanelMouseExited(evt);
            }
        });

        depositBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        depositBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        depositBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        depositBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-moneybag.png"))); // NOI18N
        depositBtnLabel.setText("Deposit");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-indicate.png"))); // NOI18N

        javax.swing.GroupLayout depositBtnPanelLayout = new javax.swing.GroupLayout(depositBtnPanel);
        depositBtnPanel.setLayout(depositBtnPanelLayout);
        depositBtnPanelLayout.setHorizontalGroup(
            depositBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositBtnPanelLayout.createSequentialGroup()
                .addComponent(depositBtnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        depositBtnPanelLayout.setVerticalGroup(
            depositBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        transferBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        transferBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transferBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transferBtnPanelMouseExited(evt);
            }
        });

        transferBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        transferBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        transferBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transferBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-moneybag.png"))); // NOI18N
        transferBtnLabel.setText("Transfer");

        javax.swing.GroupLayout transferBtnPanelLayout = new javax.swing.GroupLayout(transferBtnPanel);
        transferBtnPanel.setLayout(transferBtnPanelLayout);
        transferBtnPanelLayout.setHorizontalGroup(
            transferBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferBtnPanelLayout.createSequentialGroup()
                .addComponent(transferBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        transferBtnPanelLayout.setVerticalGroup(
            transferBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transferBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
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
                .addComponent(exitBtnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(balanceBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(withdrawBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(depositBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transferBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(balanceBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(depositBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(withdrawBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(transferBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(exitBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        admin12Panel.add(sideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 646));

        admin12_2Panel.setBackground(new java.awt.Color(102, 0, 153));

        depositAmountLabel.setBackground(new java.awt.Color(0, 0, 0));
        depositAmountLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        depositAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        depositAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        depositAmountLabel.setText("Deposit Amount");

        enterAccountNumberLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterAccountNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterAccountNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterAccountNumberLabel.setText("Enter Account Number");

        enterAccountNumberTextField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterAccountNumberTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        enterAccountNumberTextField.setToolTipText("Enter Enter Account Number");

        enterdepositAmountLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterdepositAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterdepositAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterdepositAmountLabel.setText("Enter Deposit Amount");

        enterDepositAmountTextField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterDepositAmountTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        enterDepositAmountTextField.setToolTipText("Enter Enter Account Number");

        depositAmountButton.setBackground(new java.awt.Color(0, 51, 102));
        depositAmountButton.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        depositAmountButton.setForeground(new java.awt.Color(255, 255, 255));
        depositAmountButton.setText("Deposit Amount");
        depositAmountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositAmountButton.setMaximumSize(new java.awt.Dimension(120, 40));
        depositAmountButton.setMinimumSize(new java.awt.Dimension(120, 40));
        depositAmountButton.setPreferredSize(new java.awt.Dimension(120, 40));
        depositAmountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositAmountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout admin12_2PanelLayout = new javax.swing.GroupLayout(admin12_2Panel);
        admin12_2Panel.setLayout(admin12_2PanelLayout);
        admin12_2PanelLayout.setHorizontalGroup(
            admin12_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(depositAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admin12_2PanelLayout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addGroup(admin12_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(admin12_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(enterDepositAmountTextField)
                        .addComponent(enterdepositAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(depositAmountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(admin12_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(enterAccountNumberTextField)
                        .addComponent(enterAccountNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(271, 271, 271))
        );
        admin12_2PanelLayout.setVerticalGroup(
            admin12_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin12_2PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(depositAmountLabel)
                .addGap(93, 93, 93)
                .addComponent(enterAccountNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterAccountNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enterdepositAmountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterDepositAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(depositAmountButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        admin12Panel.add(admin12_2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 101, -1, -1));

        adminPanelLabel.setBackground(new java.awt.Color(0, 0, 0));
        adminPanelLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 36)); // NOI18N
        adminPanelLabel.setForeground(new java.awt.Color(102, 0, 153));
        adminPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminPanelLabel.setText("ADMIN PANEL");
        admin12Panel.add(adminPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 13, 977, -1));

        balanceDepositWithdrawTransferLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        balanceDepositWithdrawTransferLabel.setForeground(new java.awt.Color(102, 0, 153));
        balanceDepositWithdrawTransferLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceDepositWithdrawTransferLabel.setText(" Balance / Deposit / Withdraw / Transfer");
        admin12Panel.add(balanceDepositWithdrawTransferLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 62, 965, -1));

        closeBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabelMouseClicked(evt);
            }
        });
        admin12Panel.add(closeBtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin12Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin12Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void balanceBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceBtnPanelMouseClicked
        Admin11 A11= new Admin11();
        setVisible(false);
        A11.setVisible(true);
        dispose();
    }//GEN-LAST:event_balanceBtnPanelMouseClicked

    private void balanceBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceBtnPanelMouseEntered
        JPanel btn= balanceBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_balanceBtnPanelMouseEntered

    private void balanceBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceBtnPanelMouseExited
        JPanel btn= balanceBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_balanceBtnPanelMouseExited

    private void withdrawBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawBtnPanelMouseClicked
        Admin13 A13= new Admin13();
        setVisible(false);
        A13.setVisible(true);
        dispose();
    }//GEN-LAST:event_withdrawBtnPanelMouseClicked

    private void withdrawBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawBtnPanelMouseEntered
        JPanel btn= withdrawBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_withdrawBtnPanelMouseEntered

    private void withdrawBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawBtnPanelMouseExited
        JPanel btn= withdrawBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_withdrawBtnPanelMouseExited

    private void depositBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositBtnPanelMouseClicked
        /*Admin12 A12= new Admin12();
        setVisible(false);
        A12.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_depositBtnPanelMouseClicked

    private void depositBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositBtnPanelMouseEntered
        JPanel btn= depositBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_depositBtnPanelMouseEntered

    private void depositBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositBtnPanelMouseExited
        JPanel btn= depositBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_depositBtnPanelMouseExited

    private void transferBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferBtnPanelMouseClicked
        Admin14 A14= new Admin14();
        setVisible(false);
        A14.setVisible(true);
        dispose();
    }//GEN-LAST:event_transferBtnPanelMouseClicked

    private void transferBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferBtnPanelMouseEntered
        JPanel btn= transferBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_transferBtnPanelMouseEntered

    private void transferBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferBtnPanelMouseExited
        JPanel btn= transferBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_transferBtnPanelMouseExited
    
    void isEntered(JPanel btn)
    {
        btn.setBackground(new Color(0,51,102));
    }
    
    void isExited(JPanel btn)
    {
        btn.setBackground(new Color(153,0,153));
    }
    
    private void depositAmountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositAmountButtonActionPerformed
        // TODO add your handling code here:
        String accountNumber=enterAccountNumberTextField.getText();
        String amount=enterDepositAmountTextField.getText();
        String type="Deposit";
        Date dateAndTime=new Date();
        //String balance="";
        try{
            if(accountNumber.equals("")||
                amount.equals(""))
            {
                if(accountNumber.equals(""))
                {
                     JOptionPane.showMessageDialog(null,"Account Number is Requied");     
                }
                if(amount.equals(""))
                {
                     JOptionPane.showMessageDialog(null,"Deposit Amount is Requied");     
                }
                
            }else{
                Conn c=new Conn();
                String query1="select * from addApplication3 where accountNumber = '"+accountNumber+"'";
                
                ResultSet rs1 = c.s.executeQuery(query1);
                if(rs1.next())
                {   
                    String query="insert into balance values('"+accountNumber+"', '"+dateAndTime+"', '"+type+"', '"+amount+"')";
                    c.s.executeUpdate(query);

                    JOptionPane.showMessageDialog(null,amount+" Taka Deposited Sucessfully!!!");
                    Admin11 A11= new Admin11();
                    setVisible(false);
                    A11.setVisible(true);
                    dispose();
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Account Details");
                }
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_depositAmountButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin12Panel;
    private javax.swing.JPanel admin12_2Panel;
    private javax.swing.JLabel adminPanelLabel;
    private javax.swing.JLabel balanceBtnLabel;
    private javax.swing.JPanel balanceBtnPanel;
    private javax.swing.JLabel balanceDepositWithdrawTransferLabel;
    private javax.swing.JLabel closeBtnLabel;
    private javax.swing.JButton depositAmountButton;
    private javax.swing.JLabel depositAmountLabel;
    private javax.swing.JLabel depositBtnLabel;
    private javax.swing.JPanel depositBtnPanel;
    private javax.swing.JLabel enterAccountNumberLabel;
    private javax.swing.JTextField enterAccountNumberTextField;
    private javax.swing.JTextField enterDepositAmountTextField;
    private javax.swing.JLabel enterdepositAmountLabel;
    private javax.swing.JLabel exitBtnLabel;
    private javax.swing.JPanel exitBtnPanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JLabel transferBtnLabel;
    private javax.swing.JPanel transferBtnPanel;
    private javax.swing.JLabel withdrawBtnLabel;
    private javax.swing.JPanel withdrawBtnPanel;
    // End of variables declaration//GEN-END:variables
}
