<%-- 
    Document   : viewcart
    Created on : Nov 18, 2016, 10:08:29 AM
    Author     : Imasha Perera
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession mysession=request.getSession();
            ArrayList shoppingcart=(ArrayList)mysession.getAttribute("cart");
        %>
        
        <%=shoppingcart%>
        
        <a href="menu.jsp">Back to Menu</a>
        
    </body>
</html>
