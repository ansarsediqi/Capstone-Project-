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
<title>Job Detail</title>
</head>
<body>
<h2>    Job Detail Information Below:</h2>
	<ul>

		
		<li><em> Description: </em>${listing.description }</li>
		<li><em> Title: </em>${listing.title }</li>
		<li><em> Date posted: </em>${listing.dateposted }</li>
		<li><em> Status: </em>${listing.status }</li>
		<li><em> Skills: </em>${listing.skills }</li>
		<li><em> Job Type: </em>${listing.jobType }</li>
		<li><em>  Contract Duration: </em>${listing.contractDuration }</li>
		<li><em> Experience : </em>${listing.experience }</li>
	</ul>
</body>
<link
	href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="assets/styles.css"/>
</html>