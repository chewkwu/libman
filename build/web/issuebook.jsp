<%-- 
    Document   : issuebook
    Created on : Jan 3, 2019, 3:17:35 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IssueBook</title>
    </head>
    <body>
        <div align="center">
            <h2 align="center"> Record Issuance </h2>
            <form action="IssueBook">
                <table>
                    <tr>
                        <td> Book ID : </td>
                        <td> <input type="text" name="bookID"/> </td>
                    </tr>
                    <tr>
                        <td> Book Name : </td>
                        <td> <input type="text" name="bookname"/> </td>
                    </tr>
                    <tr>
                        <td> Libarian Phone : </td>
                        <td> <input type="text" name="libphone"/> </td>
                    </tr>
                    <tr>
                        <td> No of Books : </td>
                        <td> <input type="text" name="nofbooks"/> </td>
                    </tr>
                </table>
                <p></p>
                <input type="submit" value="Issue Book"/>
            </form>
            <a href="issuemenu.jsp"> Issuance Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
        </div>
    </body>
</html>
