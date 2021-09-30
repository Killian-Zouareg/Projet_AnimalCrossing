package com.foreach.TpForEach.entityDO;

import com.foreach.TpForEach.entityDTO.EspacesDTO;
import com.foreach.TpForEach.entityDTO.ForetDTO;
import com.foreach.TpForEach.entityDTO.PlageDTO;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Entity
public class Espaces {



    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String nom;

    @ManyToOne
    @JoinColumn (name = "id_ile")
    Ile ile;


    public Espaces(EspacesDTO espacesDTO) {
        this.id = espacesDTO.getId();
        this.nom = espacesDTO.getNom();
        this.ile = espacesDTO.getIleDTO();
    }

    public Espaces() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ile getIle() {
        return ile;
    }

    public void setIle(Ile ile) {
        this.ile = ile;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
