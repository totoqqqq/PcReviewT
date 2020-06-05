<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="ko">
<head>
  <meta charset="utf-8">
	<title>PcReview Member Join</title>
   <!--Made with love by Mutiullah Samim -->
	<!--Custom styles-->
	<link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="resources/css/login.css">
	<script src="https://kit.fontawesome.com/a58b060f9f.js" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="signcard">
			<div class="card-header">
				<h3>회원가입</h3>
			</div>
			<div class="card-body">
				<form action="signAction" method="post" id="signAction">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span><br>
						</div>
						<input type="text" class="form-control" placeholder="Sign Up ID" name=id>
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" placeholder="Sign Up Password" name=pass>
					</div>
					<div class="form-group">
						<input type="submit" value="Sign Up" class="btn float-right login_btn">
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>