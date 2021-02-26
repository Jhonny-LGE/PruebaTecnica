/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credibanco.assessment.library.dto;

import com.credibanco.assessment.library.model.Autor;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author DesarrolloAndroid
 */
public interface AutorRepositorio extends Repository<Autor, Integer> {
    List<Autor> findAll();
    String save(Autor e);
}
