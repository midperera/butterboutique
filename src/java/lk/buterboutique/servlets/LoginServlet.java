/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.buterboutique.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import lk.butterboutique.dao.LoginDAO;

/**
 * 
 * @author Imasha Perera
 */


public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {//super.doPost(request, response); //To change body of generated methods, choose Tools | Templates.
        String user = request.getParameter("username");
        String pwd = request.getParameter("password");
        
        RequestDispatcher rd;
        LoginDAO mylogindao=new LoginDAO();
        mylogindao.connectDb();
        
        //if("Imasha".equals(UserName) && "1234".equals(Password)){
        if(mylogindao.isUserExit(user,pwd)){
            
            HttpSession loginsession= request.getSession();
           loginsession.setAttribute("u", user);//u refers to username
           
            rd=request.getRequestDispatcher("menu.jsp");
            rd.forward(request,response);
           // response.sendRedirect("success.jsp?username="+UserName);
           
           
        }
        else{
            response.sendRedirect("index.jsp? retry=1");
        }
    }
   
}
