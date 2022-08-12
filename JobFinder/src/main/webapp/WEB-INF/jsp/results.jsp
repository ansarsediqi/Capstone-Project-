<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Result</title>

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
<body>
	<main id="main">

		<div class="container">
			<h2 class="cover-heading">Search Results</h2>

			<a href="/search"><button class="btn greenButton">New
					Search</button></a>
			<c:if test="${empty matches }">
				<br>${msg }<br>
			</c:if>
			<c:choose>
				<c:when test="${empty user }">
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th>Job No.</th>
								<th>Description</th>
								<th>Title</th>
								<th>Salary</th>
								<th>Date Posted</th>
								<th>Status</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${matches }">
								<tr>
									<td>${item.id }</td>
									<td>${item.description }</td>
									<td>${item.title }</td>
									<td>${item.salary }</td>
									<td>${item.dateposted }</td>
									<td>${item.status }</td>
									<td>${item.skills }</td>
									<td><a href="details?id=${item.id}"><button>Details</button></a>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:when>
				<c:when test="${user.role == customer }">
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th></th>
								<th>Location</th>
								<th>Size</th>
								<th>Price</th>
								<th>Image</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${matches }">

							</c:forEach>
						</tbody>
					</table>
				</c:when>
				<c:otherwise>

					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th></th>
								<th>Location</th>
								<th>Size</th>
								<th>Price</th>
								<th>Image</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${matches }">
								<tr>
									<td>${item.property.location }</td>
									<td>${item.property.size }</td>
									<td>${item.property.price }</td>
									<td><img src="${item.property.image }"></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>

				</c:otherwise>
			</c:choose>
		</div>

	</main>


</body>
</html>