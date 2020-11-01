<%-- 
    Document   : login
    Created on : Jan 2, 2019, 9:19:01 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1 align="center"> Welcome Libarian </h1>
        <div align="center" border="true">
            <form action="LoginControl">
            <table>
                <tr>
                    <td> Enter Username : </td>
                    <td> <input type="text" name="username"/> </td>
                </tr
                <tr>
                    <td>Enter Password : </td>
                    <td> <input type="password" name="password"/> </td>
                </tr>
            </table>
                <input type="submit" value="Log in"/>
            </form>
        </div>
    </body>
</html>
