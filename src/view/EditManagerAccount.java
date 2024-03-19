/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.ManagerController;
import controller.UserController;
import view.ManagerDashboard;
import java.util.HashMap; 
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class EditManagerAccount extends javax.swing.JFrame {
    private int loggedInManagerId;
    /**
     * Creates new form EditManagerAccount
     */
    public EditManagerAccount(int managerId){
        loggedInManagerId = managerId;
        ManagerController managerController = new ManagerController();
        HashMap<String, Object> managerDeatils = managerController.getManagerDetails(loggedInManagerId);
        initComponents();
        tbxEditManagerCurrentUsername.setText(managerDeatils.get("username").toString());
        tbxEditManagerCurrentPassword.setText(managerDeatils.get("password").toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEditManagerNewUsername = new javax.swing.JLabel();
        tbxEditManagerCurrentPassword = new javax.swing.JTextField();
        lblEditManagerCurrentPassword = new javax.swing.JLabel();
        tbxEditManagerCurrentUsername = new javax.swing.JTextField();
        lblEditManagerCurrentUsername = new javax.swing.JLabel();
        lblEditManagerNewPassword = new javax.swing.JLabel();
        tbxEditManagerNewPassword = new javax.swing.JTextField();
        tbxEditManagerNewUsername = new javax.swing.JTextField();
        btnSaveEditManagerAcc = new javax.swing.JButton();
        lblLoginUsername1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 800));

        lblEditManagerNewUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEditManagerNewUsername.setText("New Username:");
        lblEditManagerNewUsername.setToolTipText("");
        lblEditManagerNewUsername.setPreferredSize(new java.awt.Dimension(200, 50));

        tbxEditManagerCurrentPassword.setEditable(false);
        tbxEditManagerCurrentPassword.setBackground(new java.awt.Color(255, 255, 255));

        lblEditManagerCurrentPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEditManagerCurrentPassword.setText("Current Password:");
        lblEditManagerCurrentPassword.setToolTipText("");
        lblEditManagerCurrentPassword.setPreferredSize(new java.awt.Dimension(200, 50));

        tbxEditManagerCurrentUsername.setEditable(false);
        tbxEditManagerCurrentUsername.setBackground(new java.awt.Color(255, 255, 255));

        lblEditManagerCurrentUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEditManagerCurrentUsername.setText("Current Username:");
        lblEditManagerCurrentUsername.setToolTipText("");
        lblEditManagerCurrentUsername.setPreferredSize(new java.awt.Dimension(200, 50));

        lblEditManagerNewPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEditManagerNewPassword.setText("New Password:");
        lblEditManagerNewPassword.setToolTipText("");
        lblEditManagerNewPassword.setPreferredSize(new java.awt.Dimension(200, 50));

        btnSaveEditManagerAcc.setText("Save");
        btnSaveEditManagerAcc.setPreferredSize(new java.awt.Dimension(200, 50));
        btnSaveEditManagerAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEditManagerAccActionPerformed(evt);
            }
        });

        lblLoginUsername1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblLoginUsername1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLoginUsername1.setText("EDIT MANAGER PROFILE");
        lblLoginUsername1.setAlignmentY(0.0F);

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEditManagerNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEditManagerCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEditManagerNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEditManagerCurrentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tbxEditManagerCurrentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbxEditManagerCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbxEditManagerNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbxEditManagerNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(lblLoginUsername1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(btnSaveEditManagerAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(back)))
                .addContainerGap(280, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEditManagerCurrentPassword, lblEditManagerCurrentUsername, lblEditManagerNewPassword, lblEditManagerNewUsername, tbxEditManagerCurrentPassword, tbxEditManagerCurrentUsername, tbxEditManagerNewPassword, tbxEditManagerNewUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblLoginUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblEditManagerCurrentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tbxEditManagerCurrentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblEditManagerCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tbxEditManagerCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblEditManagerNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tbxEditManagerNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblEditManagerNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tbxEditManagerNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnSaveEditManagerAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(back)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblEditManagerCurrentPassword, lblEditManagerCurrentUsername, lblEditManagerNewPassword, lblEditManagerNewUsername, tbxEditManagerCurrentPassword, tbxEditManagerCurrentUsername, tbxEditManagerNewPassword, tbxEditManagerNewUsername});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveEditManagerAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEditManagerAccActionPerformed
        String inputtedUsername = tbxEditManagerNewUsername.getText();
        String inputtedPassword = tbxEditManagerNewPassword.getText();
        ManagerController managerController = new ManagerController();
        UserController userController = new UserController();
        if(userController.hasUserExisted(inputtedUsername))
        {
            JOptionPane.showMessageDialog(this,"The username has already existed, please try again.");
        }
        else if(inputtedUsername.isEmpty() || inputtedPassword.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Both username and password are required to create an account");
        }
        else
        {
            managerController.editManagerAcc(loggedInManagerId,inputtedUsername,inputtedPassword);
            ManagerDashboard managerDashboard = new ManagerDashboard(loggedInManagerId);
            managerDashboard.setVisible(true);
            setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_btnSaveEditManagerAccActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        ManagerDashboard md = new ManagerDashboard(loggedInManagerId);
        md.setVisible(true);
        setVisible(false);
        dispose(); 
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(EditManagerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditManagerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditManagerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditManagerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new EditManagerAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnSaveEditManagerAcc;
    private javax.swing.JLabel lblEditManagerCurrentPassword;
    private javax.swing.JLabel lblEditManagerCurrentUsername;
    private javax.swing.JLabel lblEditManagerNewPassword;
    private javax.swing.JLabel lblEditManagerNewUsername;
    private javax.swing.JLabel lblLoginUsername1;
    private javax.swing.JTextField tbxEditManagerCurrentPassword;
    private javax.swing.JTextField tbxEditManagerCurrentUsername;
    private javax.swing.JTextField tbxEditManagerNewPassword;
    private javax.swing.JTextField tbxEditManagerNewUsername;
    // End of variables declaration//GEN-END:variables
}
