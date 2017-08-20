/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.projectmanagement.model;

import java.util.Date;

/**
 *
 * @author suresh
 */
public class Client {
    private Integer clientId;
    private String fullName;
    private String email;
    private String companyName;
    private String des;
    private Date addedDate;
    private Date ModifiedDate;
    private Boolean status; 

    public Client() {
    }

    public Client(Integer clientId, String fullName, String email, String companyName, String des, Date addedDate, Date ModifiedDate, Boolean status) {
        this.clientId = clientId;
        this.fullName = fullName;
        this.email = email;
        this.companyName = companyName;
        this.des = des;
        this.addedDate = addedDate;
        this.ModifiedDate = ModifiedDate;
        this.status = status;
    }
    public Client(String fullName, String email, String companyName, String des) {
       
        this.fullName = fullName;
        this.email = email;
        this.companyName = companyName;
        this.des = des;
        
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(Date ModifiedDate) {
        this.ModifiedDate = ModifiedDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
    
    
    
    
}
