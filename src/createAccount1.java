
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class createAccount1 extends javax.swing.JFrame {

    /**
     * Creates new form createAccount1
     */
    public createAccount1() {
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

        createAccount1Panel = new javax.swing.JPanel();
        createAccount1_2Panel = new javax.swing.JPanel();
        verifyLabel = new javax.swing.JLabel();
        verifyYourBankAccountLabel = new javax.swing.JLabel();
        accountTypeLabel = new javax.swing.JLabel();
        accountNumberLabel = new javax.swing.JLabel();
        accountNumberTextField = new javax.swing.JTextField();
        debitCardNumberLabel = new javax.swing.JLabel();
        debitCardNumberTextField = new javax.swing.JTextField();
        debitCardPinLabel = new javax.swing.JLabel();
        checkDetailsButton = new javax.swing.JButton();
        debitCardPinPasswordField = new javax.swing.JPasswordField();
        accountTypeComboBox = new javax.swing.JComboBox();
        closeBtnLabel = new javax.swing.JLabel();
        closeBtnLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        createAccount1Panel.setBackground(new java.awt.Color(0, 51, 255));
        createAccount1Panel.setPreferredSize(new java.awt.Dimension(1120, 630));

        createAccount1_2Panel.setBackground(new java.awt.Color(255, 255, 255));
        createAccount1_2Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createAccount1_2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verifyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verifyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/verify-profile.png"))); // NOI18N
        createAccount1_2Panel.add(verifyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 15, 1040, -1));

        verifyYourBankAccountLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        verifyYourBankAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verifyYourBankAccountLabel.setText("Verify Your Bank Account");
        createAccount1_2Panel.add(verifyYourBankAccountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 128, 1045, -1));

        accountTypeLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        accountTypeLabel.setText("Account Type");
        createAccount1_2Panel.add(accountTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 246, -1, -1));

        accountNumberLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        accountNumberLabel.setText("Account Number");
        createAccount1_2Panel.add(accountNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 247, -1, -1));

        accountNumberTextField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        accountNumberTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        accountNumberTextField.setToolTipText("Please Enter Account Number");
        accountNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberTextFieldActionPerformed(evt);
            }
        });
        createAccount1_2Panel.add(accountNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 270, 300, 30));

        debitCardNumberLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        debitCardNumberLabel.setText("Debit Card Number");
        createAccount1_2Panel.add(debitCardNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 345, -1, -1));

        debitCardNumberTextField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        debitCardNumberTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        debitCardNumberTextField.setToolTipText("Please Enter Debit Card Number");
        debitCardNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitCardNumberTextFieldActionPerformed(evt);
            }
        });
        createAccount1_2Panel.add(debitCardNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 368, 300, 30));

        debitCardPinLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        debitCardPinLabel.setText("Debit Card Pin");
        createAccount1_2Panel.add(debitCardPinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 345, -1, -1));

        checkDetailsButton.setBackground(new java.awt.Color(0, 51, 102));
        checkDetailsButton.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        checkDetailsButton.setForeground(new java.awt.Color(255, 255, 255));
        checkDetailsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-search-person.png"))); // NOI18N
        checkDetailsButton.setText(" Check Details");
        checkDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkDetailsButton.setMaximumSize(new java.awt.Dimension(120, 40));
        checkDetailsButton.setMinimumSize(new java.awt.Dimension(120, 40));
        checkDetailsButton.setPreferredSize(new java.awt.Dimension(120, 40));
        checkDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDetailsButtonActionPerformed(evt);
            }
        });
        createAccount1_2Panel.add(checkDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 476, 300, -1));

        debitCardPinPasswordField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        debitCardPinPasswordField.setToolTipText("Please Enter Debit Card Pin");
        debitCardPinPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitCardPinPasswordFieldActionPerformed(evt);
            }
        });
        createAccount1_2Panel.add(debitCardPinPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 368, 300, 30));

        accountTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Saving Account", "Current Account", "Fixed Deposit Account", "Recurring Deposit Account" }));
        createAccount1_2Panel.add(accountTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 269, 300, 31));

        closeBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/goback.png"))); // NOI18N
        closeBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabelMouseClicked(evt);
            }
        });
        createAccount1_2Panel.add(closeBtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        closeBtnLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeBtnLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabel1MouseClicked(evt);
            }
        });
        createAccount1_2Panel.add(closeBtnLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 30, -1));

        javax.swing.GroupLayout createAccount1PanelLayout = new javax.swing.GroupLayout(createAccount1Panel);
        createAccount1Panel.setLayout(createAccount1PanelLayout);
        createAccount1PanelLayout.setHorizontalGroup(
            createAccount1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccount1PanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(createAccount1_2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        createAccount1PanelLayout.setVerticalGroup(
            createAccount1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccount1PanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(createAccount1_2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccount1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccount1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void debitCardPinPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitCardPinPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_debitCardPinPasswordFieldActionPerformed

    private void checkDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDetailsButtonActionPerformed
        /*createAccount2 AC2= new createAccount2();
        setVisible(false);
        AC2.setVisible(true);
        dispose();*/
        // TODO add your handling code here:
        String accountNumber=accountNumberTextField.getText();
        String accountType=(String)accountTypeComboBox.getSelectedItem();
        String debitCardNumber=debitCardNumberTextField.getText();
        String debitCardPin=debitCardPinPasswordField.getText();;

        try{
            if(accountNumber.equals("")||
                accountType.equals("Select")||
                debitCardNumber.equals("")||
                debitCardPin.equals(""))
            {
                if(accountNumber.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Account Number is Requied");
                }
                if(accountType.equals("Select"))
                {
                    JOptionPane.showMessageDialog(null,"Account Type is Requied");
                }
                if(debitCardNumber.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Debit CardNumber is Requied");
                }
                if(debitCardPin.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Debit Card Pin is Requied");
                }
            }else{
                Conn c=new Conn();
                String query="select * from addApplication3 where accountNumber = '"+accountNumber+"' and accountType = '"+accountType+"' and debitCardNumber = '"+debitCardNumber+"' and debitCardPin = '"
                +debitCardPin+"'";
                //c.s.executeUpdate(query);
                
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next())
                {
                    createAccount2 AC2= new createAccount2(accountNumber);
                    createAccount4 AC4= new createAccount4(accountNumber);
                    setVisible(false);
                    AC2.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Account Details");
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        // TODO add your handling code here:

    }//GEN-LAST:event_checkDetailsButtonActionPerformed

    private void debitCardNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitCardNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_debitCardNumberTextFieldActionPerformed

    private void accountNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberTextFieldActionPerformed

    private void closeBtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnLabelMouseClicked
        Login L=new Login();
        setVisible(false);
        L.setVisible(true);
        dispose();
    }//GEN-LAST:event_closeBtnLabelMouseClicked

    private void closeBtnLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(createAccount1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createAccount1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createAccount1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createAccount1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createAccount1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNumberLabel;
    private javax.swing.JTextField accountNumberTextField;
    private javax.swing.JComboBox accountTypeComboBox;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JButton checkDetailsButton;
    private javax.swing.JLabel closeBtnLabel;
    private javax.swing.JLabel closeBtnLabel1;
    private javax.swing.JPanel createAccount1Panel;
    private javax.swing.JPanel createAccount1_2Panel;
    private javax.swing.JLabel debitCardNumberLabel;
    private javax.swing.JTextField debitCardNumberTextField;
    private javax.swing.JLabel debitCardPinLabel;
    private javax.swing.JPasswordField debitCardPinPasswordField;
    private javax.swing.JLabel verifyLabel;
    private javax.swing.JLabel verifyYourBankAccountLabel;
    // End of variables declaration//GEN-END:variables
}
