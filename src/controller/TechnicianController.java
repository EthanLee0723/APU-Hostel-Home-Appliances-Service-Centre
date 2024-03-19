/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.Technicians;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TechnicianController {
    //crate new technician account
    public void createNewTechnician(String newUsername, String newPassword)
    {
        Technicians newManager = new Technicians();
        newManager.setUsername(newUsername);
        newManager.setPassword(newPassword);
        newManager.createNewTechnican();
    }
    
    //edit technician account
    public void editTechnicianAcc(int technicianId,String editedUsername,String editedPwd)
    {
        Technicians technician = new Technicians();
        technician.setId(technicianId);
        technician.setUsername(editedUsername);
        technician.setPassword(editedPwd);
        technician.editTechnician();
    }
    
    //get all list of technician
    public ArrayList<HashMap<String, Object>> getAllTechnicianList()
    {
        Technicians technicians = new Technicians();
        ArrayList<Technicians> allTechnicians = technicians.getAllTechnicianList();
        ArrayList<HashMap<String, Object>> mapAllTechnicians = new ArrayList<HashMap<String, Object>>();
        
        
        for(int x = 0;x < allTechnicians.size();x++)
        {
            HashMap<String, Object> technicianDetails = new HashMap<String, Object>();
            technicianDetails.put("id",allTechnicians.get(x).getId());
            technicianDetails.put("username",allTechnicians.get(x).getUsername());
            technicianDetails.put("password",allTechnicians.get(x).getPassword());
            mapAllTechnicians.add(technicianDetails);
        }
        
        return mapAllTechnicians;
    }
    
    //get technician details
    public HashMap<String, Object> getTechnicianDetails(int technicianId)
    {
        Technicians technicians = new Technicians(technicianId);
        HashMap<String, Object> technicianDetails = new HashMap<>();
        technicianDetails.put("id",technicians.getId());
        technicianDetails.put("username",technicians.getUsername());
        technicianDetails.put("password", technicians.getPassword());
        return technicianDetails;
    }
    
}
