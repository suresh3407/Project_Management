/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.project_management.constraint;

/**
 *
 * @author suresh
 */
public interface SQLConstraint {

    public static final String CLIENT_INSERT_QUERY = "INSERT into " + TBConstraint.CLIENT_TABLE_NAME + ""
            + "(full_name,email,company_name,description)"
            + "VALUES(?,?,?,?)";

}
