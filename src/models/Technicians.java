/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Technicians {
    private File file = new File("src/database/Technicians.txt");
    private int id;
    private String username;
    private String password;
    
    public Technicians()
    {
        if(!isFileExists())
        {
            createDefaultFile();
        }
    }
    
    public Technicians(int newId,String newUsername,String newPassword)
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
    
    public void createDefaultFile()
    {
        try
        {
            String defaultData [] = {"0"};
            PrintWriter outputFile = new PrintWriter(file);
            for(int x = 0;x < defaultData.length;x++)
            {
                outputFile.println(defaultData[x]);
            }
            outputFile.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
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
                   Technicians technicanDetails = new Technicians(Integer.parseInt(inputFile.nextLine()),inputFile.nextLine(),inputFile.nextLine());
                   readFile.add(technicanDetails);
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
    
    
    public void createNewTechnican()
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
                Technicians technicianDetails = (Technicians)readFile.get(x);
                outputFile.println(technicianDetails.getId());
                outputFile.println(technicianDetails.getUsername());
                outputFile.println(technicianDetails.getPassword());
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
}
