<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Form</title>
</head>
<body>
	<h1>Welcome Yoda!</h1>

	<form:form action="processForm" modelAttribute="student" >
		First name: <form:input path="firstName" />
		<br />
		Last name: <form:input path="lastName" />
		<br />
		<p>Country:  
		<form:select path="country">
			<form:options items="${student.countryOptions}" ></form:options>
		</form:select>
		</p>
		<br />
		<input type="submit" value="Register" />
	</form:form>
</body>
</html>