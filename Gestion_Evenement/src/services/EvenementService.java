/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Evenement;

/**
 *
 * @author MSI
 */
public class EvenementService implements IServices <Evenement> {
    
       Connection cnx = MyConnection.getInstance().getCnx();

    
       @Override
    public void ajouter(Evenement t) throws SQLException {
        try {
   String req = "INSERT INTO evenement (nom,description,date_debut_event,date_fin_event,nb_participant,awards) VALUES("
                + "'" + t.getNom()+ "','" + t.getDescription()+ "','" + t.getDate_debut()+ "','" + t.getDate_fin() + "','" + t.getNb_participant()+ "','"+t.getAwards()+ "'" + ")";
        
        
        Statement st = cnx.createStatement();
        st.executeUpdate(req);
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    

    @Override
    public void modifier(Evenement t) throws SQLException {
         String req = " UPDATE evenement SET nom = ? ,description = ? , date_debut_event = ? , date_fin_event = ? , nb_participant = ?  , awards = ?   where id_event = ?    ";
            PreparedStatement ps = cnx.prepareStatement(req);
        ps.setString(1, t.getNom());
        ps.setString(2, t.getDescription());
        ps.setString(3, t.getDate_debut());
        ps.setString(4, t.getDate_fin());
        ps.setInt(5, t.getNb_participant());
        ps.setString(6, t.getAwards());
        ps.setInt(7, t.getId_event());
        ps.executeUpdate();
    }

    @Override
    public void supprimer(Evenement t) throws SQLException {
         String req = " DELETE FROM evenement where id_event = ?   ";
       
               PreparedStatement ps = cnx.prepareStatement(req);
             ps.setInt(1, t.getId_event());
             ps.executeUpdate();

    }

    @Override
    public List<Evenement> recuperer(Evenement t) throws SQLException {
        List<Evenement> event = new ArrayList<>();
        try {
            
            String req = "SELECT * FROM evenement";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {                
                Evenement E = new Evenement();
                E.setId_event(rs.getInt(1));
                E.setNom(rs.getString(2));
                E.setDescription(rs.getString(3));
                E.setDate_debut(rs.getString(4));
                E.setDate_fin(rs.getString(5));
                E.setNb_participant(rs.getInt(6));
                E.setAwards(rs.getString(7));
                
                event.add(E);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return event;
    }
       
}
