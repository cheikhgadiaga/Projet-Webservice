

package com.example.Bibliotheque; // Adaptez le package selon votre projet

import java.time.LocalDate;

public class Pret {

   
    private Long id;

    @Column(nullable = false, unique = false)
    private Long livreId;

    @Column(nullable = false, unique = false)
    private Long utilisateurId;

    @Column(nullable = false, unique = false)
    private LocalDate datePret;

    @Column(nullable = false, unique = false)
    private LocalDate dateRetourPrevue;

    private LocalDate dateRetourEffectif; // Peut être null si le livre n'est pas encore retourné

    // Constructeurs
    public Pret() {
        this.datePret = LocalDate.now(); // Initialise la date de prêt par défaut
    }

    public Pret(Long livreId, Long utilisateurId, LocalDate dateRetourPrevue) {
        this.livreId = livreId;
        this.utilisateurId = utilisateurId;
        this.datePret = LocalDate.now();
        this.dateRetourPrevue = dateRetourPrevue;
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

    public LocalDate getDatePret() {
        return datePret;
    }

    public void setDatePret(LocalDate datePret) {
        this.datePret = datePret;
    }

    public LocalDate getDateRetourPrevue() {
        return dateRetourPrevue;
    }

    public void setDateRetourPrevue(LocalDate dateRetourPrevue) {
        this.dateRetourPrevue = dateRetourPrevue;
    }

    public LocalDate getDateRetourEffectif() {
        return dateRetourEffectif;
    }

    public void setDateRetourEffectif(LocalDate dateRetourEffectif) {
        this.dateRetourEffectif = dateRetourEffectif;
    }

    @Override
    public String toString() {
        return "Pret{" +
               "id=" + id +
               ", livreId=" + livreId +
               ", utilisateurId=" + utilisateurId +
               ", datePret=" + datePret +
               ", dateRetourPrevue=" + dateRetourPrevue +
               ", dateRetourEffectif=" + dateRetourEffectif +
               '}';
    }
}
