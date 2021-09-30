package com.foreach.TpForEach.entityDO;


import com.foreach.TpForEach.entityDTO.PlageDTO;

import javax.persistence.*;

@Entity
public class Plage {



    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String nom;

    @ManyToOne
    @JoinColumn(name = "id_espaces")
    Espaces espaces;

    public Plage(PlageDTO plageDTO) {
        this.id = plageDTO.getId();
        this.nom = plageDTO.getNom();
        this.espaces = plageDTO.getEspacesDTO();
    }

    public Plage() {
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

    public Espaces getEspaces() {
        return espaces;
    }

    public void setEspaces(Espaces espaces) {
        this.espaces = espaces;
    }
}
