/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elbaldi.interfaces;
import java.util.List;
import elbaldi.models.commande;

/**
 *
 * @author houss
 */
public interface commandeInterfaceCRUD {
    public void ajouterCommande(commande c) ; 
    public void modifierCommande(commande c);
    public void supprimerCommande(int id_cmd) ;
    public List<commande> affichercommande();
}
