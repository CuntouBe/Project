<%--
  Created by IntelliJ IDEA.
  User: 86135
  Date: 2020/3/25
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    System.out.println(path);
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    System.out.println(basePath);

%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>login</title>
</head>
<body>
    <a href="test.jsp">bbbb</a>
</body>
</html>
