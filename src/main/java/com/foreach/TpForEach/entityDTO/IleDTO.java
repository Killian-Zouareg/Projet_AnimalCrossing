package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Archipel;
import com.foreach.TpForEach.entityDO.Batiment;
import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDO.Ile;

import java.util.ArrayList;
import java.util.List;

public class IleDTO {


    Integer id;

    String nom;

    String localisation;

    Archipel archipelDTO;


    public IleDTO(Integer id, String nom, String localisation, Archipel archipelDTO) {
        this.id = id;
        this.nom = nom;
        this.localisation = localisation;
        this.archipelDTO = archipelDTO;
    }

    public IleDTO(Ile ile) {
        this.id = ile.getId();
        this.nom = ile.getNom();
        this.localisation = ile.getLocalisation();
        this.archipelDTO = ile.getArchipel();
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

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Archipel getArchipelDTO() {
        return archipelDTO;
    }

    public void setArchipelDTO(Archipel archipelDTO) {
        this.archipelDTO = archipelDTO;
    }
}
