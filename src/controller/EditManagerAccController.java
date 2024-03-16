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
public class EditManagerAccController {
    
    public EditManagerAccController()
    {
        
    }
    
    public void editManagerAcc(Managers editedManager)
    {
        Managers manager = new Managers();
        manager.editManager(editedManager);
    }
}
