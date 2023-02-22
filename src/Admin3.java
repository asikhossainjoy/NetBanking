
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Admin3 extends javax.swing.JFrame {

    /**
     * Creates new form Admin3
     */
    String accountNumber;
    public Admin3(String accountNumber) throws SQLException {
        this.accountNumber=accountNumber;
        initComponents();
        transactionTable.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,16));
        transactionTable.getTableHeader().setOpaque(false);
        transactionTable.getTableHeader().setBackground(new Color(102,0,153));
        transactionTable.getTableHeader().setForeground(new Color(255,255,255));
        transactionTable.setRowHeight(25);
        Conn c=new Conn();
        String query="select * from balance where accountNumber = '"+accountNumber+"'";
        
        //c.s.executeUpdate(query);
                
        ResultSet rs = c.s.executeQuery(query);
        
        
        
        while(rs.next())
        {
            String Type=rs.getString("type");
            String DT=rs.getString("amount");
            String amount=rs.getString("dateAndTime");
            String tbData[]={Type,DT,amount};
            DefaultTableModel  tb1Model=(DefaultTableModel)transactionTable.getModel();
            tb1Model.addRow(tbData);
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

        admin3Panel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        searchBtnPanel = new javax.swing.JPanel();
        searchBtnLabel = new javax.swing.JLabel();
        statementBtnPanel = new javax.swing.JPanel();
        statementBtnLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        profileBtnPanel = new javax.swing.JPanel();
        profileBtnLabel = new javax.swing.JLabel();
        exitBtnPanel = new javax.swing.JPanel();
        logoutBtnLabel = new javax.swing.JLabel();
        admin3_2Panel = new javax.swing.JPanel();
        miniStatementLabel = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        AccountNumberLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        adminPanelLabel = new javax.swing.JLabel();
        searchAccountLabel = new javax.swing.JLabel();
        closeBtnLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        admin3Panel.setBackground(new java.awt.Color(255, 255, 255));
        admin3Panel.setPreferredSize(new java.awt.Dimension(1120, 630));
        admin3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        javax.swing.GroupLayout searchBtnPanelLayout = new javax.swing.GroupLayout(searchBtnPanel);
        searchBtnPanel.setLayout(searchBtnPanelLayout);
        searchBtnPanelLayout.setHorizontalGroup(
            searchBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBtnPanelLayout.createSequentialGroup()
                .addComponent(searchBtnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchBtnPanelLayout.setVerticalGroup(
            searchBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        statementBtnPanel.setBackground(new java.awt.Color(153, 0, 153));
        statementBtnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statementBtnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statementBtnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statementBtnPanelMouseExited(evt);
            }
        });

        statementBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        statementBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        statementBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statementBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-moneybag.png"))); // NOI18N
        statementBtnLabel.setText(" Statement");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-indicate.png"))); // NOI18N

        javax.swing.GroupLayout statementBtnPanelLayout = new javax.swing.GroupLayout(statementBtnPanel);
        statementBtnPanel.setLayout(statementBtnPanelLayout);
        statementBtnPanelLayout.setHorizontalGroup(
            statementBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statementBtnPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(statementBtnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        statementBtnPanelLayout.setVerticalGroup(
            statementBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statementBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statementBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
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

        logoutBtnLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        logoutBtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/white-close-icon.png"))); // NOI18N
        logoutBtnLabel.setText(" Exit");

        javax.swing.GroupLayout exitBtnPanelLayout = new javax.swing.GroupLayout(exitBtnPanel);
        exitBtnPanel.setLayout(exitBtnPanelLayout);
        exitBtnPanelLayout.setHorizontalGroup(
            exitBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnPanelLayout.createSequentialGroup()
                .addComponent(logoutBtnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitBtnPanelLayout.setVerticalGroup(
            exitBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sideBarPanelLayout = new javax.swing.GroupLayout(sideBarPanel);
        sideBarPanel.setLayout(sideBarPanelLayout);
        sideBarPanelLayout.setHorizontalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(statementBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(searchBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(profileBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(statementBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(exitBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        admin3Panel.add(sideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        admin3_2Panel.setBackground(new java.awt.Color(102, 0, 153));
        admin3_2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        miniStatementLabel.setBackground(new java.awt.Color(0, 0, 0));
        miniStatementLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        miniStatementLabel.setForeground(new java.awt.Color(255, 255, 255));
        miniStatementLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miniStatementLabel.setText("Mini Statement");
        admin3_2Panel.add(miniStatementLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 862, -1));

        printButton.setBackground(new java.awt.Color(0, 51, 102));
        printButton.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setText("Print");
        printButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printButton.setMaximumSize(new java.awt.Dimension(120, 40));
        printButton.setMinimumSize(new java.awt.Dimension(120, 40));
        printButton.setPreferredSize(new java.awt.Dimension(120, 40));
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        admin3_2Panel.add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 411, -1));

        AccountNumberLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        AccountNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        AccountNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin3_2Panel.add(AccountNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 840, 20));

        transactionTable.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 15)); // NOI18N
        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Amount", "Date & Time"
            }
        ));
        transactionTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(transactionTable);

        admin3_2Panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 79, 690, 320));

        admin3Panel.add(admin3_2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 101, -1, 487));

        adminPanelLabel.setBackground(new java.awt.Color(0, 0, 0));
        adminPanelLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 36)); // NOI18N
        adminPanelLabel.setForeground(new java.awt.Color(102, 0, 153));
        adminPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminPanelLabel.setText("ADMIN PANEL");
        admin3Panel.add(adminPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 13, 965, -1));

        searchAccountLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        searchAccountLabel.setForeground(new java.awt.Color(102, 0, 153));
        searchAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchAccountLabel.setText("Search Account");
        admin3Panel.add(searchAccountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 62, 977, -1));

        closeBtnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/close-btn.png"))); // NOI18N
        closeBtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnLabelMouseClicked(evt);
            }
        });
        admin3Panel.add(closeBtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin3Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin3Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnPanelMouseClicked
        Admin1 A1= new Admin1();
        setVisible(false);
        A1.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchBtnPanelMouseClicked

    private void searchBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnPanelMouseEntered
        JPanel btn= searchBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_searchBtnPanelMouseEntered

    private void searchBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnPanelMouseExited
        JPanel btn= searchBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_searchBtnPanelMouseExited

    private void statementBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statementBtnPanelMouseClicked
        /*Admin3 A3= new Admin3();
        setVisible(false);
        A3.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_statementBtnPanelMouseClicked

    private void statementBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statementBtnPanelMouseEntered
        JPanel btn= statementBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_statementBtnPanelMouseEntered

    private void statementBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statementBtnPanelMouseExited
        JPanel btn= statementBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_statementBtnPanelMouseExited

    private void profileBtnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanelMouseClicked
        Admin2 A2;
        try {
            A2 = new Admin2(accountNumber);
            setVisible(false);
            A2.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Admin3.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }//GEN-LAST:event_profileBtnPanelMouseClicked

    private void profileBtnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanelMouseEntered
        JPanel btn= profileBtnPanel;
        isEntered(btn);
    }//GEN-LAST:event_profileBtnPanelMouseEntered

    private void profileBtnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnPanelMouseExited
        JPanel btn= profileBtnPanel;
        isExited(btn);
    }//GEN-LAST:event_profileBtnPanelMouseExited

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

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        MessageFormat header=new MessageFormat("Account Number : "+accountNumber);

        MessageFormat footer=new MessageFormat("Sky Bank Limited( "+"Page{0,number,integer}"+" )");
        try{
            transactionTable.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_printButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Admin3("").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Admin3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountNumberLabel;
    private javax.swing.JPanel admin3Panel;
    private javax.swing.JPanel admin3_2Panel;
    private javax.swing.JLabel adminPanelLabel;
    private javax.swing.JLabel closeBtnLabel;
    private javax.swing.JPanel exitBtnPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtnLabel;
    private javax.swing.JLabel miniStatementLabel;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel profileBtnLabel;
    private javax.swing.JPanel profileBtnPanel;
    private javax.swing.JLabel searchAccountLabel;
    private javax.swing.JLabel searchBtnLabel;
    private javax.swing.JPanel searchBtnPanel;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JLabel statementBtnLabel;
    private javax.swing.JPanel statementBtnPanel;
    private javax.swing.JTable transactionTable;
    // End of variables declaration//GEN-END:variables
}