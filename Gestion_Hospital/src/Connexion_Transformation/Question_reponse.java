/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion_Transformation;
//déclaration des importations
import Classes.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdbc2014.Connexion;


/**
 *
 * @author Clement et Lisa et Florian et Jerome
 * 
 */
public class Question_reponse {
   
 
   public Connexion conn;
   

   public ArrayList<String> methode_connexion(Connexion conn,String requete){
      
       ArrayList<String> liste = new ArrayList<String>();
       try {
                
                // recuperer la liste des champs de la table
                liste = conn.remplirChampsRequete(requete);
                
            } catch (SQLException e) {
                System.out.println("Echec SQL");
                e.printStackTrace();
            }
       return liste;
   }
}