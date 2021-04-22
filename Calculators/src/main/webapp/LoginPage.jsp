<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%    String s1 = request.getParameter("login_uname");
        String s2 = request.getParameter("login_pwd");
        if (s1.equals("Neha") && s2.equals("pass")) {%>
        <jsp:forward page="Loggedin.jsp"/>
<%    } else {%>
        <h5>Login failed</h5>
        <jsp:include page="LoginPage.html"/>
<%    }%>
</body>
</html>