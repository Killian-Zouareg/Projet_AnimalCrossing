package com.foreach.TpForEach.Controller;

import com.foreach.TpForEach.Service.JoueurService;
import com.foreach.TpForEach.entityDTO.JoueurDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/joueurs")
public class JoueurController{


    public JoueurController(JoueurService joueurService) {
        this.joueurService = joueurService;
    }

    @Autowired
    private JoueurService joueurService;


    @PostMapping
    public JoueurDTO ajouterJoueur(@RequestBody JoueurDTO joueurDTO){
        return joueurService.ajouterJoueur(joueurDTO);
    }

}
