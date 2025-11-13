<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
   <h1>This is controller /about </h1>
    <h2>In this we use Expression language and JSTL to traverse list elements</h2>
    <h3></h3>
    <hr>
    <p>Controller successfully returned this JSP view.</p>

    <h1>    ${name}  </h1>
    <h2>    ${city}  </h2>
<hr>
    <c:forEach var="item" items="${array}" >
    <h1> ${item}  </h1>
</c:forEach>


</body>
</html>
