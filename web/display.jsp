<%--
  Created by IntelliJ IDEA.
  User: WagnerMestrinho
  Date: 1/15/17
  Time: 7:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
    <body>
        <h2>"<%=request.getAttribute("invName")%> you are looking to make a <%=request.getAttribute("percent")%>%
        return on $<%=request.getAttribute("invAmount")%>.
        This is a <%=request.getAttribute("invType")%> investment!"
        </h2>
        <form action="index.jsp">
        <button type="submit">Start From Bottom??</button>
        </form>
    </body>
</html>
