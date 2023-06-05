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
        // Modification de la branche actuelle
        List<CategorieProduit> list = categorieProduitService.retrieveAllCategorieProduits();
        return list;
    }

    @GetMapping("/{categorieProduit-id}")
    public CategorieProduit retrieveCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
        return categorieProduitService.retrieveCategorieProduit(categorieProduitId);
    }

}
