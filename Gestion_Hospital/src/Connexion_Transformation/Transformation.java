/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion_Transformation;

import Classes.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
   ArrayList liste_generique;
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
       //////POUR TABLE CHAMBRE/////////////
        if(checkbox_chambre.isSelected())//on teste la requête pour savoir quel sont les classes demandées
        {
            //chambre séléctionnéeg
            liste_generique=new ArrayList<chambre>();
            //on crée un arraylist pour stocker le résultat
            //on initialise les attributs de la classe à false
             boolean test_service=false;
             boolean test_chambre=false;
             boolean test_surveillant=false;
             boolean test_lits=false;
             String tmp_service;
             int tmp_chambre;
             String tmp_surveillant;
             int tmp_lits;
             
             //si checkbox supplémentaires, passer les booléan à true
            if(code_service_box.isSelected())  
                test_service=true;
            if(no_chambre_box.isSelected())
                test_chambre=true;
            if(surveillant_box.isSelected())
                test_surveillant=true;
            if(nb_lits_box.isSelected())
                test_lits=true;
            
            
            //pour chaque champ rempli d'une string, on remplit la classe correspondnte
            for (String s : liste) {
               // System.out.println(liste);
                //décomposition de la réponse en fonction de la question (dépend de l'interface graphique)
                //on enlève les espaces de la string, et on "coupe" à chaque virgule(séparation des attributs)
                String[] str=s.split(",");
                
                for(int i=0;i<str.length;i++){
                    if(test_service==true){
                        tmp_service=str[i];
                        test_service=false;
                    }
                    if(test_chambre==true){
                        tmp_chambre=Integer.parseInt(str[i]);
                        test_chambre=false;
                    }
                    if(test_surveillant==true){
                        tmp_surveillant=str[i];
                        test_surveillant=false;
                    }
                    if(test_lits==true){
                        tmp_lits=Integer.parseInt(str[i]);
                        test_lits=false;
                    }
                        
                }
                    
                //remplissage de la classse et ajout à l'ArrayList
                chambre tmp = new chambre(tmp_chambre,tmp_service,tmp_surveillant,tmp_lits);
                liste_generique.add(tmp);
                
            }
        }
        ///////POUR TABLE DOCTEUR/////////////
        if((check_box_docteur).isSelected)
        {
            liste_generique=new ArrayList<docteur>();
             //...
        
            boolean test_specialite=false;
            boolean test_nom=false;
            boolean test_prenom=false;
            boolean test_tel=false;
            boolean test_adresse=false;
            
            if(specialite_box).isSelected(){
                test_specialite=true;
             }
            if(nom_docteur_box).isSelected(){
                test_nom=true;
             }
            if(prenom_docteur_box).isSelected(){
                test_prenom=true;
                }
            if(tel_docteur_box).isSelected(){
                test_tel=true;
            }
            if(adresse_docteur_box).isSelected(){
                test_adresse=true;
            }
            //pour chaque champ rempli d'une string, on remplit la classe correspondnte
            for (String s : liste) {
               // System.out.println(liste);
               //décomposition de la réponse en fonction de la question (dépend de l'interface graphique)
               //on enlève les espaces de la string, et on "coupe" à chaque virgule(séparation des attributs)
                String[] str=s.split(",");
                
                for(int i=0;i<str.length;i++){
                    if(test_specialite==true){
                        tmp_service=str[i];
                        test_service=false;
                    }
                    if(test_chambre==true){
                        tmp_chambre=Integer.parseInt(str[i]);
                        test_chambre=false;
                    }
                    if(test_surveillant==true){
                        tmp_surveillant=str[i];
                        test_surveillant=false;
                    }
                    if(test_lits==true){
                        tmp_lits=Integer.parseInt(str[i]);
                        test_lits=false;
                    }
                        
                }
                    
                //remplissage de la classse et ajout à l'ArrayList
                chambre tmp = new chambre(tmp_chambre,tmp_service,tmp_surveillant,tmp_lits);
                liste_generique.add(tmp);
            //Fin des tests pour la table docteur
        }
       
        //////POUR TABLE INFIRMIER/////////////
        
        if((check_box_infirmier).isSelected())
        {
            liste_generique=new ArrayList<infirmier>();
             //...
            boolean test_code_service=false;
            boolean test_rotation=false;//jour: vrai nuit:false
            boolean test_salaire=false;
            boolean test_nom=false;
            boolean test_prenom=false;
            boolean test_tel=false;
            boolean test_adresse=false;
            
            if((code_service_box)).isSelected(){
                if_code_service=true;
        }
            if((rotation_box).isSelected){
                if_rotation=true;
            }
            if((salaire_box).isSelected){
                if_salaire=true;
            }
            if((nom_box).isSelected){
                if_nom=true;
            }
            if((prenom_box).isSelected){
                if_prenom=true;
            }
            if((tel_box).isSelected){
                if_tel=true;
            }
            if((adresse_box).isSelected){
                if_adresse=true;
            }
        }
        
        //////POUR TABLE MALADE/////////////
        
        if((malade_check_box).isSelected())
        {
           liste_generique=new ArrayList<malade>();
            //...
        
        boolean test_nom=false;
        boolean test_prenom=false;
        boolean test_tel=false;
        boolean test_adresse=false;
        boolean test_mutuelle=false;
        
        if((nom_box).isSelected()){
            test_nom=true;
        }
        if((prenom_box).isSelected()){
            test_prenom=true;
        }
        if((tel_box).isSelected()){
            test_tel=true;
        }
        if((adresse_box).isSelected()){
           test_adresse=true; 
        }
        if((mutuelle_box).isSelected()){
            test_mutuelle=true;
        }
        }
        
        //////POUR TABLE SERVICE/////////////
        if((check_box_service).isSelected())
        {
          liste_generique=new ArrayList<service>();
          //...
          boolean code=false;
          boolean nom=false;
          boolean batiment=false;
          boolean directeur=false;
          
          if((code_box).isSelected()){
            test_code=true;
        }
          if((nom_box).isSelected()){
              test_nom=true;
          }
          if((batiment_box).isSelected){
              test_batiment=true;
          }
          if((directeur_box).isSelected()){
              test_directeur=true;
          }
        }
        
    }
   
   public String creer_requête(){
       String requete="";
       String select_text="";
       int compteur=0;
       String from_text="";
       String where_text="";
       //créer la requête à partir de la GUI
       //si on a selectionné une table, on ajoute son nom au FROM de la requête
       //selection de la table
       if(doctor_check){
           from_text="employe e,doctor d";
           where_text=where_text+"d.numero=e.numero";
       }
       if(malade_check){
           from_text="malade m";
       }
       if(infirmier_check){
           from_text="employe e, infirmier i, service s";
           where_text=where_text+"i.numero=e.numero AND s.code=i.code";
       }
       if(chambre_check) 
           from_text="chambre c";
       if(service_check) 
           from_text="service s";
       if(hospitalisation_check){
           from_text="service s, malade m, chambre c, hospitalisation h";
           where_text=where_text+"h.numero=m.numero AND h.numero=c.numero AND h.numero=s.numero";
           compteur++;
       }
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
           select_text=select_text+"nom,";
           compteur++;
       }
       if(batiment_check){
           select_text=select_text+"batiment,";
           compteur++;
       }
       if(directeur_check){
           select_text=select_text+"directeur,";
           compteur++;
       }
       if(code_service_check){
           select_text=select_text+"code,";
           compteur++;
       }
       if(numero_chambre_check){
           select_text=select_text+"no_chambre,";
           compteur++;  
       }
       if(surveillant_check){
           select_text=select_text+"surveillant,";
           compteur++;
       }
       if(nb_lits_check){
           select_text=select_text+"nb_lits,";
           compteur++;
       }
       if(compteur!=0){
            //enlever la dernière virgule à la partie SELECT
            select_text=select_text.substring(0,select_text.length()-1);
            //ajouter les from
             requete=requete+select_text+" from "+from_text+" where "+where_text;
        }
       //afficher un message d'alerte
       else JOptionPane.showMessageDialog(null, "Sélectionnez au moins un attribut!");
      
       //rendre la requete 
       return requete;
   }
   
}
