<%--
  Created by IntelliJ IDEA.
  User: tranchung
  Date: 21/04/2019
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result Login</title>
</head>
<body>
    <table>
        <tr>
            <td>Account :</td>
            <td>${user.getAccount()}</td>
        </tr>
        <tr>
            <td>Name : </td>
            <td>${user.getName()}</td>
        </tr>
        <tr>
            <td>Email :</td>
            <td>${user.getEmail()}</td>
        </tr>
        <tr>
            <td>Age :</td>
            <td>${user.getAge()}</td>
        </tr>
    </table>
</body>
</html>
