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
public class Produit {
    int id;
    String libelle;
    String marque;
    float prix;
    
    
    public Produit(){
        
    } // constructeur par défaut
    
   public Produit(int id, String libelle,String marque) {
      this.id=id;
      this.libelle=libelle;
      this.marque=marque;
   } 
    
  
    
    public Produit(int id, String libelle,String marque, float prix) {
      this.id=id;
      this.libelle=libelle;
      this.marque=marque;
      this.prix=prix;
   }
    
    public void afficher(){
    System.out.println(" id = " +this.id
                  +" "+"libelle = "+this.libelle
                 +" "+ "marque = " + this.marque
                 +"  "+"prix = " + this.prix);
            // unne commande afficher pour le tout ( en géneral) 
            
    }
   @Override
    public String toString() 
    {
        return "id "+ this.id +" "+"libelle" +" "+this.libelle+" "+"marque"+" "+this.marque+" "+"prix"+" "+this.prix ;   
    } 
         
}
    
