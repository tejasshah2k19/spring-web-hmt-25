<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 </head>
<body>
	<form action="updatefood" method="post">
		Name :  <input type="text" name="name" value="${item.name}"/><br><br> 
		Price : <input type="text" name="price" value="${item.price}"/><br><br> 
		 Qty : <input type="text" name="qty" value="${item.qty}"/><Br><Br> 
		 <input type="submit" value="Add Food"/> 
		
	</form>
</body>
</html>