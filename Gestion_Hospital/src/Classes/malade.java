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
public class malade extends generique{
    private int numero;
    private String nom;
    private String prenom;
    private String tel;
    private String adresse;
    private String mutuelle;
    
    public malade(int numero,String nom, String prenom,String tel,String adresse,String mutuelle){
        this.numero=numero;
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.adresse=adresse;
        this.mutuelle=mutuelle;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
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
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the mutuelle
     */
    public String getMutuelle() {
        return mutuelle;
    }

    /**
     * @param mutuelle the mutuelle to set
     */
    public void setMutuelle(String mutuelle) {
        this.mutuelle = mutuelle;
    }
}
