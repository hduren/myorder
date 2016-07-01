<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<script type="text/javascript">

</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>预定</title>
</head>
<body>
预定
<s:form action="order" namespace="/user">
<s:label>提交订单1</s:label>
<br/>
<s:textfield name="portRequest">姓名</s:textfield>
<s:submit>提交</s:submit>
</s:form>

</body>
</html>