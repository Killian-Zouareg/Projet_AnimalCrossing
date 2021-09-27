package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.EspacesJPARepository;
import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDO.Foret;
import com.foreach.TpForEach.entityDO.Plage;
import com.foreach.TpForEach.entityDTO.EspacesDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspacesServiceImpl implements EspacesService {


    private final EspacesJPARepository espacesJPARepository;
    private final ForetService foretService;

    public EspacesServiceImpl(EspacesJPARepository espacesJPARepository,ForetService foretService, PlageService plageService) {
        this.espacesJPARepository = espacesJPARepository;
        this.foretService = foretService;
        this.plageService = plageService;
    }

    private final PlageService plageService;



    @Override
    public EspacesDTO ajouterEspace(int id) {
        Espaces espaces = new Espaces();
        Plage plage = new Plage();
        Foret foret = new Foret();

        plage.setId(plageService.recupererToutesLesPlages().get(id).getId());
        plage.setNom(plageService.recupererToutesLesPlages().get(id).getNom());

        foret.setId(foretService.recupererToutesLesForets().get(id).getId());
        foret.setEspecearbre(foretService.recupererToutesLesForets().get(id).getEspeceArbre());
        foret.setNom(foretService.recupererToutesLesForets().get(id).getNom());
        foret.setSuperficie(foretService.recupererToutesLesForets().get(id).getSuperficie());

        espaces.setPlage(plage);
        espaces.setForet(foret);
        return new EspacesDTO(espacesJPARepository.save(espaces));
    }

    public List<Espaces> recupererToutLesEspaces(){
        return (List<Espaces>) espacesJPARepository.findAll();
    }
}
