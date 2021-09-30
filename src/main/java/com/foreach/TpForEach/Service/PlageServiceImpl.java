package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.EspacesJPARepository;
import com.foreach.TpForEach.Repository.PlageJPARepository;
import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDO.Plage;
import com.foreach.TpForEach.entityDTO.PlageDTO;
import org.springframework.stereotype.Service;

import javax.persistence.OneToOne;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PlageServiceImpl implements PlageService{


    private PlageJPARepository plageJPARepository;
    private final EspacesJPARepository espacesJPARepository;

    public PlageServiceImpl(PlageJPARepository plageJPARepository, EspacesJPARepository espacesJPARepository) {
        this.plageJPARepository = plageJPARepository;
        this.espacesJPARepository = espacesJPARepository;
    }

    @Override
    public PlageDTO ajouterPlage(PlageDTO plageDTO) {
        Plage plage = new Plage();
        plage.setId(plageDTO.getId());
        plage.setNom(plageDTO.getNom());

        Espaces espaces = new Espaces();

        espaces = espacesJPARepository.findById(plageDTO.getId()).get();


        plage.setEspaces(espaces);
        return new PlageDTO(plageJPARepository.save(plage));
    }

    @Override
    public List<PlageDTO> recupererToutesLesPlages() {
        List<Plage> plages = (List<Plage>) plageJPARepository.findAll();
        return StreamSupport.stream(plages.spliterator(),false).map(PlageDTO::new).collect(Collectors.toList());
    }

    @Override
    public void modifierPlage(Integer id , PlageDTO plageDTO){
        Plage plage = plageJPARepository.findById(id).get();
        plage.setNom(plageDTO.getNom());
        plageJPARepository.save(plage);
    }
}
