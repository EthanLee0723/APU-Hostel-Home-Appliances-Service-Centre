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
public class Managers {
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
    
    public String getPassowrd()
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
    
    public ArrayList<Object> getAllManagerList()
    {
        ArrayList<Object> allManagers = new ArrayList<Object>();
        try
        {
           Scanner inputFile = new Scanner(file);
           boolean isFirstLoop = true;
           while(inputFile.hasNextLine())
           {
               if(isFirstLoop)
               {
                   allManagers.add(inputFile.nextLine());
                   isFirstLoop = false;
               }
               else
               {
                   Managers managerDetails = new Managers(Integer.parseInt(inputFile.nextLine()),inputFile.nextLine(),inputFile.nextLine());
                   allManagers.add(managerDetails);
               }
           }
           inputFile.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        return allManagers;
    }
    
    public void createDefaultFile()
    {
        try
        {
            String defaultData [] = {"0","0","admin","admin123"};
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
