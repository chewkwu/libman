<%-- 
    Document   : viewissue
    Created on : Jan 3, 2019, 4:30:17 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>An Issue</title>
    </head>
    <body>
        <div align="center">
            <h2 align="center"> View an Issue</h2> 
            <form action="ViewIssue">
                Enter Issue ID :
                <p></p>
                <input type="text" name="issueID"/>
                <p></p>
                <input type="submit" value="Show Issue"/>
            </form>
        </div>
        <a href="issuemenu.jsp"> Issuance Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
    </body>
</html>
