<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Login</title>
  <!-- Bootstrap 4.5 CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"  >
  <style>
    body { background: #f7f9fc; }
    .card { border: 0; border-radius: 1rem; box-shadow: 0 10px 25px rgba(0,0,0,.08); }
    .form-control { border-radius: .75rem; }
    .btn { border-radius: .75rem; }
  </style>
</head>
<body>
  <div class="container py-5">
    <div class="row justify-content-center">
      <div class="col-md-6 col-lg-5">
        <div class="text-center mb-4">
          <h1 class="h4 mb-1">Welcome back</h1>
          <p class="text-muted mb-0">Sign in to continue to your account.</p>
        </div>

        <div class="card">
          <div class="card-body p-4">
            <form action="<%= request.getContextPath() %>/login" method="post">
              <!-- If using Spring Security, include CSRF token here as a hidden input -->

              <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="you@example.com" maxlength="120" />
              </div>

              <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Your password" maxlength="64" />
              </div>

              <button type="submit" class="btn btn-primary btn-block">Log In</button>

              <div class="text-center mt-3">
                <small class="text-muted">Don't have an account? <a href="register">Sign up</a></small>
              </div>
            </form>
          </div>
        </div>

        <p class="text-center text-muted mt-3 mb-0"><small>Forgot your password? Contact support or use the password reset flow.</small></p>
      </div>
    </div>
  </div>

  <!-- Bootstrap 4.5 JS + dependencies (optional) -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B0UglyR+LyTjoob1L4q6U5rZQnN0hKciPUp8Y9MZ49jIhGxE5l5lQ8GJ5K5G3E6" crossorigin="anonymous"></script>
</body>
</html>
