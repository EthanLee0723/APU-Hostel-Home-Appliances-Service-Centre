/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.HashMap;
import models.Customers;
import models.Customers;


/**
 *
 * @author User
 */
public class CustomerController {
    public void createCustomer(String newUsername,String newPassword)
    {   
        Customers newCustomer = new Customers();
        newCustomer.setUsername(newUsername);
        newCustomer.setPassword(newPassword);
        newCustomer.createNewCustomer();
    }
    
    public void editCustomerAcc(int customerId,String editedUsername,String editedPwd)
    {
        Customers customer = new Customers();
        customer.setId(customerId);
        customer.setUsername(editedUsername);
        customer.setPassword(editedPwd);
        customer.editCustomer();
    }
    
    public ArrayList<HashMap<String, Object>> getAllCustomerList()
    {
        Customers customers = new Customers();
        ArrayList<Customers> allCustomers = customers.getAllCustomerList();
        ArrayList<HashMap<String, Object>> mapAllCustomers = new ArrayList<HashMap<String, Object>>();
        
        
        for(int x = 0;x < allCustomers.size();x++)
        {
            HashMap<String, Object> customerDetails = new HashMap<String, Object>();
            customerDetails.put("id",allCustomers.get(x).getId());
            customerDetails.put("username",allCustomers.get(x).getUsername());
            customerDetails.put("password",allCustomers.get(x).getPassword());
            mapAllCustomers.add(customerDetails);
        }
        
        return mapAllCustomers;
    }
    
    public HashMap<String, Object> getCustomerDetails(int customerId)
    {
        Customers customers = new Customers(customerId);
        HashMap<String, Object> customerDetails = new HashMap<>();
        customerDetails.put("id",customers.getId());
        customerDetails.put("username",customers.getUsername());
        customerDetails.put("password", customers.getPassword());
        return customerDetails;
    }
    
    public boolean isCustomerDatabaseEmpty()
    {
        return getAllCustomerList().size() == 0;
    }
}
