<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ArzDs World</title>
</head>
<body>
	<h2>Welcome to Product Details</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>CODE</th>
			<th>Name</th>
			<th>Cost</th>
			<th>GST</th>
			<th>Note</th>
			<th colspan="2">Operation</th>
		</tr>
	</table>
	<c:forEach items="${list}" var="data">
		<tr>
			<td><c:out value="${data.id}" /></td>
			<td><c:out value="${data.code }" /></td>
			<td><c:out value="${data.name }" /></td>
			<td><c:out value="${data.cost }" /></td>
			<td><c:out value="${data.gst }" /></td>
			<td><c:out value="${data.note }" /></td>
			<td><a href="delete?id=${data.id}">Delete</a> <a
				href="edit?id=${data.id}">Edit</a></td>
	</c:forEach>
</body>
</html>