<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resource/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<h1>商铺详情</h1>
	<table class="table">
		<tr>
			<td>编号${shop.sid }</td>
		</tr>
		<tr>
			<td>店铺名称${shop.sname }</td>
		</tr>
		<tr>
			<td>创建时间${shop.sdate }</td>
		</tr>
		<tr>
			<td>店铺名称<c:forEach items="${shop.goods }" var="g">${g.gname }</c:forEach></td>
		</tr>
	</table>
</body>
</html>