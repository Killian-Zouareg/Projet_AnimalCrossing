package com.foreach.TpForEach.entityDO;

import javax.persistence.*;

@Entity
public class Foret {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String nom;

    @Column
    int superficie;

    @Column
    String especearbre;

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

    public String getEspecearbre() {
        return especearbre;
    }

    public void setEspecearbre(String especearbre) {
        this.especearbre = especearbre;
    }
}
