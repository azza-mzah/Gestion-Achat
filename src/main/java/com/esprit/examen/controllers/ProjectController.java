package com.esprit.examen.controllers;

import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.services.ICategorieProduitService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Gestion des categories Produit")
@RequestMapping("/categorieProduit")
@RequiredArgsConstructor
public class ProjectController {
    private final ICategorieProduitService categorieProduitService;

    @GetMapping
    public List<CategorieProduit> getCategorieProduit() {
<<<<<<< HEAD
        // Modification de la nouvelle branche
        List<CategorieProduit> list = categorieProduitService.retrieveAllCategorieProduits();
        System.out.println("Nouvelle branche");
=======
        // Modification de la branche principale
        List<CategorieProduit> list = categorieProduitService.retrieveAllCategorieProduits();
        System.out.println("Branche Azza");
>>>>>>> branche-azza
        return list;
    }


    @GetMapping("/{categorieProduit-id}")
    public CategorieProduit retrieveCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
        return categorieProduitService.retrieveCategorieProduit(categorieProduitId);
    }

}
