<%-- 
    Document   : bookmenu
    Created on : Jan 3, 2019, 11:55:23 AM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books Menu</title>
    </head>
    <body>
        <div align="center">
            <a href="addbook.jsp"> Add a New Book </a>
            <p></p>
            <a href="findbook.jsp"> Find a Book </a>
            <p></p>
            <a href="updatestock.jsp"> Update Stock of Existing Book </a>
            <p></p>
            <a href="rembooks.jsp"> Remove a Book from Records </a>
            <p></p>
            <form action="AllBooks">
                <input type="submit" value="View All"/>
            </form>
            <p></p>
            <a href="menu.jsp"> Home </a>
        </div>
    </body>
</html>
