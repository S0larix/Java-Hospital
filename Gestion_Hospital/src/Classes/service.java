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
public class service extends generique {
    private int code;
    private String nom;
    private String batiemnt;
    private String directeur;
    
    public service(int code,String nom, String batiemnt,String directeur){
        this.code=code;
        this.nom=nom;
        this.batiemnt=batiemnt;
        this.directeur=directeur;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
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
    public String getBatiemnt() {
        return batiemnt;
    }

    /**
     * @param batiemnt the batiemnt to set
     */
    public void setBatiemnt(String batiemnt) {
        this.batiemnt = batiemnt;
    }

    /**
     * @return the directeur
     */
    public String getDirecteur() {
        return directeur;
    }

    /**
     * @param directeur the directeur to set
     */
    public void setDirecteur(String directeur) {
        this.directeur = directeur;
    }
    
}
