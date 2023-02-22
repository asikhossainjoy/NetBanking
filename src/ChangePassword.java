
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    String accountNumber;
    public ChangePassword(String accountNumber) throws SQLException {
        this.accountNumber=accountNumber;
        initComponents();
        Conn c=new Conn();
        String query1="select * from createAccount1 where accountNumber = '"+accountNumber+"'";
        ResultSet rs1 = c.s.executeQuery(query1);
        if(rs1.next())
        {
                
            String name=rs1.getString("username");
            UsernameLabel1.setText(UsernameLabel1.getText()+name);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changePassPanel = new javax.swing.JPanel();
        changePassPanel2 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        changePasswordButton = new javax.swing.JButton();
        accountNumberPanel1 = new javax.swing.JPanel();
        UsernameLabel1 = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        presentPasswordLabel = new javax.swing.JLabel();
        presentPasswordPasswordField = new javax.swing.JPasswordField();
        newPassLabel = new javax.swing.JLabel();
        newPassPasswordField = new javax.swing.JPasswordField();
        rePassLabel = new javax.swing.JLabel();
        rePassPasswordField = new javax.swing.JPasswordField();
        goBackBtnLabel = new javax.swing.JLabel();
        closeBtnLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        changePassPanel.setBackground(new java.awt.Color(0, 51, 255));
        changePassPanel.setPreferredSize(new java.awt.Dimension(1120, 630));

        changePassPanel2.setBackground(new java.awt.Color(255, 255, 255));
        changePassPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        changePassPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/male-profile.png"))); // NOI18N
        logoLabel.setText("Change Your E-Banking Password");
        changePassPanel2.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 24, 1046, 90));

        changePasswordButton.setBackground(new java.awt.Color(0, 51, 102));
        changePasswordButton.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        changePasswordButton.setForeground(new java.awt.Color(255, 255, 255));
        changePasswordButton.setText("Change Password");
        changePasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePasswordButton.setMaximumSize(new java.awt.Dimension(120, 40));
        changePasswordButton.setMinimumSize(new java.awt.Dimension(120, 40));
        changePasswordButton.setPreferredSize(new java.awt.Dimension(120, 40));
        changePasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePasswordButtonMouseClicked(evt);
            }
        });
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });
        changePassPanel2.add(changePasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 451, 302, -1));

        accountNumberPanel1.setBackground(new java.awt.Color(255, 255, 255));
        accountNumberPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        UsernameLabel1.setBackground(new java.awt.Color(255, 255, 255));
        UsernameLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        UsernameLabel1.setForeground(new java.awt.Color(102, 102, 102));
        UsernameLabel1.setText(" ");

        javax.swing.GroupLayout accountNumberPanel1Layout = new javax.swing.GroupLayout(accountNumberPanel1);
        accountNumberPanel1.setLayout(accountNumberPanel1Layout);
        accountNumberPanel1Layout.setHorizontalGroup(
            accountNumberPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsernameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        accountNumberPanel1Layout.setVerticalGroup(
            accountNumberPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsernameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        changePassPanel2.add(accountNumberPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 188, -1, -1));

        UsernameLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameLabel.setText("Username");
        changePassPanel2.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 165, 301, -1));

        presentPasswordLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        presentPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        presentPasswordLabel.setText("Enter Present Password");
        changePassPanel2.add(presentPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 233, 301, -1));

        presentPasswordPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentPasswordPasswordFieldActionPerformed(evt);
            }
        });
        changePassPanel2.add(presentPasswordPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 256, 301, 30));

        newPassLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        newPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newPassLabel.setText("Create New Password");
        changePassPanel2.add(newPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 299, 301, -1));

        newPassPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassPasswordFieldActionPerformed(evt);
            }
        });
        changePassPanel2.add(newPassPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 322, 301, 30));

        rePassLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        rePassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rePassLabel.setText("Re-Enter New Password");
        changePassPanel2.add(rePassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 365, 301, -1));

        rePassPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePassPasswordFieldActionPerformed(evt);
            }
        });
        changePassPanel2.add(rePassPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 388, 301, 30));

        goBackBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/goback.png"))); // NOI18N
        goBackBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackBtnLabelMouseClicked(evt);
            }
        });
        changePassPanel2.add(goBackBtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        closeBtnLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeBtnLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabel1MouseClicked(evt);
            }
        });
        changePassPanel2.add(closeBtnLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 30, -1));

        javax.swing.GroupLayout changePassPanelLayout = new javax.swing.GroupLayout(changePassPanel);
        changePassPanel.setLayout(changePassPanelLayout);
        changePassPanelLayout.setHorizontalGroup(
            changePassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePassPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(changePassPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        changePassPanelLayout.setVerticalGroup(
            changePassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePassPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(changePassPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(changePassPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(changePassPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void changePasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordButtonMouseClicked
        /*createAccount3 AC3= new createAccount3(accountNumber);
        setVisible(false);
        AC3.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_changePasswordButtonMouseClicked

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        String password1=presentPasswordPasswordField.getText();
        String password2=newPassPasswordField.getText();
        String password3=rePassPasswordField.getText();
        
        try{
            if(password1.equals("") || password2.equals("") || password3.equals(""))
            {
                if(password1.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Present Password is Requied");
                }
                if(password2.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Create New Password is Requied");
                }
                if(password3.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Re-Enter New Password is Requied");
                }
            }else{
                Conn c=new Conn();
                String query1="select * from createAccount1 where accountNumber = '"+accountNumber+"'";
                //c.s.executeUpdate(query);
                
                ResultSet rs1 = c.s.executeQuery(query1);
                if(rs1.next())
                {
                    String password=rs1.getString("userPassword");
                    
                    if(password.equals(password1))
                    {
                        
                        if(password2.equals(password3))
                        {
                            //String query="delete from createAccount1 where accountNumber = '"+accountNumber+"'";
                            //c.s.executeUpdate(query);

                    
                            String query="update createAccount1 set userPassword = '"+password2+"' where  accountNumber = '"+accountNumber+"'";
                            c.s.executeUpdate(query);
                        
                            Password4 P4= new Password4();
                            setVisible(false);
                            P4.setVisible(true);
                            dispose();
                        }else{
                            JOptionPane.showMessageDialog(null,"Both New Password Are Not Same");
                }
                        
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Present Password");
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void presentPasswordPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentPasswordPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentPasswordPasswordFieldActionPerformed

    private void newPassPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPassPasswordFieldActionPerformed

    private void rePassPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePassPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rePassPasswordFieldActionPerformed

    private void goBackBtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackBtnLabelMouseClicked
        AccountSettings AS=new AccountSettings(accountNumber);
        setVisible(false);
        AS.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackBtnLabelMouseClicked

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChangePassword("").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel UsernameLabel1;
    private javax.swing.JPanel accountNumberPanel1;
    private javax.swing.JPanel changePassPanel;
    private javax.swing.JPanel changePassPanel2;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JLabel closeBtnLabel1;
    private javax.swing.JLabel goBackBtnLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel newPassLabel;
    private javax.swing.JPasswordField newPassPasswordField;
    private javax.swing.JLabel presentPasswordLabel;
    private javax.swing.JPasswordField presentPasswordPasswordField;
    private javax.swing.JLabel rePassLabel;
    private javax.swing.JPasswordField rePassPasswordField;
    // End of variables declaration//GEN-END:variables
}
