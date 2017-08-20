/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.projectmanagement.controller;

import com.bigdata.projectmanagement.config.ViewConfig;
import com.bigdata.projectmanagement.model.Client;
import com.bigdata.projectmanagment.DAO.ClientDAO;
import com.bigdata.projectmanagment.DAOIMP.ClientDAOImp;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author suresh
 */
public class ClientRegistration extends Controller {
    
    private Client c;
    private ClientDAO cd;

    public ClientRegistration() {
        cd=new ClientDAOImp();
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        //======data gathering logic================
        
        String fullName=request.getParameter("fullName");
        String email=request.getParameter("email");
        String companyName=request.getParameter("companyName");
        String desc=request.getParameter("desc");
        
        c=new Client(fullName,email,companyName,desc);
        try {
             cd.insert(c);
             request.setAttribute("fullName", c.getFullName());
             request.getRequestDispatcher(ViewConfig.PRE_FIX+"client-form"+ViewConfig.SUF_FIX+"?sucess").forward(request, response);
             
        } catch (Exception e) {
            response.getWriter().println(e.toString());
       
      
        
        
        
        
        
        
        
        
    }


    }
}
