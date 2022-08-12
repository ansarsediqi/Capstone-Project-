<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="utf-8">
<title>Job Portal</title>

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
.form-row {
justify-content: center;
margin-bottom:5px;

}
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
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker();
	});
</script>
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

		<main role="main" class="inner cover">


			<form:form modelAttribute="jobList" action="/hr/add-job" method="post">
				<h3 class="text-danger">${msg}</h3>
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="inputEmail4">Description</label>
						<form:input path="description" type="text" class="form-control"
							id="inputEmail4" />
							
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="inputEmail4">Salary</label>
						<form:input path="Salary" type="text" class="form-control"
							id="inputEmail4" />
							
							
							
					</div>
				</div>
				
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="inputEmail4">Title</label>
						<form:input path="title" type="text" class="form-control"
							id="inputEmail4" />
							
					</div>
				</div>
				
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="inputEmail4">Date Posted</label>
						<p>
							<form:input path="dateposted" type="text" id="datepicker"
								class="form-control" />
						</p>
						<!--<form:input path="dateposted" type="text" class="form-control"
							id="inputEmail4" /> -->

					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="inputEmail4">Status</label>
						<form:input path="status" type="text" class="form-control"
							id="inputEmail4" />
							
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="inputEmail4">Skills</label>
						<form:input path="skills" type="text" class="form-control"
							id="inputEmail4" />
							
					</div>
				</div>
				
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="inputEmail4">Job Type</label>
						<form:input path="jobType" type="text" class="form-control"
							id="inputEmail4" />
							
					</div>
				</div>
				
				
				
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="inputEmail4">Contract Duration</label>
						<form:input path="contractDuration" type="text" class="form-control"
							id="inputEmail4" />
							
					</div>
				</div>
				
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="inputEmail4">Experience</label>
						<form:input path="experience" type="text" class="form-control"
							id="inputEmail4" />
							
					</div>
				</div>
				
				<button type="submit" class="btn greenButton">Submit</button>
				
			</form:form>


		</main>

		<footer class="mastfoot mt-auto">
			<div class="inner">
				<p>
					Designed by Ansarullah | Sediqi<a href="https://getbootstrap.com/"></a>
					 <a href=""></a>
				</p>
			</div>
		</footer>
	</div>


</body>
</html>