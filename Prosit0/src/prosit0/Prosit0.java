/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit0;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Prosit0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=5;
        int n2=6;
        System.out.println("afficher les deux nombres :" + n1 +" "+ n2); 
        
        float Somme=0;
        Somme= n1+n2; 
        System.out.println(" « Le resultat est : "+" "+ Somme );
        
        
        System.out.println("Entrer le premier nombre a additionner" );
        Scanner scan=new Scanner(System.in);
        n1=scan.nextInt();
        
        System.out.println("Entrer le deuxieme nombre a additionner" );
         n2=scan.nextInt();
         Somme=n1+n2;
         System.out.println("La somme de "+ n1 +" et "+n2+" est " +Somme );
        
        
         int n;
         System.out.println(" Tapez un nombre : "  );
         n=scan.nextInt();
         
         int m=2*n;
         System.out.println(" Le double du nombre: " + n +" est: " +m );
         
    }
    
}

