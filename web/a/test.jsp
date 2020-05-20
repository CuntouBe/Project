<%--
  Created by IntelliJ IDEA.
  User: 86135
  Date: 2020/3/25
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<%
    String path = request.getContextPath();
    System.out.println(path);
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    System.out.println(basePath);

%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>创建超链接解决路径问题</title>
</head>
<body>
    <a href="login.jsp">aaaaa</a>
</body>
</html>
