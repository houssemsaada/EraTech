/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selimyoussef;

import elbaldi.interfaces.InterfaceCRUD;
import elbaldi.model.promotion;
import elbaldi.model.question;
import elbaldi.model.quiz;
import elbaldi.services.PromotionCRUD;
import elbaldi.services.QuestionCRUD;
import elbaldi.services.QuizCRUD;
import elbaldi.utils.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author selim
 */
public class Selimyoussef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //MyConnection conn = MyConnection.getInstance();
        
        quiz q1= new quiz(4,"facile",0,3,1);
        QuizCRUD qu= new QuizCRUD();
      //qu.ajouterQuiz(q1);
       //qu.modifierquiz(q1);
       //qu.supprimerquiz(4);
       //System.out.println( qu.afficherQuiz());
       //System.out.println(qu.getById(2));
        //System.out.println(qu.filtreByDifficulte("Moyenne"));
        
        
        
       question qq1= new question("mOYENNE"," Quelle h?","Tunis","Sousse","Sfax","Tunis",4);
       
       QuestionCRUD qq= new QuestionCRUD();
       //qq.ajouterQuestion(qq1);
        //qq.modifierquestion(qq1);       
        //qq.supprimerquestion(3);
        //System.out.println( qq.afficherQuestion());
        //System.out.println(qq.getById(2));
        // System.out.println(qq.filtreByDifficulte("difficile"));
    
    
      // créer un objet Promotion
        promotion p1 = new promotion("HJIK525", 0.25f, LocalDate.of(2023, 3, 1), LocalDate.of(2023, 3, 21));
     // appeler la méthode pour ajouter la promotion
         PromotionCRUD pc2 = new PromotionCRUD();
  
         //Ajout Promotion
         /*if (p1.isValid()) {
             pc2.ajouterpromotion(p1);
        } else {
               System.out.println(" la date de début doit être antérieure à la date de fin");
        }*/


         
         
 //Modification promotion        
        /* if (p1.isValid()) {
             pc2.modifierpromotion(p1);
        } else {
               System.out.println(" la date de début doit être antérieure à la date de fin");
        }*/
        
         
         
         //pc2.supprimerpromotion(2);
         //System.out.println( pc2.afficherpromotion());
         //System.out.println(pc2.getById(1));
         //System.out.println(pc2.filtreBytaux(0.25f));
 
}}