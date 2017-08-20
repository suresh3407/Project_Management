/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.projectmanagment.DAOIMP;

import com.bigdata.DBWrapper.DBConnection;
import com.bigdata.project_management.constraint.SQLConstraint;
import com.bigdata.projectmanagement.model.Client;
import com.bigdata.projectmanagment.DAO.ClientDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author suresh
 */
public class ClientDAOImp implements ClientDAO {

    private DBConnection db;

    public ClientDAOImp() {

        db = new DBConnection();

    }

    @Override
    public Boolean insert(Client t) throws SQLException, ClassNotFoundException {
        String query = SQLConstraint.CLIENT_INSERT_QUERY;
       
        db.openConn();
        PreparedStatement ps = db.initStatement(query);
        ps.setString(1, t.getFullName());
        ps.setString(2, t.getEmail());
        ps.setString(3, t.getCompanyName());
        ps.setString(4, t.getDes());
        Boolean cnf = ps.execute();
        db.closeConn();

        return cnf;

    }

    @Override
    public List<Client> getAll() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean update(int id) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean delete(int id) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client search(int id) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
