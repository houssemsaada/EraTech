/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elbaldi.services;

import elbaldi.interfaces.commandeInterfaceCRUD;
import elbaldi.models.commande;
import elbaldi.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author houss
 */
public class CommandeCRUD implements commandeInterfaceCRUD {

    Statement ste;
    Connection conn = MyConnection.getInstance().getConn();

    @Override
    public void ajouterCommande(commande c) {
        if (c.getId_cmd() != 0) {
            try {
                String req = "INSERT INTO `commande` (`id_cmd`,`id_user`, `etat`, `date_cmd`) VALUES (?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(req);
                ps.setInt(1, c.getId_cmd());
                ps.setInt(2, c.getId_user());
                ps.setString(3, c.getEtat());
                ps.setDate(4, c.getDate_cmd());
                ps.executeUpdate();
                System.out.println("commande ajouté!!!");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                String req = "INSERT INTO `commande` (`id_user`, `etat`, `date_cmd`) VALUES (?,?,?)";
                PreparedStatement ps = conn.prepareStatement(req);
                ps.setInt(1, c.getId_user());
                ps.setString(2, c.getEtat());
                ps.setDate(3, c.getDate_cmd());
                ps.executeUpdate();
                System.out.println("commande ajouté!!!");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void modifierCommande(commande c) {
        try {
            String req = "UPDATE `commande` SET `etat` = ?, `date_cmd` = ? , `id_user` = ? WHERE id_cmd  = ? ";
            PreparedStatement ps = conn.prepareStatement(req);
            ps.setString(1, c.getEtat());
            ps.setDate(2, c.getDate_cmd());
            ps.setInt(3, c.getId_user());
            ps.setInt(4, c.getId_cmd());
            ps.executeUpdate();
            System.out.println("commande updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void supprimerCommande(int id_cmd) {
        try {
            String req = "DELETE FROM `commande` WHERE id_cmd = " + id_cmd;
            Statement st = conn.createStatement();
            st.executeUpdate(req);
            System.out.println("commande deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<commande> affichercommande() {
        List<commande> list = new ArrayList<>();
        try {
            String req = "Select * from commande";
            Statement st = conn.createStatement();

            ResultSet RS = st.executeQuery(req);
            while (RS.next()) {
                commande c = new commande();
                c.setId_cmd(RS.getInt(1));
                c.setEtat(RS.getString(2));
                c.setDate_cmd(RS.getDate(3));
                c.setId_user(RS.getInt(4));
                list.add(c);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }

}
