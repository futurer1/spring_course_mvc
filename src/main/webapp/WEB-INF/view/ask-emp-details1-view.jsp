<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Please enter your details:</h2>

<%--@elvariable id="employee" type="com.mikhail.spring.mvc.Employee"--%>
<form:form action="showDetails" modelAttribute="employee">
    
    Name <form:input path="name"/>
    <form:errors path="name"/> <!-- вывод информации с ошибкой валидации -->
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    Department <form:select path="department">
<%--        Вариант хардкода: --%>
<%--        <form:option value="Information Technology" label="IT"/>--%>
<%--        <form:option value="Hrenovye Gabotniki" label="HR"/>--%>
<%--        <form:option value="Prodajniki" label="sales"/>--%>

<%--        То же самое, но из HashMap объекта Employee --%>
        <form:options items="${employee.departments}"/>
    </form:select>
    <br>
<%--    Geely <form:radiobutton path="carBrand" value="Geely Coolray"/>--%>
<%--    Haval <form:radiobutton path="carBrand" value="Haval H9"/>--%>
<%--    Dongfeng <form:radiobutton path="carBrand" value="Dongfeng J"/>--%>

<%--        То же самое, но из HashMap объекта Employee--%>
        <form:radiobuttons path="carBrand" items="${employee.carBrands}" />
    <br>

<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutch"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>

<%--        То же самое, но из HashMap объекта Employee--%>
        <form:checkboxes path="languages" items="${employee.languagesList}"/>

    <br>
    Phone number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <input type="submit" value="ok"/>

</form:form>

</body>

</html>