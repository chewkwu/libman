/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.key.Generator;
import com.pojo.Books;
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
public class BooksDAO {
    
    public Books addBook(Books book) throws SQLException{
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	 Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	 String sql = "INSERT INTO books  VALUES(?,?,?,?,?)";
	 PreparedStatement pst = conn.prepareStatement(sql);
         int id = Generator.trackCode();
         pst.setInt(1, id);
         pst.setString(2, book.getBookName());
         pst.setInt(3, book.getBookStock());
         pst.setString(4, book.getPublisher());
         pst.setString(5, book.getAuthor());
         pst.executeUpdate();
         conn.close();
         book.setBookID(id);
        return book;
    }
    public Books findBook(String name, String author) throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	String sql = "SELECT * FROM books WHERE BookName =? AND BookAuthor =?";
	PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, name);
        pst.setString(2, author);
         ResultSet rst = pst.executeQuery();
         rst.next();
         Books book = new Books();
         book.setBookID(rst.getInt("BookID"));
         book.setBookName(rst.getString("BookName"));
         book.setBookStock(rst.getInt("BookStock"));
         book.setPublisher(rst.getString("BookPublisher"));
         book.setAuthor(rst.getString("BookAuthor"));
         conn.close();
         return book;
    }
    
    public void updateStock(int stock, int id, String function) throws SQLException{
        if (function.equalsIgnoreCase("add")){
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	String sql = "SELECT * FROM books WHERE BookID =?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rst = pst.executeQuery();
        rst.next();
        int bkstck = rst.getInt("BookStock");
        int nwstk = bkstck + stock ;
        String sql2 = "UPDATE books SET BookStock = ? WHERE BookID =?";
        PreparedStatement pst2 = conn.prepareStatement(sql2);
        pst2.setInt(1, nwstk);
        pst2.setInt(2, id);
        pst2.executeUpdate();
        conn.close();
        }else {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	String sql = "SELECT * FROM books WHERE BookID =?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rst = pst.executeQuery();
        rst.next();
        int bkstck = rst.getInt("BookStock");
        int nwstk = bkstck - stock ;
        String sql2 = "UPDATE books SET BookStock = ? WHERE BookID =?";
        PreparedStatement pst2 = conn.prepareStatement(sql2);
        pst2.setInt(1, nwstk);
        pst2.setInt(2, id);
        pst2.executeUpdate();
        conn.close();    
        }
    }
    
    public List<Books> allBooks() throws SQLException{
        List<Books> allbooks = new ArrayList<>();
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	String sql = "SELECT * FROM books";
	PreparedStatement pst = conn.prepareStatement(sql);
         ResultSet rst = pst.executeQuery();
         while (rst.next()){
         Books book = new Books();
         book.setBookID(rst.getInt("BookID"));
         book.setBookName(rst.getString("BookName"));
         book.setBookStock(rst.getInt("BookStock"));
         book.setPublisher(rst.getString("BookPublisher"));
         book.setAuthor(rst.getString("BookAuthor"));
         allbooks.add(book);
         }
         conn.close();
         return allbooks;
    }
    public void removeBook(int id) throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection conn = DriverManager.getConnection("jdbc:mysql:///libdb", "root", "java@1986");
	String sql = "DELETE FROM books WHERE BookID =?";
	PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeUpdate();
        conn.close();
    }
}
