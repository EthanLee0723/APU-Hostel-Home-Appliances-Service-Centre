package models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;   	
import java.io.*;           

/**
 *
 * @author User
 */
public class Managers {
    public void createDefaultFile()
    {
        try
        {
            File newFile = new File("src/database/Managers.txt");
            PrintWriter outputFile = new PrintWriter(newFile);
            outputFile.println("testing");
            outputFile.close();
            
            Scanner keyboard = new Scanner(System.in);
            String filename = keyboard.nextLine();
            File file = new File("src/database/Managers.txt");
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()){
                String friendName = inputFile.nextLine();
                System.out.println(friendName);
             }
             inputFile.close();



        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void createNewFile()
    {
        
    }
}
