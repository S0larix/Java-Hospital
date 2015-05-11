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
 * @author Clement et Lisa et Florian et Jerome
 */
/**
 *
 * @author Lisa
 */
public class suppr{

    private Connexion conect;

    public void suppr(String table, String requete, Connexion conect) throws SQLException {
        ArrayList<String> resultat;

        conect.executeUpdate(requete);

    }
}
