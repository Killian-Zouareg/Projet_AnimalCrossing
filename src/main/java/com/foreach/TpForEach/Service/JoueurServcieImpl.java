package com.foreach.TpForEach.Service;

import com.foreach.TpForEach.Repository.JoueurJPARepository;
import com.foreach.TpForEach.entityDO.Joueur;
import com.foreach.TpForEach.entityDTO.JoueurDTO;
import org.springframework.stereotype.Service;

@Service
public class JoueurServcieImpl implements JoueurService{

    private final JoueurJPARepository joueurJPARepository;

    public JoueurServcieImpl(JoueurJPARepository joueurJPARepository) {
        this.joueurJPARepository = joueurJPARepository;
    }

    public JoueurDTO ajouterJoueur(JoueurDTO joueurDTO){
        Joueur joueur = new Joueur();

        joueur.setId(joueurDTO.getId());
        joueur.setMail(joueurDTO.getMail());
        joueur.setNom(joueurDTO.getNom());
        joueur.setPrenom(joueurDTO.getPrenom());

        return new JoueurDTO(joueurJPARepository.save(joueur));
    }
}
