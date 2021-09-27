package com.foreach.TpForEach.Controller;

import com.foreach.TpForEach.Service.BatimentService;
import com.foreach.TpForEach.entityDO.Batiment;
import com.foreach.TpForEach.entityDTO.BatimentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/batiments")
public class BatimentController {

    @Autowired
    private BatimentService batimentService;

    public BatimentController(BatimentService batimentService) {
        this.batimentService = batimentService;
    }

    @PostMapping
    public BatimentDTO ajouterBatiment(@RequestBody BatimentDTO batimentDTO){
        return batimentService.ajouterBatiment(batimentDTO);
    }

    @GetMapping
    public List<Batiment> recupererToutLesBatiments(){
        return batimentService.recupererToutLesBatiments();
    }
}
