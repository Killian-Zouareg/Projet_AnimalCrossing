package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Joueur;

public class JoueurDTO {

    Integer id;

    String nom;

    String prenom;

    String mail;

    public JoueurDTO(Integer id, String nom, String prenom, String mail, ArchipelDTO archipelDTO) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

    public JoueurDTO(Joueur joueur){
        this.id = joueur.getId();
        this.nom = joueur.getNom();
        this.prenom = joueur.getPrenom();
        this.mail = joueur.getMail();
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
}
