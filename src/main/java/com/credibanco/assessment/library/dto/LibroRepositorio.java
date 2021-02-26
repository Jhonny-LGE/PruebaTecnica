package com.credibanco.assessment.library.dto;

import com.credibanco.assessment.library.model.Libro;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface LibroRepositorio extends Repository<Libro, Integer> {
    List<Libro> findAll();
    String save(Libro l);
}
