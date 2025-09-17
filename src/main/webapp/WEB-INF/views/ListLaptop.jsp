<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>List Laptop</h2>

	<table border="1">
		<tr>
			<th>LaptopId</th>
			<th>Model Name</th>
			<th>Price</th>
			<th>Ram</th>
			<th>SSD</th>
		</tr>
		<c:forEach items="${laptops}" var="l">

			<tr>
				<td>${l.laptopId}</td>
				<td>${l.modelName}</td>
				<td>${l.price}</td>
				<td>${l.ram}</td>
				<td>${l.ssd}</td>
			</tr>

		</c:forEach>
	</table>


	<br>
	<a href="newlaptop">New Laptop</a>
</body>
</html>