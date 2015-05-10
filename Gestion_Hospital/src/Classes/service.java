/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Clément
 */
public class service {
    private String code;
    private String nom;
    private String batiment;
    private int directeur;
    
    public service(String code,String nom, String batiment,int directeur){
        this.code=code;
        this.nom=nom;
        this.batiment=batiment;
        this.directeur=directeur;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the batiemnt
     */
    public String getBatiment() {
        return batiment;
    }

    /**
     * @param batiment the batiemnt to set
     */
    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    /**
     * @return the directeur
     */
    public int getDirecteur() {
        return directeur;
    }

    /**
     * @param directeur the directeur to set
     */
    public void setDirecteur(int directeur) {
        this.directeur = directeur;
    }
    
}
