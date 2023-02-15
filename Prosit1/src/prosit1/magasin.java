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
public class magasin {
    int id;
    String adresse;
    int capaciteMagasin; 
    int ensembleProduits; 
}

   
    public magasin(int id, String adresse, int capaciteMagasin, int ensembleProduits) {
      this.id=id;
      this.adresse=adresse;
      this.capaciteMagasin=capaciteMagasin;
      this.ensembleProduits=ensembleProduits;
   }


public void afficher(){
    System.out.println(" id = " +this.id
                  +" "+"adresse = "+this.adresse
                 +" "+ "capaciteMagasin = " + this.capaciteMagasin 
                 +"  "+"ensembleProduits = " + this.ensembleProduits);
             
            
    }