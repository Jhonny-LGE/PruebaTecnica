/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credibanco.assessment.library.service;

import com.credibanco.assessment.library.model.Autor;
import java.util.List;

/**
 *
 * @author DesarrolloAndroid
 */
public interface AutorService {
    List<Autor> listar();
    String crear(Autor a);
}
