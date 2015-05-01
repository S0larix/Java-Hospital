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
        for(int i=0;i<trans.liste.size();i++){
            System.out.println(trans.liste.get(i));
        
        }
        System.exit(0);
    }
}