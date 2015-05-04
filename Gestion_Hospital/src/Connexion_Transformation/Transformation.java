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
        if(checkbox_chambre.isSelected())//on teste la requête pour savoir quel sont les classes demandés
        {
            liste_generique=new ArrayList<chambre>();
            //...
             boolean if_service=false;
             boolean if_chambre=false;
             boolean if_surveillant=false;
             boolean if_lits=false;
             String tmp_service;
             int tmp_chambre;
             String tmp_surveillant;
             int tmp_lits;
             
             //tester les checkbox de la GUI
            if(code_service_box.isSelected())  
                if_service=true;
            if(no_chambre_box.isSelected())
                if_chambre=true;
            if(surveillant_box.isSelected())
                if_surveillant=true;
            if(nb_lits_box.isSelected())
                if_lits=true;
            
            
            //pour chaque string rendu, on va remplir la classe correspondante de la requête
            for (String s : liste) {
               // System.out.println(liste);
                //décomposition de la réponse en fonction de la question (dépend de l'interface graphique)
                String[] str=s.trim().split(",");
                for(int i=0;i<str.length;i++){
                    if(if_service=true){
                        tmp_service=str[i];
                        if_service=false;
                    }
                    if(if_chambre=true){
                        tmp_chambre=Integer.parseInt(str[i]);
                        if_chambre=false;
                    }
                    if(if_surveillant=true){
                        tmp_surveillant=str[i];
                        if_surveillant=false;
                    }
                    if(if_lits=true){
                        tmp_lits=Integer.parseInt(str[i]);
                        if_lits=false;
                    }
                        
                }
                    
                //remplissage de la classse et ajout à l'ArrayList
                chambre tmp = new chambre(tmp_chambre,tmp_service,tmp_surveillant,tmp_lits);
                liste_generique.add(tmp);
                
            }
        }
        //Faut copier le modèle au dessus pour tout le reste
       //a la limite, créer une fonction pour chaque test genre test_chambre,test_docteur...
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
