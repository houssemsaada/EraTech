/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit1;

/**
 *
 * @author user
 */
public class Prosit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Produit p= new Produit(); //pour appeler le constructeur qu'on a déja crée dans la classe produit
     Produit p1= new Produit(1021, "lait" , "delice");
     Produit p2= new Produit(2510, "yaourt" , "vitalait");
     Produit p3= new Produit(1021, "tomate", "sicam",1.2f); // f= pour dire que c'est un float     }
    
     p1.prix=0.7f;
     p2.prix=0.9f;
     
     p1.afficher();
     p2.afficher();
     p3.afficher();
     
     
     String aff=p1.toString(); //on a crée une variale aff de type string pour la méthode d'affichage to string
     String aff1=p2.toString();
     String aff2=p3.toString();
             
     System.out.println(aff);
     System.out.println(aff1);
     System.out.println(aff2);
}
}

