package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Batiment;
import com.foreach.TpForEach.entityDO.Ile;

import java.util.Optional;

public class BatimentDTO {

    Integer id;

    String nom;

    int superficie;

    String typeDeBatiment;

    Ile ileDTO;

    public BatimentDTO(Integer id, String nom, int superficie, String typeDeBatiment, Ile ileDTO) {
        this.id = id;
        this.nom = nom;
        this.superficie = superficie;
        this.typeDeBatiment = typeDeBatiment;
        this.ileDTO = ileDTO;
    }

    public BatimentDTO(Batiment batiment) {
        this.id = batiment.getId();
        this.nom = batiment.getNom();
        this.superficie = batiment.getSuperficie();
        this.typeDeBatiment = batiment.getTypedebatiment();
        this.ileDTO = batiment.getIle();
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

    public String getTypeDeBatiment() {
        return typeDeBatiment;
    }

    public void setTypeDeBatiment(String typeDeBatiment) {
        this.typeDeBatiment = typeDeBatiment;
    }

    public Ile getIleDTO() {
        return ileDTO;
    }

    public void setIleDTO(Ile ileDTO) {
        this.ileDTO = ileDTO;
    }
}
