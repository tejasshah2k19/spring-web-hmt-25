<%@ page contentType="text/html; charset=UTF-8" language="java" %>
 
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Sign Up</title>
  <!-- Bootstrap 4.5 CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    body { background: #f7f9fc; }
    .card { border: 0; border-radius: 1rem; box-shadow: 0 10px 25px rgba(0,0,0,.08); }
    .form-control { border-radius: .75rem; }
    .btn { border-radius: .75rem; }
    .required::after { content: " *"; color: #dc3545; }
  </style>
</head>
<body>
  <div class="container py-5">
    <div class="row justify-content-center">
      <div class="col-md-7 col-lg-6">
        <div class="text-center mb-4">
          <h1 class="h3 mb-1">Create your account</h1>
          <p class="text-muted mb-0">It's fast and easy.</p>
        </div>
 

        <div class="card">
          <div class="card-body p-4">
            <form id="signupForm" action="saveuser" method="post"  >
              <!-- If you're using Spring Security, include the CSRF token as a hidden input here. -->

              <div class="form-row">
                <div class="form-group col-md-6">
                  <label class="required" for="firstName">First Name</label>
                  <input type="text" class="form-control" id="firstName" name="firstName" placeholder="John"  />
					<div class="text-danger"> ${firstNameError}</div>
                </div>
                <div class="form-group col-md-6">
                  <label class="required" for="lastName">Last Name</label>
                  <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Doe"   />
					${lastNameError }
                </div>
              </div>

              <div class="form-group">
                <label class="required" for="email">Email</label>
                <input type="text" class="form-control" id="email" name="email" placeholder="you@example.com"   />
                <div class="invalid-feedback">Please enter a valid email address.</div>
              </div>

              <div class="form-group">
                <label class="required" for="password">Password</label>
                <div class="input-group">
                  <input type="password" class="form-control" id="password" name="password" placeholder="Minimum 8 characters" />
                  <div class="input-group-append">
                    <button class="btn btn-outline-secondary" type="button" id="togglePwd" tabindex="-1">Show</button>
                  </div>
                  <div class="invalid-feedback d-block" id="pwdHelp" style="display:none;">Password must be at least 8 characters and include a number.</div>
                </div>
                <small class="form-text text-muted">Use at least 8 characters, including a number.</small>
              </div>

              <button type="submit" class="btn btn-primary btn-block">Sign Up</button>

              <div class="text-center mt-3">
                <small class="text-muted">Already have an account? <a href="signin">Log in</a></small>
              </div>
            </form>
          </div>
        </div>

        <p class="text-center text-muted mt-3 mb-0"><small>By signing up, you agree to our Terms and Privacy Policy.</small></p>
      </div>
    </div>
  </div>

  <!-- Bootstrap 4.5 JS + dependencies -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B0UglyR+LyTjoob1L4q6U5rZQnN0hKciPUp8Y9MZ49jIhGxE5l5lQ8GJ5K5G3E6" crossorigin="anonymous"></script>

</body>
</html>
