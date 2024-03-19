package view;
import controller.TechnicianController;
import view.EditTechnicianAccount;
import java.util.HashMap;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class EditTechnicianSelection extends javax.swing.JFrame {
    private ArrayList<HashMap<String, Object>> allTechnicians;
    private int loggedInManagerid;
    /**
     * Creates new form EditTechnicianSelection
     */
    //array to get the technician account
    public EditTechnicianSelection() {
        TechnicianController technicianController = new TechnicianController();
        allTechnicians = technicianController.getAllTechnicianList();
        String [] technicianModel = new String[allTechnicians.size()];
        
        
        for(int x = 0;x < allTechnicians.size();x++)
        {
            technicianModel[x] = allTechnicians.get(x).get("username").toString();
        }
        initComponents();
        combobxEditTechnicianSelection.setModel(new javax.swing.DefaultComboBoxModel<>(technicianModel));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditTechnicianSelection = new javax.swing.JButton();
        combobxEditTechnicianSelection = new javax.swing.JComboBox<>();
        lblEditTechnicianSelection = new javax.swing.JLabel();
        lblLoginUsername1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEditTechnicianSelection.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEditTechnicianSelection.setText("Next");
        btnEditTechnicianSelection.setPreferredSize(new java.awt.Dimension(200, 50));
        btnEditTechnicianSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTechnicianSelectionActionPerformed(evt);
            }
        });

        combobxEditTechnicianSelection.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combobxEditTechnicianSelection.setPreferredSize(new java.awt.Dimension(200, 50));

        lblEditTechnicianSelection.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEditTechnicianSelection.setText("Select Technician to edit:");
        lblEditTechnicianSelection.setPreferredSize(new java.awt.Dimension(200, 50));

        lblLoginUsername1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblLoginUsername1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLoginUsername1.setText("Technician Selections");
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
                        .addGap(111, 111, 111)
                        .addComponent(lblEditTechnicianSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditTechnicianSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combobxEditTechnicianSelection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(lblLoginUsername1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(back)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lblLoginUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEditTechnicianSelection, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(combobxEditTechnicianSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(btnEditTechnicianSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //jump to edit technican page
    private void btnEditTechnicianSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTechnicianSelectionActionPerformed
        int selectedInd = combobxEditTechnicianSelection.getSelectedIndex();
        EditTechnicianAccount editTechnnicianAccount = new EditTechnicianAccount(Integer.parseInt(allTechnicians.get(selectedInd).get("id").toString()),"null");
        editTechnnicianAccount.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnEditTechnicianSelectionActionPerformed

    //back button
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        ManagerDashboard md = new ManagerDashboard(loggedInManagerid);
        md.setVisible(true);
        setVisible(false);
        dispose();         // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(EditTechnicianSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTechnicianSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTechnicianSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTechnicianSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTechnicianSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnEditTechnicianSelection;
    private javax.swing.JComboBox<String> combobxEditTechnicianSelection;
    private javax.swing.JLabel lblEditTechnicianSelection;
    private javax.swing.JLabel lblLoginUsername1;
    // End of variables declaration//GEN-END:variables
}
