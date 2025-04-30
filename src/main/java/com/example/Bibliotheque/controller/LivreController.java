package com.example.Bibliotheque.controller;

import com.example.Bibliotheque.Livre;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreController {

    private List<Livre> livres = new ArrayList<>();

    // --- Initialisation de quelques livres ---
    public LivreController() {
        livres.add(new Livre(1L, "Une si longue lettre", "Mariama Bâ", "978-2-07-037963-7", true));
        livres.add(new Livre(2L, "Sous l'orage", "Seydou Badian", "978-2-02-006576-8", true));
        livres.add(new Livre(3L, "Le Vieux Nègre et la médaille", "Ferdinand Oyono", "978-2-07-036256-1", false));
    }

    // --- Récupérer tous les livres ---
    @GetMapping
    public List<Livre> getAllLivres() {
        return livres;
    }

    // --- Récupérer un livre par ID ---
    @GetMapping("/{id}")
    public Livre getLivreById(@PathVariable Long id) {
        return livres.stream()
                .filter(livre -> livre.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Livre non trouvé avec id : " + id));
    }

    // --- Récupérer les livres disponibles ---
    @GetMapping("/disponibles")
    public List<Livre> getLivresDisponibles() {
        List<Livre> disponibles = new ArrayList<>();
        for (Livre livre : livres) {
            if (livre.getDisponible()) {
                disponibles.add(livre);
            }
        }
        return disponibles;
    }

    // --- Ajouter un nouveau livre ---
    @PostMapping
    public Livre ajouterLivre(@RequestBody Livre livre) {
        livres.add(livre);
        return livre;
    }

    // --- Supprimer un livre par ID ---
    @DeleteMapping("/{id}")
    public void supprimerLivre(@PathVariable Long id) {
        livres.removeIf(livre -> livre.getId() == id);
    }
}
