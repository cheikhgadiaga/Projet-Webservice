

package com.example.Bibliotheque;

import java.time.LocalDate;

public class Reservation {

   
    private Long id;

    @Column(nullable = false, unique = false)
    private Long livreId;

    @Column(nullable = false, unique = false)
    private Long utilisateurId;

    @Column(nullable = false, unique = false)
    private LocalDate dateReservation;

    @Column(nullable = false, unique = false)
    private LocalDate dateDebut;

    @Column(nullable = false, unique = false) 
    private LocalDate dateFin;

    private String statut; // e.g., "en attente", "confirmée", "annulée"

    // Constructeurs
    public Reservation() {
        this.dateReservation = LocalDate.now(); // Initialise la date de réservation par défaut
        this.statut = "en attente"; // Statut initial par défaut
    }

    public Reservation(Long livreId, Long utilisateurId, LocalDate dateDebut, LocalDate dateFin) {
        this.livreId = livreId;
        this.utilisateurId = utilisateurId;
        this.dateReservation = LocalDate.now();
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.statut = "en attente";
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLivreId() {
        return livreId;
    }

    public void setLivreId(Long livreId) {
        this.livreId = livreId;
    }

    public Long getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Long utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Reservation{" +
               "id=" + id +
               ", livreId=" + livreId +
               ", utilisateurId=" + utilisateurId +
               ", dateReservation=" + dateReservation +
               ", dateDebut=" + dateDebut +
               ", dateFin=" + dateFin +
               ", statut='" + statut + '\'' +
               '}';
    }
}
