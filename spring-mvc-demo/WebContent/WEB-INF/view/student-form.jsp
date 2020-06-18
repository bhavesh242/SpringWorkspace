<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<form:form action="processForm" modelAttribute="student" >
	First name : <form:input path="firstName" />
	<br><br>
	Last name : <form:input path="lastName" />
	<br><br>
	Country : 
	<form:select path="country">
		<form:options items="${student.countryOptions}" />
	</form:select>
	<br><br>
	Favorite Programming Languages :
	Java<form:radiobutton path="favoriteLanguage" value="Java"/>
	PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
	Python<form:radiobutton path="favoriteLanguage" value="Python"/>
	C#<form:radiobutton path="favoriteLanguage" value="C#"/>
	<br><br>
	Operating Systems :
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	Windows <form:checkbox path="operatingSystems" value="Windows"/>
	CentOS <form:checkbox path="operatingSystems" value="CentOS"/>
	<input type="submit" value="submit" />
	</form:form>
	
</body>
</html>