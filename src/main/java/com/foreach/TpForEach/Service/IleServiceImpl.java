package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.ArchipelJPARepository;
import com.foreach.TpForEach.Repository.BatimentJPARepository;
import com.foreach.TpForEach.Repository.IleJPARepository;
import com.foreach.TpForEach.entityDO.Archipel;
import com.foreach.TpForEach.entityDO.Ile;
import com.foreach.TpForEach.entityDTO.IleDTO;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class IleServiceImpl implements IleService {


    private final IleJPARepository ileJPARepository;
    private final BatimentService batimentService;
    private final EspacesService espacesService;
    private final ArchipelJPARepository archipelJPARepository;

    @Lazy
    public IleServiceImpl(IleJPARepository ileJPARepository, BatimentJPARepository batimentJPARepository, BatimentService batimentService, EspacesService espacesService, ArchipelJPARepository archipelJPARepository) {
        this.ileJPARepository = ileJPARepository;
        this.batimentService = batimentService;
        this.espacesService = espacesService;
        this.archipelJPARepository = archipelJPARepository;
    }

    public IleDTO ajouterIle(IleDTO ileDTO){
        Ile ile = new Ile();

        ile.setNom(ileDTO.getNom());
        ile.setLocalisation(ileDTO.getLocalisation());

        Archipel archipel = new Archipel();
        archipel = archipelJPARepository.findById(ileDTO.getId()).get();

        ile.setArchipel(archipel);
        return new IleDTO(ileJPARepository.save(ile));
    }

    public List<IleDTO> recupererToutesLesIles(){
        List<Ile> iles = (List<Ile>) ileJPARepository.findAll();
        return StreamSupport.stream(iles.spliterator(),false).map(IleDTO::new).collect(Collectors.toList());
    }

}
