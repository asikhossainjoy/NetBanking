
import java.awt.Color;
import java.sql.ResultSet;
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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jButton1 = new javax.swing.JButton();
        basePanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        headingLabel = new javax.swing.JLabel();
        subheadingLabel = new javax.swing.JLabel();
        createAccountBtnPanel = new javax.swing.JPanel();
        createAccountLabel = new javax.swing.JLabel();
        forgotPassBtnPanel = new javax.swing.JPanel();
        forgotPassLabel = new javax.swing.JLabel();
        exitBtnPanel = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        loginLogoLabel = new javax.swing.JLabel();
        loginHeadingLabel = new javax.swing.JLabel();
        usernamePanel = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        basePanel.setBackground(new java.awt.Color(255, 255, 255));

        sideBarPanel.setBackground(new java.awt.Color(0, 51, 255));

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/pngwing.com.png"))); // NOI18N

        headingLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(255, 255, 255));
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("SKY BANK");

        subheadingLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        subheadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        subheadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subheadingLabel.setText("Bangladesh's No One Online Bank");

        createAccountBtnPanel.setBackground(new java.awt.Color(0, 0, 255));
        createAccountBtnPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccountBtnPanel.setPreferredSize(new java.awt.Dimension(262, 45));
        createAccountBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createAccountBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createAccountBtnPanelMouseExited(evt);
            }
        });

        createAccountLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        createAccountLabel.setForeground(new java.awt.Color(255, 255, 255));
        createAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createAccountLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-addAccount.png"))); // NOI18N
        createAccountLabel.setText("Create Account");

        javax.swing.GroupLayout createAccountBtnPanelLayout = new javax.swing.GroupLayout(createAccountBtnPanel);
        createAccountBtnPanel.setLayout(createAccountBtnPanelLayout);
        createAccountBtnPanelLayout.setHorizontalGroup(
            createAccountBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        createAccountBtnPanelLayout.setVerticalGroup(
            createAccountBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        forgotPassBtnPanel.setBackground(new java.awt.Color(0, 0, 255));
        forgotPassBtnPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassBtnPanel.setPreferredSize(new java.awt.Dimension(262, 45));
        forgotPassBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotPassBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotPassBtnPanelMouseExited(evt);
            }
        });

        forgotPassLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        forgotPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        forgotPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotPassLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-forgetpass.png"))); // NOI18N
        forgotPassLabel.setText("Forgot Password");

        javax.swing.GroupLayout forgotPassBtnPanelLayout = new javax.swing.GroupLayout(forgotPassBtnPanel);
        forgotPassBtnPanel.setLayout(forgotPassBtnPanelLayout);
        forgotPassBtnPanelLayout.setHorizontalGroup(
            forgotPassBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(forgotPassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        forgotPassBtnPanelLayout.setVerticalGroup(
            forgotPassBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(forgotPassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        exitBtnPanel.setBackground(new java.awt.Color(0, 0, 255));
        exitBtnPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtnPanel.setPreferredSize(new java.awt.Dimension(262, 45));
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

        exitLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-close-icon.png"))); // NOI18N
        exitLabel.setText("Exit");

        javax.swing.GroupLayout exitBtnPanelLayout = new javax.swing.GroupLayout(exitBtnPanel);
        exitBtnPanel.setLayout(exitBtnPanelLayout);
        exitBtnPanelLayout.setHorizontalGroup(
            exitBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnPanelLayout.setVerticalGroup(
            exitBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sideBarPanelLayout = new javax.swing.GroupLayout(sideBarPanel);
        sideBarPanel.setLayout(sideBarPanelLayout);
        sideBarPanelLayout.setHorizontalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subheadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(createAccountBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(forgotPassBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(exitBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(logoLabel)
                .addGap(24, 24, 24)
                .addComponent(headingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subheadingLabel)
                .addGap(43, 43, 43)
                .addComponent(createAccountBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(forgotPassBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(exitBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginLogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/login-profile.png"))); // NOI18N

        loginHeadingLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        loginHeadingLabel.setForeground(new java.awt.Color(0, 51, 255));
        loginHeadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginHeadingLabel.setText("Welcome");

        usernamePanel.setBackground(new java.awt.Color(255, 255, 255));

        usernameTextField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        usernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameTextField.setToolTipText("Please Enter Username");
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        usernameLabel.setText("Username");

        javax.swing.GroupLayout usernamePanelLayout = new javax.swing.GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        usernamePanelLayout.setVerticalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        passwordPanel.setBackground(new java.awt.Color(255, 255, 255));

        passwordLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        passwordLabel.setText("Password");

        passwordField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        passwordField.setToolTipText("Please Enter Password");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        loginButton.setBackground(new java.awt.Color(0, 0, 255));
        loginButton.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setMaximumSize(new java.awt.Dimension(120, 40));
        loginButton.setMinimumSize(new java.awt.Dimension(120, 40));
        loginButton.setPreferredSize(new java.awt.Dimension(120, 40));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basePanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginHeadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                                .addGap(0, 194, Short.MAX_VALUE)
                                .addComponent(loginLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addComponent(usernamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(basePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLogoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginHeadingLabel)
                .addGap(48, 48, 48)
                .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountBtnPanelMouseEntered
        JPanel btn= createAccountBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_createAccountBtnPanelMouseEntered

    private void createAccountBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountBtnPanelMouseClicked
        createAccount1 AC1= new createAccount1();
        setVisible(false);
        AC1.setVisible(true);
        dispose();
    }//GEN-LAST:event_createAccountBtnPanelMouseClicked

    private void createAccountBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountBtnPanelMouseExited
        JPanel btn= createAccountBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_createAccountBtnPanelMouseExited

    private void forgotPassBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassBtnPanelMouseEntered
        JPanel btn= forgotPassBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_forgotPassBtnPanelMouseEntered

    private void forgotPassBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassBtnPanelMouseClicked
        Password1 Pass1= new Password1();
        setVisible(false);
        Pass1.setVisible(true);
        dispose();
    }//GEN-LAST:event_forgotPassBtnPanelMouseClicked

    private void forgotPassBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassBtnPanelMouseExited
        JPanel btn= forgotPassBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_forgotPassBtnPanelMouseExited

    private void exitBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnPanelMouseEntered
        JPanel btn= exitBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_exitBtnPanelMouseEntered

    private void exitBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnPanelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnPanelMouseClicked

    private void exitBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnPanelMouseExited
        JPanel btn= exitBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_exitBtnPanelMouseExited

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        
        
            
    }//GEN-LAST:event_loginButtonMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String username=usernameTextField.getText();
        String password=passwordField.getText();

        try{
            if(username.equals("")||
                password.equals("Select"))
            {
                if(username.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Username is Requied");
                }
                if(password.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Passward is Requied");
                }
            }else{
                Conn c=new Conn();
                String query="select * from createAccount1 where username = '"+username+"' and userPassword = '"+password+"'";
                //c.s.executeUpdate(query);
                
                ResultSet rs = c.s.executeQuery(query);
                if("admin".equals(usernameTextField.getText()) && "12345".equals(passwordField.getText()))
                {
                    Admin4 A4= new Admin4();
                    setVisible(false);
                    A4.setVisible(true);
                    dispose();
                }
                else if("addbank".equals(usernameTextField.getText()) && "12345".equals(passwordField.getText()))
                {
                    AddBank AB= new AddBank();
                    setVisible(false);
                    AB.setVisible(true);
                    dispose();
                }else if(rs.next())
                {
                    String accountNumber=rs.getString("accountNumber");
                    //System.out.println(accountNumber);
                    Home H= new Home(accountNumber);
                    setVisible(false);
                    H.setVisible(true);
                    dispose();
                    Transfer T=new Transfer(accountNumber);
                    Account A= new Account(accountNumber);
                    Cards C= new Cards(accountNumber);
                    Profile P=new Profile(accountNumber);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Account Details");
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                //new Login().setUndecorated(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel createAccountBtnPanel;
    private javax.swing.JLabel createAccountLabel;
    private javax.swing.JPanel exitBtnPanel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel forgotPassBtnPanel;
    private javax.swing.JLabel forgotPassLabel;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginHeadingLabel;
    private javax.swing.JLabel loginLogoLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JLabel subheadingLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPanel usernamePanel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}