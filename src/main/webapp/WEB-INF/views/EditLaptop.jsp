<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Laptop</title>
    <link rel="stylesheet" 
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4"> Edit Laptop</h2>
    <form action="updatelaptop" method="post">
        <!-- Model Name -->
        <div class="form-group">
            <label for="modelName">Model Name</label>
            <input type="text" class="form-control" id="modelName" value="${x.modelName}" name="modelName"  >
        </div>
        
        <!-- Price -->
        <div class="form-group">
            <label for="price">Price (₹)</label>
            <input type="number" step="0.01" class="form-control"  value="${x.price}" id="price" name="price"  >
        </div>
        
        <!-- RAM -->
        <div class="form-group">
            <label for="ram">RAM</label>
            <input type="text" class="form-control" id="ram" name="ram"  value="${x.ram}" placeholder="e.g. 8GB, 16GB">
        </div>
        
        <!-- SSD -->
        <div class="form-group">
            <label for="ssd">SSD</label>
            <input type="text" class="form-control" id="ssd" name="ssd"  value="${x.ssd}" placeholder="e.g. 256GB, 512GB">
        </div>
        
        <input type="hidden" value="${x.laptopId}" name="laptopId"/> 
        
        <!-- Submit -->
        <button type="submit" class="btn btn-primary">Update Laptop</button>
        <a href="#" class="btn btn-secondary">Cancel</a>
    </form>
</div>
</body>
</html>
