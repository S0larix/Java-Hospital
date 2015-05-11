/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Jérôme&Lisa&Clément&Florian
 */
public class hospitalisation {
    private int num_lit;
    private String code_service;
    private int num_malade;
    private int num_chambre;
    
    
    public hospitalisation(String code_service,int num_malade,int num_chambre, int num_lit){
       this.code_service=code_service;
       this.num_chambre=num_chambre;
       this.num_malade=num_malade;
       this.num_lit=num_lit;
    }

}


