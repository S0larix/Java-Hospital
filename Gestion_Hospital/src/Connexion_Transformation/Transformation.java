/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion_Transformation;

import Classes.generique;
import java.sql.SQLException;
import java.util.ArrayList;
import jdbc2014.Connexion;

/**
 *
 * @author Jérôme
 */
public class Transformation {
   
   String loginECE="ducrocq";
   String mdpECE="KlrIT05A@";
   String loginBDD="ducrocq-rw";
   String mdpBDD="KlrIT05A@";
   ArrayList<String> liste;
   ArrayList<generique> liste_generique;
   public Connexion conn;

   public void methodechiante(){
      
       try {
                try {
                    // tentative de connexion si les 4 attributs sont remplis
                    conn = new Connexion(loginECE, mdpECE, loginBDD,mdpBDD);
                } catch (ClassNotFoundException cnfe) {
                    System.out.println("Connexion echouee : probleme de classe");
                    cnfe.printStackTrace();
                }
            } catch (SQLException e) {
                System.out.println("Connexion echouee : probleme SQL");
                e.printStackTrace();
            }
       
       
       try {

                // recuperer la liste des champs de la table
                liste = conn.remplirChampsRequete("SELECT * from docteur");

                // effacer les champs de la fenetre
                

                // ajouter la liste des champs dans la fenetre
               

                // se positionner sur le premier champ
                
            } catch (SQLException e) {
                System.out.println("Echec SQL");
                e.printStackTrace();
            }
   }
//new Connexion(loginECE, mdpECE, loginBDD, mdpBDD);
   
   public ArrayList<generique> test_requete (){
         /*
        if()//on teste la requête pour savoir quel sont les classes demandés
        {
            liste_generique=new ArrayList<chambre>();
            //...
        }
        if()
        {
            liste_generique=new ArrayList<docteur>();
             //...
        }
        if()
        {
            liste_generique=new ArrayList<infirmier>();
             //...
        }
        if()
        {
           liste_generique=new ArrayList<malade>();
            //...
        }
        if()
        {
          liste_generique=new ArrayList<service>();
          //...
        }
        return
        */  
    }
}
