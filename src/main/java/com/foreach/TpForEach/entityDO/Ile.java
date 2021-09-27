package com.foreach.TpForEach.entityDO;


import com.foreach.TpForEach.entityDTO.BatimentDTO;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ile {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String nom;

    @Column
    String localisation;

    @OneToMany
    @JoinColumn (name = "id")
    List<Batiment> batiment;

    @OneToMany
    @JoinColumn (name = "id")
    List <Espaces> espaces;


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

    public List<Batiment> getBatiment() {
        return batiment;
    }

    public void setBatiment(List<Batiment> batiment) {
        this.batiment = batiment;
    }

    public List<Espaces> getEspaces() {
        return espaces;
    }

    public void setEspaces(List<Espaces> espaces) {
        this.espaces = espaces;
    }
}
