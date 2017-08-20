/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.projectmanagement.model;

import java.sql.Date;

/**
 *
 * @author suresh
 */
public class Project {
    private Integer projectId;
    private Client clientId;
    private Date addedDate;
    private Date modifedDate;
    private Date startDate;
    private Date endDate;   
    private String status;

    public Project() {
    }

    public Project(Integer projectId, Client clientId, Date addedDate, Date modifedDate, Date startDate, Date endDate, String status) {
        this.projectId = projectId;
        this.clientId = clientId;
        this.addedDate = addedDate;
        this.modifedDate = modifedDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifedDate() {
        return modifedDate;
    }

    public void setModifedDate(Date modifedDate) {
        this.modifedDate = modifedDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
}
