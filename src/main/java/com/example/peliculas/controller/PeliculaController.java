package com.example.peliculas.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.peliculas.model.Pelicula;
import com.example.peliculas.service.PeliculaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping
    public List<Pelicula> getAllPeliculas() {
        return peliculaService.getAllPeliculas();
    }

    @GetMapping("/{id}")
    public Optional<Pelicula> getMethodName(@PathVariable Long id) {
        return peliculaService.getPeliculaById(id);
    }

}
