package com.foreach.TpForEach.entityDO;


import javax.persistence.*;

@Entity
public class Batiment {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String nom;

    @Column
    int superficie;

    @Column
    String typedebatiment;

    @ManyToOne
    @JoinColumn (name = "id_ile")
    Ile ile;

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

    public String getTypedebatiment() {
        return typedebatiment;
    }

    public void setTypedebatiment(String typedebatiment) {
        this.typedebatiment = typedebatiment;
    }

    public Ile getIle() {
        return ile;
    }

    public void setIle(Ile ile) {
        this.ile = ile;
    }
}
