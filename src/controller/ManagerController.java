/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.Managers;
import java.util.HashMap; 

/**
 *
 * @author User
 */
public class ManagerController {
    
    public HashMap<String, Object> getManagerDetails(int managerId)
    {
        Managers manager = new Managers(managerId);
        HashMap<String, Object> managerDetails = new HashMap<>();
        managerDetails.put("id",manager.getId());
        managerDetails.put("username",manager.getUsername());
        managerDetails.put("password", manager.getPassword());
        return managerDetails;
    }
    
    public void CreateManager(String newUsername,String newPassword)
    {   
        Managers newManager = new Managers();
        newManager.setUsername(newUsername);
        newManager.setPassword(newPassword);
        newManager.createNewManager();
    }
    
    public void editManagerAcc(int managerId,String editedUsername,String editedPwd)
    {
        Managers manager = new Managers();
        manager.setId(managerId);
        manager.setUsername(editedUsername);
        manager.setPassword(editedPwd);
        manager.editManager();
    }
}
