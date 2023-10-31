<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<p>Name: ${employee.name}</p>
<p>Surname: ${employee.surname}</p>
<p>Salary: ${employee.salary}</p>
<p>Department: ${employee.department}</p>
<p>Car brand: ${employee.carBrand}</p>
<p>Language(s):</p>
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
<p>Phone number: ${employee.phoneNumber}</p>
<p>Email: ${employee.email}</p>
</body>
</html>