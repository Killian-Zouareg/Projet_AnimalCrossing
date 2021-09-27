package com.foreach.TpForEach.entityDTO;

public class JoueurDTO {

    Integer id;

    String nom;

    String prenom;

    String mail;

    ArchipelDTO archipelDTO;

    public JoueurDTO(Integer id, String nom, String prenom, String mail, ArchipelDTO archipelDTO) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.archipelDTO = archipelDTO;
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

    public ArchipelDTO getArchipelDTO() {
        return archipelDTO;
    }

    public void setArchipelDTO(ArchipelDTO archipelDTO) {
        this.archipelDTO = archipelDTO;
    }
}
