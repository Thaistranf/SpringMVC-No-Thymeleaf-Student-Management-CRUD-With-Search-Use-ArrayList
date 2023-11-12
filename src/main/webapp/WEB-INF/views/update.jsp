<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/12/2023
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit student</h1>
<p>
    <a href="${pageContext.request.contextPath}/students/list">Back to customer list</a>
</p>
<fieldset style="width: 500px">
    <legend>Student Information</legend>
    <form action="${pageContext.request.contextPath}/students" method="post">
        <table>
            <tr>
                <td>Id</td>
                <td><input type="text" name="id" value="${student.id}" readonly></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="${student.name}"></td>
            </tr>
            <tr>
                <td>Date of birth</td>
                <td><input type="text" name="dateOfBirth" value="${student.dateOfBirth}"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" value="${student.email}"></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address" value="${student.address}"></td>
            </tr>
            <tr>
                <td>Phone</td>
                <td><input type="text" name="phone" value="${student.phone}"></td>
            </tr>
            <tr>
                <td>Classroom</td>
                <td><input type="text" name="classroom" value="${student.classroom}"></td>
            </tr>
            <tr>
                <td>
                    <button type="submit">Update</button>
                </td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>
