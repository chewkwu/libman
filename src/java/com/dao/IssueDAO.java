/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.key.Generator;
import com.pojo.Issue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Uchenna
 */
public class IssueDAO {
    
    public Issue issueBooks(Issue ishu) throws SQLException{
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	 Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	 String sql = "INSERT INTO issue  VALUES(?,?,?,?,?,?,?)";
	 PreparedStatement pst = conn.prepareStatement(sql);
         int id = Generator.trackCode();
         pst.setInt(1, id); 
         pst.setInt(2, ishu.getBookID());
         pst.setString(3, ishu.getBookName());
         pst.setString(4, ishu.getLibPhone());
         pst.setInt(5, ishu.getNoIssued());
         pst.setDate(6, ishu.getDueDate());
         pst.setString(7, ishu.getDueStatus());
         pst.executeUpdate();
         conn.close();
         ishu.setIssueID(id);
         return ishu;
    }
    public void updateIssue(String status, int id) throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	 Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	 String sql = "UPDATE issue SET DueStatus =? WHERE IssueID =?";
	 PreparedStatement pst = conn.prepareStatement(sql);
         pst.setString(1, status);
         pst.setInt(2, id);
         pst.executeUpdate();
         conn.close();
    }
    public Issue showIssue(int id) throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	String sql = "SELECT * FROM issue WHERE IssueID =?";
	PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rst = pst.executeQuery();
        rst.next();
        Issue ish = new Issue();
        ish.setIssueID(rst.getInt("IssueID"));
        ish.setBookID(rst.getInt("BookID"));
        ish.setBookName(rst.getString("BookName"));
        ish.setLibPhone(rst.getString("LibPhone"));
        ish.setNoIssued(rst.getInt("NoIssued"));
        ish.setDueDate(rst.getDate("DueDate"));
        ish.setDueStatus(rst.getString("DueStatus"));
        conn.close();
        return ish;
    }
    public List<Issue> allIssues() throws SQLException{
        List<Issue> allissue = new ArrayList<>();
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	String sql = "SELECT * FROM issue";
	PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();
        while(rst.next()){;
        Issue ish = new Issue();
        ish.setIssueID(rst.getInt("IssueID"));
        ish.setBookID(rst.getInt("BookID"));
        ish.setBookName(rst.getString("BookName"));
        ish.setLibPhone(rst.getString("LibPhone"));
        ish.setNoIssued(rst.getInt("NoIssued"));
        ish.setDueDate(rst.getDate("DueDate"));
        ish.setDueStatus(rst.getString("DueStatus"));
        allissue.add(ish);
        }
        conn.close();
        return allissue;
    }
}
