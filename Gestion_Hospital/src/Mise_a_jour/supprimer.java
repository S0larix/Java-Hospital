/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mise_a_jour;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc2014.*;

/**
 *
 * @author Lisa
 */
/**
 *
 * @author Lisa
 */
public class supprimer {

    private Connexion conect;

    public void supprimer() throws SQLException {
        String table = null;
        ArrayList<String> champs, resultat;
        Scanner sc = new Scanner(System.in);
        String requete = "DELETE FROM ", mot;

        try {
            conect = new Connexion("ducrocq", "KlrIT05A@", "ducrocq-rw", "KlrIT05A@");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ajouter.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("SUPPRIMER quoi ?");
        while (table == null) {
            table = sc.nextLine();
        }
        resultat = conect.remplirChampsRequete("SELECT * FROM " + table);
        for (int i = 0; i < resultat.size(); i++) {
            System.out.println(resultat.get(i));
        }

        System.out.println("Saisir suppr");

        requete = requete + " " + table + " " + "WHERE ";

        champs = conect.remplirChampsTable(table);

        for (int i = 0; i < champs.size(); i++) {
            requete = requete + champs.get(i) + "=";

            System.out.println(champs.get(i));

            mot = sc.nextLine();

            requete = requete + "'" + mot + "'";

            if (i != (champs.size() - 1)) {
                requete = requete + " AND ";
            }
        }

        requete = requete + ";";

        System.out.println(requete);

        conect.executeUpdate(requete);

        resultat = conect.remplirChampsRequete("SELECT * FROM " + table);
        for (int i = 0; i < resultat.size(); i++) {
            System.out.println(resultat.get(i));
        }
    }
}
