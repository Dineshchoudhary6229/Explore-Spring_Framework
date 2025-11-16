
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h2>Spring-MVC project started with controller </h2>

<h1>currently request mapping is on model and view</h2>


<%  String name=(String) request.getAttribute("name");
    Integer id=(Integer) request.getAttribute("id");
    List<String> friends=(List<String>) request.getAttribute("frnd");
%>

<h1>Name is <%=name%></h1>
<h1>Id is <%=id%></h1>


<%   for(String s: friends)
{   %>
 <h1>List of friends is
  <%=s%>
  </h1>
<%   }  %>




<h2></h2>








</body>
</html>
