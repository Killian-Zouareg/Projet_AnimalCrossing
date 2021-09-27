package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.BatimentJPARepository;
import com.foreach.TpForEach.entityDO.Batiment;
import com.foreach.TpForEach.entityDTO.BatimentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatimentServiceImpl implements BatimentService {

    private final BatimentJPARepository batimentJPARepository;

    public BatimentServiceImpl(BatimentJPARepository batimentJPARepository) {
        this.batimentJPARepository = batimentJPARepository;
    }


    public BatimentDTO ajouterBatiment(BatimentDTO batimentDTO){
        Batiment batiment = new Batiment();
        batiment.setId(batimentDTO.getId());
        batiment.setNom(batimentDTO.getNom());
        batiment.setSuperficie(batimentDTO.getSuperficie());
        batiment.setTypedebatiment(batimentDTO.getTypeDeBatiment());

        return new BatimentDTO(batimentJPARepository.save(batiment));
    }

    public List<Batiment> recupererToutLesBatiments(){
        return (List<Batiment>) batimentJPARepository.findAll();
    }
}


