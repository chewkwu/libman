<%-- 
    Document   : addedbook
    Created on : Jan 3, 2019, 12:34:32 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Added Book</title>
    </head>
    <body>
        
        <div align="center">
            <h2> Book Details </h2>
            <p></p>
             Book ID :  ${Book.bookID}
            <p></p>
             Book Name :  ${Book.bookName}
            <p></p>
             Book Stock :  ${Book.bookStock}
            <p></p>
             Book ID :  ${Book.publisher}
            <p></p>
             Book ID :  ${Book.author}
            <p></p>
            <a href="bookmenu.jsp"> Books Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
        </div>
    </body>
</html>
