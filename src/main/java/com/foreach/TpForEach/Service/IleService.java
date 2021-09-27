package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.entityDTO.IleDTO;

import java.util.List;

public interface IleService {

    IleDTO ajouterIle(IleDTO ileDTO);

    List<IleDTO> recupererToutesLesIles();
}
