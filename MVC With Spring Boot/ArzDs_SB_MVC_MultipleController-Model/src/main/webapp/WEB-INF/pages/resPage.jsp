<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Reservation Form</title>
</head>
<body>
	<form:form action="submit" modelAttribute="reservation">
FirstName <form:input path="firstName" />
LastName <form:input path="lastName" />
Gender
	Male  <form:radiobutton path="gender" value="male" />
	Female <form:radiobutton path="gender" value="female" />
		<br>
		<br>


		<br>
		<br>  
        Meals:  
        BreakFast<form:checkbox path="food" value="BreakFast" />  
        Lunch<form:checkbox path="food" value="Lunch" />  
        Dinner<form:checkbox path="food" value="Dinner" />
	
	Leaving from :<form:select path="cityFrom">
	<form:option value="Delhi"/>
	<form:option value="Amritsar"/>
	<form:option value="Chandigarh"/>
	<form:option value="Gwalior"/>
	<form:option value="Hyderabad"/>
	
	</form:select>
	Going To :<form:select path="cityTo">
	<form:option value="Delhi"/>
	<form:option value="Amritsar"/>
	<form:option value="Chandigarh"/>
	<form:option value="Gwalior"/>
	<form:option value="Hyderabad"/>
	
	</form:select>
		<br>
		<br>
		<input type="submit" value="Register">
	</form:form>
</body>
</html>