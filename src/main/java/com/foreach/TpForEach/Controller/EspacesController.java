package com.foreach.TpForEach.Controller;


import com.foreach.TpForEach.Service.EspacesService;
import com.foreach.TpForEach.entityDO.Espaces;
import com.foreach.TpForEach.entityDTO.EspacesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/espaces")
public class EspacesController {

    @Autowired
    private EspacesService espacesService;

    public EspacesController(EspacesService espacesService) {
        this.espacesService = espacesService;
    }

    @PostMapping
    public EspacesDTO ajouterEspace(@RequestParam int id){
        return espacesService.ajouterEspace(id);
    }

    @GetMapping
    public List<Espaces> recuperertoutLesEspaces(){
        return espacesService.recupererToutLesEspaces();
    }
}
