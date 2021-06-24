/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncontact.couche01_dao.entites;

import java.util.List;

/**
 *
 * @author masambukidi herve
 */
public class Personne {
    private String idp;
    private String nomsp;
    private String sexep;
    //
    private List<Adresse> adresseList;
    //

    public String getIdp() {
        return idp;
    }

    public void setIdp(String idp) {
        this.idp = idp;
    }

    public String getNomsp() {
        return nomsp;
    }

    public void setNomsp(String nomsp) {
        this.nomsp = nomsp;
    }

    public String getSexep() {
        return sexep;
    }

    public void setSexep(String sexep) {
        this.sexep = sexep;
    }

    public List<Adresse> getAdresseList() {
        return adresseList;
    }

    public void setAdresseList(List<Adresse> adresseList) {
        this.adresseList = adresseList;
    }
    
}
