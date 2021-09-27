package com.foreach.TpForEach.Controller;

import com.foreach.TpForEach.Service.IleService;
import com.foreach.TpForEach.entityDTO.IleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/iles")
public class IleController {

    @Autowired
    private IleService ileService;

    public IleController(IleService ileService) {
        this.ileService = ileService;
    }

    @PostMapping
    public IleDTO ajouterIle(@RequestBody IleDTO ileDTO){
        return ileService.ajouterIle(ileDTO);
    }

    @GetMapping
    public List<IleDTO> recupererToutesLesIles(){
        return ileService.recupererToutesLesIles();
    }
}
