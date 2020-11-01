<%-- 
    Document   : issue
    Created on : Jan 3, 2019, 3:58:44 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Issue Page</title>
    </head>
    <body>
        <div align="center">
            <h2 align="center"> Issue Details </h2>
            <p></p>
             Issue ID :  ${Issue.issueID}
            <p></p>
             Book ID :  ${Issue.bookID}
            <p></p>
             Book Name :  ${Issue.bookName}
            <p></p>
             Libarian Phone :  ${Issue.libPhone}
            <p></p>
             No of Books Issued :  ${Issue.noIssued}
            <p></p>
             Issue Date :  ${Issue.dueDate}
            <p></p>
             Issue Status :  ${Issue.dueStatus}
            <p></p>
            <a href="issuemenu.jsp"> Issuance Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
        </div>
    </body>
</html>
