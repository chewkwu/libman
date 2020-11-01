<%-- 
    Document   : updatestock
    Created on : Jan 3, 2019, 1:54:29 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UpdateStock</title>
    </head>
    <body>
        <div align="center">
            <h2 align="center"></h2>
            <p></p>
            <form action="UpdateStock">
                <table>
                    <tr>
                        <td> Book ID : </td>
                        <td> <input type="text" name="bookID"/> </td>
                    </tr>
                    <tr>
                        <td> New Stock : </td>
                        <td> <input type="text" name="newstock"/> </td>
                    </tr>
                </table>
                <p></p>  
                <input type="submit" value="Update Stock"/>
            </form>
            <p></p>
            <a href="bookmenu.jsp"> Books Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
        </div>
    </body>
</html>
