JSP:-
<%@page import="edu.matc.persistence"%>
<%@ page import="edu.matc.persistence.LengthConverter" %>
<%@ page import="javax.ws.rs.core.Response" %>
<html>
<head>
    <%
        LengthConverter object= new LengthConverter();//Creating class Object
        Response sum=object.getLengthText("inches","feet",36);//Calling add Method
    %>
</head>
<body>
<h4>Addition of two numbers is <%=sum%> </h4>
</body>
</html>