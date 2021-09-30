package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.EspacesJPARepository;
import com.foreach.TpForEach.Repository.ForetJPARepository;
import com.foreach.TpForEach.Repository.IleJPARepository;
import com.foreach.TpForEach.Repository.PlageJPARepository;
import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDO.Foret;
import com.foreach.TpForEach.entityDO.Ile;
import com.foreach.TpForEach.entityDO.Plage;
import com.foreach.TpForEach.entityDTO.EspacesDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspacesServiceImpl implements EspacesService {


    private final EspacesJPARepository espacesJPARepository;
    private final ForetService foretService;
    private final IleJPARepository ileJPARepository;
    private final PlageJPARepository plageJPARepository;
    private final ForetJPARepository foretJPARepository;

    public EspacesServiceImpl(EspacesJPARepository espacesJPARepository, ForetService foretService, IleJPARepository ileJPARepository, PlageJPARepository plageJPARepository, ForetJPARepository foretJPARepository, PlageService plageService) {
        this.espacesJPARepository = espacesJPARepository;
        this.foretService = foretService;
        this.ileJPARepository = ileJPARepository;
        this.plageJPARepository = plageJPARepository;
        this.foretJPARepository = foretJPARepository;
        this.plageService = plageService;
    }

    private final PlageService plageService;



    @Override
    public EspacesDTO ajouterEspace(EspacesDTO espacesDTO) {
        Espaces espaces = new Espaces();


        espaces.setId(espacesDTO.getId());
        espaces.setNom(espacesDTO.getNom());
        Ile ile = new Ile();
        ile = ileJPARepository.findById(espacesDTO.getId()).get();

        espaces.setIle(ile);
        return new EspacesDTO(espacesJPARepository.save(espaces));
    }

    public List<Espaces> recupererToutLesEspaces(){
        return (List<Espaces>) espacesJPARepository.findAll();
    }
}
