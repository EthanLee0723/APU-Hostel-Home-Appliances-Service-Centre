/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.Managers;

/**
 *
 * @author User
 */
public class ManagerController {
    public void CreateManager(String newUsername,String newPassword)
    {   
        Managers newManager = new Managers();
        newManager.setUsername(newUsername);
        newManager.setPassword(newPassword);
        newManager.createNewManager();
    }
    
    public void editManagerAcc(Managers editedManager)
    {
        Managers manager = new Managers();
        manager.editManager(editedManager);
    }
}
