<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
<title>
This is Student form
</title>
</head>

<body>
<form:form action="processForm" modelAttribute = "student">

First Name: <form:input path="firstName"/>
<br>
<br>
Last Name: <form:input path="lastName"/>
<br>
<br>
Country: 
<form:select path="country">
	<form:option value = "India" label = "India"/>
	<form:option value = "Africa" label = "Africa"/>
	<form:option value = "Alibaug" label = "Alibaug"/>
	<form:option value = "Germany" label = "Germany"/>
</form:select>
<input type="submit" value = "Submit">
</form:form>
</body>
</html>