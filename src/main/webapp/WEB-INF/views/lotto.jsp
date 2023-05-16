<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또번호 생성하기</title>
</head>
<body>
	<%
		Random ran = new Random();

		int[] numList = new int[6];
		for(int i=0;i<6;i++){
			numList[i] = 0;
		}
		while(true){
			int num = ran.nextInt(45) + 1;
			for(int i=0;i<6;i++){
				if(numList[i] == num){
					out.print("중복발생!");
					break;
				}
				if(numList[i] == 0){
					numList[i] = num;
					out.print(i+1+"번째 숫자 : "+numList[i]+"<br>");
					break;
				}
			}
			if(numList[5] != 0){
				break;
			}
		}
		
		
	%>
</body>
</html>