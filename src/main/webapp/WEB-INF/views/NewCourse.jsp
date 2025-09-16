<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>New Course</title>
</head>
<body>
    <h2>Add New Course</h2>
    <form action="savecourse" method="post">
        <label>Course Name:</label>
        <input type="text" name="courseName" >
        ${result.getFieldError("courseName").getDefaultMessage()}
        
        <br><br>

        <label>Fees:</label>
        <input type="number" name="fees" >
        ${result.getFieldError("fees").getDefaultMessage()}
        
        <br><br>

        <label>Description:</label><br>
        <textarea name="description" rows="4" cols="30"></textarea><br><br>

        <input type="submit" value="Save Course">
    </form>
</body>
</html>
