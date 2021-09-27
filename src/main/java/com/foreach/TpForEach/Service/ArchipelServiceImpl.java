package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.ArchipelJPARepository;
import com.foreach.TpForEach.entityDO.Archipel;
import com.foreach.TpForEach.entityDO.Ile;
import com.foreach.TpForEach.entityDTO.ArchipelDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArchipelServiceImpl implements ArchipelService{


    private final ArchipelJPARepository archipelJPARepository;

    public ArchipelServiceImpl(ArchipelJPARepository archipelJPARepository) {
        this.archipelJPARepository = archipelJPARepository;
    }

    public ArchipelDTO ajouterArchipel(ArchipelDTO archipelDTO) {
        Archipel archipel = new Archipel();

        List<Ile> iles = new ArrayList<>();
        iles.addAll(archipelDTO.getIles());

        archipel.setId(archipelDTO.getId());
        archipel.setLocalisation(archipelDTO.getLocalisation());
        archipel.setNom(archipelDTO.getNom());
        archipel.setIleDTOS(iles);

        return new ArchipelDTO(archipelJPARepository.save(archipel));
    }
}
