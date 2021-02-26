/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credibanco.assessment.library.service;

import com.credibanco.assessment.library.model.Libro;
import java.util.List;

public interface LibroService {
    List<Libro> listar();
    String crear(Libro l);
}
