package com.foreach.TpForEach.entityDO;

import com.foreach.TpForEach.entityDTO.ForetDTO;
import com.foreach.TpForEach.entityDTO.PlageDTO;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Entity
public class Espaces {



    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "id_foret")
    Foret foret;

    @ManyToOne
    @JoinColumn(name = "id_plage")
    Plage plage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Foret getForetDO() {
        return foret;
    }

    public Foret getForet() {
        return foret;
    }

    public void setForet(Foret foret) {
        this.foret = foret;
    }

    public Plage getPlage() {
        return plage;
    }

    public void setPlage(Plage plage) {
        this.plage = plage;
    }


}
