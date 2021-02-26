/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credibanco.assessment.library.service.impl;

import com.credibanco.assessment.library.dto.LibroRepositorio;
import com.credibanco.assessment.library.model.Libro;
import com.credibanco.assessment.library.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImplent implements LibroService{
    @Autowired
    private LibroRepositorio libroRepository;
    
    @Override
    public List<Libro> listar() {
        return libroRepository.findAll();
    }

    @Override
    public String crear(Libro l) {
        return libroRepository.save(l);
    }
    
}
