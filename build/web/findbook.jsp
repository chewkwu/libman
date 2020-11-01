<%-- 
    Document   : findbook
    Created on : Jan 3, 2019, 12:52:31 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FindBook</title>
    </head>
    <body>
        <div align="center">
            <h2 align="center"> Enter Book Details </h2>
            <p></p>
            <form action="FindBook">
                <table>
                    <tr>
                        <td>Book Name : </td>
                        <td> <input type="text" name="bookname"/> </td>
                    </tr>
                    <tr>
                        <td>Book Author : </td>
                        <td> <input type="text" name="bookauthor"/> </td>
                    </tr>
                </table>
                <input type="submit" value="Find Book"/>
            </form>
            <p></p>
            <a href="bookmenu.jsp"> Books Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
        </div>
    </body>
</html>
