<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 31.03.2017
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    import="controllers.WelcomeController" %>
<html>
  <head>
    <title>{requestScope.get(WelcomeController.WELCOME_KEY)} Welcome to our gun shop!</title>
  </head>
  <body>
    <%=request.getAttribute(WelcomeController.WELCOME_KEY)%> Welcome to our gun shop!
  </body>
</html>
