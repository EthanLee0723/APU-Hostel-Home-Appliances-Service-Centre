package models;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Customers {
    private File file = new File("src/database/Customers.txt");
    private int id;
    private String username;
    private String password;
    
    public Customers()
    {
        if(!isFileExists())
        {
            createDefaultFile();
        }
    }
    
    public Customers(String username)
    {
        ArrayList<Customers> allCustomers = getAllCustomerList();
        Customers customerDetails = new Customers();
        for(int x = 0;x < allCustomers.size();x++)
        {
            if(allCustomers.get(x).getUsername().equals(username))
            {
                setId(allCustomers.get(x).getId());
                setUsername(allCustomers.get(x).getUsername());
                setPassword(allCustomers.get(x).getPassword());
                break;
            }
        }
    }
    
    public Customers(int customerId)
    {
        ArrayList<Customers> allCustomers = getAllCustomerList();
        for(int x = 0;x < allCustomers.size();x++)
        {
            if(allCustomers.get(x).getId() == customerId)
            {
                setId(allCustomers.get(x).getId());
                setUsername(allCustomers.get(x).getUsername());
                setPassword(allCustomers.get(x).getPassword());
                break;
            }
        }
    }
    
    public Customers(String username,String password)
    {
        ArrayList<Customers> allCustomers = getAllCustomerList();
        Customers customerDetails = new Customers();
        for(int x = 0;x < allCustomers.size();x++)
        {
            if(allCustomers.get(x).getUsername().equals(username) && allCustomers.get(x).getPassword().equals(password))
            {
                setId(allCustomers.get(x).getId());
                setUsername(allCustomers.get(x).getUsername());
                setPassword(allCustomers.get(x).getPassword());
                break;
            }
        }
    }
    
    public Customers(int newId,String newUsername,String newPassword)
    {
        setId(newId);
        setUsername(newUsername);
        setPassword(newPassword);
    }
    
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
    
    public ArrayList<Object> readFile()
    {
        ArrayList<Object> readFile = new ArrayList<Object>();
        try
        {
           Scanner inputFile = new Scanner(file);
           boolean isFirstLoop = true;
           while(inputFile.hasNextLine())
           {
               if(isFirstLoop)
               {
                   readFile.add(inputFile.nextLine());
                   isFirstLoop = false;
               }
               else
               {
                   Customers customerDetails = new Customers(Integer.parseInt(inputFile.nextLine()),inputFile.nextLine(),inputFile.nextLine());
                   readFile.add(customerDetails);
               }
           }
           inputFile.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        return readFile;
    }
    
    public ArrayList<Customers> getAllCustomerList()
    {
        ArrayList<Object> readFile = readFile();
        ArrayList<Customers> allCustomers = new ArrayList<Customers>();
        for(int x = 1;x < readFile.size();x++)
        {
            Customers customerDetails = (Customers) readFile.get(x);
            allCustomers.add(customerDetails);
        }
        return allCustomers;
    }
    
    
    
    public void createDefaultFile()
    {
        try
        {
            PrintWriter outputFile = new PrintWriter(file);
            outputFile.println("0");
            outputFile.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public boolean isFileExists()
    {
        try
        {
            Scanner inputFile = inputFile = new Scanner(file);
        }
        catch(IOException e)
        {
            return false;
        }
        
        return true;
    }
    
    public void createNewCustomer()
    {
        ArrayList<Object> readFile = readFile();
        try
        {
            PrintWriter outputFile = new PrintWriter(file);
            int latestPrimaryKey =  Integer.parseInt(readFile.get(0).toString());
            latestPrimaryKey++;
            outputFile.println(latestPrimaryKey);
            for(int x = 1;x < readFile.size();x++)
            {
                Customers customerDetails = (Customers)readFile.get(x);
                outputFile.println(customerDetails.getId());
                outputFile.println(customerDetails.getUsername());
                outputFile.println(customerDetails.getPassword());
            }
            
            outputFile.println(latestPrimaryKey);
            outputFile.println(getUsername());
            outputFile.println(getPassword());
            outputFile.close();
        }
        catch(IOException e)
        {
            
        }
    }
    
    public void editCustomer()
    {
        ArrayList<Object> readFile = readFile();
        try
        {
            PrintWriter outputFile = new PrintWriter(file);
            for(int x = 0;x < readFile.size();x++)
            {
                if(x == 0)
                {
                    outputFile.println(readFile.get(x));
                }
                else
                {
                    Customers customerDetails = (Customers)readFile.get(x);
                    outputFile.println(customerDetails.getId());
                    if(customerDetails.getId() == getId())
                    {
                        outputFile.println(getUsername());
                        outputFile.println(getPassword());
                    }
                    else
                    {
                        outputFile.println(customerDetails.getUsername());
                        outputFile.println(customerDetails.getPassword());
                    }
                }
            }
            outputFile.close();
        }
        catch(IOException e)
        {
            
        }
    }
    
    public Customers getCustomerDetails()
    {
        return this;
    }
}
