<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="1" bgcolor='red'>
	<tr bgcolor="blue">
		<th>eno</th>
		<th>empname</th>
		<th>empSalary</th>
	</tr>
	<c:forEach var="emp" items="${empList }">
		<tr>
			<td><c:out value="${emp.empId }" /></td>
			<td><c:out value="${emp.empName }" /></td>
			<td><c:out value="${emp.empSal }" /></td>
		</tr>

	</c:forEach>
</table>