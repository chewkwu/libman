<%-- 
    Document   : allbooks
    Created on : Jan 3, 2019, 2:38:28 PM
    Author     : Uchenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <link href="style.css" rel="stylesheet" type="text/css">
        <title>Allbooks</title>
    </head>
    <body>
        <table>
            <tr>
                <td>Book ID</td>
                <td>Book Name</td>
                <td>Book Stock</td>
                <td>Book Publisher</td>
                <td>Book Author</td>
            </tr>
            <c:forEach items="${AllBooks}" var="element">
                <tr>
                <td>${element.bookID}</td>
                <td>${element.bookName}</td>
                <td>${element.bookStock}</td>
                <td>${element.publisher}</td>
                <td>${element.author}</td> 
                </tr>
            </c:forEach>
        </table>
         <a href="bookmenu.jsp"> Books Menu</a> <p>  </p> <a href="menu.jsp"> Main Menu</a>
    </body>
</html>
