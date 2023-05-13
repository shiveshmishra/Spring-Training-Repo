<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="login" method="post" modelAttribute="userdata">
Enter Username:<form:input   path="username"/>
Enter UserAddress:<form:input path="address"/>
Enter EmailId:<form:input path="email"/>

<input type="submit" value="logIn"> 
</form:form>
</body>
</html>