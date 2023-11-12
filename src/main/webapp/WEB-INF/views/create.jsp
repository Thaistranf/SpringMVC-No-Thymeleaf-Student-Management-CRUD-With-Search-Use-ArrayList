<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/12/2023
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Add new student</title>
</head>
<body>
<h1>Add new student</h1>
<p>
    <a href="${pageContext.request.contextPath}/students/list">Back to customer list</a>
</p>
<form action="${pageContext.request.contextPath}/students/create" method="post">
    <fieldset>
        <legend>Student information</legend>
        <table>
            <tr>
                <td>Id: </td>
                <td><input type="text" id="id" name="id"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" id="name" name="name"></td>
            </tr>
            <tr>
                <td>Date of Birth: </td>
                <td><input type="text" id="dateOfBirth" name="dateOfBirth" placeholder="YYYY-MM-DD"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" id="email" name="email"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" id="address" name="address"></td>
            </tr>
            <tr>
                <td>Phone Number: </td>
                <td><input type="text" id="phone" name="phone"></td>
            </tr>
            <tr>
                <td>Classroom: </td>
                <td><input type="text" id="classroom" name="classroom"></td>
            </tr>
            <tr>
                <td></td>
                <td><button type="submit">Add student</button></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
