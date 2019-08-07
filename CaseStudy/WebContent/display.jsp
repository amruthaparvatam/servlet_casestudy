<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.res.model.Athelete, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" style="font-style:25px" >
<tr>
<td>athleteID</td>
<td>athleteName</td>
<td>athleteGender</td>
<td>category</td>
<td>athleteEmail</td>
<td>athleteMobile</td>
</tr>

<%
	ArrayList<Athelete> atheletes=(ArrayList<Athelete>) request.getAttribute("atheletes");
	
	for(Athelete each: atheletes) {
%>
<tr>
<td><%= each.getId() %></td> 
<td><%= each.getName()%></td> 
<td><%= each.getGender()%></td>
<td><%=each.getCategory()%></td> 
<td><%=each.getEmail()%></td>
<td><%=each.getMobile()%></td>
</tr>
	<% }%>

</table>



</body>
</html>