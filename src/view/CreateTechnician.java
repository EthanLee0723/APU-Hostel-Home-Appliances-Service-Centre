/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.TechnicianController;
import controller.UserController;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class CreateTechnician extends javax.swing.JFrame {
    private int loggedInManagerid;
    /**
     * Creates new form CreateTechnician
     */
    public CreateTechnician() {
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

        tbxCreateTechnicianUsername = new javax.swing.JTextField();
        tbxCreateTechnicianPwd = new javax.swing.JPasswordField();
        lblCreateTechnician = new javax.swing.JLabel();
        lblCreateTechnicianPwd = new javax.swing.JLabel();
        btnCreateTechnician = new javax.swing.JButton();
        lblLoginUsername1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbxCreateTechnicianUsername.setPreferredSize(new java.awt.Dimension(200, 50));

        tbxCreateTechnicianPwd.setPreferredSize(new java.awt.Dimension(200, 50));

        lblCreateTechnician.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCreateTechnician.setText("USERNAME");
        lblCreateTechnician.setPreferredSize(new java.awt.Dimension(200, 50));

        lblCreateTechnicianPwd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCreateTechnicianPwd.setText("PASSWORD");
        lblCreateTechnicianPwd.setPreferredSize(new java.awt.Dimension(200, 50));

        btnCreateTechnician.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCreateTechnician.setText("Create");
        btnCreateTechnician.setPreferredSize(new java.awt.Dimension(200, 50));
        btnCreateTechnician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTechnicianActionPerformed(evt);
            }
        });

        lblLoginUsername1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblLoginUsername1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLoginUsername1.setText("EDIT TECHNICIAN PROFILE");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbxCreateTechnicianUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(tbxCreateTechnicianPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(417, 417, 417))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addComponent(lblLoginUsername1)
                .addGap(333, 333, 333))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCreateTechnicianPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(432, 432, 432))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCreateTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(430, 430, 430))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(lblLoginUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(lblCreateTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbxCreateTechnicianUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lblCreateTechnicianPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbxCreateTechnicianPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnCreateTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(back)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateTechnicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTechnicianActionPerformed
        String inputtedUsername =  tbxCreateTechnicianUsername.getText();
        String inputtedPassword = tbxCreateTechnicianPwd.getText();
        TechnicianController technicianController = new TechnicianController();
        UserController userController = new UserController();
        if(userController.hasUserExisted(inputtedUsername))
        {
            JOptionPane.showMessageDialog(this,"The username has already existed, please try again.");
        }
        else
        {
             technicianController.createNewTechnician(inputtedUsername, inputtedPassword);
        }
    }//GEN-LAST:event_btnCreateTechnicianActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        ManagerDashboard md = new ManagerDashboard(loggedInManagerid);
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
            java.util.logging.Logger.getLogger(CreateTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTechnician().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnCreateTechnician;
    private javax.swing.JLabel lblCreateTechnician;
    private javax.swing.JLabel lblCreateTechnicianPwd;
    private javax.swing.JLabel lblLoginUsername1;
    private javax.swing.JPasswordField tbxCreateTechnicianPwd;
    private javax.swing.JTextField tbxCreateTechnicianUsername;
    // End of variables declaration//GEN-END:variables
}
