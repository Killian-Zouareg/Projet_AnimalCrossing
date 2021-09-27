package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Foret;

public class ForetDTO {

    Integer id;

    String nom;

    int superficie;

    String especeArbre;

    public ForetDTO(Integer id, String nom, int superficie, String especeArbre) {
        this.id = id;
        this.nom = nom;
        this.superficie = superficie;
        this.especeArbre = especeArbre;
    }

    public ForetDTO(Foret foret){
        this.id = foret.getId();
        this.nom = foret.getNom();
        this.superficie = foret.getSuperficie();
        this.especeArbre = foret.getEspecearbre();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getEspeceArbre() {
        return especeArbre;
    }

    public void setEspeceArbre(String especeArbre) {
        this.especeArbre = especeArbre;
    }
}
