/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credibanco.assessment.library.service.impl;

import com.credibanco.assessment.library.dto.EditorialRepositorio;
import com.credibanco.assessment.library.model.Editorial;
import com.credibanco.assessment.library.service.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServiceImplement implements EditorialService {

    @Autowired
    private EditorialRepositorio editorialRepository;
    
    @Override
    public List<Editorial> listar() {
        return editorialRepository.findAll();
    }

    @Override
    public String crear(Editorial e) {
        return editorialRepository.save(e);
    }

    
}
