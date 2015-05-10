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
public class infirmier extends personne{
    private String code_service;
    private boolean rotation;//jour: vrai nuit:false
    private int salaire;
    
    public infirmier(int numero,String code_service,boolean rotation,int salaire,String nom, String prenom,String tel,String adresse){
        this.setNumero(numero);
        this.setCode_service(code_service);
        this.rotation=rotation;
        this.salaire=salaire;
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setTel(tel);
        this.setAdresse(adresse);
    }

    /**
     * @return the code_service
     */
    public String getCode_service() {
        return code_service;
    }

    /**
     * @param code_service the code_service to set
     */
    public void setCode_service(String code_service) {
        this.code_service = code_service;
    }

    /**
     * @return the rotation
     */
    public boolean isRotation() {
        return rotation;
    }

    /**
     * @param rotation the rotation to set
     */
    public void setRotation(boolean rotation) {
        this.rotation = rotation;
    }

    /**
     * @return the salaire
     */
    public int getSalaire() {
        return salaire;
    }

    /**
     * @param salaire the salaire to set
     */
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
