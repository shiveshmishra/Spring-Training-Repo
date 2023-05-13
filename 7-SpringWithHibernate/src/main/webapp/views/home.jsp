<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="saveCustomer" method="post" modelAttribute="customerAttribute">
	<div>
		
	<p>
		<label for="name">Enter Name</label>
		<input type="text" name="name"/>
	</p>
	<p>
		<label for="age">Enter Age</label>
		<input type="text" name="age"/>
	</p>
		<input type="submit" value="add customer"/>
	</div>
</f:form>
</body>
</html>