<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="utf-8">
<title>Job Finder</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.4/examples/cover/">

<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="assets/styles.css" />


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="cover.css" rel="stylesheet">
</head>


<body class="text-center">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		<header class="masthead mb-auto">
			<div class="inner">
				<h3 class="masthead-brand"></h3>
				<nav class="nav nav-masthead justify-content-center">
					<a class="nav-link active text-muted" href="/">Home</a> 
				</nav>
			</div>
		</header>

		<h1 class="contactheader">Contact Us</h1>
		<p class="lead"></p>



		<main role="main" class="inner cover">
			<h1 class="cover-heading"></h1>
			<h2 class="lead">Phone Number ${newStudent.firstName}
				${newStudent.lastName} +1 314-328-3748</h2>
			<p class="lead">Email: Ansarsediqi2@gmail.com ${newStudent.email}</p>
			<p class="lead">
				<a href="/" class="btn greenButton">Return Home</a>
			</p>
		</main>

		<footer class="mastfoot mt-auto">
			<div class="inner">
				<p>
					<a href="https://getbootstrap.com/"></a> <a
						href="https://www.linkedin.com/in/ansarullah-sediqi-b37622222/">Copyright
						All Rights Reserved</a>
				</p>
			</div>
		</footer>
	</div>


</body>

</html>

