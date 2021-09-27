package com.foreach.TpForEach.Controller;

import com.foreach.TpForEach.Service.PlageService;
import com.foreach.TpForEach.entityDTO.PlageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/plages")
public class PlageController {

    @Autowired
    private PlageService plageService;

    public PlageController(PlageService plageService) {
        this.plageService = plageService;
    }

    @PostMapping
    public PlageDTO ajouterPlage(@RequestBody PlageDTO plageDTO){
        return plageService.ajouterPlage(plageDTO);
    }

    @GetMapping
    public List<PlageDTO> recupererToutesLesPLages(){
        return plageService.recupererToutesLesPlages();
    }
}
