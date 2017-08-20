/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.projectmanagment.DAO;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author suresh
 */
public interface GenericDao<T> {
    Boolean insert(T t) throws SQLException,ClassNotFoundException;
    List<T> getAll() throws SQLException,ClassNotFoundException;
    Boolean update(int id) throws SQLException,ClassNotFoundException;
    Boolean delete(int id)throws SQLException,ClassNotFoundException;
    T search(int id) throws SQLException,ClassNotFoundException;
    
}
