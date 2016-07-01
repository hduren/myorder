<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
<body>
	<s:form action="index">
		<s:submit value="添加用户"></s:submit>

	</s:form>
	
		<s:form namespace="/user" action="addUser" >
		<s:submit value="添加用户1"></s:submit>

	</s:form>

</body>
</html>