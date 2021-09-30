package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.ArchipelJPARepository;
import com.foreach.TpForEach.Repository.JoueurJPARepository;
import com.foreach.TpForEach.entityDO.Archipel;
import com.foreach.TpForEach.entityDO.Joueur;
import com.foreach.TpForEach.entityDTO.ArchipelDTO;
import org.springframework.stereotype.Service;

@Service
public class ArchipelServiceImpl implements ArchipelService{


    private final ArchipelJPARepository archipelJPARepository;
    private final JoueurJPARepository joueurJPARepository;

    public ArchipelServiceImpl(ArchipelJPARepository archipelJPARepository, JoueurJPARepository joueurJPARepository) {
        this.archipelJPARepository = archipelJPARepository;
        this.joueurJPARepository = joueurJPARepository;
    }

    public ArchipelDTO ajouterArchipel(ArchipelDTO archipelDTO) {
        Archipel archipel = new Archipel();

        archipel.setId(archipelDTO.getId());
        archipel.setLocalisation(archipelDTO.getLocalisation());
        archipel.setNom(archipelDTO.getNom());

        Joueur joueur = new Joueur();
        joueur = joueurJPARepository.findById(archipelDTO.getId()).get();

        archipel.setJoueur(joueur);
        return new ArchipelDTO(archipelJPARepository.save(archipel));
    }
}
