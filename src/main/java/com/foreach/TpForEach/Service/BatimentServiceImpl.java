package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.BatimentJPARepository;
import com.foreach.TpForEach.Repository.IleJPARepository;
import com.foreach.TpForEach.entityDO.Batiment;
import com.foreach.TpForEach.entityDO.Ile;
import com.foreach.TpForEach.entityDTO.BatimentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatimentServiceImpl implements BatimentService {

    private final BatimentJPARepository batimentJPARepository;
    private final IleService ileService;
    private final IleJPARepository ileJPARepository;

    public BatimentServiceImpl(BatimentJPARepository batimentJPARepository, IleService ileService, IleJPARepository ileJPARepository) {
        this.batimentJPARepository = batimentJPARepository;
        this.ileService = ileService;
        this.ileJPARepository = ileJPARepository;
    }


    public BatimentDTO ajouterBatiment(BatimentDTO batimentDTO){

        Batiment batiment = new Batiment();
        Ile ile = new Ile();
        batiment.setId(batimentDTO.getId());
        batiment.setNom(batimentDTO.getNom());
        batiment.setSuperficie(batimentDTO.getSuperficie());
        batiment.setTypedebatiment(batimentDTO.getTypeDeBatiment());
        ile = ileJPARepository.findById(batimentDTO.getId()).get();
        batiment.setIle(ile);


        return new BatimentDTO(batimentJPARepository.save(batiment));
    }

    public List<Batiment> recupererToutLesBatiments(){
        return (List<Batiment>) batimentJPARepository.findAll();
    }
}


