<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${status eq 'successfully' }">
			<h1 style='color: green; text-align: center;'>STUDENT RECORD
				UPDATED SUCCESSFULLY</h1>
		</c:when>
		<c:otherwise>
			<h1 style='color: green; text-align: center;'>STUDENT RECORD
				UPDATION FAILED</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>