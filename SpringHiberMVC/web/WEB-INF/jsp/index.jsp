<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <c:url var="action" value="/user/add"></c:url>
    <form:form method="post" action="${action}" commandName="user">
        <table>
            <tr>
                <td>
                    <form:label path="username">
                        <spring:message code="label.userName"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="username"/>
                </td>
            </tr>
            <tr>
                 <td>
                    <form:label path="password">
                        <spring:message code="label.userPassword"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="password"/>
                </td>
            </tr>
             <tr>
                 <td>
                    <form:label path="firstname">
                        <spring:message code="label.userFirstname"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="firstname"/>
                </td>
            </tr>
             <tr>
                 <td>
                    <form:label path="lastname">
                        <spring:message code="label.userLastname"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="lastname"/>
                </td>
            </tr>
             <tr>
                 <td>
                    <form:label path="email">
                        <spring:message code="label.userEmail"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="email"/>
                </td>
            </tr>
             <tr>
                 <td>
                    <form:label path="address">
                        <spring:message code="label.userAddress"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="address"/>
                </td>
            </tr>
             <tr>
                 <td>
                    <form:label path="phone">
                        <spring:message code="label.userPhone"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="phone"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="<spring:message code="label.addUser"/>"/>
                </td>
            </tr>
        </table>
    </form:form>
    </body>
</html>
