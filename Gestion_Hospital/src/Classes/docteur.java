/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Clement Lisa et Jerome et Florian
 */
public class docteur extends personne{
    //déclaration des variables
    private String specialite;
    //déclaration du constructeur
    public docteur(int numero,String specialite,String nom, String prenom,String tel,String adresse){
        super();
        this.setNumero(numero);
        this.specialite=specialite;
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setTel(tel);
        this.setAdresse(adresse);
    }

    /**
     * @return the numero
     */

    /**
     * @return the specialite
     */
    public String getSpecialite() {
        return specialite;
    }

    /**
     * @param specialite the specialite to set
     */
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
