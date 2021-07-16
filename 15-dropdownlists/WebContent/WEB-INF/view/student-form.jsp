<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>

<body>
<form:form action="processForm" modelAttribute="student">
First Name: <form:input path="firstName"/>
<br><br>

Last Name: <form:input path="lastName"/>
<br><br>


<br><br>

Country:
<form:select path="country">
<!--<form:option value="Pakistan" label="Pakistan"/>
<form:option value="USA" label="USA"/>
<form:option value="Germany" label="Germany"/>
<form:option value="France" label="France"/>-->

<form:options items="${student.countryOptions}"/>
</form:select>

favourite language:
java<form:radiobutton path="favouriteLanguage" value="java"/>
c#<form:radiobutton path="favouriteLanguage" value="c#"/>
php<form:radiobutton path="favouriteLanguage" value="php"/>
ruby<form:radiobutton path="favouriteLanguage" value="ruby"/>
<br><br>

Operating Systems:
Linux<form:checkbox path="operatingSystems" value="Linux"/>
Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
Windows<form:checkbox path="operatingSystems" value="Windows"/>



<input type="submit" value="Submit"/>
</form:form>
</body>
</html>