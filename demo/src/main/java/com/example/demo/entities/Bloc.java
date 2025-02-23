package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;

    private String nomBloc;
    private long capaciteBloc;

    // Association with Foyer (Many-to-One)
    @ManyToOne
    @JoinColumn(name = "idFoyer")
    private Foyer foyer;

    // Association with Chambre (One-to-Many)
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;
}