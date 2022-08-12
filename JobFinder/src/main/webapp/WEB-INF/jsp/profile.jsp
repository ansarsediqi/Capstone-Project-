<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="utf-8">
<title><c:out value="${hrUser[0].first_name}" /> Profile Page</title>

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
					<a class="nav-link active text-muted" href="/">Home</a> <a class="nav-link text-muted"
						href="/search">Search for Jobs</a>
				</nav>
			</div>
		</header>
		<br>
		<div class="container">
			<h1 class="Careerheader">Careers Page</h1>
		</div>
		<br>
		<main role="main" class="inner cover">





			<c:if test="${jobList != null }">
				<h2 class="cover-heading"></h2>
				<table class="table">
					<caption></caption>
					<thead>
						<tr>

							<th scope="col">Description</th>
							<th scope="col">Title</th>

							<th scope="col">Date-Posted</th>
							<th scope="col">Status</th>

							<th scope="col">Job Type</th>
							<th scope="col">Contract Duration</th>

						</tr>
					</thead>
					<c:forEach items="${jobList}" var="item">
						<tr>

							<td><c:out value="${item.description }" /></td>
							<td><c:out value="${item.title }" /></td>

							<td><fmt:formatDate value="${item.dateposted }"
									pattern="MM/dd/yyyy" /></td>
							<td><c:out value="${item.status }" /></td>

							<td><c:out value="${item.jobType }" /></td>
							<td><c:out value="${item.contractDuration }" /></td>

							<td><a href="details?id=${item.id}"><button>Details</button></a></td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
			<c:if test="${scheduled != null }">
				<h2 class="cover-heading">List of Jobs</h2>
				<table class="table">
					<caption>Current Job List</caption>
					<thead>
						<tr>
							<th scope="col">Logo</th>
							<th scope="col">Job Name</th>
							<th scope="col">Start Date</th>
							<th scope="col">Start Time</th>
							<th scope="col"></th>
						</tr>
					</thead>
					<c:forEach items="${scheduled}" var="schedule">



					</c:forEach>
				</table>
			</c:if>
			<h2 class="cover-heading"></h2>
			<c:if test="${courselist != null }">
				<table class="table">
					<caption>All Jobs are available</caption>
					<thead>
						<tr>
							<th scope="col">job ID</th>
							<th scope="col">Logo</th>
							<th scope="col">Actions</th>
							<th scope="col">Job Name</th>
							<th scope="col">Start Date</th>
						</tr>
					</thead>

				</table>
			</c:if>
			<c:if test="${list == null }">
				<h3 class="text-danger">${msg}</h3>
			</c:if>
		</main>

		<footer class="mastfoot mt-auto">
			<div class="inner">
				<p>
					Designed by Ansarullah | Sediqi <a href="https://getbootstrap.com/"></a>
					<a href=""></a>
				</p>
			</div>
		</footer>
	</div>


</body>

</html>
