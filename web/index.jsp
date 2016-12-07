<%-- 
    Document   : index
    Created on : Nov 4, 2016, 9:58:07 AM
    Author     : cb006186
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Butter Boutique Colombo - Home</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="LoginServlet" method="POST">
            Username <input type="text" name="username" /><br/>
            Password <input type="password" name="password" /><br/>
            <input type="Submit" value="Sign In"/>
            <%
                if(request.getParameter("loginstate")!=null){
                  %>  
                  <font color="RED">You need to login to add items to cart :( <font>
                  <%
                      }
                   %>
        </form>
    </body>
</html>
