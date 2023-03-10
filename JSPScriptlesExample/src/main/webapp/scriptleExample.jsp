<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
	public String sayHello(){
		return "Hello from JSP";
	}
%>
<%=
	sayHello()
%>
<% 
	out.print(sayHello());
	response.getWriter().print(sayHello());
%>
</body>
</html>