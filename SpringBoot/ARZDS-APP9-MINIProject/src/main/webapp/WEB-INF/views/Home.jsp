<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome TO ArzDs</title>
</head>
<body>
	<h1>Welcome To ArzDs World></h1>
	<form:form action="save" method="POST" modelAttribute="product">
		<pre>
			Code : <form:input path="code" />
			<br>
			Name : <form:input path="name" />
			<br>
			Cost : <form:input path="cost" />
			<br>
			GST  : <form:select path="gst">
				<br>
				   <form:option value="5">5%-SLAB</form:option>
				   <form:option value="12">12%-SLAB</form:option>
				   <form:option value="18">18%-SLAB</form:option>
				   <form:option value="22">22%-SLAB</form:option>
				   <form:option value="30">30%-SLAB</form:option>
			</form:select>
			NOTE :<form:textarea path="note" /> <br>
			<input type="submit" value="CREATE Product">
		</pre>
	</form:form>
	${message}

	</form>
</body>
</html>