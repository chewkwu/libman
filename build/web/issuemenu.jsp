<%-- 
    Document   : issuemenu
    Created on : Jan 3, 2019, 2:48:09 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <h2 align="center"> Issuances Menu</h2>
            <p></p>
            <a href="issuebook.jsp"> Issue a Book</a>
            <p></p>
            <a href="updissue.jsp"> Update an Issue</a>
            <p></p>
            <a href="viewissue.jsp"> Show an Issue</a>
            <p></p>
            <form action="AllIssues">
                <input type="submit" value="All Issuances"/>
            </form>
        </div>
    </body>
</html>
