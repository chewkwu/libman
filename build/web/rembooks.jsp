<%-- 
    Document   : rembooks
    Created on : Jan 3, 2019, 2:13:34 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Book</title>
    </head>
    <body>
        <div align="center">
            <h2 align="center"> Remove Book Form </h2>
            <form action="RemoveBook">
            <p></p>
            <p> Enter Book ID : </p>
            <p></p>
            <input type="text" name="bookID"/>
            <p></p>
            <input type="submit" value="Remove Book"/>
            </form>
            <a href="bookmenu.jsp"> Books Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
        </div>
    </body>
</html>
