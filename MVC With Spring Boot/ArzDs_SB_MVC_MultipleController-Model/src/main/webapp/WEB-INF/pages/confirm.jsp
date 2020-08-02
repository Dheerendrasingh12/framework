<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<body>
	<p>Your reservation is confirmed successfully. Please, re-check the
		details.</p>
	First Name : ${reservation.firstName}
	<br> Last Name : ${reservation.lastName}
	<br> Gender : ${reservation.gender}
	<br> Food :
	<ul><c:forEach var="meal" items="${reservation.food}">
	<li>${meal }</li></c:forEach>
	</ul>
<br> City From ${reservation.cityFrom}
<br> City To ${reservation.cityTo}
</body>
</html>