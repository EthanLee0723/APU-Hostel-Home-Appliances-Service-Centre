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
    private String id;
    private String date;
    private String service_type;
    private double amount;
    private String status;
    private String name;
    private String bankname;
    private String recipient;

    public Biling(String id, String date, String service_type, double amount, String status, String name, String bank_name, String recipient) {
        this.id = id;
        this.date = date;
        this.service_type = service_type;
        this.amount = amount;
        this.status = status;
        this.name = name;
        this.bankname = bank_name;
        this.recipient = recipient;
    }
    
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getST() {
        return service_type;
    }

    public void setST(String service_type) {
        this.service_type = service_type;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
