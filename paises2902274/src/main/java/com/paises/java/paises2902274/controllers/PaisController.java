package com.paises.java.paises2902274.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.paises.java.paises2902274.entities.Pais;
import com.paises.java.paises2902274.services.PaisServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RestController

public class PaisController {

    @Autowired
    private PaisServiceImpl service;

    @GetMapping("/api/pais")
    public List<Pais> mostrarPais() {
        // Buscar todos los paises en bd
        // utilizando el service
        return service.findAll();
    }
}
