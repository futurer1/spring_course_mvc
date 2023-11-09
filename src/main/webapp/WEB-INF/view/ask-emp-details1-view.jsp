<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Please enter your details:</h2>

<%--@elvariable id="employee" type="com.mikhail.spring.mvc.Employee"--%>
<form:form action="showDetails" modelAttribute="employee">
    
    Name <form:input path="name"/><br>
    Surname <form:input path="surname"/><br>
    Salary <form:input path="salary"/><br>
    Department <form:select path="department">
<%--        Вариант хардкода: --%>
<%--        <form:option value="Information Technology" label="IT"/>--%>
<%--        <form:option value="Hrenovye Gabotniki" label="HR"/>--%>
<%--        <form:option value="Prodajniki" label="sales"/>--%>

<%--        То же самое, но из HashMap объекта Employee --%>
        <form:options items="${employee.departments}"/>
    </form:select>

    <input type="submit" value="ok"/>

</form:form>

</body>

</html>