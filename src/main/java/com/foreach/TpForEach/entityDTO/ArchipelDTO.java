package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Archipel;
import com.foreach.TpForEach.entityDO.Ile;
import com.foreach.TpForEach.entityDO.Joueur;

import java.util.List;

public class ArchipelDTO {


    Integer id;

    String nom;

    String localisation;

    Joueur joueur;

    public ArchipelDTO(Integer id, String nom, String localisation, Joueur joueur) {
        this.id = id;
        this.nom = nom;
        this.localisation = localisation;
        this.joueur = joueur;
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

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public ArchipelDTO(Archipel archipel) {
        this.id = archipel.getId();
        this.nom = archipel.getNom();
        this.localisation = archipel.getLocalisation();
        this.joueur = archipel.getJoueur();
    }

}
