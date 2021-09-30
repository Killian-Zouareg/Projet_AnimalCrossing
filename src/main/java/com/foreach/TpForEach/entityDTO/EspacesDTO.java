package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDO.Ile;
import com.foreach.TpForEach.entityDO.Plage;

public class EspacesDTO {


    Integer id;

    Ile ileDTO;

    String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public EspacesDTO(Integer id,String nom, Ile ileDTO) {
        this.id = id;
        this.nom = nom;
        this.ileDTO = ileDTO;
    }

    public EspacesDTO(Espaces espaces) {
        this.id = espaces.getId();
        this.ileDTO = espaces.getIle();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ile getIleDTO() {
        return ileDTO;
    }

    public void setIleDTO(Ile ileDTO) {
        this.ileDTO = ileDTO;
    }
}
