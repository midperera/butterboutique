/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.buterboutique.servlets;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Imasha Perera
 */
@WebServlet(name = "AddToCartServlet", urlPatterns = {"/AddToCartServlet"})
public class AddToCartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         HttpSession cartsession=req.getSession();
         
        if(req.getSession().getAttribute("u")!=null){
        
        String itemId=req.getParameter("itemId");
         
        
        
         ArrayList shoppingCart= new ArrayList();
         shoppingCart.add(itemId);
         
         
         cartsession.setAttribute("cart",shoppingCart);
         
            RequestDispatcher rd = req.getRequestDispatcher("viewcart.jsp");
            rd.forward(req, resp);
        
        }else{
        resp.sendRedirect("index.jsp?loginstate=1");
              
        }
        if(req.getParameter("logout")!=null){
        cartsession.invalidate();
        
        RequestDispatcher rd= req.getRequestDispatcher("index.jsp");
        rd.forward(req, resp);
        
        //resp.sendRedirect("index.jsp");
        }
         //resp.sendRedirect("viewcart.jsp?item="+itemId);
    }
    
}
        

    

    


