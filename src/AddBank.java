
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
public class AddBank extends javax.swing.JFrame {

    /**
     * Creates new form AddBank
     */
    public AddBank() {
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
        admin12_2Panel = new javax.swing.JPanel();
        enterAccountNumberLabel = new javax.swing.JLabel();
        enterAccountNumberTextField = new javax.swing.JTextField();
        depositAmountButton = new javax.swing.JButton();
        bankComboBox = new javax.swing.JComboBox();
        enterdepositAmountLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminPanelLabel = new javax.swing.JLabel();
        balanceDepositWithdrawTransferLabel = new javax.swing.JLabel();
        closeBtnLabel = new javax.swing.JLabel();
        closeBtnLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        admin12Panel.setBackground(new java.awt.Color(255, 255, 255));
        admin12Panel.setPreferredSize(new java.awt.Dimension(1120, 630));
        admin12Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin12_2Panel.setBackground(new java.awt.Color(0, 51, 51));
        admin12_2Panel.setForeground(new java.awt.Color(0, 51, 51));

        enterAccountNumberLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterAccountNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterAccountNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterAccountNumberLabel.setText("Enter Account / Mobile Number");

        enterAccountNumberTextField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterAccountNumberTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        enterAccountNumberTextField.setToolTipText("Enter Enter Account Number");

        depositAmountButton.setBackground(new java.awt.Color(0, 51, 102));
        depositAmountButton.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        depositAmountButton.setForeground(new java.awt.Color(255, 255, 255));
        depositAmountButton.setText("Add Bank");
        depositAmountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositAmountButton.setMaximumSize(new java.awt.Dimension(120, 40));
        depositAmountButton.setMinimumSize(new java.awt.Dimension(120, 40));
        depositAmountButton.setPreferredSize(new java.awt.Dimension(120, 40));
        depositAmountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositAmountButtonActionPerformed(evt);
            }
        });

        bankComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Bkash", "One Bank", "Brac Bank", "Pubali Bank", "City Bank" }));

        enterdepositAmountLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterdepositAmountLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterdepositAmountLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterdepositAmountLabel1.setText("Select Bank");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/bkash.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/bangladesh-Bank.png"))); // NOI18N

        javax.swing.GroupLayout admin12_2PanelLayout = new javax.swing.GroupLayout(admin12_2Panel);
        admin12_2Panel.setLayout(admin12_2PanelLayout);
        admin12_2PanelLayout.setHorizontalGroup(
            admin12_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin12_2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(admin12_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterdepositAmountLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterAccountNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositAmountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterAccountNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );
        admin12_2PanelLayout.setVerticalGroup(
            admin12_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin12_2PanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(admin12_2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(admin12_2PanelLayout.createSequentialGroup()
                        .addComponent(enterAccountNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enterAccountNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enterdepositAmountLabel1)
                        .addGap(13, 13, 13)
                        .addComponent(bankComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(depositAmountButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        admin12Panel.add(admin12_2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 101, 1020, 480));

        adminPanelLabel.setBackground(new java.awt.Color(0, 0, 0));
        adminPanelLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 36)); // NOI18N
        adminPanelLabel.setForeground(new java.awt.Color(0, 51, 51));
        adminPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminPanelLabel.setText("ADD BANK");
        admin12Panel.add(adminPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 13, 1024, -1));

        balanceDepositWithdrawTransferLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        balanceDepositWithdrawTransferLabel.setForeground(new java.awt.Color(0, 51, 51));
        balanceDepositWithdrawTransferLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceDepositWithdrawTransferLabel.setText("Bkash / One Bank / Brac Bank / Pubali Bank / City Bank");
        admin12Panel.add(balanceDepositWithdrawTransferLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 1101, -1));

        closeBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabelMouseClicked(evt);
            }
        });
        admin12Panel.add(closeBtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        closeBtnLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/goback.png"))); // NOI18N
        closeBtnLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabel1MouseClicked(evt);
            }
        });
        admin12Panel.add(closeBtnLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin12Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin12Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void depositAmountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositAmountButtonActionPerformed
        // TODO add your handling code here:
        String bkashNumber=enterAccountNumberTextField.getText();
        String bank=(String)bankComboBox.getSelectedItem();
        try{
            if(bkashNumber.equals("")||
                bank.equals("Select"))
            {
                if(bkashNumber.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Account/Mobile Number is Requied");
                }

                if(bank.equals("Select"))
                {
                    JOptionPane.showMessageDialog(null,"Bank is Requied");
                }
            }else{
                Conn c=new Conn();

                //if(rs4.next())
                //{

                    String query1="insert into AddBank values('"+bkashNumber+"', '"+bank+"')";
                    c.s.executeUpdate(query1);
                    JOptionPane.showMessageDialog(null,"Add Account Succesfully");
                    enterAccountNumberTextField.setText("");
                    bankComboBox.setSelectedItem("Select");

                }
            }catch(Exception e){
                System.out.println(e);
            }
            // TODO add your handling code here:
    }//GEN-LAST:event_depositAmountButtonActionPerformed

    private void closeBtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnLabelMouseClicked

    private void closeBtnLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnLabel1MouseClicked
        Login L=new Login();
        setVisible(false);
        L.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(AddBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin12Panel;
    private javax.swing.JPanel admin12_2Panel;
    private javax.swing.JLabel adminPanelLabel;
    private javax.swing.JLabel balanceDepositWithdrawTransferLabel;
    private javax.swing.JComboBox bankComboBox;
    private javax.swing.JLabel closeBtnLabel;
    private javax.swing.JLabel closeBtnLabel1;
    private javax.swing.JButton depositAmountButton;
    private javax.swing.JLabel enterAccountNumberLabel;
    private javax.swing.JTextField enterAccountNumberTextField;
    private javax.swing.JLabel enterdepositAmountLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
