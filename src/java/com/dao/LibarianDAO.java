/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.Libarian;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Uchenna
 */
public class LibarianDAO {
    
    public Libarian addLib(Libarian lib) throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	 Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	 String sql = "INSERT INTO libarian  VALUES(?,?,?)";
	 PreparedStatement pst = conn.prepareStatement(sql);
         pst.setString(1, lib.getPhone());
         pst.setString(2, lib.getName());
         pst.setString(3, lib.getPassword());
         pst.executeUpdate();
         conn.close();
         return lib;
    }
    
    public void removeLib(String phone) throws SQLException{
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	 Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	 String sql = "DELETE FROM libarian WHERE Phone =?";
	 PreparedStatement pst = conn.prepareStatement(sql);
         pst.setString(1, phone);
         pst.executeUpdate();
         conn.close();
    }
    
    public Libarian findLib(String phone) throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	String sql = "SELECT * FROM libarian WHERE Phone =?";
	PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, phone);
        ResultSet rst = pst.executeQuery();
        rst.next();
        Libarian lib = new Libarian();
        lib.setPhone(rst.getString("Phone"));
        lib.setName(rst.getString("Name"));
        lib.setPassword(rst.getString("Password"));
        conn.close();
        return lib;
    }
    public void updPass(String phone, String password) throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	 Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	 String sql = "UPDATE libarian SET Password =? WHERE Phone =?";
	 PreparedStatement pst = conn.prepareStatement(sql);
         pst.setString(1, password);
         pst.setString(2, phone);
         pst.executeUpdate();
         conn.close();
    }
}
