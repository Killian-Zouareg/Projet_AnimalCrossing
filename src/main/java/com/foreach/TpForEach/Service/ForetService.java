package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.entityDTO.ForetDTO;

import java.util.List;

public interface ForetService {

    ForetDTO ajouterForet(ForetDTO foretDTO);

    List<ForetDTO> recupererToutesLesForets();
}
