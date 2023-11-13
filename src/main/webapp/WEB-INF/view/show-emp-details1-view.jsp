<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="employee" scope="request" type="com.mikhail.spring.mvc.Employee"/>
<!DOCTYPE html>
<html>

<body>

<h2>Dear employee, welcome!</h2>


<p>Your name: ${employee.name}</p><%--срабатывают геттеры--%>
<p>Your surname: ${employee.surname}</p>
<p>Your salary: ${employee.salary}</p>
<p>Your department: ${employee.department}</p>
<p>Your car brand: ${employee.carBrand}</p>
<p>Your languages: <ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul></p>
<p>Your phone number: ${employee.phoneNumber}</p>
<p>Your email: ${employee.email}</p>

</body>

</html>