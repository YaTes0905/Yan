<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resource/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<h1>列表页面</h1>
	<form action="/getlist" method="post">
		销售商品：
		<span id="goods">
			
		</span>
		店铺名称：<input type="text" name="keyword" value="${keyword }">
		<input type="hidden" name="pageNum">
		<input type="submit" value="查询">
		<input type="button" value="删除"  onclick="del()" >
	</form>
	<table class="table">
		<tr>
			<td><input onclick="qx()" id="all" type="checkbox"></td>
			<td>编号</td>
			<td>店铺名称</td>
			<td>创建日期</td>
			<td>销售商品</td>
			<td>操作<input type="button" value="添加" onclick="add()"></td>
		</tr>
		<c:forEach items="${list }" var="a" varStatus="i">
			<tr>
				<td><input type="checkbox" class="all" value="${a.sid }"></td>
				<td>${a.sid }</td>
				<td>${a.sname }</td>
				<td><fmt:formatDate value="${a.sdate }" pattern="yyyy-MM-dd"/></td>
				<td>
					<c:forEach items="${a.goods }" var="g">
						${g.gname }
					</c:forEach>
				</td>
				<td><a href="details?sid=${a.sid }">详情</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
				当前${info.pageNum }/${info.pages }页 共${info.total }条
				<input type="button" value="首页"  onclick="goPage(1)">
				<input type="button" value="上一页"  onclick="goPage(${info.prePage})">
				<input type="button" value="下一页"  onclick="goPage(${info.nextPage})">
				<input type="button" value="尾页"  onclick="goPage(${info.pages})">
			</td>
		</tr>
	</table>
	<script type="text/javascript">
		$(function(){
			$.ajax({
				url:"/getGoods",
				data:{},
				type:"post",
				dataType:"json",
				success:function(obj){
					for (var i = 0; i < obj.length; i++) {
						$("#goods").append("<input type='checkbox' name='idss' value='"+obj[i].gid+"'>"+obj[i].gname+"")
					}
				}
			})
		}) 
		function qx(){
			$(".all").each(function(){
				this.checked=$("#all")[0].checked;
			})
		}
		function goPage(pageNum){
			$("[name='pageNum']").val(pageNum);
			$("form").submit();
		}
		function add(){
			location.href="add";
		}
		function del(){
			var ids="";
			$(".all:checked").each(function(){
				ids+=","+this.value;
			});
			ids=ids.substring(1)
			$.ajax({
				url:"delete",
				data:{ids:ids},
				type:"post",
				dataType:"json",
				success:function(obj){
					if(obj){
						alert("删除成功")
						location.href="/getlist";
					}else{
						alert("删除失败")
					}
				}
			})
		}
	</script>
</body>
</html>