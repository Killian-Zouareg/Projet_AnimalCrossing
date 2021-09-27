package com.foreach.TpForEach.Controller;

import com.foreach.TpForEach.Service.ForetService;
import com.foreach.TpForEach.entityDTO.ForetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forets")
public class ForetController {

    @Autowired
    private ForetService foretService;

    public ForetController(ForetService foretService) {
        this.foretService = foretService;
    }

    @PostMapping
    public ForetDTO ajouterForet(@RequestBody ForetDTO foretDTO){
        return foretService.ajouterForet(foretDTO);
    }

    @GetMapping
    public List<ForetDTO> recupererToutesLesForets(){
        return foretService.recupererToutesLesForets();
    }
}
