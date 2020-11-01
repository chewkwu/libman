<%-- 
    Document   : addstaff
    Created on : Jan 3, 2019, 4:45:26 PM
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
            <h2 align="center"> Register Staff</h2>
            <form action="AddStaff">
            <table>
                <tr>
                    <td> Staff Phone : </td>
                    <td> <input type="text" name="phone"/> </td>
                </tr>
                 <tr>
                    <td> Staff Name : </td>
                    <td> <input type="text" name="name"/> </td>
                </tr>
                <tr>
                    <td> Password : </td>
                    <td> <input type="password" name="password"/> </td>
                </tr>
            </table>
                <p></p>
                <input type="submit" value="Add Staff"/>
            </form>
            <p></p>
             <a href="staffmenu.jsp"> Issuance Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
        </div>
    </body>
</html>
