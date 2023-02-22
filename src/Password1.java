
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
public class Password1 extends javax.swing.JFrame {

    /**
     * Creates new form Password1
     */
    public Password1() {
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

        createAccount4Panel = new javax.swing.JPanel();
        createAccount4_2Panel = new javax.swing.JPanel();
        verifyLabel = new javax.swing.JLabel();
        firstCheckItsYouLabel = new javax.swing.JLabel();
        enterAccountNumberLabel = new javax.swing.JLabel();
        enterAccountNumberTextField = new javax.swing.JTextField();
        enterUsernameLabel = new javax.swing.JLabel();
        enterUsernameTextField = new javax.swing.JTextField();
        verifyDetailsButton = new javax.swing.JButton();
        searchAccountLabel = new javax.swing.JLabel();
        closeBtnLabel = new javax.swing.JLabel();
        closeBtnLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        createAccount4Panel.setBackground(new java.awt.Color(0, 51, 255));
        createAccount4Panel.setPreferredSize(new java.awt.Dimension(1120, 630));

        createAccount4_2Panel.setBackground(new java.awt.Color(255, 255, 255));
        createAccount4_2Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createAccount4_2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verifyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verifyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/verify-profile.png"))); // NOI18N
        createAccount4_2Panel.add(verifyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 55, 1045, -1));

        firstCheckItsYouLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        firstCheckItsYouLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstCheckItsYouLabel.setText("First Check It's You");
        createAccount4_2Panel.add(firstCheckItsYouLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 162, 1045, -1));

        enterAccountNumberLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterAccountNumberLabel.setText("Enter Account Number");
        createAccount4_2Panel.add(enterAccountNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 245, -1, -1));

        enterAccountNumberTextField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterAccountNumberTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        enterAccountNumberTextField.setToolTipText("Please Enter Account Number");
        enterAccountNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAccountNumberTextFieldActionPerformed(evt);
            }
        });
        createAccount4_2Panel.add(enterAccountNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 268, 300, 30));

        enterUsernameLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterUsernameLabel.setText("Enter Username");
        createAccount4_2Panel.add(enterUsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 316, -1, -1));

        enterUsernameTextField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        enterUsernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        enterUsernameTextField.setToolTipText("Please Enter Username");
        enterUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterUsernameTextFieldActionPerformed(evt);
            }
        });
        createAccount4_2Panel.add(enterUsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 340, 300, 30));

        verifyDetailsButton.setBackground(new java.awt.Color(0, 51, 102));
        verifyDetailsButton.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        verifyDetailsButton.setForeground(new java.awt.Color(255, 255, 255));
        verifyDetailsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-search-person.png"))); // NOI18N
        verifyDetailsButton.setText("Verify Details");
        verifyDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verifyDetailsButton.setMaximumSize(new java.awt.Dimension(120, 40));
        verifyDetailsButton.setMinimumSize(new java.awt.Dimension(120, 40));
        verifyDetailsButton.setPreferredSize(new java.awt.Dimension(120, 40));
        verifyDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verifyDetailsButtonMouseClicked(evt);
            }
        });
        verifyDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyDetailsButtonActionPerformed(evt);
            }
        });
        createAccount4_2Panel.add(verifyDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 410, 300, -1));

        searchAccountLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        searchAccountLabel.setForeground(new java.awt.Color(0, 51, 255));
        searchAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchAccountLabel.setText("Forgot Password");
        createAccount4_2Panel.add(searchAccountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 27, 1021, -1));

        closeBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/goback.png"))); // NOI18N
        closeBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabelMouseClicked(evt);
            }
        });
        createAccount4_2Panel.add(closeBtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        closeBtnLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeBtnLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabel1MouseClicked(evt);
            }
        });
        createAccount4_2Panel.add(closeBtnLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 30, -1));

        javax.swing.GroupLayout createAccount4PanelLayout = new javax.swing.GroupLayout(createAccount4Panel);
        createAccount4Panel.setLayout(createAccount4PanelLayout);
        createAccount4PanelLayout.setHorizontalGroup(
            createAccount4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccount4PanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(createAccount4_2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        createAccount4PanelLayout.setVerticalGroup(
            createAccount4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccount4PanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(createAccount4_2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccount4Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccount4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enterAccountNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAccountNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAccountNumberTextFieldActionPerformed

    private void enterUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterUsernameTextFieldActionPerformed

    private void verifyDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifyDetailsButtonMouseClicked
        /*Password2 Pass2= new Password2(accountNumber);
        setVisible(false);
        Pass2.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_verifyDetailsButtonMouseClicked

    private void verifyDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyDetailsButtonActionPerformed
        String accountNumber=enterAccountNumberTextField.getText();
        //String username=(String)accountTypeComboBox.getSelectedItem();
        String username=enterUsernameTextField.getText();
        //String debitCardPin=debitCardPinPasswordField.getText();;

        try{
            if(accountNumber.equals("")||
                username.equals("Select"))
            {
                if(accountNumber.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Account Number is Requied");
                }
                if(username.equals("Select"))
                {
                    JOptionPane.showMessageDialog(null,"Username is Requied");
                }
            }else{
                Conn c=new Conn();
                String query="select * from createAccount1 where accountNumber = '"+accountNumber+"' and username = '"+username+"'";
                //c.s.executeUpdate(query);
                
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next())
                {
                    //JOptionPane.showMessageDialog(null,"Account Verify Sucessfully!!!\nPlease check Your E-Mail For OTP");
                    Password2 P2= new Password2(accountNumber);
                    Password3 P3= new Password3(accountNumber);
                    setVisible(false);
                    P2.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Account Details");
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_verifyDetailsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Password1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeBtnLabel;
    private javax.swing.JLabel closeBtnLabel1;
    private javax.swing.JPanel createAccount4Panel;
    private javax.swing.JPanel createAccount4_2Panel;
    private javax.swing.JLabel enterAccountNumberLabel;
    private javax.swing.JTextField enterAccountNumberTextField;
    private javax.swing.JLabel enterUsernameLabel;
    private javax.swing.JTextField enterUsernameTextField;
    private javax.swing.JLabel firstCheckItsYouLabel;
    private javax.swing.JLabel searchAccountLabel;
    private javax.swing.JButton verifyDetailsButton;
    private javax.swing.JLabel verifyLabel;
    // End of variables declaration//GEN-END:variables
}
