package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDO.Plage;

public class PlageDTO {

    Integer id;

    String nom;

    Espaces espacesDTO;


    public PlageDTO(Integer id, String nom, Espaces espacesDTO) {
        this.id = id;
        this.nom = nom;
        this.espacesDTO = espacesDTO;
    }

    public PlageDTO(Plage plage) {
        this.nom = plage.getNom();
        this.id = plage.getId();
        this.espacesDTO = plage.getEspaces();
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

    public Espaces getEspacesDTO() {
        return espacesDTO;
    }

    public void setEspacesDTO(Espaces espacesDTO) {
        this.espacesDTO = espacesDTO;
    }
}
