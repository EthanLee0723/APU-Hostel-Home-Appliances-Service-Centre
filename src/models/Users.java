package models;
import java.util.HashMap;
import java.util.ArrayList;
import models.Customers;
import models.Managers;
import models.Technicians;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Users{
    private int id;
    private String username;
    private String password;
    
    public int getId()
    {
        return id;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setId(int newId)
    {
        id = newId;
    }
    
    public void setUsername(String newUsername)
    {
        username = newUsername;
    }
    
    public void setPassword(String newPassword)
    {
        password = newPassword;
    }
    
//    public ArrayList<HashMap<String, Object>> getAllUsers()
//    {
//        ArrayList<HashMap<String, Object>> userList = new ArrayList<HashMap<String, Object>>();
//        HashMap<String, Object> userDetails = new HashMap<String, Object>();
//        Managers managers = new Managers();
//        Technicians technicians = new Technicians();
//        Customers customers = new Customers();
//        ArrayList<Managers> allManagers = managers.getAllManagerList();
//        ArrayList<Technicians> allTechnicians = technicians.getAllTechnicianList();
//        ArrayList<Customers> allCustomers = customers.getAllCustomerList();
//        
//        for(int x = 0;x < allManagers.size();x++)
//        {
//            userDetails.put("id",allManagers.get(x).getId());
//            userDetails.put("username",allManagers.get(x).getUsername());
//            userDetails.put("password",allManagers.get(x).getPassword());
//            userList.add(userDetails);
//        }
//        
//        for(int x = 0;x < allTechnicians.size();x++)
//        {
//            userDetails.put("id",allTechnicians.get(x).getId());
//            userDetails.put("username",allTechnicians.get(x).getUsername());
//            userDetails.put("password",allTechnicians.get(x).getPassword());
//            userList.add(userDetails);
//        }
//        
//        for(int x = 0;x < allCustomers.size();x++)
//        {
//            userDetails.put("id",allCustomers.get(x).getId());
//            userDetails.put("username",allCustomers.get(x).getUsername());
//            userDetails.put("password",allCustomers.get(x).getPassword());
//            userList.add(userDetails);
//        }
//        
//        System.out.println(userList);
//        
//        return userList;
//    }
    
    
    public ArrayList<Users> getAllUsers()
    {
        ArrayList<Users> userList = new ArrayList<Users>();
        
        Managers managers = new Managers();
        Technicians technicians = new Technicians();
        Customers customers = new Customers();
        ArrayList<Managers> allManagers = managers.getAllManagerList();
        ArrayList<Technicians> allTechnicians = technicians.getAllTechnicianList();
        ArrayList<Customers> allCustomers = customers.getAllCustomerList();
        
        for(int x = 0;x < allManagers.size();x++)
        {
            Users userDetails = new Users();
            userDetails.setId(allManagers.get(x).getId());
            userDetails.setUsername(allManagers.get(x).getUsername());
            userDetails.setPassword(allManagers.get(x).getPassword());
            userList.add(userDetails);
        }
        
        for(int x = 0;x < allTechnicians.size();x++)
        {
            Users userDetails = new Users();
            userDetails.setId(allTechnicians.get(x).getId());
            userDetails.setUsername(allTechnicians.get(x).getUsername());
            userDetails.setPassword(allTechnicians.get(x).getPassword());
            userList.add(userDetails);
        }
        
        for(int x = 0;x < allCustomers.size();x++)
        {
            Users userDetails = new Users();
            userDetails.setId(allCustomers.get(x).getId());
            userDetails.setUsername(allCustomers.get(x).getUsername());
            userDetails.setPassword(allCustomers.get(x).getPassword());
            userList.add(userDetails);
        }
        
        return userList;
    }
}
