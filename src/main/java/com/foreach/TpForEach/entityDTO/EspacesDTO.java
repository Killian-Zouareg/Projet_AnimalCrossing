package com.foreach.TpForEach.entityDTO;

import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDO.Plage;

public class EspacesDTO {


    Integer id;

    ForetDTO foretDTO;

    PlageDTO plageDTO;


    public EspacesDTO(Integer id, ForetDTO foretDTO, PlageDTO plageDTO) {
        this.id = id;
        this.foretDTO = foretDTO;
        this.plageDTO = plageDTO;
    }

    public EspacesDTO(Espaces espaces) {
        this.id = espaces.getId();
        this.foretDTO =new ForetDTO(espaces.getForet());
        this.plageDTO =new PlageDTO(espaces.getPlage());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ForetDTO getForetDTO() {
        return foretDTO;
    }

    public void setForetDTO(ForetDTO foretDTO) {
        this.foretDTO = foretDTO;
    }

    public PlageDTO getPlageDTO() {
        return plageDTO;
    }

    public void setPlageDTO(Plage plage) {
        this.plageDTO = plageDTO;
    }
}
