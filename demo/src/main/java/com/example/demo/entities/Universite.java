package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;

    private String nomUniversite;
    private String adresse;

    // Association with Foyer (One-to-One)
    @OneToOne
    @JoinColumn(name = "idFoyer")
    private Foyer foyer;
}