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
    
    public Technicians(int technicianId)
    {
        ArrayList<Technicians> allTechnicians = getAllTechnicianList();
        for(int x = 0;x < allTechnicians.size();x++)
        {
            if(allTechnicians.get(x).getId() == technicianId)
            {
                setId(allTechnicians.get(x).getId());
                setUsername(allTechnicians.get(x).getUsername());
                setPassword(allTechnicians.get(x).getPassword());
                break;
            }
        }
    }
    
    public Technicians(String username,String password)
    {
        ArrayList<Technicians> allTechnicians = getAllTechnicianList();
        Technicians technicianDetails = new Technicians();
        for(int x = 0;x < allTechnicians.size();x++)
        {
            if(allTechnicians.get(x).getUsername().equals(username) && allTechnicians.get(x).getPassword().equals(password))
            {
                setId(allTechnicians.get(x).getId());
                setUsername(allTechnicians.get(x).getUsername());
                setPassword(allTechnicians.get(x).getPassword());
                break;
            }
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
            PrintWriter outputFile = new PrintWriter(file);
            outputFile.println("0");
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
    
    public ArrayList<Technicians> getAllTechnicianList()
    {
        ArrayList<Object> readFile = readFile();
        ArrayList<Technicians> allTechnicians = new ArrayList<Technicians>();
        for(int x = 1;x < readFile.size();x++)
        {
            Technicians technicianDetails = (Technicians) readFile.get(x);
            allTechnicians.add(technicianDetails);
        }
        return allTechnicians;
    }
    
    public void editTechnician()
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
                    Technicians technicianDetails = (Technicians)readFile.get(x);
                    outputFile.println(technicianDetails.getId());
                    if(technicianDetails.getId() == getId())
                    {
                        outputFile.println(getUsername());
                        outputFile.println(getPassword());
                    }
                    else
                    {
                        outputFile.println(technicianDetails.getUsername());
                        outputFile.println(technicianDetails.getPassword());
                    }
                }
            }
            outputFile.close();
        }
        catch(IOException e)
        {
            
        }
    }
}
