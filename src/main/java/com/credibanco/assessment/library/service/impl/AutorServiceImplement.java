/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credibanco.assessment.library.service.impl;

import com.credibanco.assessment.library.dto.AutorRepositorio;
import com.credibanco.assessment.library.model.Autor;
import com.credibanco.assessment.library.service.AutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImplement implements AutorService {

    @Autowired
    private AutorRepositorio autorRepository;
    
    @Override
    public List<Autor> listar() {
        return autorRepository.findAll();
    }

    @Override
    public String crear(Autor a) {
        return autorRepository.save(a);
    }
    
}
