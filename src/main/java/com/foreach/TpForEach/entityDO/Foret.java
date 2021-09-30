package com.foreach.TpForEach.entityDO;

import com.foreach.TpForEach.entityDTO.ForetDTO;

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

    @ManyToOne
    @JoinColumn(name = "id_espaces")
    Espaces espaces;

    public Foret(ForetDTO foretDTO) {
        this.id = foretDTO.getId();
        this.nom = foretDTO.getNom();
        this.superficie = foretDTO.getSuperficie();
        this.especearbre = foretDTO.getEspeceArbre();
        this.espaces = foretDTO.getEspacesDTO();
    }

    public Foret() {
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

    public String getEspecearbre() {
        return especearbre;
    }

    public void setEspecearbre(String especearbre) {
        this.especearbre = especearbre;
    }

    public Espaces getEspaces() {
        return espaces;
    }

    public void setEspaces(Espaces espaces) {
        this.espaces = espaces;
    }
}
