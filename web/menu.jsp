<%-- 
    Document   : order
    Created on : Nov 4, 2016, 10:32:33 AM
    Author     : cb006186
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            if(session.getAttribute("u")!=null){
                
         %>
               <h1>Welcome <%=session.getAttribute("u") %> ! </h1>
         <%
            }else{
         %> 
             <h1>Welcome Guest!</h1>

         <%
             }
         %>
        
        
        <table border="0">
            
                <tr>
                    <td>Blueberry cheese cake</td>
                    <td>Blueberry cheese cake slice </td>
                    <td>Rs 420</td>
                    <td><img src="images/cheesecake.png" width="200" height="100" alt="cheesecake"/>
                    </td>
                    <td><a href="AddToCartServlet?itemId=I001"><img src="images/addtocart.png" width="50" height="50" alt="addtocart"/></a></td>
                </tr>
                <tr>
                    <td> chocolate cookies</td>
                    <td> chocolate cookies  </td>
                    <td>Rs 260</td>
                    <td><img src="images/chocolatecookies.png" width="200" height="100" alt="chocolatecookies"/>
                    </td>
                    <td><a href="AddToCartServlet?itemId=I002"><img src="images/addtocart.png" width="50" height="50" alt="addtocart"/></a></td>
                </tr>
                <tr>
                    <td> pain-au-chocolate</td>
                    <td>pain-au-chocolate  </td>
                    <td>Rs 150</td>
                    <td><img src="images/pain-au-chocolate.png" width="200" height="100" alt="pain-au-chocolate"/>
                    </td>
                    <td><a href="AddToCartServlet?itemId=I003"><img src="images/addtocart.png" width="50" height="50" alt="addtocart"/></a></td>
                </tr>
            
        </table>
         <a href="AddToCartServlet?logout=1">Logout</a>
        
    </body>
</html>
