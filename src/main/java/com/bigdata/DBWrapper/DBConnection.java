/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.DBWrapper;

import com.bigdata.project_management.constraint.DBConstraint;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author suresh
 */
public class DBConnection {
    private Connection con;
    private PreparedStatement ps;
    public void openConn() throws SQLException,ClassNotFoundException
    {
        Class.forName(DBConstraint.JDBC_DRIVER_CLASS);
        con=DriverManager.getConnection(DBConstraint.DB_URL,DBConstraint.DB_USER_NAME,DBConstraint.DB_PASSWORD);
        
    }
    public PreparedStatement initStatement(String sqlQuery) throws SQLException,ClassNotFoundException
    {
        return ps=con.prepareStatement(sqlQuery);
        
    }
    public Boolean execute()throws SQLException,ClassNotFoundException
    {
       return  ps.execute();
    }
    
    
    public void closeConn() throws SQLException,ClassNotFoundException
    {
        con.close();
    }
    
}
