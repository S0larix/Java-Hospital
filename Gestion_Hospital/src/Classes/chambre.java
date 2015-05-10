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
public class chambre {
    private int no_chambre;
    private String code_service;
    private int surveillant;
    private int nb_lits;
    
    public chambre(String service,int chambre,int surveil,int lits){
        this.no_chambre=chambre;
        this.code_service =service;
        this.surveillant=surveil;
        this.nb_lits=lits;
    }

    /**
     * @return the no_chambre
     */
    public int getNo_chambre() {
        return no_chambre;
    }

    /**
     * @param no_chambre the no_chambre to set
     */
    public void setNo_chambre(int no_chambre) {
        this.no_chambre = no_chambre;
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
     * @return the surveillant
     */
    public int getSurveillant() {
        return surveillant;
    }

    /**
     * @param surveillant the surveillant to set
     */
    public void setSurveillant(int surveillant) {
        this.surveillant = surveillant;
    }

    /**
     * @return the nb_lits
     */
    public int getNb_lits() {
        return nb_lits;
    }

    /**
     * @param nb_lits the nb_lits to set
     */
    public void setNb_lits(int nb_lits) {
        this.nb_lits = nb_lits;
    }
    
}
