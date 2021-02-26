/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credibanco.assessment.library.dto;

import com.credibanco.assessment.library.model.Editorial;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author DesarrolloAndroid
 */
public interface EditorialRepositorio  extends Repository<Editorial, Integer> {
    List<Editorial> findAll();
    String save(Editorial e);
}
