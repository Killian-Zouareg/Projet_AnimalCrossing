package com.foreach.TpForEach.entityDO;


import com.foreach.TpForEach.entityDTO.IleDTO;

import javax.persistence.*;
import java.util.List;

@Entity
public class Archipel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String nom;

    @Column
    String localisation;

    @OneToMany
    @JoinColumn (name = "id_ile")
    List<Ile> ileDTOS;


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

    public List<Ile> getIleDTOS() {
        return ileDTOS;
    }

    public void setIleDTOS(List<Ile> ileDTOS) {
        this.ileDTOS = ileDTOS;
    }
}
