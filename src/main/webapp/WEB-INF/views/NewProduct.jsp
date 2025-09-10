<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>New Product</h2>
	<form action="saveproduct" method="post">
		ProductName : <input type="text" name="productName" />
		<span style="color:red;"> 
		${result.getFieldError("productName").getDefaultMessage()} 
		</span><br>
		<br> Price : <input type="text" name="price" />
			<span style="color:red;"> 
		${result.getFieldError("price").getDefaultMessage()} 
		</span>
		<br>
		<br> Qty : <input type="text" name="qty" /><br>
		<br> Category : <input type="text" name="category" />
		${result.getFieldError("category").getDefaultMessage()}
		<br>
		<br> <input type="submit" value="Add Product" />

	</form>
</body>
</html>