<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setAttribute("req_name","seedinfo");
out.println(request.getAttribute("req_name"));
%>
${requestScope}
${requestScope.req_name}

</body>
</html>