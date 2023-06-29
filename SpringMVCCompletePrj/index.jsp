<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>
<c:url var="countURI" value="/hr/count"/>
<a href="${countURI}">사원의 수 조회</a>
<br>
<img src="images/apple.jpg"/>
</body>
</html>