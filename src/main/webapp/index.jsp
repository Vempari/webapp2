<%@ page import="webapp.EJBLogic" %>
<html>
<body>
<h2>
    <%
        EJBLogic ejbLogic = new EJBLogic();
        String result = "";
        for (String str : ejbLogic.doRecursion()) {
            result = result + "<p>" + str + "</p>";
        }
    %>
    <%= result%>
</h2>
</body>
</html>
