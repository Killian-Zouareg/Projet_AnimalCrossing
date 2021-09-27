package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Plage;

public class PlageDTO {

    Integer id;

    String nom;


    public PlageDTO(Integer id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public PlageDTO(Plage plage) {
        this.nom = plage.getNom();
        this.id = plage.getId();
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
}
