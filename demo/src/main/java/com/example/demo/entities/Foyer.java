package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;

    private String nomFoyer;
    private long capaciteFoyer;

    // Association with Bloc (One-to-Many)
    @OneToMany(mappedBy = "foyer")
    private List<Bloc> blocs;

    // Association with Universite (One-to-One)
    @OneToOne(mappedBy = "foyer")
    private Universite universite;
}