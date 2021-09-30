package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDTO.EspacesDTO;
import com.foreach.TpForEach.entityDTO.IleDTO;

import java.util.List;

public interface EspacesService {

    EspacesDTO ajouterEspace(EspacesDTO espacesDTO);

    List<Espaces> recupererToutLesEspaces();
}
