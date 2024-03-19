/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import controller.Appt.UpdateApt;
import models.Appt;
import controller.ApptServiceController;
/**
 *
 * @author GENJI
 */
public class ApptServiceController {
    public ApptServiceController() {
    }

    //get the data
    public List<Appt> getAll() {
        List<Appt> appts = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("storage/appointment.txt"))) {
            while (scanner.hasNextLine()) {
                String apptLine = scanner.nextLine();

                String apptInfo[] = apptLine.split(",");

                Appt appt = new Appt(apptInfo[0],apptInfo[1],apptInfo[2],apptInfo[3],Double.parseDouble(apptInfo[4]),apptInfo[5]
                        ,apptInfo[6],apptInfo[7],apptInfo[8]);

                appts.add(appt);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ApptServiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return appts;
    }
    
    //get data with technician name
    public List<Appt> getAllbyTechnicianName(String name) {
        List<Appt> appts = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("storage/appointment.txt"))) {
            while (scanner.hasNextLine()) {
                String apptLine = scanner.nextLine();

                String apptInfo[] = apptLine.split(",");
                if (apptInfo[6].equals(name)) {
                    Appt appt = new Appt(apptInfo[0],apptInfo[1],apptInfo[2],apptInfo[3],Double.parseDouble(apptInfo[4]),apptInfo[5]
                        ,apptInfo[6],apptInfo[7],apptInfo[8]);

                    appts.add(appt);
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ApptServiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return appts;
    }
    
    //get appointment by index
    public Appt getApptByIndex(int index) {
        List<Appt> listOfAppt = getAll();

        if (listOfAppt.size() >= index) {
            return listOfAppt.get(index - 1);
        }

        return null;
    }

    //create appoint function and save in text file
    public void create(Appt appt) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/appointment.txt", true))) {
            pw.println(appt.getName() + "," + appt.getDate() + "," + appt.getTime()+ "," + appt.getServiceType()+ "," + appt.getAmount()+ "," + appt.getPaymentStatus()+ "," + appt.getTechnician()+ "," + appt.getCustomerName()+ "," + appt.getFeedback());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ApptServiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //delete function from text file
    public synchronized boolean delete(String name) {

        List<Appt> apptList = getAll();

        int indexToBeDeleted = -1;
        // find the appt to be deleted
        for (int i = 0; i < apptList.size(); i++) {
            Appt appt = apptList.get(i);

            if (appt.getName().equalsIgnoreCase(name)) {
                indexToBeDeleted = i;
            }
        }

        if (indexToBeDeleted == -1) {
            return false;
        }
        apptList.remove(indexToBeDeleted);

        try {
            // Delete the entire file
            Files.delete(Paths.get("storage/appointment.txt"));
        } catch (IOException ex) {
            Logger.getLogger(ApptServiceController.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Create a new file and write new data into the file
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/appointment.txt"))) {
            apptList.forEach(appt -> {
                pw.println(appt.getName() + "," + appt.getDate() + "," + appt.getTime()+ "," + appt.getServiceType()+ "," + appt.getAmount()+ "," + appt.getPaymentStatus()+ "," + appt.getTechnician()+ "," + appt.getCustomerName()+ "," + appt.getFeedback());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ApptServiceController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    //update function from text file
    public synchronized boolean update(String srcName, Appt updatedAppt) {
        List<Appt> apptList = new ArrayList<>();

        // Read all the appt
        try (Scanner scanner = new Scanner(new FileInputStream("storage/appointment.txt"))) {
            while (scanner.hasNextLine()) {
                String apptLine = scanner.nextLine();

                String apptInfo[] = apptLine.split(",");

                Appt appt = new Appt(apptInfo[0],apptInfo[1],apptInfo[2],apptInfo[3],Double.parseDouble(apptInfo[4]),apptInfo[5]
                        ,apptInfo[6],apptInfo[7],apptInfo[8]);
                apptList.add(appt);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UpdateApt.class.getName()).log(Level.SEVERE, null, ex);
        }

        int apptIndexToUpdate = -1;

        for (int i = 0; i < apptList.size(); i++) {
            Appt appt = apptList.get(i);

            if (appt.getName().equalsIgnoreCase(srcName)) {
                apptIndexToUpdate = i;
            }
        }

        if (apptIndexToUpdate == -1) {
            return false;
        }

        apptList.set(apptIndexToUpdate, updatedAppt);

        try {
            Files.delete(Paths.get("storage/appointment.txt"));
        } catch (IOException ex) {
            Logger.getLogger(UpdateApt.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/appointment.txt"))) {
            apptList.forEach(appt -> {
                pw.println(appt.getName() + "," + appt.getDate() + "," + appt.getTime()+ "," + appt.getServiceType()+ "," + appt.getAmount()+ "," + appt.getPaymentStatus()+ "," + appt.getTechnician()+ "," + appt.getCustomerName()+ "," + appt.getFeedback());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UpdateApt.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    //reduce appointment quantity by appointment name
    public synchronized void reduceApptQuantityByApptName(String apptName, int reduceNumber) {
        List<Appt> apptList = getAll();

        for (int i = 0; i < apptList.size(); i++) {

            Appt appt = apptList.get(i);

        //            if (appt.getName().equalsIgnoreCase(apptName)) {
        //                appt.setQuantity(Math.max(0, appt.getQuantity() - reduceNumber));
        //                apptList.set(i, appt);
        //            }
        }

        try {
            Files.delete(Paths.get("storage/appointment.txt"));
        } catch (IOException ex) {
            Logger.getLogger(ApptServiceController.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/appointment.txt"))) {
            apptList.forEach(appt -> {
                pw.println(appt.getName() + "," + appt.getDate() + "," + appt.getTime()+ "," + appt.getServiceType()+ "," + appt.getAmount()+ "," + appt.getPaymentStatus()+ "," + appt.getTechnician()+ "," + appt.getCustomerName()+ "," + appt.getFeedback());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ApptServiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
