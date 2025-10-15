<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f9f9f9;
            margin: 40px;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
            background: #fff;
            box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
        }

        th, td {
            padding: 12px 15px;
            text-align: center;
        }

        th {
            background-color: #4CAF50;
            color: white;
            text-transform: uppercase;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        img {
            width: 60px;
            height: 60px;
            border-radius: 50%;
            object-fit: cover;
        }

        .no-data {
            text-align: center;
            margin-top: 50px;
            color: #777;
        }
    </style>
</head>
<body>

    <h2>Employee List</h2>

    <c:if test="${empty employeeList}">
        <div class="no-data">No Employee found</div>
    </c:if>

    <c:if test="${not empty employeeList}">
        <table>
            <thead>
                <tr>
                    <th>Profile Picture</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="emp" items="${employeeList}">
                    <tr>
                        <td>
                            <img src="${emp.profilePicURL}" alt="${emp.firstName}" onerror="this.src='user-avatar.png';">
                        </td>
                        <td>${emp.firstName}</td>
                        <td>${emp.lastName}</td>
                        <td>${emp.email}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>

</body>
</html>
