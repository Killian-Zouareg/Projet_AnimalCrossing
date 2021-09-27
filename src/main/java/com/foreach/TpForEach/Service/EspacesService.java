package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDTO.EspacesDTO;

import java.util.List;

public interface EspacesService {

    EspacesDTO ajouterEspace(int id);

    List<Espaces> recupererToutLesEspaces();
}
