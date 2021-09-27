package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.entityDO.Batiment;
import com.foreach.TpForEach.entityDTO.BatimentDTO;

import java.util.List;

public interface BatimentService {

    BatimentDTO ajouterBatiment(BatimentDTO batimentDTO);

    List<Batiment> recupererToutLesBatiments();
}
