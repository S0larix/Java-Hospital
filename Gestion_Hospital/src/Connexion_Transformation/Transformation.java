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
   
   /*public void test_requete (){ //renplie l'ArrayList<generique> de la classe attendu avec la requête rendu
       
        if(checkbox_chambre.isSelected())//on teste la requête pour savoir quel sont les classes demandés
        {
            //chambre séléctionnée
            liste_generique=new ArrayList<chambre>();
            //on crée un arraylist pour stocker le résultat
            //on initialise les attributs de la classe à false
             boolean if_service=false;
             boolean if_chambre=false;
             boolean if_surveillant=false;
             boolean if_lits=false;
             String tmp_service;
             int tmp_chambre;
             String tmp_surveillant;
             int tmp_lits;
             
             //si checkbox supplémentaires, passer les booléan à true
            if(code_service_box.isSelected())  
                if_service=true;
            if(no_chambre_box.isSelected())
                if_chambre=true;
            if(surveillant_box.isSelected())
                if_surveillant=true;
            if(nb_lits_box.isSelected())
                if_lits=true;
            
            
            //pour chaque champ rempli d'une string, on remplit la classe correspondnte
            for (String s : liste) {
               // System.out.println(liste);
                //décomposition de la réponse en fonction de la question (dépend de l'interface graphique)
                //on enlève les espaces de la string, et on "coupe" à chaque virgule(séparation des attributs)
                String[] str=s.trim().split(",");
                
                for(int i=0;i<str.length;i++){
                    if(if_service==true){
                        tmp_service=str[i];
                        if_service=false;
                    }
                    if(if_chambre==true){
                        tmp_chambre=Integer.parseInt(str[i]);
                        if_chambre=false;
                    }
                    if(if_surveillant==true){
                        tmp_surveillant=str[i];
                        if_surveillant=false;
                    }
                    if(if_lits==true){
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
        
    }
   */
   public String creer_requête(){
       String requete;
       String select_text;
       int compteur=0;
       String from_text;
       String where_text;
       //créer la requête à partir de la GUI
       //si on a selectionné une table, on ajoute son nom au FROM de la requête
       if(doctor_check){
           from_text="employe e,doctor d";
           where_text="d.numero=e.numero";
       }
       if(malade_check){
           from_text="malade m";
       }
       if(infirmier_check){
           from_text="employe e, infirmier i, service s";
           where_text=where_text+"i.numero=e.numero AND s.code=i.code";
       }
       if(chambre_check) from_text="chambre c";
       if(service_check) from_text="service s";
       
       //selection des attributs
       if(nom_check){
           select_text=select_text+"nom,";
           compteur++;
       }
       if(prenom_check){
           select_text=select_text+"prenom,";
           compteur++;
       }
       if(tel_check){
           select_text=select_text+"tel,";
           compteur++;
       }
       if(adresse_check){
           select_text=select_text+"adresse,";
           compteur++;
       }
       if(numero_check){
           select_text=select_text+"numero,";
           compteur++;
       }
       if(mutuelle_check){
           select_text=select_text+"mutuelle,";
           compteur++;
       }
       if(code_check){
           select_text=select_text+"code,";
           compteur++;
       }
       if(nom_service_check){
           select_text=select_text+"nom";
           compteur++;
       }
       if(batiment_check){
           select_text=select_text+"batiment,";
           compteur++;
       }
       if(directeur_check){
           select_text=select_text+"directeur";
           compteur++;
       }
       if(code_service_check){
           select_text=select_text+"code";
           compteur++;
       }
       //enlever la dernière virgule à la partie SELECT
       select_text=select_text.substring(0,select_text.length()-1);
       //ajouter les from
       requete=requete+select_text+" from "+from_text+" where "+where_text;
       //rendre la requete 
       return requete;
   }
   
}
