/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mise_a_jour;
import jdbc2014.Connexion;
import Interface.*;
import Classes.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lisa
 */
public class Opération_bdd {
    public ArrayList <generique> ajouter_entité(String requetes[][])
    {
        String requete;
        String result[];
        ArrayList <generique> tab;
        requete= "INSERT INTO " + requetes[0][0] + "( ";
        
        for(int j=0; j<requetes[1].length; j++)
        {
            requete=requete+requetes[1][j]+", ";
        }
        requete=requete+" ) VALUES (";
        
        for(int j=0; j<requetes[2].length; j++)
        {
            requete=requete+requetes[2][j]+", ";
        }
        requete=requete+" );";
        
        try {
            executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(Opération_bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        result=remplirChampsTable(requetes[0][0]);
        
       return tab;
    }
    
    public ArrayList <generique> supprimer_entité()
    {
         string requete;
        //on demande à l'utilisateur de saisir les infos de l'entité
        requete=demande_utilisateur();
        
        executeUpdate(requete);
        
        return tab;
    }
    
    public ArrayList <generique> modifier_entité()
    {
         string requete;
        //on demande à l'utilisateur de saisir les infos de l'entité
        requete=demande_utilisateur();
        
        executeUpdate(requete);
        
        return tab;
    }
}
