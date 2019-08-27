<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    request.setAttribute("rnum",12);
%>
<html>
<head>
    <title>主页</title>
    <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
    <script type="text/javascript">
         $(function(){
             alert('主页');
         })
    </script>
</head>
<body>
<h2>Hello World!</h2>
<h2>${requestScope.rnum}</h2>
</body>
</html>
