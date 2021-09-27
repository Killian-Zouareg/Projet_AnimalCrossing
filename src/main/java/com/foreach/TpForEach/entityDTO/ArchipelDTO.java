package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Archipel;
import com.foreach.TpForEach.entityDO.Ile;

import java.util.List;

public class ArchipelDTO {


    Integer id;

    String nom;

    String localisation;

    List<Ile> iles;

    public ArchipelDTO() {
    }

    public ArchipelDTO(Integer id, String nom, String localisation, List<Ile> iles) {
        this.id = id;
        this.nom = nom;
        this.localisation = localisation;
        this.iles = iles;
    }

public ArchipelDTO(Archipel archipel) {
        this.id = archipel.getId();
        this.nom = archipel.getNom();
        this.localisation = archipel.getLocalisation();
        this.iles = archipel.getIleDTOS();
    }

    public List<Ile> getIles() {
        return iles;
    }

    public void setIles(List<Ile> iles) {
        this.iles = iles;
    }

    public ArchipelDTO(Integer id, String nom, String localisation) {
        this.id = id;
        this.nom = nom;
        this.localisation = localisation;
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
}
