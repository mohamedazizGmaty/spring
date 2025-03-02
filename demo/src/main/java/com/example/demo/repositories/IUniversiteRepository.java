package com.example.demo.repositories;

import com.example.demo.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUniversiteRepository extends JpaRepository<Universite, Long> {
}
