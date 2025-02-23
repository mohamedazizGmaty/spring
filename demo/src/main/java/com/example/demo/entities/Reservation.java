package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    private String idReservation;

    private Date anneeUniversitaire;
    private boolean estValide;

    // Association with Chambre (One-to-One)
    @OneToOne
    @JoinColumn(name = "idChambre")
    private Chambre chambre;

    // Association with Etudiant (Many-to-One)
    @ManyToOne
    @JoinColumn(name = "idEtudiant")
    private Etudiant etudiant;
}