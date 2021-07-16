<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h3>student confirmation</h3>
<br>
the student is confirmed: ${student.firstName } ${student.lastName}

<br> the country is ${student.country }
<br> the favourite language is ${student.favouriteLanguage }

<br>

operating systems

<ul>
<c:forEach var="temp" items="${student.operatingSystems}">
<li> ${temp }</li>
</c:forEach>
</ul>
</body>
</html>