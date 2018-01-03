<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="resources/js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="resources/js/vue.min.js"></script>
	<title>Insert title here</title>
</head>
<body>
    <div id="test">
	    用户名：<input type="text" id="username" v-model="user.username">
	    密码：<input type="text" id="pwd" v-model="user.pwd">
	  <button type="button"  v-on:click="login()">登录</button>
	</div>
	<script type="text/javascript" src="resources/js/test.js"></script>
</body>
</html>