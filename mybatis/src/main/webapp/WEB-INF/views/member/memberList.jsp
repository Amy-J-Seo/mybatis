<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>회원목록</h1>
		</div>
		<div>
			<c:forEach var="member" items="${members }">
				
				아이디: ${member.id } name: ${member.name }<br>

			</c:forEach>

		</div>

	</div>
</body>
</html>