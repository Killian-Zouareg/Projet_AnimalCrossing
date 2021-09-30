package com.foreach.TpForEach.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageAccueilController {

    @GetMapping("/Accueil")
    public String accueil(Model model){
        return "Accueil";
    }
}
