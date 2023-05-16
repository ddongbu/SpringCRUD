<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>구구단</title>
	</head>
	<body>
		<table border="1">
		<%
			int num = 0;
			for(int i=1; i<10;i++){
				out.print("<tr>");
				for(int j=1; j<10;j++){
					out.print("<td>"+j+" * "+i+" = "+j*i+"</td>");
				}
				out.print("</tr>");
			}
		%>
		</table>
		
	</body>
</html>