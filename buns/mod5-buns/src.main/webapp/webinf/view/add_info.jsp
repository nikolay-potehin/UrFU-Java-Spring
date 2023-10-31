<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form:form action="save" modelAttribute="employee">
    <form:hidden path="id"/>
    <p>Name <form:input path="name"/><form:errors path="name"/></p>
    <p>Surname <form:input path="surname"/><form:errors path="surname"/></p>
    <p>Department <form:input path="department"/></p>
    <p>Salary <form:input path="salary"/><form:errors path="salary"/></p>
    <p><input type="submit" /></p>
</form:form>
</body>
</html>