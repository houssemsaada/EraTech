package eratech;




import elbaldi.model.Reclamation;
import static elbaldi.model.Role.client;
import elbaldi.model.Utilisateur;
import elbaldi.services.UtilisateurCRUD;
import elbaldi.services.ReclamationCRUD;
import java.sql.SQLException;

/**
 *
 * @author belkn
 */
public class eratech {

    /**
      * @param args the command line arguments
     * @throws java.sql.SQLException
     */
   public static void main(String[] args) throws SQLException {
       
       
       System.out.println("-------------------------------------------------------------------------------");
         System.out.println("                              PARTIE UTILISATEUR");
         System.out.println("-------------------------------------------------------------------------------");
     
       
       
      
        Utilisateur u1 = new Utilisateur("ben mahmoud", "khaled","test@test","10/16/2000",2345564,"tunis","test","test",client);
        UtilisateurCRUD uti = new UtilisateurCRUD();
        
        uti.ajouterUtlisateur(u1);
        uti.supprimerUtilisateur(2423);
        Utilisateur mod = new Utilisateur("ben mahmoud", "test","test@test","10/16/2000",2345564,"tunis","test","test",client);
        uti.modifierUtilisateur(mod,2424);
      
        System.out.println( uti.afficherUtilisateur());
        
        System.out.println(uti.getUserByID(2433)); 
        System.out.println(uti.Filter_utilisateur("nom", "test"));
        
        
        
     //-----------------------------------------------------------------------------------------------------------------------------------------
         System.out.println("-------------------------------------------------------------------------------");
         System.out.println("                             PARTIE RECLAMATION");
         System.out.println("-------------------------------------------------------------------------------");
     
     
     Reclamation r1 = new Reclamation("10/16/2000","tunis",2425);
        ReclamationCRUD rec = new ReclamationCRUD();
        
        rec.ajouterReclamation(r1);
         rec.supprimerReclamation(2425);
        Reclamation mod2 = new Reclamation("10/16/2000","testetst",2425);
        rec.modifierReclamation(mod2,2424);
      
         System.out.println( rec.afficherReclamation());
        
         System.out.println(rec.getReclamationByID(2433)); 
        System.out.println(rec.Filter_Reclamation("10/16/2000", "tunis"));
        
    
        
    }
    
   }
