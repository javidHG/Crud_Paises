package com.paises.java.paises2902274.services;

import java.util.List;
import java.util.Optional;

import com.paises.java.paises2902274.entities.Pais;;

public interface IPaisService {
    // Metodos de la crud que
    // se podran utilizar en el software
    List<Pais> findAll();

    // Seleccionar un pais por el id
    Optional<Pais> findById(Long id);

    // Guardar un Pais(Nuevo o para Actualizar)
    Pais save(Pais pais);

    // Borrar pais
    Optional<Pais> delete(Long id);

}
