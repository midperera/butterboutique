/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.butterboutique.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Imasha Perera
 */
public class CartDAO {
     Connection con;
    Statement stmt;
    
    public boolean isUserExit(String u,String p){
        boolean flag =false;
        String sqlquery="select * from Userdetails where username='"+u+"' and password='"+p+"'";
        try{
          stmt = con.createStatement();
           
          ResultSet rs=stmt.executeQuery(sqlquery);
                  while(rs.next()){
                      flag= true;
        }
        
    }   catch (SQLException ex) {
            
        }
        return flag;
}
    /**connect to database
     * */
     
    public void connectDb(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/dbbutterboutique", "Imasha", "midp");
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
           
        }
    }// end connect
}
