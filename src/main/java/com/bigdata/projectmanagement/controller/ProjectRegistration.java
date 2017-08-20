/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.projectmanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProjectRegistration extends Controller {

  

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     String clientName=request.getParameter("clientName");
     String startDate=request.getParameter("startDate");
     String endDate=request.getParameter("endDate");
     
        
        response.getWriter().println(clientName+startDate+endDate);
      
    }

   
}
