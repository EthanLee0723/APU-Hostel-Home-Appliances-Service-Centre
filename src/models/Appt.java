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
public class Appt {
    
    private String name;
    private String date;
    private String feedback;
    private String customerName;
    private String time;
    private double amount;
    private String selectedServiceType;
    private String technician;
    private String paymentStatus;
 
    public Appt(String name, String date, String time, String selectedServiceType, double amount, String paymentStatus, String technician, String customerName, String feedback) {
        this.name = name;
        this.date = date;
        this.feedback = feedback;
        this.customerName = customerName;
        this.time = time;
        this.amount = amount;
        this.selectedServiceType = selectedServiceType;
        this.technician = technician;
        this.paymentStatus = paymentStatus;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getServiceType() {
        return selectedServiceType;
    }

    public void setServiceType(String selectedServiceType) {
        this.selectedServiceType = selectedServiceType;
    }
    
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }
}
