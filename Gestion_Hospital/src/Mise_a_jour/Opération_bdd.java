/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mise_a_jour;
import Interface.*;
import Classes.*;
import java.util.ArrayList;
/**
 *
 * @author Lisa
 */
public class Opération_bdd {
    public ArrayList <generique> ajouter_entité()
    {
        string requete;
        //on demande à l'utilisateur de saisir les infos de l'entité
        requete=demande_utilisateur();
        executeUpdate(requete);
        
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
