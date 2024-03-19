/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.Managers;
import models.Technicians;
import models.Customers;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.ManagerDashboard;
import view.TechnicianDashboard;
import view.Login;
/**
 *
 * @author User
 */
public class LoginController {
    public LoginController()
    {
        
    }
    
    //search match manager data with username and password
    public boolean isManagerLoginDetailsMatch(String username,String password)
    {
        Managers managers = new Managers();
        ArrayList<Managers> allManagers = managers.getAllManagerList();
        for(int x = 0;x < allManagers.size();x++)
        {
            boolean isUsernameMatch = allManagers.get(x).getUsername().equals(username);
            boolean isPasswordMatch = allManagers.get(x).getPassword().equals(password);
            
            if(isUsernameMatch && isPasswordMatch)
            {
                return true;
            }
            
            return false;
        }
        
        
        return false;
    }
    
    //search matching technician account
    public boolean isTechnicianLoginDetailsMatch(String username,String password)
    {
        Technicians technician = new Technicians();
        ArrayList<Technicians> allTechnicians = technician.getAllTechnicianList();
        for(int x = 0;x < allTechnicians.size();x++)
        {
            boolean isUsernameMatch = allTechnicians.get(x).getUsername().equals(username);
            boolean isPasswordMatch = allTechnicians.get(x).getPassword().equals(password);
            
            if(isUsernameMatch && isPasswordMatch)
            {
                return true;
            }
            
            return false;
        }
        
        
        return false;
    }
    
    //search matching customer account
    public boolean isCustomerLoginDetailsMatch(String username,String password)
    {
        Customers customers = new Customers();
        ArrayList<Customers> allCustomers = customers.getAllCustomerList();
        for(int x = 0;x < allCustomers.size();x++)
        {
            boolean isUsernameMatch = allCustomers.get(x).getUsername().equals(username);
            boolean isPasswordMatch = allCustomers.get(x).getPassword().equals(password);
            
            if(isUsernameMatch && isPasswordMatch)
            {
                return true;
            }
            
            return false;
        }
        
        
        return false;
    }
    
    //search matching user account
    public String userLogIn(String username,String password,Login login)
    {
        Managers manager = new Managers(username,password);
        Customers customer = new Customers(username,password);
        Technicians technician = new Technicians(username,password);
        String loginStatus = "success";
        if(manager.getId() != 0)
        {
            JOptionPane.showMessageDialog(null, "Manager Login Sucess: " + manager.getUsername());
            System.out.println(manager.getId());
            ManagerDashboard managerDashboard = new ManagerDashboard(manager.getId());
            login.setVisible(false);
            login.dispose();
            managerDashboard.setVisible(true);
        }
        else if(technician.getId() != 0)
        {
            JOptionPane.showMessageDialog(null, "Technician Login Sucess: " + technician.getUsername());
            TechnicianDashboard technicianDashboard = new TechnicianDashboard(technician.getId());
            login.setVisible(false);
            login.dispose();
            technicianDashboard.setVisible(true);
        }
        else if(customer.getId() != 0)
        {
            loginStatus = "customer";
        }
        else
        {
            loginStatus = "fail";
        }
        
        return loginStatus;
    }
    
    //generate user default account
    public void generateDefaultUserFile()
    {
        Managers manager = new Managers();
        Customers customer = new Customers();
        Technicians technician = new Technicians();
    }
}
