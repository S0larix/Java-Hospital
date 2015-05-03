/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion_Transformation;

import Classes.*;
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
   
   public void test_requete (){ //renplie l'ArrayList<generique> de la classe attendu avec la requête rendu
       /* 
        if()//on teste la requête pour savoir quel sont les classes demandés
        {
            liste_generique=new ArrayList<chambre>();
            //...
            for (String s : liste) {
               // System.out.println(liste);
                //décomposition de la réponse en fonction de la question (dépend de l'interface graphique)
                
                //remplissage de la classse
                chambre tmp = new chambre(,,,);
                liste_generique.add(tmp);
                
            }
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
       */
    }
   
   public String creer_requête(){
       String requete = "select";
       //créer la requête à partir de la GUI
       /*if()
       requete=requete+" from "+;
       if()
       */
       return requete;
   }
   
}
