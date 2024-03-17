/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.Technicians;

/**
 *
 * @author User
 */
public class TechnicianController {
    public void createNewTechnician(String newUsername, String newPassword)
    {
        Technicians newManager = new Technicians();
        newManager.setUsername(newUsername);
        newManager.setPassword(newPassword);
        newManager.createNewTechnican();
    }
}
