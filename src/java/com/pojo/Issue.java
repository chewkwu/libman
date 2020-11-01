/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

import java.sql.Date;

/**
 *
 * @author Uchenna
 */
public class Issue {
    
    private int issueID;
    private int bookID;
    private String bookName;
    private String libPhone;
    private int noIssued;
    private Date dueDate;
    private String dueStatus;

    public Issue(){
        
    }
    
    public int getIssueID() {
        return issueID;
    }

    public void setIssueID(int issueID) {
        this.issueID = issueID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getLibPhone() {
        return libPhone;
    }

    public void setLibPhone(String libPhone) {
        this.libPhone = libPhone;
    }

    public int getNoIssued() {
        return noIssued;
    }

    public void setNoIssued(int noIssued) {
        this.noIssued = noIssued;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueStatus() {
        return dueStatus;
    }

    public void setDueStatus(String dueStatus) {
        this.dueStatus = dueStatus;
    }

    @Override
    public String toString() {
        return "Issue{" + "issueID=" + issueID + ", bookID=" + bookID + ", bookName=" + bookName + ", libPhone=" + libPhone + ", noIssued=" + noIssued + ", dueDate=" + dueDate + ", dueStatus=" + dueStatus + '}';
    }
    
}
