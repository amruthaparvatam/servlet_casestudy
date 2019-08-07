<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		int id = (int)request.getAttribute("athleteId");
		String name = (String)request.getAttribute("athleteName");
		String gender = (String)request.getAttribute("athleteGender");
		String category = (String)request.getAttribute("athleteCategory");
		String email = (String)request.getAttribute("athleteEmail");
		int mobile = (int)request.getAttribute("athleteMobile");
	%>
	
	<h3> Athlete ID is 
	<%=id %>
	</h3>
	<h3> Athlete Name is 
	<%=name %>
	</h3>
	<h3> Athlete gender is 
	<%=gender %>
	</h3>
	<h3> Athlete category is 
	<%=category %>
	</h3>
	<h3> Athlete email is 
	<%=email %>
	</h3>
	<h3> Athlete mobile is 
	<%=mobile %>
	</h3>
	

</body>
</html>