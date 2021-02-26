/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credibanco.assessment.library.controller;

import com.credibanco.assessment.library.model.Autor;
import com.credibanco.assessment.library.model.Editorial;
import com.credibanco.assessment.library.model.Libro;
import com.credibanco.assessment.library.service.AutorService;
import com.credibanco.assessment.library.service.EditorialService;
import com.credibanco.assessment.library.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/", produces = "application/json", method = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
public class Controller {
    @Autowired
    LibroService service;
    
    @Autowired
    AutorService serviceAutor;
    
    @Autowired
    EditorialService serviceEditorial;
    
    @GetMapping("/listarlibros")
    public List<Libro> ConsultaRedesSociales() {
        return service.listar();
    }
    
    @GetMapping("/listareditorial")
    public List<Editorial> ListarEditorial() {
        return serviceEditorial.listar();
    }
    
    @GetMapping("/listarautores")
    public List<Autor> ListarAutores() {
        return serviceAutor.listar();
    }
    
    @PostMapping("/CrearAutores")
    public String CrearAutores(@RequestBody Autor entidad) {
        return serviceAutor.crear(entidad);
    }
    
    @PostMapping("/CrearEditorial")
    public String CrearEditorial(@RequestBody Editorial entidad) {
        return serviceEditorial.crear(entidad);
    }
    
    @PostMapping("/CrearLibro")
    public String CrearLibro(@RequestBody Libro entidad) {
        return service.crear(entidad);
    }
}
