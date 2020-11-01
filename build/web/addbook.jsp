<%-- 
    Document   : addbook
    Created on : Jan 3, 2019, 12:08:51 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Book</title>
    </head>
    <body>
        <div align="center">
            <form action="AddBook">
                <table>
                    <tr>
                        <td> Book Name : </td>
                        <td> <input type="text" name="bookname"/> </td>
                    </tr>
                    <tr>
                        <td> Book Stock : </td>
                        <td> <input type="text" name="bookstock"/> </td>
                    </tr>
                    <tr>
                        <td> Book Publisher : </td>
                        <td> <input type="text" name="bookpublisher"/> </td>
                    </tr>
                    <tr>
                        <td> Book Author : </td>
                        <td> <input type="text" name="bookauthor"/> </td>
                    </tr>
                </table>
                <input type="submit" value="Add Book"/>
            </form>
            <a href="bookmenu.jsp"> Books Menu</a>
            <p></p>
            <a href="menu.jsp"> Home Menu</a>
        </div>  
    </body>
</html>
