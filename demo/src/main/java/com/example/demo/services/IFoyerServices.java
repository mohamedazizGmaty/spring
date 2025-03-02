package com.example.demo.services;

import com.example.demo.entities.Foyer;

import java.util.List;
import java.util.Optional;


public interface IFoyerServices
{
    public Foyer findById(long id);
    public List<Foyer> findAll();
    public Foyer save(Foyer foyer);
    public void delete(Long id);


}
