package com.foreach.TpForEach.entityDO;


import com.foreach.TpForEach.entityDTO.BatimentDTO;
import com.foreach.TpForEach.entityDTO.IleDTO;

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

    @ManyToOne
    @JoinColumn(name = "id_archipel")
    Archipel archipel;


    public Ile(IleDTO ileDTO) {
        this.id = ileDTO.getId();
        this.nom = ileDTO.getNom();
        this.localisation = ileDTO.getLocalisation();
        this.archipel = ileDTO.getArchipelDTO();
    }

    public Ile() {
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


    public Archipel getArchipel() {
        return archipel;
    }

    public void setArchipel(Archipel archipel) {
        this.archipel = archipel;
    }
}
