<%-- 
    Document   : updstaff
    Created on : Jan 3, 2019, 5:24:27 PM
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
            <h2 align="center"> Enter Staff Details</h2>
            <p></p>
            <form action="UpdStaff">
            Staff Phone : 
            <input type="text" name="phone"/>
            <p></p>
            New Password :
            <input type="password" name="password"/>
            <p></p>
            <input type="submit" value="Change Password"/>
            <p></p>
            </form>
            <a href="staffmenu.jsp"> Issuance Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
        </div>
    </body>
</html>
