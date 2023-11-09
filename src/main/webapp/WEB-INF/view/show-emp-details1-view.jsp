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

</body>

</html>