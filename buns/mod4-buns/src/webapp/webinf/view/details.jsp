<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form:form action="info" modelAttribute="employee">
    <p>Name <form:input path="name"/><form:errors path="name"/></p>
    <p>Surname <form:input path="surname"/><form:errors path="surname"/></p>
    <p>Salary <form:input path="salary"/><form:errors path="salary"/></p>
    <p>Department <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select></p>
    <p>Which car do you want?
        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    </p>
    <p>Language(s)
        <form:checkboxes path="languages" items="${employee.langList}"/>
    </p>
    <p>Phone Number <form:input path="phoneNumber"/><form:errors path="phoneNumber"/></p>
    <p>Email <form:input path="email"/><form:errors path="email"/></p>
    <p><input type="submit"></p>
</form:form>
</body>
</html>