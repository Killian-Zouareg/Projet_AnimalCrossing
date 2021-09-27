package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.PlageJPARepository;
import com.foreach.TpForEach.entityDO.Plage;
import com.foreach.TpForEach.entityDTO.PlageDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PlageServiceImpl implements PlageService{


    private PlageJPARepository plageJPARepository;

    public PlageServiceImpl(PlageJPARepository plageJPARepository) {
        this.plageJPARepository = plageJPARepository;
    }

    @Override
    public PlageDTO ajouterPlage(PlageDTO plageDTO) {
        Plage plage = new Plage();
        plage.setId(plageDTO.getId());
        plage.setNom(plageDTO.getNom());

        return new PlageDTO(plageJPARepository.save(plage));
    }

    @Override
    public List<PlageDTO> recupererToutesLesPlages() {
        List<Plage> plages = (List<Plage>) plageJPARepository.findAll();
        return StreamSupport.stream(plages.spliterator(),false).map(PlageDTO::new).collect(Collectors.toList());
    }
}
