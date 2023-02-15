/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elbaldi.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author selim
 */
public class MyConnection {
     private static Connection conn; //DB Credations
     
     String url ="jdbc:mysql://localhost:3306/Eratech";
     String user = "root";
     String pwd = "";
     
     private static MyConnection instance;
     
        public MyConnection() {
        try {
            conn=DriverManager.getConnection(url, user, pwd);
            System.out.println("Connexion avec succés");
        } catch (SQLException ex) {
            System.out.println("Prebleme de connexion!!");        }
    }
        
         public static MyConnection getInstance() {
        if(instance==null){
            instance= new MyConnection();
        }
        return instance;
    }
 
    
    public Connection getConn(){
        return MyConnection.getInstance().conn;
    }
    
}
