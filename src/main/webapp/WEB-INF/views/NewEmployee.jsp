<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>New Employee - Add</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .preview-img { max-width: 150px; max-height: 150px; object-fit: cover; border-radius: 8px; }
        .form-card { max-width: 700px; margin: 30px auto; }
    </style>
</head>
<body>
<div class="container">
    <div class="card form-card shadow-sm">
        <div class="card-body">
            <h3 class="card-title mb-3">Add New Employee</h3>

      
            <form action="saveemployee" method="post"  enctype="multipart/form-data" >
 
                <div class="row g-3">
                    <div class="col-md-6">
                        <label for="firstName" class="form-label">First Name</label>
                        <input type="text" class="form-control" id="firstName" name="firstName"  
                               placeholder="Enter first name">
                        <div class="invalid-feedback">First name is required.</div>
                    </div>

                    <div class="col-md-6">
                        <label for="lastName" class="form-label">Last Name</label>
                        <input type="text" class="form-control" id="lastName" name="lastName"  
                               placeholder="Enter last name">
                        <div class="invalid-feedback">Last name is required.</div>
                    </div>

                    <div class="col-md-6">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control" id="email" name="email"  
                               placeholder="name@example.com">
                        <div class="invalid-feedback">Please enter a valid email.</div>
                    </div>

                    <div class="col-md-6">
                        <label for="password" class="form-label">Password</label>
                        <input type="password" class="form-control" id="password" name="password"  
                               placeholder="Enter password">
                        <div class="form-text">Minimum 6 characters recommended.</div>
                        <div class="invalid-feedback">Password is required.</div>
                    </div>

                    <div class="col-md-12">
                        <label for="profilePic" class="form-label">Profile Picture</label>
                        <input type="file" class="form-control" id="profilePic" name="profilePic" accept="image/*">
                        <div class="form-text">Allowed: images (jpg, png, gif). Max size depends on server settings.</div>
                    </div>

                
                    <div class="col-12 mt-3">
                        <button type="submit" class="btn btn-primary">Save</button>
                     
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

  
</body>
</html>