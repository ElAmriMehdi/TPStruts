<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style><%@include file="/css/style.css"%></style>
<title>Ma formation Struts2</title>
</head>
<body>
	<div>
	<h3>La liste des todos</h3>
		<display:table name="todosList">
			<display:column property="title"></display:column>
		</display:table>
	</div>

</body>
</html>