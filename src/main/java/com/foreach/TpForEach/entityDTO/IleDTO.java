package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Batiment;
import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDO.Ile;

import java.util.ArrayList;
import java.util.List;

public class IleDTO {


    Integer id;

    String nom;

    String localisation;

    List<Batiment> batimentDTO;

    List<Espaces> espacesDTO;


    public IleDTO(Integer id, String nom, String localisation, List<Batiment> batimentDTO, List<Espaces> espacesDTO) {
        this.id = id;
        this.nom = nom;
        this.localisation = localisation;
        this.batimentDTO = batimentDTO;
        this.espacesDTO = espacesDTO;
    }

    public IleDTO(Ile ile) {
        this.id = ile.getId();
        this.nom = ile.getNom();
        this.localisation = ile.getLocalisation();
        this.batimentDTO = ile.getBatiment();
        this.espacesDTO = ile.getEspaces();
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

    public List<Batiment> getBatimentDTO() {
        return batimentDTO;
    }

    public void setBatimentDTO(List<Batiment> batimentDTO) {
        this.batimentDTO = batimentDTO;
    }

    public List<Espaces> getEspacesDTO() {
        return espacesDTO;
    }

    public void setEspacesDTO(List<Espaces> espacesDTO) {
        this.espacesDTO = espacesDTO;
    }
}
