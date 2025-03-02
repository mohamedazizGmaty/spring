package com.example.demo.services;

import com.example.demo.entities.Foyer;
import com.example.demo.repositories.IChambreRepository;
import com.example.demo.repositories.IFoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServicesImpl implements IFoyerServices

{
    IChambreRepository chambreRepository;
    IFoyerRepository foyerRepository;

    @Override
    public Foyer findById(long id) {
        return foyerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Foyer> findAll() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public Foyer save(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void delete(Long id) {
foyerRepository.deleteById(id);
    }
}
