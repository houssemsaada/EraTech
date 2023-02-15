/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.SQLException;
import models.Evenement;
import services.EvenementService;
import utils.MyConnection;

/**
 *
 * @author MSI
 */
public class mainn {
    public static void main(String[] args) throws SQLException {
        
        MyConnection cn = new MyConnection();
      
        EvenementService es = new EvenementService();
        
        Evenement e1= new Evenement(10, "amen", "ssdddes", "15-10-2021", "19-10-2023", "100dt");
      //  es.ajouter(e1);
      //es.supprimer(e1);
        System.out.println(es.recuperer(e1));   
        
    }
    
}
