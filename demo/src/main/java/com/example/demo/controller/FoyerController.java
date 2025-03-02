package com.example.demo.controller;
import com.example.demo.entities.Foyer;
import com.example.demo.services.IFoyerServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerController {
    IFoyerServices foyerService;

    @PostMapping("/saveFoyer")
    public Foyer saveFoyer(@RequestBody  Foyer foyer) {
        return foyerService.save(foyer);
    }
    @GetMapping("/findById/{id}")
    public Foyer findById(@PathVariable Long id) {
        return foyerService.findById(id);
    }



}
