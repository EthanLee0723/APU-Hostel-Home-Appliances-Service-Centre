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
            PrintWriter outputFile = new PrintWriter("managers");
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
