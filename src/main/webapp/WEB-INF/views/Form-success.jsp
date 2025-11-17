<%@page contentType="text/html;charset=ISO-8859-1" language="java"
 pageEncoding="ISO-8859-1" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@page isELIgnored="false" %>
<!doctype html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Login Details </title>
<h1>${Header}</h1>
<h1>${Desc}</h1>
</head>

<body>
<h1> Welcome ${user.userName} </h1>
<h1>Email id is ${user.email} </h1>
<h1>Password is, ${user.password} </h1>
</body>

</html>
<%--The above userName , email, password after user. should be same as in Form-login--%>