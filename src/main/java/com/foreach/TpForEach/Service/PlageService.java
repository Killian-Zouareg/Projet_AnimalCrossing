package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.entityDTO.PlageDTO;

import java.util.List;

public interface PlageService {

        PlageDTO ajouterPlage(PlageDTO plageDTO);

        List<PlageDTO> recupererToutesLesPlages();

        void modifierPlage(Integer id , PlageDTO plageDTO);
}
