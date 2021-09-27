package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.BatimentJPARepository;
import com.foreach.TpForEach.Repository.IleJPARepository;
import com.foreach.TpForEach.entityDO.Batiment;
import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDO.Ile;
import com.foreach.TpForEach.entityDTO.BatimentDTO;
import com.foreach.TpForEach.entityDTO.EspacesDTO;
import com.foreach.TpForEach.entityDTO.IleDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class IleServiceImpl implements IleService {


    private final IleJPARepository ileJPARepository;
    private final BatimentService batimentService;
    private final EspacesService espacesService;

    public IleServiceImpl(IleJPARepository ileJPARepository, BatimentJPARepository batimentJPARepository, BatimentService batimentService, EspacesService espacesService) {
        this.ileJPARepository = ileJPARepository;
        this.batimentService = batimentService;
        this.espacesService = espacesService;
    }

    public IleDTO ajouterIle(IleDTO ileDTO){
        Ile ile = new Ile();


        List<Batiment> batiment = new ArrayList<>();
        batiment.add(batimentService.recupererToutLesBatiments().get(0));

        List<Espaces> espaces = new ArrayList<>();
        espaces.add(espacesService.recupererToutLesEspaces().get(0));

        ile.setNom(ileDTO.getNom());
        ile.setLocalisation(ileDTO.getLocalisation());
        ile.setBatiment(batiment);
        ile.setEspaces(espaces);

        return new IleDTO(ileJPARepository.save(ile));
    }

    public List<IleDTO> recupererToutesLesIles(){
        List<Ile> iles = (List<Ile>) ileJPARepository.findAll();
        return StreamSupport.stream(iles.spliterator(),false).map(IleDTO::new).collect(Collectors.toList());
    }

}
