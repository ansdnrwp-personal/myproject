<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/resources/include/head.jspf" %>

<!DOCTYPE html>
<html>
<head>

<!-- 화면단위 css 및 script는 외부에 작성 -->
<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/agency/login/agencyLogin.css" />
<script type="text/javascript" src="/resources/js/agency/login/agencyLogin.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<div class="login_con">
		<div class="inner">
			<p class="id_txt"><input type="text"     name="userid" class="input_id" placeholder="ID" value="${id }"/></p>
			<p class="pw_txt"><input type="password" name="passwd" class="input_pw" placeholder="Password" /></p>
			<p class="btn_login"><a href="#"><img src="/resources/images/btn/btn_m_login.png" alt="로그인" id="btn_login"/></a></p>
		</div>
	</div>
</body>
</html>