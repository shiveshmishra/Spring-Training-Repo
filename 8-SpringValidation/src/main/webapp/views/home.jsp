<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<style type="text/css">
.error{
color: red;
font-weight:bold}

</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="login" method="post" modelAttribute="userdata">
Enter Id:<form:input   path="custId"/>
<form:errors path="custId" cssClass="error"/>

Enter Username:<form:input   path="custName"/>
<form:errors path="custName" cssClass="error"/>

Enter UserAddress:<form:input path="custAddress"/>
<form:errors path="custAddress" cssClass="error"/>

Enter password:<form:input path="password"/>
<form:errors path="password" cssClass="error"/>

<input type="submit" value="logIn"> 
</form:form>
</body>
</html>