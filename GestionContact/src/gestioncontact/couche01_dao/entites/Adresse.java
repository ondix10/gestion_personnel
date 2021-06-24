/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncontact.couche01_dao.entites;

/**
 *
 * @author masambukidi herve
 */
public class Adresse {
    //
    private long ida;
    private String adressea;
    private String typea;
    private Personne idpersa;
    //

    public long getIda() {
        return ida;
    }

    public void setIda(long ida) {
        this.ida = ida;
    }

    public String getAdressea() {
        return adressea;
    }

    public void setAdressea(String adressea) {
        this.adressea = adressea;
    }

    public String getTypea() {
        return typea;
    }

    public void setTypea(String typea) {
        this.typea = typea;
    }

    public Personne getIdpersa() {
        return idpersa;
    }

    public void setIdpersa(Personne idpersa) {
        this.idpersa = idpersa;
    }
    
}
