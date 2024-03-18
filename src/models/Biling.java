/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author GENJI
 */
public class Biling {
    private String appt_name;
    private String date;
    private double amount;
    private String name;
    private String bankname;
    private String recipient;

    public Biling(String appt_name, String date, double amount, String name, String bank_name, String recipient) {
        this.appt_name = appt_name;
        this.date = date;
        this.amount = amount;
        this.name = name;
        this.bankname = bank_name;
        this.recipient = recipient;
    }
    
    public String getApptname() {
        return appt_name;
    }

    public void setApptname(String appt_name) {
        this.appt_name = appt_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
   
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
