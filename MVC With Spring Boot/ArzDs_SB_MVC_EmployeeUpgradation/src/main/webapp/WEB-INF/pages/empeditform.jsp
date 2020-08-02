<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit Employee</h1>
<form:form method="POST" action="/editsave">
	<table>
		<tr>
			<td></td>
			<td><form:hidden path="empId" /></td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><form:input path="empName" /></td>
		</tr>
		<tr>
			<td>Salary :</td>
			<td><form:input path="empSal" /></td>
		</tr>
	
		<tr>
			<td></td>
			<td><input type="submit" value="Edit Save" /></td>
		</tr>
	</table>
</form:form>