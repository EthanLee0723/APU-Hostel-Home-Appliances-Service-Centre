/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import models.Managers;
import controller.EditManagerAccController;
import view.ManagerDashboard;
/**
 *
 * @author User
 */
public class EditManagerAccount extends javax.swing.JFrame {
    private Managers currentManager;
    /**
     * Creates new form EditManagerAccount
     */
    public EditManagerAccount(Managers managerDetails){
        currentManager = managerDetails;
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

        lblNewUsername = new javax.swing.JLabel();
        tbxCurrentPassword = new javax.swing.JTextField();
        lblCurrentPassword = new javax.swing.JLabel();
        tbxCurrentUsername = new javax.swing.JTextField();
        lblCurrentUsername1 = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        tbxNewPassword = new javax.swing.JTextField();
        tbxNewUsername = new javax.swing.JTextField();
        btnSaveEditManagerAcc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 800));

        lblNewUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNewUsername.setText("New Username:");
        lblNewUsername.setToolTipText("");
        lblNewUsername.setPreferredSize(new java.awt.Dimension(200, 50));

        tbxCurrentPassword.setEditable(false);
        tbxCurrentPassword.setBackground(new java.awt.Color(255, 255, 255));
        tbxCurrentPassword.setText(currentManager.getPassword());

        lblCurrentPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCurrentPassword.setText("Current Password:");
        lblCurrentPassword.setToolTipText("");
        lblCurrentPassword.setPreferredSize(new java.awt.Dimension(200, 50));

        tbxCurrentUsername.setEditable(false);
        tbxCurrentUsername.setBackground(new java.awt.Color(255, 255, 255));
        tbxCurrentUsername.setText(currentManager.getUsername()
        );

        lblCurrentUsername1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCurrentUsername1.setText("Current Username:");
        lblCurrentUsername1.setToolTipText("");
        lblCurrentUsername1.setPreferredSize(new java.awt.Dimension(200, 50));

        lblNewPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNewPassword.setText("New Password:");
        lblNewPassword.setToolTipText("");
        lblNewPassword.setPreferredSize(new java.awt.Dimension(200, 50));

        btnSaveEditManagerAcc.setText("Save");
        btnSaveEditManagerAcc.setPreferredSize(new java.awt.Dimension(200, 50));
        btnSaveEditManagerAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEditManagerAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSaveEditManagerAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCurrentUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbxCurrentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbxCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbxNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbxNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxCurrentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnSaveEditManagerAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveEditManagerAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEditManagerAccActionPerformed
        String inputtedUsername = tbxNewUsername.getText();
        String inputtedPassword = tbxNewPassword.getText();
        Managers editedManager = new Managers();
        editedManager.setId(currentManager.getId());
        editedManager.setUsername(inputtedUsername);
        editedManager.setPassword(inputtedPassword);
        EditManagerAccController editManagerAccController = new EditManagerAccController();
        editManagerAccController.editManagerAcc(editedManager);
        ManagerDashboard managerDashboard = new ManagerDashboard(currentManager);
        managerDashboard.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnSaveEditManagerAccActionPerformed

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
    private javax.swing.JButton btnSaveEditManagerAcc;
    private javax.swing.JLabel lblCurrentPassword;
    private javax.swing.JLabel lblCurrentUsername1;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblNewUsername;
    private javax.swing.JTextField tbxCurrentPassword;
    private javax.swing.JTextField tbxCurrentUsername;
    private javax.swing.JTextField tbxNewPassword;
    private javax.swing.JTextField tbxNewUsername;
    // End of variables declaration//GEN-END:variables
}
