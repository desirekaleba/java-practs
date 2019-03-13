<%-- 
    Document   : user
    Created on : May 31, 2019, 9:51:38 AM
    Author     : desire
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${message}</title>
    </head>
    <body>
        <h1>${message}</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>UserName</th>
                <th>Email</th>
                
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td><c:out value="${user.id}"/></td>
                    <td><c:out value="${user.name}"/></td>
                    <td><c:out value="${user.username}"/></td>
                    <td><c:out value="${user.email}"/></td>
                </tr>
            </c:forEach>
        </table>
       
    </body>
</html>
