package models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;  
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Managers{
    private File file = new File("src/database/Managers.txt");
    private int id;
    private String username;
    private String password;
    
    public Managers()
    {
        if(!isFileExists())
        {
            createDefaultFile();
        }
    }
    
    public Managers(String username)
    {
        ArrayList<Managers> allManagers = getAllManagerList();
        Managers managerDetails = new Managers();
        for(int x = 0;x < allManagers.size();x++)
        {
            if(allManagers.get(x).getUsername().equals(username))
            {
                setId(allManagers.get(x).getId());
                setUsername(allManagers.get(x).getUsername());
                setPassword(allManagers.get(x).getPassword());
                break;
            }
        }
    }
    
    public Managers(int managerId)
    {
        ArrayList<Managers> allManagers = getAllManagerList();
        for(int x = 0;x < allManagers.size();x++)
        {
            if(allManagers.get(x).getId() == managerId)
            {
                setId(allManagers.get(x).getId());
                setUsername(allManagers.get(x).getUsername());
                setPassword(allManagers.get(x).getPassword());
                break;
            }
        }
    }
    
    public Managers(String username,String password)
    {
        ArrayList<Managers> allManagers = getAllManagerList();
        Managers managerDetails = new Managers();
        for(int x = 0;x < allManagers.size();x++)
        {
            if(allManagers.get(x).getUsername().equals(username) && allManagers.get(x).getPassword().equals(password))
            {
                setId(allManagers.get(x).getId());
                setUsername(allManagers.get(x).getUsername());
                setPassword(allManagers.get(x).getPassword());
                break;
            }
        }
    }
    
    public Managers(int newId,String newUsername,String newPassword)
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
                   Managers managerDetails = new Managers(Integer.parseInt(inputFile.nextLine()),inputFile.nextLine(),inputFile.nextLine());
                   readFile.add(managerDetails);
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
    
    public ArrayList<Managers> getAllManagerList()
    {
        ArrayList<Object> readFile = readFile();
        ArrayList<Managers> allManagers = new ArrayList<Managers>();
        for(int x = 1;x < readFile.size();x++)
        {
            Managers managerDetails = (Managers) readFile.get(x);
            allManagers.add(managerDetails);
        }
        return allManagers;
    }
    
    
    
    public void createDefaultFile()
    {
        try
        {
            String defaultData [] = {"1","1","admin","admin123"};
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
    
    public boolean isFileExists()
    {
        try
        {
            File file = new File("src/database/Managers.txt");
            Scanner inputFile = inputFile = new Scanner(file);
        }
        catch(IOException e)
        {
            return false;
        }
        
        return true;
    }
    
    
}
