/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Appt;

import javax.swing.*;
import models.Appt;
import controller.ApptServiceController;
import controller.CustomerController;
import controller.TechnicianController;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UpdateApt extends javax.swing.JFrame {

    private final ApptServiceController apptService;
    private static Map<String, String[]> detailsMap = new HashMap<>();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    /**
     * Creates new form ModifyAppt
     */
    
    //get the list of technician and customer
    public UpdateApt() {
        ArrayList<HashMap<String, Object>> allTechnicians;
        ArrayList<HashMap<String, Object>> allCustomers;
        TechnicianController technicianController = new TechnicianController();
        allTechnicians = technicianController.getAllTechnicianList();
        String [] technicianModel = new String[allTechnicians.size()];
        CustomerController customerController = new CustomerController();
        allCustomers = customerController.getAllCustomerList();
        String [] customerModel = new String[allCustomers.size()];
        
        for(int x = 0;x < allTechnicians.size();x++)
        {
            technicianModel[x] = allTechnicians.get(x).get("username").toString();
        }
        
        for(int x = 0;x < allCustomers.size();x++)
        {
            customerModel[x] = allCustomers.get(x).get("username").toString();
        }
        initComponents();
        this.apptService = new ApptServiceController();
        cbxUpdateApptCustomerName.setModel(new javax.swing.DefaultComboBoxModel<>(customerModel));
        cbxUpdateApptTechnician.setModel(new javax.swing.DefaultComboBoxModel<>(technicianModel));
        performFileRelatedTask();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mServiceType = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        mPaymentStatus = new javax.swing.JComboBox<>();
        updateButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        modText = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        modName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mTime = new javax.swing.JTextField();
        mAmount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mFeedback = new javax.swing.JTextField();
        mDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backButton1 = new javax.swing.JButton();
        cbxUpdateApptTechnician = new javax.swing.JComboBox<>();
        cbxUpdateApptCustomerName = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Update Appointment");

        jPanel3.setBackground(new java.awt.Color(211, 211, 211));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mServiceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room Cleaning", "Bed Linen Change", "Breakfast", "Laundry", "Tour Guide" }));

        jLabel9.setText("Enter New Service Type");

        mPaymentStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Success", "Failed" }));
        mPaymentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPaymentStatusActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Enter New Payment Status");

        modText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null" }));
        modText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modTextActionPerformed(evt);
            }
        });

        jLabel11.setText("Enter New Technician");

        jLabel2.setText("Enter New Name");

        jLabel12.setText("Enter New Time");

        jLabel4.setText("Enter New Date");

        jLabel13.setText("Enter New Customer Name");

        text.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(text);

        jLabel14.setText("Enter New Feedback");

        jLabel8.setText("Enter New Amount");

        jLabel3.setText("Enter appoinment name to update information");

        backButton1.setText("Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(modName)
                                    .addComponent(modText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mDate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mPaymentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(cbxUpdateApptTechnician, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mTime)
                                            .addComponent(mServiceType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(backButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(updateButton))
                            .addComponent(mFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(cbxUpdateApptCustomerName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(96, 96, 96))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {mAmount, mDate, mFeedback, mPaymentStatus, mServiceType, mTime, modName, modText});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(modName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mServiceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(mPaymentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUpdateApptTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUpdateApptCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton1)
                    .addComponent(updateButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {mAmount, mDate, mFeedback, mPaymentStatus, mServiceType, mTime, modName, modText});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mPaymentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPaymentStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPaymentStatusActionPerformed

    //read the data to show table data
    private static String[] readDetailsFromFile(String filePath, String selectedName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].equals(selectedName)) {
                    return parts;
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle or log the error
        }
        return null; // Name not found or error occurred
    }
    
    //find the specific account and auto pump in data
    private void performFileRelatedTask() {
        modText.removeAllItems();
        modText.addItem("");
        String[] columnNames = {"Name", "Date", "Time", "Service Type", "Amount", "Payment Status", "Technician Name", "Customer Name", "Feedback"};
         // Create DefaultTableModel with column names
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Set the table model to your table component
        text.setModel(model);
        
        apptService.getAll().forEach((appt) -> {
            model.addRow(new Object[]{
                appt.getName(),
                appt.getDate(),
                appt.getTime(),
                appt.getServiceType(),
                appt.getAmount(),
                appt.getPaymentStatus(),
                appt.getTechnician(),
                appt.getCustomerName(),
                appt.getFeedback()
            });
        });
        
        try {
            // Read all lines from the file into a list
            for (String line : Files.readAllLines(Paths.get("storage/appointment.txt"))) {
                String[] parts = line.split(",");
                if (parts.length > 0) {
                    String name = parts[0];
                    modText.addItem(name);
                    detailsMap.put(name, parts);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle or log the error
        }

        // Add ActionListener to the JComboBox
        modText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> source = (JComboBox<String>) e.getSource();
                String selectedName = (String) source.getSelectedItem();
                if (selectedName != null) {
                    // Retrieve details from the map based on the selected name
                    String[] details = detailsMap.get(selectedName);
                    if (details != null) {
                        // Auto-fill other text fields
                        modName.setText(details[0]); 
                        mDate.setText(details[1]); 
                        mTime.setText(details[2]); 
                        mServiceType.setSelectedItem(details[3]); 
                        mAmount.setText(details[4]); 
                        mPaymentStatus.setSelectedItem(details[5]); 
                        cbxUpdateApptTechnician.setSelectedItem(details[6]); 
                        cbxUpdateApptCustomerName.setSelectedItem(details[7]); 
                        mFeedback.setText(details[8]); 
                        
                    }
                }
            }
        });
        
    }
    
    //validation
    private boolean isValidDate(String date) {
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    //validation time
    private boolean isValidTime(String time) {
        // Validate time format
        if (!time.matches("\\d{2}:\\d{2}(AM|PM|am|pm)")) {
            return false; // Invalid format
        }
        return true;
    }
    
    //validation duplicate name
    private boolean isDuplicateName(String name) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("storage/appointment.txt"));
            for (String line : lines) {
                // Split the line to extract the appointment name
                String[] parts = line.split(",");
                String existingName = parts[0]; // Assuming the name is the first column

                // Check if the name already exists
                if (existingName.equals(name)) {
                    return true; // Found a duplicate name
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle or log the error
        }
        return false; // No duplicate names found
    }
    
    //update button and use validation to filter the input
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String name = (String) modText.getSelectedItem();
        String mName = modName.getText();
        String date = mDate.getText();
        String time = mTime.getText();
        String feedback = mFeedback.getText();
        String amount = mAmount.getText();
        String paymentStatus = (String) mPaymentStatus.getSelectedItem();
        String selectedServiceType = (String) mServiceType.getSelectedItem();
        String technicianName = cbxUpdateApptTechnician.getSelectedItem().toString();
        String customerName = cbxUpdateApptCustomerName.getSelectedItem().toString();

        if(name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Edit appointment name cannot be empty");
            return;
        }
        if(!amount.isEmpty()){
            if (!amount.matches("\\d+(\\.\\d+)?")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid amount for the appointment");
                return;
            }

            // Now, if the amount is in a valid format, check if it's <= 0
            if (Double.parseDouble(amount) <= 0) {
                JOptionPane.showMessageDialog(this, "Please enter a valid amount for the appointment");
                return;
            }
        }

        if(!date.isEmpty() || !date.matches("\\d{4}-\\d{2}-\\d{2}") || !isValidDate(date)){
            if (!date.matches("\\d{4}-\\d{2}-\\d{2}") || !isValidDate(date)) {
                JOptionPane.showMessageDialog(this, "Please enter a valid date for the appointment");
                return;
            }
        }

        if(!time.isEmpty() || !isValidTime(time) ){
            if (!isValidTime(time)) {
                JOptionPane.showMessageDialog(this, "Please enter a valid time for the appointment");
                return;
            }
        }

        if(customerName.isEmpty() ) {
            customerName = null;

        }

        if(technicianName.isEmpty() ) {
            technicianName = null;

        }

        if(feedback.isEmpty() ) {
            feedback = null;

        }

        Appt updatedAppt = new Appt(mName,date,time,selectedServiceType,Double.parseDouble(mAmount.getText()),paymentStatus,technicianName,customerName,feedback);

        boolean isUpdated = apptService.update(name, updatedAppt);

        if (!isUpdated) {
            JOptionPane.showMessageDialog(this, "No appointment name was found to updated.");
            return;
        }

        modText.setSelectedItem("");
        modName.setText("");
        mDate.setText("");
        mTime.setText("");
        mServiceType.setSelectedItem("");
        mAmount.setText("");
        mFeedback.setText("");
        mPaymentStatus.setSelectedItem("");
        JOptionPane.showMessageDialog(this, "Appointment has been modify");

        // Update display information
        performFileRelatedTask();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        ApptManagement im = new ApptManagement();
        im.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void modTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modTextActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateApt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JComboBox<String> cbxUpdateApptCustomerName;
    private javax.swing.JComboBox<String> cbxUpdateApptTechnician;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mAmount;
    private javax.swing.JTextField mDate;
    private javax.swing.JTextField mFeedback;
    private javax.swing.JComboBox<String> mPaymentStatus;
    private javax.swing.JComboBox<String> mServiceType;
    private javax.swing.JTextField mTime;
    private javax.swing.JTextField modName;
    private javax.swing.JComboBox<String> modText;
    private javax.swing.JTable text;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
