package com.foreach.TpForEach.entityDO;


import javax.persistence.*;

@Entity
public class JoueurDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String nom;

    @Column
    String prenom;

    @Column
    String mail;

    @ManyToOne
    @JoinColumn(name = "id_archipel")
    Archipel archipel;


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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Archipel getArchipelDO() {
        return archipel;
    }

    public void setArchipelDO(Archipel archipel) {
        this.archipel = archipel;
    }
}
