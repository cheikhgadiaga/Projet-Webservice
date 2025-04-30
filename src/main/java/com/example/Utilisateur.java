package com.example;

import com.example.Bibliotheque.Column;

public class Utilisateur {

     
    private Long id;

    @Column(nullable = false, unique = false)
    private String nom;

    @Column(nullable = false, unique = false)
    private String prenom;

    @Column(nullable = false, unique = true)
    private String email;

    // Vous pouvez ajouter d'autres informations spécifiques à l'utilisateur,
    // comme une adresse, un numéro de téléphone, un rôle (étudiant/professeur), etc.

    // Constructeurs
    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
               "id=" + id +
               ", nom='" + nom + '\'' +
               ", prenom='" + prenom + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}
