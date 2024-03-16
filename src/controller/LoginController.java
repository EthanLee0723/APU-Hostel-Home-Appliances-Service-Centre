/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.Managers;
import java.util.ArrayList;
import view.ManagerDashboard;
import view.Login;
/**
 *
 * @author User
 */
public class LoginController {
    public LoginController()
    {
        
    }
    
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
        }
        
        
        return false;
    }
    
    public void userLogIn(String username,String password,Login login)
    {
        Managers manager = new Managers(username,password);
        if(manager.getId() != 0)
        {
            ManagerDashboard managerDashboard = new ManagerDashboard(manager);
            login.setVisible(false);
            login.dispose();
            managerDashboard.setVisible(true);
        }
        else
        {
            
        }
    }
}
