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

	<table border="1">

		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Qty</th>
			<th>Action</th>
		</tr>

		<c:forEach items="${items}" var="x">
			<tr>
				<td>${x.foodItemId}</td>
				<td>${x.name }</td>
				<td>${x.price }</td>
				<td>${x.qty }</td>
				<td><a href="editfood?foodItemId=${x.foodItemId}">Edit</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>