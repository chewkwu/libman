<%-- 
    Document   : staff
    Created on : Jan 3, 2019, 5:00:13 PM
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
            <h2 align="center"> Staff Details</h2>
            p></p>
            <p> Staff Phone No : </p> ${Staff.phone}
            <p></p>
            <p> Staff Name : </p> ${Staff.name}
            <p></p>
            <p> Staff Password : </p> ${Staff.password}
            <p></p>
            <a href="staffmenu.jsp"> Issuance Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
        </div>
    </body>
</html>
