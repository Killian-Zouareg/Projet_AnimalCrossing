package com.foreach.TpForEach.Controller;

import com.foreach.TpForEach.Service.ArchipelService;
import com.foreach.TpForEach.entityDTO.ArchipelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/archipel")
public class ArchipelController {

    @Autowired
    private ArchipelService archipelService;

    public ArchipelController(ArchipelService archipelService) {
        this.archipelService = archipelService;
    }

    @PostMapping
    public ArchipelDTO ajouterArchipel(@RequestBody ArchipelDTO archipelDTO){
        return archipelService.ajouterArchipel(archipelDTO);
    }

}
