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
import Interface.SousMenutri;

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
            //chambre séléctionné
            //on crée un arraylist pour stocker le résultat
            liste_generique=new ArrayList<chambre>();
            //on initialise les attributs temporaires
             String tmp_service;
             int tmp_chambre;
             String tmp_surveillant;
             int tmp_lits;
            
            //pour chaque champ rempli d'une string, on remplit la classe correspondnte
            for (String s : liste) {
                //décomposition de la réponse en fonction de la question (dépend de l'interface graphique)
                //et on "coupe" à chaque virgule(séparation des attributs)
                String[] str=s.split(",");
                
                int i=0;
                if(CodeServiceCheck.isSelected()){
                     tmp_service=str[i];
                     i++;
                }
                if(NumeroCheck.isSelected()){
                     tmp_chambre=Integer.parseInt(str[i]);
                    i++;
                }
                if(SurveillantCheck.isSelected()){
                    tmp_surveillant=str[i];
                    i++;
                }
                if(NombreLitCheck.isSelected()){
                    tmp_lits=Integer.parseInt(str[i]);
                    i++;
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
        
            int tmp_numero;
            String tmp_specialite;
            String tmp_nom;
            String tmp_prenom;
            String tmp_tel;
            String tmp_adresse;
            
            //pour chaque champ rempli d'une string, on remplit la classe correspondnte
            for (String s : liste) {
                //décomposition de la réponse en fonction de la question (dépend de l'interface graphique)
                //et on "coupe" à chaque virgule(séparation des attributs)
                String[] str=s.split(",");
                
                int i=0;
               
                if(NumeroCheck.isSelected()){
                    tmp_numero=Integer.parseInt(str[i]);
                    i++;
                }
                if(SpecialiteCheck.isSelected()){
                   tmp_specialite=str[i];
                   i++;
                }
                if(NomCheck.isSelected()){
                   tmp_nom=str[i];
                   i++;
                }
                if(PrenomCheck.isSelected()){
                   tmp_prenom=str[i];
                   i++;
                }
                if(AdresseCheck.isSelected()){
                  tmp_adresse=str[i];
                   i++;
                }
                if(TelephoneCheck.isSelected()){
                   tmp_tel=str[i];
                   i++;
                }
                
                    
                //remplissage de la classse et ajout à l'ArrayList
                docteur tmp = new docteur(tmp_numero,tmp_specialite,tmp_nom,tmp_prenom,tmp_tel,tmp_adresse);
                liste_generique.add(tmp);
                
            }
            //Fin des tests pour la table docteur
        }
       
        //////POUR TABLE INFIRMIER/////////////
        
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
       if(NomCheck){
           select_text=select_text+"nom,";
           compteur++;
       }
       if(PrenomCheck){
           select_text=select_text+"prenom,";
           compteur++;
       }
       if(TelephoneCheck){
           select_text=select_text+"tel,";
           compteur++;
       }
       if(AdresseCheck){
           select_text=select_text+"adresse,";
           compteur++;
       }
       if(NumeroCheck){
           select_text=select_text+"numero,";
           compteur++;
       }
       if(MutuelleCheck){
           select_text=select_text+"mutuelle,";
           compteur++;
       }
       if(CodeCheck){
           select_text=select_text+"code,";
           compteur++;
       }
       if(NomServiceCheck){
           select_text=select_text+"nom,";
           compteur++;
       }
       if(BatimentCheck){
           select_text=select_text+"batiment,";
           compteur++;
       }
       if(DirecteurCheck){
           select_text=select_text+"directeur,";
           compteur++;
       }
       if(CodeServiceCheck){
           select_text=select_text+"code,";
           compteur++;
       }
       if(NumeroCheck){
           select_text=select_text+"no_chambre,";
           compteur++;  
       }
       if(SurveillantCheck){
           select_text=select_text+"surveillant,";
           compteur++;
       }
       if(NombreLitCheck){
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
