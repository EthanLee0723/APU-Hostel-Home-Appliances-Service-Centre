/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import models.Users;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class UserController {
    public boolean hasUserExisted(String checkUsername)
    {
       Users users = new Users();
       ArrayList<Users> allUsers = users.getAllUsers();
       for(int x = 0;x < allUsers.size();x++)
       {
           if(allUsers.get(x).getUsername().equals(checkUsername))
           {
               return true;
           }
       }
       return false;
    }
}
