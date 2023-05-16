<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>1부터 10까지 더하</title>
	</head>
	<body>
		<%
			int num = 0;
			for(int i=1; i<=10;i++){
				num += i;
			}
		%>
		1부터 10까지의 합 : <%=num %>
	</body>
</html>