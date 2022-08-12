<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Portal</title>

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
	<div class="cover-container d-flex w-100 h-100 p-4 mx-auto flex-column">
		<header class="masthead mb-auto">
			<div class="inner">
				<h3 class="masthead-brand"></h3>
				<nav class="nav nav-masthead justify-content-center">
					<a class="nav-link active text-muted" href="/">Home</a> <a class="nav-link"
						href="/search"></a>
				</nav>
			</div>
		</header>
		<div class="container">
			<h1 class="Careerheader"></h1>
		</div>
		<br>
		<main role="main" class="inner cover">
			<h2 class="cover-heading"></h2>
			<br>${msg }<br>
			<div class="row align-items-center">
				<h4 class="careerheader"Search Jobs></h4>
			</div>
			<div class="row align-items-center">
				<form class="row contact_form" method="post">
					<input type="text" id="keyword" name="keyword"
						placeholder="Search part-time, title, etc." class="form-control" />
					<a href="/search" class="btn greenButton"><button type="submit"
							value="submit" class="btn">Search</button></a>


				</form>
			</div>
		</main>

		<footer class="mastfoot mt-auto">
			<div class="inner">

					Designed by Ansarullah | Sediqi <a href="https://getbootstrap.com/"></a>
					<a href=""></a>
				
			</div>
		</footer>
	</div>

</body>
</html>