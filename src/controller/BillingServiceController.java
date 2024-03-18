/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author GENJI
 */
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
import models.Biling;
import controller.BillingServiceController;


public class BillingServiceController {
    
    public BillingServiceController() {
    }
    
    public List<Biling> getAll() {
        List<Biling> labourList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("storage/Billing.txt"))) {
            while (scanner.hasNextLine()) {

                String bilingLine = scanner.nextLine();

                String bilingInfo[] = bilingLine.split(",");

                Biling billing = new Biling(bilingInfo[0], bilingInfo[1], Double.parseDouble(bilingInfo[2]), bilingInfo[3], bilingInfo[4], bilingInfo[5]);

                labourList.add(billing);
            }
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(DeleteBiling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return labourList;
    }
    
    public void create(Biling biling) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/Billing.txt", true))) {
            pw.println(biling.getApptname() + "," + biling.getDate() + "," + biling.getAmount()+ "," + biling.getName()+ "," + biling.getBankname()+ "," + biling.getRecipient());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BillingServiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
