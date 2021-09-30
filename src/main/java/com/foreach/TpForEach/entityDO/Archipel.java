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

    @ManyToOne
    @JoinColumn(name = "id_joueur")
    Joueur joueur;


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

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }
}
