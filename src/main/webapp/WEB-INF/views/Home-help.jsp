<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.LocalDateTime" %>

<html>
<body>

<%  String name =(String) request.getAttribute("name");
    Integer id = (Integer) request.getAttribute("id");
    LocalDateTime time=(LocalDateTime) request.getAttribute("time");
    List<String> corp =(List<String>) request.getAttribute("Company");
%>




<h1>  My name is <%=name%>    </h1>
<h1>  My Id is <%=id%>        </h1>
<h1>  Time and Date is <%=time.toString()%> <%=id%>        </h1>

<%   for(String s: corp)
{   %>
 <h1>List of corporate company is
  <%=s%>
  </h1>
<%   }  %>


<h2></h2>







</body>
</html>