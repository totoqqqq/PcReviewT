<%@ page language="java" contentType="text/html; charset=utf-8" %>
<html lang="ko">
<head>
  <meta charset="utf-8">
	<title>PcReview login</title>
   <!--Made with love by Mutiullah Samim -->
	<!--Custom styles-->
	<link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="resources/css/login.css">
	<script src="https://kit.fontawesome.com/a58b060f9f.js" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>로그인</h3>
			</div>
			<div class="card-body">
				<form action=loginAction method="post">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="PcReviewID">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" placeholder="PcReviewPassword">
					</div>
					<div class="row align-items-center remember">
						<input type="checkbox">기억하기
					</div>
					<div class="form-group">
						<input type="submit" value="Login" class="btn float-right login_btn">
					</div>
				</form>
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					아이디가 없습니까?<a href="#">회원가입</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="#">비밀번호를 잊어버렸습니까?</a>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>