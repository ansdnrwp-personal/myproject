<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/resources/include/head.jspf" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/common/portal_layout.css" />
<title></title>
</head>
<body>
<div id="div_layout">
	<div id="div_header">
		<tiles:insertAttribute name="header"/>
	</div>
	<div id="div_top">
		<tiles:insertAttribute name="top"/>	
	</div>
	<div id="div_middle">
		<div id="div_left">
			<tiles:insertAttribute name="left"/>	
		</div>
		<div id="div_body">
			<tiles:insertAttribute name="body"/>	
		</div>
	</div>
	<div id="div_footer">
		<tiles:insertAttribute name="footer"/>	
	</div>
</div>
</body>
</html>