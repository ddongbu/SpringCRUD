<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>1부터 1000까지 소수</title>
	</head>
	<body>
		<%
			for(int i=2; i<=1000; i++){
				boolean t = true;
				for(int j=2; j<i;j++){
					if(i%j==0){
						t=false;
						break;
					}
				}
				if(t){
					out.print(i+"<br>");
				}
			}
		%>
	</body>
</html>