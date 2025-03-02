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

    @OneToOne
    private Chambre chambre;

    // Association with Etudiant (Many-to-One)
    @ManyToOne
    private Etudiant etudiant;
}