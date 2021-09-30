package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDO.Foret;

public class ForetDTO {

    Integer id;

    String nom;

    int superficie;

    String especeArbre;

    Espaces espacesDTO;

    public ForetDTO(Integer id, String nom, int superficie, String especeArbre, Espaces espacesDTO) {
        this.id = id;
        this.nom = nom;
        this.superficie = superficie;
        this.especeArbre = especeArbre;
        this.espacesDTO = espacesDTO;
    }

    public ForetDTO(Foret foret){
        this.id = foret.getId();
        this.nom = foret.getNom();
        this.superficie = foret.getSuperficie();
        this.especeArbre = foret.getEspecearbre();
        this.espacesDTO = foret.getEspaces();
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

    public Espaces getEspacesDTO() {
        return espacesDTO;
    }

    public void setEspacesDTO(Espaces espacesDTO) {
        this.espacesDTO = espacesDTO;
    }
}
