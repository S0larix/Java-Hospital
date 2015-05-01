/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion_Transformation;

/**
 *
 * @author Jérôme
 */
public class Test {
    
    public static void main(String[] s) {
        Transformation trans= new Transformation();
        trans.methodechiante();
        //System.out.println(trans.liste.size());
        for (String liste : trans.liste) {
            System.out.println(liste);
        }
        //test_reqête
        System.exit(0);
    }
    
    
}