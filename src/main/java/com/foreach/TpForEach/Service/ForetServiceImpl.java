package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.EspacesJPARepository;
import com.foreach.TpForEach.Repository.ForetJPARepository;
import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDO.Foret;
import com.foreach.TpForEach.entityDTO.ForetDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ForetServiceImpl implements ForetService{

    private ForetJPARepository foretJPARepository;
    private final EspacesJPARepository espacesJPARepository;

    public ForetServiceImpl(ForetJPARepository foretJPARepository, EspacesJPARepository espacesJPARepository) {
        this.foretJPARepository = foretJPARepository;
        this.espacesJPARepository = espacesJPARepository;
    }

    public ForetDTO ajouterForet(ForetDTO foretDTO){
        Foret foret = new Foret();
        foret.setId(foretDTO.getId());
        foret.setNom(foretDTO.getNom());
        foret.setEspecearbre(foretDTO.getEspeceArbre());
        foret.setSuperficie(foretDTO.getSuperficie());

        Espaces espace = new Espaces();

        espace = espacesJPARepository.findById(foretDTO.getId()).get();

        foret.setEspaces(espace);
        return  new ForetDTO(foretJPARepository.save(foret));
    }

    @Override
    public List<ForetDTO> recupererToutesLesForets() {
        List<Foret> forets = (List<Foret>) foretJPARepository.findAll();
        return StreamSupport.stream(forets.spliterator(),false).map(ForetDTO::new).collect(Collectors.toList());
    }
}
