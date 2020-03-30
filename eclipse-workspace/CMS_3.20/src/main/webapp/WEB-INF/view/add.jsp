<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resource/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<h1>添加页面</h1>
<form action="addSG" method="post">
	<table class="table">
		<tr>
			<td>店铺名称</td>
			<td><input type="text" name="sname"></td>
		</tr>
		<tr>
			<td>创建日期</td>
			<td><input type="date" name="sdate"></td>
		</tr>
		<tr>
			<td>销售商品</td>
			<td id="good"></td>
		</tr>
		<tr>
			<td colspan="100">
				<input type="submit" value="保存">
			</td>
		</tr>
	</table>
</form>
	<script type="text/javascript">
		$(function(){
			$.ajax({
				url:"getGoods",
				data:{},
				type:"post",
				dataType:"json",
				success:function(obj){
					for (var i = 0; i < obj.length; i++) {
						$("#good").append("<input type='checkbox' name='idss' value='"+obj[i].gid+"'>"+obj[i].gname+"")
					}
				}
			})
		}) 
	</script>
</body>
</html>