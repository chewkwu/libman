<%-- 
    Document   : allissues
    Created on : Jan 3, 2019, 3:03:04 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <link href="style.css" rel="stylesheet" type="text/css">
        <title>AllIssues</title>
    </head>
    <body>
        <table>
            <tr>
                <td>Issue ID</td>
                <td>Book ID</td>
                <td>Book Name</td>
                <td>Libarian Phone</td>
                <td>No of Books Issued</td>
                <td>Date Issued</td>
                <td>Due Status</td>
            </tr>
            <c:forEach items="${AllIssues}" var="element">
             <tr>
                <td>${element.issueID}</td>
                <td>${element.bookID}</td>
                <td>${element.bookNmae}</td>
                <td>${element.libPhone}</td>
                <td>${element.noIssued}</td>
                <td>${element.dueDate}</td>
                <td>${element.dueStatus}</td>
            </tr>  
            </c:forEach>
        </table>
         <a href="issuemenu.jsp"> Issuance Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
    </body>
</html>
