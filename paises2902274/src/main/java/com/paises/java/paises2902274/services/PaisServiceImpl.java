package com.paises.java.paises2902274.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paises.java.paises2902274.entities.Pais;
import com.paises.java.paises2902274.entities.repositories.PaisRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class PaisServiceImpl implements IPaisService {

    // Referencia al repository
    @Autowired
    private PaisRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Pais> findAll() {
        return (List<Pais>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pais> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Pais save(Pais pais) {
        return repository.save(pais);
    }

    @Override
    public Optional<Pais> delete(Long id) {
        // 1.seleccionar el pais por id
        Optional<Pais> paisDB = repository.findById(id);
        paisDB.ifPresent(p -> {
            // 2. si existe el pais, borrelo de bd
            repository.delete(p);
        });
        return paisDB;
    }

}
