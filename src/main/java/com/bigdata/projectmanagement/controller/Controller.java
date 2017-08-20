/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.projectmanagement.controller;

import com.bigdata.projectmanagement.config.ViewConfig;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author suresh
 */
public class Controller extends HttpServlet {

    protected void viewResolver(String fileName,HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        
        response.sendRedirect(getServletContext().getContextPath()+ViewConfig.PRE_FIX+fileName+ViewConfig.SUF_FIX);
    
    }
     protected void viewResolver(String fileName,String queryString,HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        
        response.sendRedirect(getServletContext().getContextPath()+ViewConfig.PRE_FIX+fileName+ViewConfig.SUF_FIX+"?"+queryString);
    
    }
   
}
