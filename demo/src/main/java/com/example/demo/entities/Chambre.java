package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;

    private long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    // Association with Bloc (Many-to-One)
    @ManyToOne
    @JoinColumn(name = "idBloc")
    private Bloc bloc;
//Aziz Gmatty
    // Association with Reservation (One-to-One)
    @OneToOne(mappedBy = "chambre")
    private Reservation reservation;
}
