/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Clement et Lisa et Florian et Jerome
 */
public class malade extends personne{
    //déclaration des variables
    private String mutuelle;
    //déclaration du constructeur
    public malade(int numero,String nom, String prenom,String tel,String adresse,String mutuelle){
        this.setNumero(numero);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setTel(tel);
        this.setAdresse(adresse);
        this.mutuelle=mutuelle;
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
