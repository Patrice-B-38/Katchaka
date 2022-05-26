<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
	<jsp:include page="entete.jsp" />
	<h1 style="padding: 15px">Bienvenue Sur Katchaka</h1>
	<h2 style="padding: 15px">Connexion</h2>
	<form action="connexion" method="post">
		<div class="mb-3 row formConnexion">
			<label style="margin: 15px" for="staticEmail" class="col-sm-2 col-form-label">Email</label>
			<div style="width: 350px" class="col-sm-10 form">
				<input name="email" type="text" class="form-control form-control-lg"
					id="staticEmail" placeholder="email@example.com">
			</div>
		</div>
		<div class="mb-3 row">
			<label style="margin: 15px" for="inputPassword" class="col-sm-2 col-form-label">Password</label>
			<div style="width: 350px" class="col-sm-10">
				<input name="motDePasse" type="password"
					class="form-control form-control-lg" id="inputPassword">
			</div>
			<div>
				<button style="margin: 15px" type="submit" class="btn btn-primary mb-3">Connexion</button>
			</div>
		</div>
	</form>
</body>
</html>